// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: altimeter.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoAltimeter {
  private ProtoAltimeter() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AltimeterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Altimeter)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     */
    boolean hasTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time getTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder getTimeOrBuilder();

    /**
     * <code>required double vertical_position = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical position data, in meters.
     * </pre>
     */
    boolean hasVerticalPosition();
    /**
     * <code>required double vertical_position = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical position data, in meters.
     * </pre>
     */
    double getVerticalPosition();

    /**
     * <code>required double vertical_velocity = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical velocity data, in meters/second.
     * </pre>
     */
    boolean hasVerticalVelocity();
    /**
     * <code>required double vertical_velocity = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical velocity data, in meters/second.
     * </pre>
     */
    double getVerticalVelocity();

    /**
     * <code>required double vertical_reference = 4;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical reference.
     * </pre>
     */
    boolean hasVerticalReference();
    /**
     * <code>required double vertical_reference = 4;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical reference.
     * </pre>
     */
    double getVerticalReference();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Altimeter}
   *
   * <pre>
   *&#47; &#92;brief Altimeter sensor data
   * </pre>
   */
  public static final class Altimeter extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Altimeter)
      AltimeterOrBuilder {
    // Use Altimeter.newBuilder() to construct.
    private Altimeter(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Altimeter(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Altimeter defaultInstance;
    public static Altimeter getDefaultInstance() {
      return defaultInstance;
    }

    public Altimeter getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Altimeter(
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
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = time_.toBuilder();
              }
              time_ = input.readMessage(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(time_);
                time_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              verticalPosition_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              verticalVelocity_ = input.readDouble();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              verticalReference_ = input.readDouble();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.internal_static_gazebo_msgs_Altimeter_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.internal_static_gazebo_msgs_Altimeter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter.Builder.class);
    }

    public static com.google.protobuf.Parser<Altimeter> PARSER =
        new com.google.protobuf.AbstractParser<Altimeter>() {
      public Altimeter parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Altimeter(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Altimeter> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TIME_FIELD_NUMBER = 1;
    private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time time_;
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time getTime() {
      return time_;
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Timestamp of the altimeter data
     * </pre>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }

    public static final int VERTICAL_POSITION_FIELD_NUMBER = 2;
    private double verticalPosition_;
    /**
     * <code>required double vertical_position = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical position data, in meters.
     * </pre>
     */
    public boolean hasVerticalPosition() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required double vertical_position = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical position data, in meters.
     * </pre>
     */
    public double getVerticalPosition() {
      return verticalPosition_;
    }

    public static final int VERTICAL_VELOCITY_FIELD_NUMBER = 3;
    private double verticalVelocity_;
    /**
     * <code>required double vertical_velocity = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical velocity data, in meters/second.
     * </pre>
     */
    public boolean hasVerticalVelocity() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required double vertical_velocity = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical velocity data, in meters/second.
     * </pre>
     */
    public double getVerticalVelocity() {
      return verticalVelocity_;
    }

    public static final int VERTICAL_REFERENCE_FIELD_NUMBER = 4;
    private double verticalReference_;
    /**
     * <code>required double vertical_reference = 4;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical reference.
     * </pre>
     */
    public boolean hasVerticalReference() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required double vertical_reference = 4;</code>
     *
     * <pre>
     *&#47; &#92;brief Vertical reference.
     * </pre>
     */
    public double getVerticalReference() {
      return verticalReference_;
    }

    private void initFields() {
      time_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
      verticalPosition_ = 0D;
      verticalVelocity_ = 0D;
      verticalReference_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVerticalPosition()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVerticalVelocity()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVerticalReference()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, verticalPosition_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, verticalVelocity_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, verticalReference_);
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
          .computeMessageSize(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, verticalPosition_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, verticalVelocity_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, verticalReference_);
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

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter prototype) {
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
     * Protobuf type {@code gazebo.msgs.Altimeter}
     *
     * <pre>
     *&#47; &#92;brief Altimeter sensor data
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Altimeter)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.AltimeterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.internal_static_gazebo_msgs_Altimeter_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.internal_static_gazebo_msgs_Altimeter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoAltimeter.Altimeter.newBuilder()
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
          getTimeFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        verticalPosition_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        verticalVelocity_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        verticalReference_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.internal_static_gazebo_msgs_Altimeter_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.verticalPosition_ = verticalPosition_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.verticalVelocity_ = verticalVelocity_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.verticalReference_ = verticalReference_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasVerticalPosition()) {
          setVerticalPosition(other.getVerticalPosition());
        }
        if (other.hasVerticalVelocity()) {
          setVerticalVelocity(other.getVerticalVelocity());
        }
        if (other.hasVerticalReference()) {
          setVerticalReference(other.getVerticalReference());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!hasVerticalPosition()) {
          
          return false;
        }
        if (!hasVerticalVelocity()) {
          
          return false;
        }
        if (!hasVerticalReference()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoAltimeter.Altimeter) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time time_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder> timeBuilder_;
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Timestamp of the altimeter data
       * </pre>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Timestamp of the altimeter data
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time getTime() {
        if (timeBuilder_ == null) {
          return time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Timestamp of the altimeter data
       * </pre>
       */
      public Builder setTime(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Timestamp of the altimeter data
       * </pre>
       */
      public Builder setTime(
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Timestamp of the altimeter data
       * </pre>
       */
      public Builder mergeTime(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              time_ != cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance()) {
            time_ =
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.newBuilder(time_).mergeFrom(value).buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Timestamp of the altimeter data
       * </pre>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Timestamp of the altimeter data
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Timestamp of the altimeter data
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Timestamp of the altimeter data
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder>
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder>(
                  getTime(),
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      private double verticalPosition_ ;
      /**
       * <code>required double vertical_position = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical position data, in meters.
       * </pre>
       */
      public boolean hasVerticalPosition() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required double vertical_position = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical position data, in meters.
       * </pre>
       */
      public double getVerticalPosition() {
        return verticalPosition_;
      }
      /**
       * <code>required double vertical_position = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical position data, in meters.
       * </pre>
       */
      public Builder setVerticalPosition(double value) {
        bitField0_ |= 0x00000002;
        verticalPosition_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double vertical_position = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical position data, in meters.
       * </pre>
       */
      public Builder clearVerticalPosition() {
        bitField0_ = (bitField0_ & ~0x00000002);
        verticalPosition_ = 0D;
        onChanged();
        return this;
      }

      private double verticalVelocity_ ;
      /**
       * <code>required double vertical_velocity = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical velocity data, in meters/second.
       * </pre>
       */
      public boolean hasVerticalVelocity() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required double vertical_velocity = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical velocity data, in meters/second.
       * </pre>
       */
      public double getVerticalVelocity() {
        return verticalVelocity_;
      }
      /**
       * <code>required double vertical_velocity = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical velocity data, in meters/second.
       * </pre>
       */
      public Builder setVerticalVelocity(double value) {
        bitField0_ |= 0x00000004;
        verticalVelocity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double vertical_velocity = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical velocity data, in meters/second.
       * </pre>
       */
      public Builder clearVerticalVelocity() {
        bitField0_ = (bitField0_ & ~0x00000004);
        verticalVelocity_ = 0D;
        onChanged();
        return this;
      }

      private double verticalReference_ ;
      /**
       * <code>required double vertical_reference = 4;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical reference.
       * </pre>
       */
      public boolean hasVerticalReference() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required double vertical_reference = 4;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical reference.
       * </pre>
       */
      public double getVerticalReference() {
        return verticalReference_;
      }
      /**
       * <code>required double vertical_reference = 4;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical reference.
       * </pre>
       */
      public Builder setVerticalReference(double value) {
        bitField0_ |= 0x00000008;
        verticalReference_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double vertical_reference = 4;</code>
       *
       * <pre>
       *&#47; &#92;brief Vertical reference.
       * </pre>
       */
      public Builder clearVerticalReference() {
        bitField0_ = (bitField0_ & ~0x00000008);
        verticalReference_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Altimeter)
    }

    static {
      defaultInstance = new Altimeter(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Altimeter)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Altimeter_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Altimeter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017altimeter.proto\022\013gazebo.msgs\032\ntime.pro" +
      "to\"~\n\tAltimeter\022\037\n\004time\030\001 \002(\0132\021.gazebo.m" +
      "sgs.Time\022\031\n\021vertical_position\030\002 \002(\001\022\031\n\021v" +
      "ertical_velocity\030\003 \002(\001\022\032\n\022vertical_refer" +
      "ence\030\004 \002(\001B1\n\037cn.autolabor.plugin.gazebo" +
      ".msgsB\016ProtoAltimeter"
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
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_Altimeter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Altimeter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_Altimeter_descriptor,
        new java.lang.String[] { "Time", "VerticalPosition", "VerticalVelocity", "VerticalReference", });
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}