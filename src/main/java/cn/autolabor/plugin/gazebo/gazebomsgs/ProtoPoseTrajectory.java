// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pose_trajectory.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoPoseTrajectory {
  private ProtoPoseTrajectory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PoseTrajectoryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.PoseTrajectory)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional uint32 id = 2;</code>
     */
    boolean hasId();
    /**
     * <code>optional uint32 id = 2;</code>
     */
    int getId();

    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped>
        getPoseStampedList();
    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped getPoseStamped(int index);
    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    int getPoseStampedCount();
    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    java.util.List<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder>
        getPoseStampedOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder getPoseStampedOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code gazebo.msgs.PoseTrajectory}
   */
  public static final class PoseTrajectory extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.PoseTrajectory)
      PoseTrajectoryOrBuilder {
    // Use PoseTrajectory.newBuilder() to construct.
    private PoseTrajectory(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PoseTrajectory(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PoseTrajectory defaultInstance;
    public static PoseTrajectory getDefaultInstance() {
      return defaultInstance;
    }

    public PoseTrajectory getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PoseTrajectory(
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readUInt32();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                poseStamped_ = new java.util.ArrayList<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped>();
                mutable_bitField0_ |= 0x00000004;
              }
              poseStamped_.add(input.readMessage(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.PARSER, extensionRegistry));
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
          poseStamped_ = java.util.Collections.unmodifiableList(poseStamped_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.internal_static_gazebo_msgs_PoseTrajectory_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.internal_static_gazebo_msgs_PoseTrajectory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory.Builder.class);
    }

    public static com.google.protobuf.Parser<PoseTrajectory> PARSER =
        new com.google.protobuf.AbstractParser<PoseTrajectory>() {
      public PoseTrajectory parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PoseTrajectory(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PoseTrajectory> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <code>optional uint32 id = 2;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 id = 2;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int POSE_STAMPED_FIELD_NUMBER = 3;
    private java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped> poseStamped_;
    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    public java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped> getPoseStampedList() {
      return poseStamped_;
    }
    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    public java.util.List<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder>
        getPoseStampedOrBuilderList() {
      return poseStamped_;
    }
    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    public int getPoseStampedCount() {
      return poseStamped_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped getPoseStamped(int index) {
      return poseStamped_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder getPoseStampedOrBuilder(
        int index) {
      return poseStamped_.get(index);
    }

    private void initFields() {
      name_ = "";
      id_ = 0;
      poseStamped_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getPoseStampedCount(); i++) {
        if (!getPoseStamped(i).isInitialized()) {
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
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, id_);
      }
      for (int i = 0; i < poseStamped_.size(); i++) {
        output.writeMessage(3, poseStamped_.get(i));
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
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, id_);
      }
      for (int i = 0; i < poseStamped_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, poseStamped_.get(i));
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

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory prototype) {
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
     * Protobuf type {@code gazebo.msgs.PoseTrajectory}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.PoseTrajectory)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectoryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.internal_static_gazebo_msgs_PoseTrajectory_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.internal_static_gazebo_msgs_PoseTrajectory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoPoseTrajectory.PoseTrajectory.newBuilder()
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
          getPoseStampedFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (poseStampedBuilder_ == null) {
          poseStamped_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          poseStampedBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.internal_static_gazebo_msgs_PoseTrajectory_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.id_ = id_;
        if (poseStampedBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            poseStamped_ = java.util.Collections.unmodifiableList(poseStamped_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.poseStamped_ = poseStamped_;
        } else {
          result.poseStamped_ = poseStampedBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (poseStampedBuilder_ == null) {
          if (!other.poseStamped_.isEmpty()) {
            if (poseStamped_.isEmpty()) {
              poseStamped_ = other.poseStamped_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePoseStampedIsMutable();
              poseStamped_.addAll(other.poseStamped_);
            }
            onChanged();
          }
        } else {
          if (!other.poseStamped_.isEmpty()) {
            if (poseStampedBuilder_.isEmpty()) {
              poseStampedBuilder_.dispose();
              poseStampedBuilder_ = null;
              poseStamped_ = other.poseStamped_;
              bitField0_ = (bitField0_ & ~0x00000004);
              poseStampedBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPoseStampedFieldBuilder() : null;
            } else {
              poseStampedBuilder_.addAllMessages(other.poseStamped_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getPoseStampedCount(); i++) {
          if (!getPoseStamped(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseTrajectory.PoseTrajectory) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>optional uint32 id = 2;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 id = 2;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional uint32 id = 2;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 id = 2;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped> poseStamped_ =
        java.util.Collections.emptyList();
      private void ensurePoseStampedIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          poseStamped_ = new java.util.ArrayList<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped>(poseStamped_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder> poseStampedBuilder_;

      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped> getPoseStampedList() {
        if (poseStampedBuilder_ == null) {
          return java.util.Collections.unmodifiableList(poseStamped_);
        } else {
          return poseStampedBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public int getPoseStampedCount() {
        if (poseStampedBuilder_ == null) {
          return poseStamped_.size();
        } else {
          return poseStampedBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped getPoseStamped(int index) {
        if (poseStampedBuilder_ == null) {
          return poseStamped_.get(index);
        } else {
          return poseStampedBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public Builder setPoseStamped(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped value) {
        if (poseStampedBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoseStampedIsMutable();
          poseStamped_.set(index, value);
          onChanged();
        } else {
          poseStampedBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public Builder setPoseStamped(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder builderForValue) {
        if (poseStampedBuilder_ == null) {
          ensurePoseStampedIsMutable();
          poseStamped_.set(index, builderForValue.build());
          onChanged();
        } else {
          poseStampedBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public Builder addPoseStamped(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped value) {
        if (poseStampedBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoseStampedIsMutable();
          poseStamped_.add(value);
          onChanged();
        } else {
          poseStampedBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public Builder addPoseStamped(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped value) {
        if (poseStampedBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoseStampedIsMutable();
          poseStamped_.add(index, value);
          onChanged();
        } else {
          poseStampedBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public Builder addPoseStamped(
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder builderForValue) {
        if (poseStampedBuilder_ == null) {
          ensurePoseStampedIsMutable();
          poseStamped_.add(builderForValue.build());
          onChanged();
        } else {
          poseStampedBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public Builder addPoseStamped(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder builderForValue) {
        if (poseStampedBuilder_ == null) {
          ensurePoseStampedIsMutable();
          poseStamped_.add(index, builderForValue.build());
          onChanged();
        } else {
          poseStampedBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public Builder addAllPoseStamped(
          java.lang.Iterable<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped> values) {
        if (poseStampedBuilder_ == null) {
          ensurePoseStampedIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, poseStamped_);
          onChanged();
        } else {
          poseStampedBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public Builder clearPoseStamped() {
        if (poseStampedBuilder_ == null) {
          poseStamped_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          poseStampedBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public Builder removePoseStamped(int index) {
        if (poseStampedBuilder_ == null) {
          ensurePoseStampedIsMutable();
          poseStamped_.remove(index);
          onChanged();
        } else {
          poseStampedBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder getPoseStampedBuilder(
          int index) {
        return getPoseStampedFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder getPoseStampedOrBuilder(
          int index) {
        if (poseStampedBuilder_ == null) {
          return poseStamped_.get(index);  } else {
          return poseStampedBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public java.util.List<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder>
           getPoseStampedOrBuilderList() {
        if (poseStampedBuilder_ != null) {
          return poseStampedBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(poseStamped_);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder addPoseStampedBuilder() {
        return getPoseStampedFieldBuilder().addBuilder(
            cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder addPoseStampedBuilder(
          int index) {
        return getPoseStampedFieldBuilder().addBuilder(
            index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.PoseStamped pose_stamped = 3;</code>
       */
      public java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder>
           getPoseStampedBuilderList() {
        return getPoseStampedFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder>
          getPoseStampedFieldBuilder() {
        if (poseStampedBuilder_ == null) {
          poseStampedBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder>(
                  poseStamped_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          poseStamped_ = null;
        }
        return poseStampedBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.PoseTrajectory)
    }

    static {
      defaultInstance = new PoseTrajectory(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.PoseTrajectory)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_PoseTrajectory_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_PoseTrajectory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025pose_trajectory.proto\022\013gazebo.msgs\032\022po" +
      "se_stamped.proto\"Z\n\016PoseTrajectory\022\014\n\004na" +
      "me\030\001 \001(\t\022\n\n\002id\030\002 \001(\r\022.\n\014pose_stamped\030\003 \003" +
      "(\0132\030.gazebo.msgs.PoseStampedB6\n\037cn.autol" +
      "abor.plugin.gazebo.msgsB\023ProtoPoseTrajec" +
      "tory"
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
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_PoseTrajectory_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_PoseTrajectory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_PoseTrajectory_descriptor,
        new java.lang.String[] { "Name", "Id", "PoseStamped", });
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
