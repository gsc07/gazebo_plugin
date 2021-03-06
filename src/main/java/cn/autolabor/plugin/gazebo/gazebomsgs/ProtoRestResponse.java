// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rest_response.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoRestResponse {
  private ProtoRestResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RestResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.RestResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 id = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief ID of the response message
     * </pre>
     */
    boolean hasId();
    /**
     * <code>optional uint32 id = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief ID of the response message
     * </pre>
     */
    int getId();

    /**
     * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Type of response
     * </pre>
     */
    boolean hasType();
    /**
     * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Type of response
     * </pre>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type getType();

    /**
     * <code>optional string msg = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     */
    boolean hasMsg();
    /**
     * <code>optional string msg = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     */
    java.lang.String getMsg();
    /**
     * <code>optional string msg = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * Protobuf type {@code gazebo.msgs.RestResponse}
   */
  public static final class RestResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.RestResponse)
      RestResponseOrBuilder {
    // Use RestResponse.newBuilder() to construct.
    private RestResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RestResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RestResponse defaultInstance;
    public static RestResponse getDefaultInstance() {
      return defaultInstance;
    }

    public RestResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RestResponse(
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
              id_ = input.readUInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type value = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                type_ = value;
              }
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              msg_ = bs;
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
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.internal_static_gazebo_msgs_RestResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.internal_static_gazebo_msgs_RestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<RestResponse> PARSER =
        new com.google.protobuf.AbstractParser<RestResponse>() {
      public RestResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RestResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RestResponse> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code gazebo.msgs.RestResponse.Type}
     */
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>SUCCESS = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Rest service call was successfull
       * </pre>
       */
      SUCCESS(0, 1),
      /**
       * <code>ERR = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Error calling rest service
       * </pre>
       */
      ERR(1, 2),
      /**
       * <code>LOGIN = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Response to a login request
       * </pre>
       */
      LOGIN(2, 3),
      /**
       * <code>LOGOUT = 4;</code>
       *
       * <pre>
       *&#47; &#92;brief Response to a logout request
       * </pre>
       */
      LOGOUT(3, 4),
      ;

      /**
       * <code>SUCCESS = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Rest service call was successfull
       * </pre>
       */
      public static final int SUCCESS_VALUE = 1;
      /**
       * <code>ERR = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Error calling rest service
       * </pre>
       */
      public static final int ERR_VALUE = 2;
      /**
       * <code>LOGIN = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Response to a login request
       * </pre>
       */
      public static final int LOGIN_VALUE = 3;
      /**
       * <code>LOGOUT = 4;</code>
       *
       * <pre>
       *&#47; &#92;brief Response to a logout request
       * </pre>
       */
      public static final int LOGOUT_VALUE = 4;


      public final int getNumber() { return value; }

      public static Type valueOf(int value) {
        switch (value) {
          case 1: return SUCCESS;
          case 2: return ERR;
          case 3: return LOGIN;
          case 4: return LOGOUT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.valueOf(number);
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
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Type(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:gazebo.msgs.RestResponse.Type)
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional uint32 id = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief ID of the response message
     * </pre>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 id = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief ID of the response message
     * </pre>
     */
    public int getId() {
      return id_;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type type_;
    /**
     * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Type of response
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Type of response
     * </pre>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type getType() {
      return type_;
    }

    public static final int MSG_FIELD_NUMBER = 3;
    private java.lang.Object msg_;
    /**
     * <code>optional string msg = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string msg = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string msg = 3;</code>
     *
     * <pre>
     *&#47; &#92;brief Message describing the response
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      id_ = 0;
      type_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type.SUCCESS;
      msg_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
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
        output.writeUInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, type_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMsgBytes());
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
          .computeUInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMsgBytes());
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

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse prototype) {
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
     * Protobuf type {@code gazebo.msgs.RestResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.RestResponse)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.internal_static_gazebo_msgs_RestResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.internal_static_gazebo_msgs_RestResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoRestResponse.RestResponse.newBuilder()
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
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000002);
        msg_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.internal_static_gazebo_msgs_RestResponse_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.msg_ = msg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasMsg()) {
          bitField0_ |= 0x00000004;
          msg_ = other.msg_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>optional uint32 id = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief ID of the response message
       * </pre>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 id = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief ID of the response message
       * </pre>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional uint32 id = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief ID of the response message
       * </pre>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 id = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief ID of the response message
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type type_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type.SUCCESS;
      /**
       * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Type of response
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Type of response
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type getType() {
        return type_;
      }
      /**
       * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Type of response
       * </pre>
       */
      public Builder setType(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .gazebo.msgs.RestResponse.Type type = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Type of response
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoRestResponse.RestResponse.Type.SUCCESS;
        onChanged();
        return this;
      }

      private java.lang.Object msg_ = "";
      /**
       * <code>optional string msg = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       */
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string msg = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            msg_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string msg = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string msg = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string msg = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       */
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000004);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string msg = 3;</code>
       *
       * <pre>
       *&#47; &#92;brief Message describing the response
       * </pre>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        msg_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.RestResponse)
    }

    static {
      defaultInstance = new RestResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.RestResponse)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_RestResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_RestResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023rest_response.proto\022\013gazebo.msgs\"\212\001\n\014R" +
      "estResponse\022\n\n\002id\030\001 \001(\r\022,\n\004type\030\002 \002(\0162\036." +
      "gazebo.msgs.RestResponse.Type\022\013\n\003msg\030\003 \001" +
      "(\t\"3\n\004Type\022\013\n\007SUCCESS\020\001\022\007\n\003ERR\020\002\022\t\n\005LOGI" +
      "N\020\003\022\n\n\006LOGOUT\020\004B4\n\037cn.autolabor.plugin.g" +
      "azebo.msgsB\021ProtoRestResponse"
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
    internal_static_gazebo_msgs_RestResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_RestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_RestResponse_descriptor,
        new java.lang.String[] { "Id", "Type", "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
