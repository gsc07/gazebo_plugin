package cn.autolabor.plugin.gazebo.conversion;

import com.google.protobuf.ByteString;

public interface ConversionInterface<F> {

    F toFramework(ByteString gazeboMsg);

    ByteString toGazebo(F frameworkMsg);
}
