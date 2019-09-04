package cn.autolabor.plugin.gazebo.util;

import cn.autolabor.util.Sugar;
import com.google.protobuf.ByteString;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ParseUtil {

    public final static int HEADER_SIZE = 8;

    public static int gazeboHeader(byte[] bytes) {
        if (null == bytes || bytes.length != HEADER_SIZE) {
            throw Sugar.makeThrow("Header length error!");
        }
        return Integer.parseInt(new String(bytes), 16);
    }

    public static ByteString readData(InputStream is) throws IOException {
        synchronized (is) {
            byte[] header = new byte[HEADER_SIZE];
            int headerLen = is.read(header);
            if (headerLen != HEADER_SIZE) {
                throw Sugar.makeThrow("Read Header error!");
            }

            int size = gazeboHeader(header);
            byte[] body = new byte[size];
            int bodyLen = is.read(body);
            while (bodyLen != size) {
                int add = is.read(body, bodyLen, size - bodyLen);
                bodyLen += add;
            }
            return ByteString.copyFrom(body);
        }
    }

    public static void writeData(ByteString msgBytes, OutputStream os) throws IOException {
        ByteString header = ByteString.copyFromUtf8(String.format("%08X", msgBytes.size()));
        ByteString bytes = header.concat(msgBytes);

        synchronized (os) {
            os.write(bytes.toByteArray());
        }
    }


}
