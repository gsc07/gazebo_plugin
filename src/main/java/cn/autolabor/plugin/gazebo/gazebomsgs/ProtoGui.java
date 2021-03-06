// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gui.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoGui {
  private ProtoGui() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GUIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.GUI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool fullscreen = 1;</code>
     */
    boolean hasFullscreen();
    /**
     * <code>optional bool fullscreen = 1;</code>
     */
    boolean getFullscreen();

    /**
     * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
     */
    boolean hasCamera();
    /**
     * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera getCamera();
    /**
     * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICameraOrBuilder getCameraOrBuilder();

    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin>
        getPluginList();
    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin getPlugin(int index);
    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    int getPluginCount();
    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    java.util.List<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.PluginOrBuilder>
        getPluginOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.PluginOrBuilder getPluginOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code gazebo.msgs.GUI}
   */
  public static final class GUI extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.GUI)
      GUIOrBuilder {
    // Use GUI.newBuilder() to construct.
    private GUI(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GUI(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GUI defaultInstance;
    public static GUI getDefaultInstance() {
      return defaultInstance;
    }

    public GUI getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GUI(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              fullscreen_ = input.readBool();
              break;
            }
            case 18: {
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = camera_.toBuilder();
              }
              camera_ = input.readMessage(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(camera_);
                camera_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                plugin_ = new java.util.ArrayList<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin>();
                mutable_bitField0_ |= 0x00000004;
              }
              plugin_.add(input.readMessage(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          plugin_ = java.util.Collections.unmodifiableList(plugin_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.internal_static_gazebo_msgs_GUI_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.internal_static_gazebo_msgs_GUI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI.Builder.class);
    }

    public static com.google.protobuf.Parser<GUI> PARSER =
        new com.google.protobuf.AbstractParser<GUI>() {
      public GUI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GUI(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GUI> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FULLSCREEN_FIELD_NUMBER = 1;
    private boolean fullscreen_;
    /**
     * <code>optional bool fullscreen = 1;</code>
     */
    public boolean hasFullscreen() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool fullscreen = 1;</code>
     */
    public boolean getFullscreen() {
      return fullscreen_;
    }

    public static final int CAMERA_FIELD_NUMBER = 2;
    private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera camera_;
    /**
     * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
     */
    public boolean hasCamera() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera getCamera() {
      return camera_;
    }
    /**
     * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICameraOrBuilder getCameraOrBuilder() {
      return camera_;
    }

    public static final int PLUGIN_FIELD_NUMBER = 3;
    private java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin> plugin_;
    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    public java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin> getPluginList() {
      return plugin_;
    }
    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    public java.util.List<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.PluginOrBuilder>
        getPluginOrBuilderList() {
      return plugin_;
    }
    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    public int getPluginCount() {
      return plugin_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin getPlugin(int index) {
      return plugin_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.PluginOrBuilder getPluginOrBuilder(
        int index) {
      return plugin_.get(index);
    }

    private void initFields() {
      fullscreen_ = false;
      camera_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.getDefaultInstance();
      plugin_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasCamera()) {
        if (!getCamera().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getPluginCount(); i++) {
        if (!getPlugin(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, fullscreen_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, camera_);
      }
      for (int i = 0; i < plugin_.size(); i++) {
        output.writeMessage(3, plugin_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, fullscreen_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, camera_);
      }
      for (int i = 0; i < plugin_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, plugin_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gazebo.msgs.GUI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.GUI)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.internal_static_gazebo_msgs_GUI_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.internal_static_gazebo_msgs_GUI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoGui.GUI.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getCameraFieldBuilder();
          getPluginFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        fullscreen_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (cameraBuilder_ == null) {
          camera_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.getDefaultInstance();
        } else {
          cameraBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (pluginBuilder_ == null) {
          plugin_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          pluginBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.internal_static_gazebo_msgs_GUI_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fullscreen_ = fullscreen_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (cameraBuilder_ == null) {
          result.camera_ = camera_;
        } else {
          result.camera_ = cameraBuilder_.build();
        }
        if (pluginBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            plugin_ = java.util.Collections.unmodifiableList(plugin_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.plugin_ = plugin_;
        } else {
          result.plugin_ = pluginBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI.getDefaultInstance()) return this;
        if (other.hasFullscreen()) {
          setFullscreen(other.getFullscreen());
        }
        if (other.hasCamera()) {
          mergeCamera(other.getCamera());
        }
        if (pluginBuilder_ == null) {
          if (!other.plugin_.isEmpty()) {
            if (plugin_.isEmpty()) {
              plugin_ = other.plugin_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePluginIsMutable();
              plugin_.addAll(other.plugin_);
            }
            onChanged();
          }
        } else {
          if (!other.plugin_.isEmpty()) {
            if (pluginBuilder_.isEmpty()) {
              pluginBuilder_.dispose();
              pluginBuilder_ = null;
              plugin_ = other.plugin_;
              bitField0_ = (bitField0_ & ~0x00000004);
              pluginBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPluginFieldBuilder() : null;
            } else {
              pluginBuilder_.addAllMessages(other.plugin_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasCamera()) {
          if (!getCamera().isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getPluginCount(); i++) {
          if (!getPlugin(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGui.GUI) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean fullscreen_ ;
      /**
       * <code>optional bool fullscreen = 1;</code>
       */
      public boolean hasFullscreen() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool fullscreen = 1;</code>
       */
      public boolean getFullscreen() {
        return fullscreen_;
      }
      /**
       * <code>optional bool fullscreen = 1;</code>
       */
      public Builder setFullscreen(boolean value) {
        bitField0_ |= 0x00000001;
        fullscreen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool fullscreen = 1;</code>
       */
      public Builder clearFullscreen() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fullscreen_ = false;
        onChanged();
        return this;
      }

      private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera camera_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICameraOrBuilder> cameraBuilder_;
      /**
       * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
       */
      public boolean hasCamera() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera getCamera() {
        if (cameraBuilder_ == null) {
          return camera_;
        } else {
          return cameraBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
       */
      public Builder setCamera(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera value) {
        if (cameraBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          camera_ = value;
          onChanged();
        } else {
          cameraBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
       */
      public Builder setCamera(
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.Builder builderForValue) {
        if (cameraBuilder_ == null) {
          camera_ = builderForValue.build();
          onChanged();
        } else {
          cameraBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
       */
      public Builder mergeCamera(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera value) {
        if (cameraBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              camera_ != cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.getDefaultInstance()) {
            camera_ =
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.newBuilder(camera_).mergeFrom(value).buildPartial();
          } else {
            camera_ = value;
          }
          onChanged();
        } else {
          cameraBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
       */
      public Builder clearCamera() {
        if (cameraBuilder_ == null) {
          camera_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.getDefaultInstance();
          onChanged();
        } else {
          cameraBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.Builder getCameraBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getCameraFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICameraOrBuilder getCameraOrBuilder() {
        if (cameraBuilder_ != null) {
          return cameraBuilder_.getMessageOrBuilder();
        } else {
          return camera_;
        }
      }
      /**
       * <code>optional .gazebo.msgs.GUICamera camera = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICameraOrBuilder>
          getCameraFieldBuilder() {
        if (cameraBuilder_ == null) {
          cameraBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICamera.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.GUICameraOrBuilder>(
                  getCamera(),
                  getParentForChildren(),
                  isClean());
          camera_ = null;
        }
        return cameraBuilder_;
      }

      private java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin> plugin_ =
        java.util.Collections.emptyList();
      private void ensurePluginIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          plugin_ = new java.util.ArrayList<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin>(plugin_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.PluginOrBuilder> pluginBuilder_;

      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin> getPluginList() {
        if (pluginBuilder_ == null) {
          return java.util.Collections.unmodifiableList(plugin_);
        } else {
          return pluginBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public int getPluginCount() {
        if (pluginBuilder_ == null) {
          return plugin_.size();
        } else {
          return pluginBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin getPlugin(int index) {
        if (pluginBuilder_ == null) {
          return plugin_.get(index);
        } else {
          return pluginBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public Builder setPlugin(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin value) {
        if (pluginBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePluginIsMutable();
          plugin_.set(index, value);
          onChanged();
        } else {
          pluginBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public Builder setPlugin(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder builderForValue) {
        if (pluginBuilder_ == null) {
          ensurePluginIsMutable();
          plugin_.set(index, builderForValue.build());
          onChanged();
        } else {
          pluginBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public Builder addPlugin(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin value) {
        if (pluginBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePluginIsMutable();
          plugin_.add(value);
          onChanged();
        } else {
          pluginBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public Builder addPlugin(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin value) {
        if (pluginBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePluginIsMutable();
          plugin_.add(index, value);
          onChanged();
        } else {
          pluginBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public Builder addPlugin(
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder builderForValue) {
        if (pluginBuilder_ == null) {
          ensurePluginIsMutable();
          plugin_.add(builderForValue.build());
          onChanged();
        } else {
          pluginBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public Builder addPlugin(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder builderForValue) {
        if (pluginBuilder_ == null) {
          ensurePluginIsMutable();
          plugin_.add(index, builderForValue.build());
          onChanged();
        } else {
          pluginBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public Builder addAllPlugin(
          java.lang.Iterable<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin> values) {
        if (pluginBuilder_ == null) {
          ensurePluginIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, plugin_);
          onChanged();
        } else {
          pluginBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public Builder clearPlugin() {
        if (pluginBuilder_ == null) {
          plugin_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          pluginBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public Builder removePlugin(int index) {
        if (pluginBuilder_ == null) {
          ensurePluginIsMutable();
          plugin_.remove(index);
          onChanged();
        } else {
          pluginBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder getPluginBuilder(
          int index) {
        return getPluginFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.PluginOrBuilder getPluginOrBuilder(
          int index) {
        if (pluginBuilder_ == null) {
          return plugin_.get(index);  } else {
          return pluginBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public java.util.List<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.PluginOrBuilder>
           getPluginOrBuilderList() {
        if (pluginBuilder_ != null) {
          return pluginBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(plugin_);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder addPluginBuilder() {
        return getPluginFieldBuilder().addBuilder(
            cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder addPluginBuilder(
          int index) {
        return getPluginFieldBuilder().addBuilder(
            index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Plugin plugin = 3;</code>
       */
      public java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder>
           getPluginBuilderList() {
        return getPluginFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.PluginOrBuilder>
          getPluginFieldBuilder() {
        if (pluginBuilder_ == null) {
          pluginBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.Plugin.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.PluginOrBuilder>(
                  plugin_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          plugin_ = null;
        }
        return pluginBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.GUI)
    }

    static {
      defaultInstance = new GUI(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.GUI)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_GUI_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_GUI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tgui.proto\022\013gazebo.msgs\032\020gui_camera.pro" +
      "to\032\014plugin.proto\"f\n\003GUI\022\022\n\nfullscreen\030\001 " +
      "\001(\010\022&\n\006camera\030\002 \001(\0132\026.gazebo.msgs.GUICam" +
      "era\022#\n\006plugin\030\003 \003(\0132\023.gazebo.msgs.Plugin" +
      "B+\n\037cn.autolabor.plugin.gazebo.msgsB\010Pro" +
      "toGui"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.getDescriptor(),
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_GUI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_GUI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_GUI_descriptor,
        new java.lang.String[] { "Fullscreen", "Camera", "Plugin", });
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGuiCamera.getDescriptor();
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPlugin.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
