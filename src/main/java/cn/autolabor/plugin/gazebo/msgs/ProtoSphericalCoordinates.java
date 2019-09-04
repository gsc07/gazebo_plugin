// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spherical_coordinates.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoSphericalCoordinates {
  private ProtoSphericalCoordinates() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SphericalCoordinatesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.SphericalCoordinates)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.SphericalCoordinates.SurfaceModel surface_model = 1;</code>
     */
    boolean hasSurfaceModel();
    /**
     * <code>required .gazebo.msgs.SphericalCoordinates.SurfaceModel surface_model = 1;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel getSurfaceModel();

    /**
     * <code>required double latitude_deg = 2;</code>
     */
    boolean hasLatitudeDeg();
    /**
     * <code>required double latitude_deg = 2;</code>
     */
    double getLatitudeDeg();

    /**
     * <code>required double longitude_deg = 3;</code>
     */
    boolean hasLongitudeDeg();
    /**
     * <code>required double longitude_deg = 3;</code>
     */
    double getLongitudeDeg();

    /**
     * <code>required double elevation = 4;</code>
     */
    boolean hasElevation();
    /**
     * <code>required double elevation = 4;</code>
     */
    double getElevation();

    /**
     * <code>required double heading_deg = 5;</code>
     */
    boolean hasHeadingDeg();
    /**
     * <code>required double heading_deg = 5;</code>
     */
    double getHeadingDeg();
  }
  /**
   * Protobuf type {@code gazebo.msgs.SphericalCoordinates}
   */
  public static final class SphericalCoordinates extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.SphericalCoordinates)
      SphericalCoordinatesOrBuilder {
    // Use SphericalCoordinates.newBuilder() to construct.
    private SphericalCoordinates(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SphericalCoordinates(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SphericalCoordinates defaultInstance;
    public static SphericalCoordinates getDefaultInstance() {
      return defaultInstance;
    }

    public SphericalCoordinates getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SphericalCoordinates(
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
              int rawValue = input.readEnum();
              cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel value = cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                surfaceModel_ = value;
              }
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              latitudeDeg_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              longitudeDeg_ = input.readDouble();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              elevation_ = input.readDouble();
              break;
            }
            case 41: {
              bitField0_ |= 0x00000010;
              headingDeg_ = input.readDouble();
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
      return cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.internal_static_gazebo_msgs_SphericalCoordinates_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.internal_static_gazebo_msgs_SphericalCoordinates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.class, cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.Builder.class);
    }

    public static com.google.protobuf.Parser<SphericalCoordinates> PARSER =
        new com.google.protobuf.AbstractParser<SphericalCoordinates>() {
      public SphericalCoordinates parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SphericalCoordinates(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SphericalCoordinates> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code gazebo.msgs.SphericalCoordinates.SurfaceModel}
     */
    public enum SurfaceModel
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>EARTH_WGS84 = 1;</code>
       */
      EARTH_WGS84(0, 1),
      ;

      /**
       * <code>EARTH_WGS84 = 1;</code>
       */
      public static final int EARTH_WGS84_VALUE = 1;


      public final int getNumber() { return value; }

      public static SurfaceModel valueOf(int value) {
        switch (value) {
          case 1: return EARTH_WGS84;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<SurfaceModel>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<SurfaceModel>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<SurfaceModel>() {
              public SurfaceModel findValueByNumber(int number) {
                return SurfaceModel.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.getDescriptor().getEnumTypes().get(0);
      }

      private static final SurfaceModel[] VALUES = values();

      public static SurfaceModel valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private SurfaceModel(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:gazebo.msgs.SphericalCoordinates.SurfaceModel)
    }

    private int bitField0_;
    public static final int SURFACE_MODEL_FIELD_NUMBER = 1;
    private cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel surfaceModel_;
    /**
     * <code>required .gazebo.msgs.SphericalCoordinates.SurfaceModel surface_model = 1;</code>
     */
    public boolean hasSurfaceModel() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.SphericalCoordinates.SurfaceModel surface_model = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel getSurfaceModel() {
      return surfaceModel_;
    }

    public static final int LATITUDE_DEG_FIELD_NUMBER = 2;
    private double latitudeDeg_;
    /**
     * <code>required double latitude_deg = 2;</code>
     */
    public boolean hasLatitudeDeg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required double latitude_deg = 2;</code>
     */
    public double getLatitudeDeg() {
      return latitudeDeg_;
    }

    public static final int LONGITUDE_DEG_FIELD_NUMBER = 3;
    private double longitudeDeg_;
    /**
     * <code>required double longitude_deg = 3;</code>
     */
    public boolean hasLongitudeDeg() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required double longitude_deg = 3;</code>
     */
    public double getLongitudeDeg() {
      return longitudeDeg_;
    }

    public static final int ELEVATION_FIELD_NUMBER = 4;
    private double elevation_;
    /**
     * <code>required double elevation = 4;</code>
     */
    public boolean hasElevation() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required double elevation = 4;</code>
     */
    public double getElevation() {
      return elevation_;
    }

    public static final int HEADING_DEG_FIELD_NUMBER = 5;
    private double headingDeg_;
    /**
     * <code>required double heading_deg = 5;</code>
     */
    public boolean hasHeadingDeg() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required double heading_deg = 5;</code>
     */
    public double getHeadingDeg() {
      return headingDeg_;
    }

    private void initFields() {
      surfaceModel_ = cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel.EARTH_WGS84;
      latitudeDeg_ = 0D;
      longitudeDeg_ = 0D;
      elevation_ = 0D;
      headingDeg_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSurfaceModel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLatitudeDeg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLongitudeDeg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasElevation()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHeadingDeg()) {
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
        output.writeEnum(1, surfaceModel_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, latitudeDeg_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, longitudeDeg_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, elevation_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeDouble(5, headingDeg_);
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
          .computeEnumSize(1, surfaceModel_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, latitudeDeg_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, longitudeDeg_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, elevation_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, headingDeg_);
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

    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates prototype) {
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
     * Protobuf type {@code gazebo.msgs.SphericalCoordinates}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.SphericalCoordinates)
        cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinatesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.internal_static_gazebo_msgs_SphericalCoordinates_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.internal_static_gazebo_msgs_SphericalCoordinates_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.class, cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        surfaceModel_ = cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel.EARTH_WGS84;
        bitField0_ = (bitField0_ & ~0x00000001);
        latitudeDeg_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        longitudeDeg_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        elevation_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        headingDeg_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.internal_static_gazebo_msgs_SphericalCoordinates_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates result = new cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.surfaceModel_ = surfaceModel_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.latitudeDeg_ = latitudeDeg_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.longitudeDeg_ = longitudeDeg_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.elevation_ = elevation_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.headingDeg_ = headingDeg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.getDefaultInstance()) return this;
        if (other.hasSurfaceModel()) {
          setSurfaceModel(other.getSurfaceModel());
        }
        if (other.hasLatitudeDeg()) {
          setLatitudeDeg(other.getLatitudeDeg());
        }
        if (other.hasLongitudeDeg()) {
          setLongitudeDeg(other.getLongitudeDeg());
        }
        if (other.hasElevation()) {
          setElevation(other.getElevation());
        }
        if (other.hasHeadingDeg()) {
          setHeadingDeg(other.getHeadingDeg());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSurfaceModel()) {
          
          return false;
        }
        if (!hasLatitudeDeg()) {
          
          return false;
        }
        if (!hasLongitudeDeg()) {
          
          return false;
        }
        if (!hasElevation()) {
          
          return false;
        }
        if (!hasHeadingDeg()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel surfaceModel_ = cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel.EARTH_WGS84;
      /**
       * <code>required .gazebo.msgs.SphericalCoordinates.SurfaceModel surface_model = 1;</code>
       */
      public boolean hasSurfaceModel() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.SphericalCoordinates.SurfaceModel surface_model = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel getSurfaceModel() {
        return surfaceModel_;
      }
      /**
       * <code>required .gazebo.msgs.SphericalCoordinates.SurfaceModel surface_model = 1;</code>
       */
      public Builder setSurfaceModel(cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        surfaceModel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.SphericalCoordinates.SurfaceModel surface_model = 1;</code>
       */
      public Builder clearSurfaceModel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        surfaceModel_ = cn.autolabor.plugin.gazebo.msgs.ProtoSphericalCoordinates.SphericalCoordinates.SurfaceModel.EARTH_WGS84;
        onChanged();
        return this;
      }

      private double latitudeDeg_ ;
      /**
       * <code>required double latitude_deg = 2;</code>
       */
      public boolean hasLatitudeDeg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required double latitude_deg = 2;</code>
       */
      public double getLatitudeDeg() {
        return latitudeDeg_;
      }
      /**
       * <code>required double latitude_deg = 2;</code>
       */
      public Builder setLatitudeDeg(double value) {
        bitField0_ |= 0x00000002;
        latitudeDeg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double latitude_deg = 2;</code>
       */
      public Builder clearLatitudeDeg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        latitudeDeg_ = 0D;
        onChanged();
        return this;
      }

      private double longitudeDeg_ ;
      /**
       * <code>required double longitude_deg = 3;</code>
       */
      public boolean hasLongitudeDeg() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required double longitude_deg = 3;</code>
       */
      public double getLongitudeDeg() {
        return longitudeDeg_;
      }
      /**
       * <code>required double longitude_deg = 3;</code>
       */
      public Builder setLongitudeDeg(double value) {
        bitField0_ |= 0x00000004;
        longitudeDeg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double longitude_deg = 3;</code>
       */
      public Builder clearLongitudeDeg() {
        bitField0_ = (bitField0_ & ~0x00000004);
        longitudeDeg_ = 0D;
        onChanged();
        return this;
      }

      private double elevation_ ;
      /**
       * <code>required double elevation = 4;</code>
       */
      public boolean hasElevation() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required double elevation = 4;</code>
       */
      public double getElevation() {
        return elevation_;
      }
      /**
       * <code>required double elevation = 4;</code>
       */
      public Builder setElevation(double value) {
        bitField0_ |= 0x00000008;
        elevation_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double elevation = 4;</code>
       */
      public Builder clearElevation() {
        bitField0_ = (bitField0_ & ~0x00000008);
        elevation_ = 0D;
        onChanged();
        return this;
      }

      private double headingDeg_ ;
      /**
       * <code>required double heading_deg = 5;</code>
       */
      public boolean hasHeadingDeg() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required double heading_deg = 5;</code>
       */
      public double getHeadingDeg() {
        return headingDeg_;
      }
      /**
       * <code>required double heading_deg = 5;</code>
       */
      public Builder setHeadingDeg(double value) {
        bitField0_ |= 0x00000010;
        headingDeg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double heading_deg = 5;</code>
       */
      public Builder clearHeadingDeg() {
        bitField0_ = (bitField0_ & ~0x00000010);
        headingDeg_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.SphericalCoordinates)
    }

    static {
      defaultInstance = new SphericalCoordinates(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.SphericalCoordinates)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_SphericalCoordinates_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_SphericalCoordinates_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033spherical_coordinates.proto\022\013gazebo.ms" +
      "gs\"\323\001\n\024SphericalCoordinates\022E\n\rsurface_m" +
      "odel\030\001 \002(\0162..gazebo.msgs.SphericalCoordi" +
      "nates.SurfaceModel\022\024\n\014latitude_deg\030\002 \002(\001" +
      "\022\025\n\rlongitude_deg\030\003 \002(\001\022\021\n\televation\030\004 \002" +
      "(\001\022\023\n\013heading_deg\030\005 \002(\001\"\037\n\014SurfaceModel\022" +
      "\017\n\013EARTH_WGS84\020\001B<\n\037cn.autolabor.plugin." +
      "gazebo.msgsB\031ProtoSphericalCoordinates"
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
        }, assigner);
    internal_static_gazebo_msgs_SphericalCoordinates_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_SphericalCoordinates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_SphericalCoordinates_descriptor,
        new java.lang.String[] { "SurfaceModel", "LatitudeDeg", "LongitudeDeg", "Elevation", "HeadingDeg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}