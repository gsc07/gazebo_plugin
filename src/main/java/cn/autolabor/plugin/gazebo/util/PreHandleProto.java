package cn.autolabor.plugin.gazebo.util;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class PreHandleProto {

    public static void main(String[] args) throws IOException {
        String outPath = "/home/colin/tmp/msgs_new/";
        File fileDir = new File("/home/colin/tmp/msgs/");
        if (fileDir.isDirectory()) {
            File[] filelist = fileDir.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.endsWith(".proto");
                }
            });

            for (int i = 0; null != filelist && i < filelist.length; i++) {
                List<String> org = Files.readAllLines(filelist[i].toPath());
                //                org.add(2, "\noption java_package = \"cn.autolabor.plugin.gazebo.ignitionmsgs\";");
                //                org.add(3, String.format("option java_outer_classname = \"Ignition%s\";", Strings.upperFirst(Strings.line2Hump(Strings.trimExtension(filelist[i].getName())))));
                for (int j = 0; j < org.size(); j++) {
                    if (org.get(j).startsWith("import \"ignition/msgs/")) {
                        org.set(j,org.get(j).replace("ignition/msgs/",""));
                    }
                }
                Files.write(new File(outPath + filelist[i].getName()).toPath(), org, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
            }
        }
    }

}
