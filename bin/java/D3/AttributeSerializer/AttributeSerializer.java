// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AttributeSerializer.proto

package D3.AttributeSerializer;

public final class AttributeSerializer {
  private AttributeSerializer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class SavedAttribute extends
      com.google.protobuf.GeneratedMessage {
    // Use SavedAttribute.newBuilder() to construct.
    private SavedAttribute() {
      initFields();
    }
    private SavedAttribute(boolean noInit) {}
    
    private static final SavedAttribute defaultInstance;
    public static SavedAttribute getDefaultInstance() {
      return defaultInstance;
    }
    
    public SavedAttribute getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return D3.AttributeSerializer.AttributeSerializer.internal_static_D3_AttributeSerializer_SavedAttribute_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return D3.AttributeSerializer.AttributeSerializer.internal_static_D3_AttributeSerializer_SavedAttribute_fieldAccessorTable;
    }
    
    // required sint32 key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private boolean hasKey;
    private int key_ = 0;
    public boolean hasKey() { return hasKey; }
    public int getKey() { return key_; }
    
    // required sint32 value = 2;
    public static final int VALUE_FIELD_NUMBER = 2;
    private boolean hasValue;
    private int value_ = 0;
    public boolean hasValue() { return hasValue; }
    public int getValue() { return value_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasKey) return false;
      if (!hasValue) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasKey()) {
        output.writeSInt32(1, getKey());
      }
      if (hasValue()) {
        output.writeSInt32(2, getValue());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasKey()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(1, getKey());
      }
      if (hasValue()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(2, getValue());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttribute parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(D3.AttributeSerializer.AttributeSerializer.SavedAttribute prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private D3.AttributeSerializer.AttributeSerializer.SavedAttribute result;
      
      // Construct using D3.AttributeSerializer.AttributeSerializer.SavedAttribute.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new D3.AttributeSerializer.AttributeSerializer.SavedAttribute();
        return builder;
      }
      
      protected D3.AttributeSerializer.AttributeSerializer.SavedAttribute internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new D3.AttributeSerializer.AttributeSerializer.SavedAttribute();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return D3.AttributeSerializer.AttributeSerializer.SavedAttribute.getDescriptor();
      }
      
      public D3.AttributeSerializer.AttributeSerializer.SavedAttribute getDefaultInstanceForType() {
        return D3.AttributeSerializer.AttributeSerializer.SavedAttribute.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public D3.AttributeSerializer.AttributeSerializer.SavedAttribute build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private D3.AttributeSerializer.AttributeSerializer.SavedAttribute buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public D3.AttributeSerializer.AttributeSerializer.SavedAttribute buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        D3.AttributeSerializer.AttributeSerializer.SavedAttribute returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof D3.AttributeSerializer.AttributeSerializer.SavedAttribute) {
          return mergeFrom((D3.AttributeSerializer.AttributeSerializer.SavedAttribute)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(D3.AttributeSerializer.AttributeSerializer.SavedAttribute other) {
        if (other == D3.AttributeSerializer.AttributeSerializer.SavedAttribute.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setKey(input.readSInt32());
              break;
            }
            case 16: {
              setValue(input.readSInt32());
              break;
            }
          }
        }
      }
      
      
      // required sint32 key = 1;
      public boolean hasKey() {
        return result.hasKey();
      }
      public int getKey() {
        return result.getKey();
      }
      public Builder setKey(int value) {
        result.hasKey = true;
        result.key_ = value;
        return this;
      }
      public Builder clearKey() {
        result.hasKey = false;
        result.key_ = 0;
        return this;
      }
      
      // required sint32 value = 2;
      public boolean hasValue() {
        return result.hasValue();
      }
      public int getValue() {
        return result.getValue();
      }
      public Builder setValue(int value) {
        result.hasValue = true;
        result.value_ = value;
        return this;
      }
      public Builder clearValue() {
        result.hasValue = false;
        result.value_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:D3.AttributeSerializer.SavedAttribute)
    }
    
    static {
      defaultInstance = new SavedAttribute(true);
      D3.AttributeSerializer.AttributeSerializer.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:D3.AttributeSerializer.SavedAttribute)
  }
  
  public static final class SavedAttributes extends
      com.google.protobuf.GeneratedMessage {
    // Use SavedAttributes.newBuilder() to construct.
    private SavedAttributes() {
      initFields();
    }
    private SavedAttributes(boolean noInit) {}
    
    private static final SavedAttributes defaultInstance;
    public static SavedAttributes getDefaultInstance() {
      return defaultInstance;
    }
    
    public SavedAttributes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return D3.AttributeSerializer.AttributeSerializer.internal_static_D3_AttributeSerializer_SavedAttributes_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return D3.AttributeSerializer.AttributeSerializer.internal_static_D3_AttributeSerializer_SavedAttributes_fieldAccessorTable;
    }
    
    // required .D3.GameBalance.Handle gb_handle = 1;
    public static final int GB_HANDLE_FIELD_NUMBER = 1;
    private boolean hasGbHandle;
    private D3.GameBalance.GBHandle.Handle gbHandle_;
    public boolean hasGbHandle() { return hasGbHandle; }
    public D3.GameBalance.GBHandle.Handle getGbHandle() { return gbHandle_; }
    
    // repeated .D3.AttributeSerializer.SavedAttribute attributes = 2;
    public static final int ATTRIBUTES_FIELD_NUMBER = 2;
    private java.util.List<D3.AttributeSerializer.AttributeSerializer.SavedAttribute> attributes_ =
      java.util.Collections.emptyList();
    public java.util.List<D3.AttributeSerializer.AttributeSerializer.SavedAttribute> getAttributesList() {
      return attributes_;
    }
    public int getAttributesCount() { return attributes_.size(); }
    public D3.AttributeSerializer.AttributeSerializer.SavedAttribute getAttributes(int index) {
      return attributes_.get(index);
    }
    
    private void initFields() {
      gbHandle_ = D3.GameBalance.GBHandle.Handle.getDefaultInstance();
    }
    public final boolean isInitialized() {
      if (!hasGbHandle) return false;
      if (!getGbHandle().isInitialized()) return false;
      for (D3.AttributeSerializer.AttributeSerializer.SavedAttribute element : getAttributesList()) {
        if (!element.isInitialized()) return false;
      }
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasGbHandle()) {
        output.writeMessage(1, getGbHandle());
      }
      for (D3.AttributeSerializer.AttributeSerializer.SavedAttribute element : getAttributesList()) {
        output.writeMessage(2, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasGbHandle()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getGbHandle());
      }
      for (D3.AttributeSerializer.AttributeSerializer.SavedAttribute element : getAttributesList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.AttributeSerializer.AttributeSerializer.SavedAttributes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(D3.AttributeSerializer.AttributeSerializer.SavedAttributes prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private D3.AttributeSerializer.AttributeSerializer.SavedAttributes result;
      
      // Construct using D3.AttributeSerializer.AttributeSerializer.SavedAttributes.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new D3.AttributeSerializer.AttributeSerializer.SavedAttributes();
        return builder;
      }
      
      protected D3.AttributeSerializer.AttributeSerializer.SavedAttributes internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new D3.AttributeSerializer.AttributeSerializer.SavedAttributes();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return D3.AttributeSerializer.AttributeSerializer.SavedAttributes.getDescriptor();
      }
      
      public D3.AttributeSerializer.AttributeSerializer.SavedAttributes getDefaultInstanceForType() {
        return D3.AttributeSerializer.AttributeSerializer.SavedAttributes.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public D3.AttributeSerializer.AttributeSerializer.SavedAttributes build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private D3.AttributeSerializer.AttributeSerializer.SavedAttributes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public D3.AttributeSerializer.AttributeSerializer.SavedAttributes buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.attributes_ != java.util.Collections.EMPTY_LIST) {
          result.attributes_ =
            java.util.Collections.unmodifiableList(result.attributes_);
        }
        D3.AttributeSerializer.AttributeSerializer.SavedAttributes returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof D3.AttributeSerializer.AttributeSerializer.SavedAttributes) {
          return mergeFrom((D3.AttributeSerializer.AttributeSerializer.SavedAttributes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(D3.AttributeSerializer.AttributeSerializer.SavedAttributes other) {
        if (other == D3.AttributeSerializer.AttributeSerializer.SavedAttributes.getDefaultInstance()) return this;
        if (other.hasGbHandle()) {
          mergeGbHandle(other.getGbHandle());
        }
        if (!other.attributes_.isEmpty()) {
          if (result.attributes_.isEmpty()) {
            result.attributes_ = new java.util.ArrayList<D3.AttributeSerializer.AttributeSerializer.SavedAttribute>();
          }
          result.attributes_.addAll(other.attributes_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              D3.GameBalance.GBHandle.Handle.Builder subBuilder = D3.GameBalance.GBHandle.Handle.newBuilder();
              if (hasGbHandle()) {
                subBuilder.mergeFrom(getGbHandle());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setGbHandle(subBuilder.buildPartial());
              break;
            }
            case 18: {
              D3.AttributeSerializer.AttributeSerializer.SavedAttribute.Builder subBuilder = D3.AttributeSerializer.AttributeSerializer.SavedAttribute.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addAttributes(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // required .D3.GameBalance.Handle gb_handle = 1;
      public boolean hasGbHandle() {
        return result.hasGbHandle();
      }
      public D3.GameBalance.GBHandle.Handle getGbHandle() {
        return result.getGbHandle();
      }
      public Builder setGbHandle(D3.GameBalance.GBHandle.Handle value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasGbHandle = true;
        result.gbHandle_ = value;
        return this;
      }
      public Builder setGbHandle(D3.GameBalance.GBHandle.Handle.Builder builderForValue) {
        result.hasGbHandle = true;
        result.gbHandle_ = builderForValue.build();
        return this;
      }
      public Builder mergeGbHandle(D3.GameBalance.GBHandle.Handle value) {
        if (result.hasGbHandle() &&
            result.gbHandle_ != D3.GameBalance.GBHandle.Handle.getDefaultInstance()) {
          result.gbHandle_ =
            D3.GameBalance.GBHandle.Handle.newBuilder(result.gbHandle_).mergeFrom(value).buildPartial();
        } else {
          result.gbHandle_ = value;
        }
        result.hasGbHandle = true;
        return this;
      }
      public Builder clearGbHandle() {
        result.hasGbHandle = false;
        result.gbHandle_ = D3.GameBalance.GBHandle.Handle.getDefaultInstance();
        return this;
      }
      
      // repeated .D3.AttributeSerializer.SavedAttribute attributes = 2;
      public java.util.List<D3.AttributeSerializer.AttributeSerializer.SavedAttribute> getAttributesList() {
        return java.util.Collections.unmodifiableList(result.attributes_);
      }
      public int getAttributesCount() {
        return result.getAttributesCount();
      }
      public D3.AttributeSerializer.AttributeSerializer.SavedAttribute getAttributes(int index) {
        return result.getAttributes(index);
      }
      public Builder setAttributes(int index, D3.AttributeSerializer.AttributeSerializer.SavedAttribute value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.attributes_.set(index, value);
        return this;
      }
      public Builder setAttributes(int index, D3.AttributeSerializer.AttributeSerializer.SavedAttribute.Builder builderForValue) {
        result.attributes_.set(index, builderForValue.build());
        return this;
      }
      public Builder addAttributes(D3.AttributeSerializer.AttributeSerializer.SavedAttribute value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.attributes_.isEmpty()) {
          result.attributes_ = new java.util.ArrayList<D3.AttributeSerializer.AttributeSerializer.SavedAttribute>();
        }
        result.attributes_.add(value);
        return this;
      }
      public Builder addAttributes(D3.AttributeSerializer.AttributeSerializer.SavedAttribute.Builder builderForValue) {
        if (result.attributes_.isEmpty()) {
          result.attributes_ = new java.util.ArrayList<D3.AttributeSerializer.AttributeSerializer.SavedAttribute>();
        }
        result.attributes_.add(builderForValue.build());
        return this;
      }
      public Builder addAllAttributes(
          java.lang.Iterable<? extends D3.AttributeSerializer.AttributeSerializer.SavedAttribute> values) {
        if (result.attributes_.isEmpty()) {
          result.attributes_ = new java.util.ArrayList<D3.AttributeSerializer.AttributeSerializer.SavedAttribute>();
        }
        super.addAll(values, result.attributes_);
        return this;
      }
      public Builder clearAttributes() {
        result.attributes_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:D3.AttributeSerializer.SavedAttributes)
    }
    
    static {
      defaultInstance = new SavedAttributes(true);
      D3.AttributeSerializer.AttributeSerializer.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:D3.AttributeSerializer.SavedAttributes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_D3_AttributeSerializer_SavedAttribute_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_D3_AttributeSerializer_SavedAttribute_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_D3_AttributeSerializer_SavedAttributes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_D3_AttributeSerializer_SavedAttributes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031AttributeSerializer.proto\022\026D3.Attribut" +
      "eSerializer\032\016GBHandle.proto\",\n\016SavedAttr" +
      "ibute\022\013\n\003key\030\001 \002(\021\022\r\n\005value\030\002 \002(\021\"x\n\017Sav" +
      "edAttributes\022)\n\tgb_handle\030\001 \002(\0132\026.D3.Gam" +
      "eBalance.Handle\022:\n\nattributes\030\002 \003(\0132&.D3" +
      ".AttributeSerializer.SavedAttribute"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_D3_AttributeSerializer_SavedAttribute_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_D3_AttributeSerializer_SavedAttribute_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_D3_AttributeSerializer_SavedAttribute_descriptor,
              new java.lang.String[] { "Key", "Value", },
              D3.AttributeSerializer.AttributeSerializer.SavedAttribute.class,
              D3.AttributeSerializer.AttributeSerializer.SavedAttribute.Builder.class);
          internal_static_D3_AttributeSerializer_SavedAttributes_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_D3_AttributeSerializer_SavedAttributes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_D3_AttributeSerializer_SavedAttributes_descriptor,
              new java.lang.String[] { "GbHandle", "Attributes", },
              D3.AttributeSerializer.AttributeSerializer.SavedAttributes.class,
              D3.AttributeSerializer.AttributeSerializer.SavedAttributes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          D3.GameBalance.GBHandle.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
