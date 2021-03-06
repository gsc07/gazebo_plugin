// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model_v.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoModelV {
  private ProtoModelV() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Model_VOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Model_V)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model>
        getModelsList();
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model getModels(int index);
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    int getModelsCount();
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    java.util.List<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.ModelOrBuilder>
        getModelsOrBuilderList();
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.ModelOrBuilder getModelsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code gazebo.msgs.Model_V}
   */
  public static final class Model_V extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Model_V)
      Model_VOrBuilder {
    // Use Model_V.newBuilder() to construct.
    private Model_V(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Model_V(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Model_V defaultInstance;
    public static Model_V getDefaultInstance() {
      return defaultInstance;
    }

    public Model_V getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Model_V(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                models_ = new java.util.ArrayList<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model>();
                mutable_bitField0_ |= 0x00000001;
              }
              models_.add(input.readMessage(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          models_ = java.util.Collections.unmodifiableList(models_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.internal_static_gazebo_msgs_Model_V_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.internal_static_gazebo_msgs_Model_V_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V.Builder.class);
    }

    public static com.google.protobuf.Parser<Model_V> PARSER =
        new com.google.protobuf.AbstractParser<Model_V>() {
      public Model_V parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Model_V(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Model_V> getParserForType() {
      return PARSER;
    }

    public static final int MODELS_FIELD_NUMBER = 2;
    private java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model> models_;
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    public java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model> getModelsList() {
      return models_;
    }
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    public java.util.List<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.ModelOrBuilder>
        getModelsOrBuilderList() {
      return models_;
    }
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    public int getModelsCount() {
      return models_.size();
    }
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model getModels(int index) {
      return models_.get(index);
    }
    /**
     * <code>repeated .gazebo.msgs.Model models = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.ModelOrBuilder getModelsOrBuilder(
        int index) {
      return models_.get(index);
    }

    private void initFields() {
      models_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getModelsCount(); i++) {
        if (!getModels(i).isInitialized()) {
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
      for (int i = 0; i < models_.size(); i++) {
        output.writeMessage(2, models_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < models_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, models_.get(i));
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

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V prototype) {
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
     * Protobuf type {@code gazebo.msgs.Model_V}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Model_V)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_VOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.internal_static_gazebo_msgs_Model_V_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.internal_static_gazebo_msgs_Model_V_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoModelV.Model_V.newBuilder()
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
          getModelsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (modelsBuilder_ == null) {
          models_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          modelsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.internal_static_gazebo_msgs_Model_V_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V(this);
        int from_bitField0_ = bitField0_;
        if (modelsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            models_ = java.util.Collections.unmodifiableList(models_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.models_ = models_;
        } else {
          result.models_ = modelsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V.getDefaultInstance()) return this;
        if (modelsBuilder_ == null) {
          if (!other.models_.isEmpty()) {
            if (models_.isEmpty()) {
              models_ = other.models_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureModelsIsMutable();
              models_.addAll(other.models_);
            }
            onChanged();
          }
        } else {
          if (!other.models_.isEmpty()) {
            if (modelsBuilder_.isEmpty()) {
              modelsBuilder_.dispose();
              modelsBuilder_ = null;
              models_ = other.models_;
              bitField0_ = (bitField0_ & ~0x00000001);
              modelsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getModelsFieldBuilder() : null;
            } else {
              modelsBuilder_.addAllMessages(other.models_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getModelsCount(); i++) {
          if (!getModels(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModelV.Model_V) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model> models_ =
        java.util.Collections.emptyList();
      private void ensureModelsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          models_ = new java.util.ArrayList<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model>(models_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.ModelOrBuilder> modelsBuilder_;

      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model> getModelsList() {
        if (modelsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(models_);
        } else {
          return modelsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public int getModelsCount() {
        if (modelsBuilder_ == null) {
          return models_.size();
        } else {
          return modelsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model getModels(int index) {
        if (modelsBuilder_ == null) {
          return models_.get(index);
        } else {
          return modelsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder setModels(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model value) {
        if (modelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureModelsIsMutable();
          models_.set(index, value);
          onChanged();
        } else {
          modelsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder setModels(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder builderForValue) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          models_.set(index, builderForValue.build());
          onChanged();
        } else {
          modelsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addModels(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model value) {
        if (modelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureModelsIsMutable();
          models_.add(value);
          onChanged();
        } else {
          modelsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addModels(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model value) {
        if (modelsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureModelsIsMutable();
          models_.add(index, value);
          onChanged();
        } else {
          modelsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addModels(
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder builderForValue) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          models_.add(builderForValue.build());
          onChanged();
        } else {
          modelsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addModels(
          int index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder builderForValue) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          models_.add(index, builderForValue.build());
          onChanged();
        } else {
          modelsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder addAllModels(
          java.lang.Iterable<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model> values) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, models_);
          onChanged();
        } else {
          modelsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder clearModels() {
        if (modelsBuilder_ == null) {
          models_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          modelsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public Builder removeModels(int index) {
        if (modelsBuilder_ == null) {
          ensureModelsIsMutable();
          models_.remove(index);
          onChanged();
        } else {
          modelsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder getModelsBuilder(
          int index) {
        return getModelsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.ModelOrBuilder getModelsOrBuilder(
          int index) {
        if (modelsBuilder_ == null) {
          return models_.get(index);  } else {
          return modelsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public java.util.List<? extends cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.ModelOrBuilder>
           getModelsOrBuilderList() {
        if (modelsBuilder_ != null) {
          return modelsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(models_);
        }
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder addModelsBuilder() {
        return getModelsFieldBuilder().addBuilder(
            cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder addModelsBuilder(
          int index) {
        return getModelsFieldBuilder().addBuilder(
            index, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.getDefaultInstance());
      }
      /**
       * <code>repeated .gazebo.msgs.Model models = 2;</code>
       */
      public java.util.List<cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder>
           getModelsBuilderList() {
        return getModelsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.ModelOrBuilder>
          getModelsFieldBuilder() {
        if (modelsBuilder_ == null) {
          modelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.Model.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.ModelOrBuilder>(
                  models_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          models_ = null;
        }
        return modelsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Model_V)
    }

    static {
      defaultInstance = new Model_V(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Model_V)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Model_V_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Model_V_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmodel_v.proto\022\013gazebo.msgs\032\013model.prot" +
      "o\"-\n\007Model_V\022\"\n\006models\030\002 \003(\0132\022.gazebo.ms" +
      "gs.ModelB.\n\037cn.autolabor.plugin.gazebo.m" +
      "sgsB\013ProtoModelV"
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
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_Model_V_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Model_V_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_Model_V_descriptor,
        new java.lang.String[] { "Models", });
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoModel.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
