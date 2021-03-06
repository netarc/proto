// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hireling.proto

package D3.Hireling;

public final class Hireling {
  private Hireling() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Info extends
      com.google.protobuf.GeneratedMessage {
    // Use Info.newBuilder() to construct.
    private Info() {
      initFields();
    }
    private Info(boolean noInit) {}
    
    private static final Info defaultInstance;
    public static Info getDefaultInstance() {
      return defaultInstance;
    }
    
    public Info getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return D3.Hireling.Hireling.internal_static_D3_Hireling_Info_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return D3.Hireling.Hireling.internal_static_D3_Hireling_Info_fieldAccessorTable;
    }
    
    // required sint32 hireling_class = 1;
    public static final int HIRELING_CLASS_FIELD_NUMBER = 1;
    private boolean hasHirelingClass;
    private int hirelingClass_ = 0;
    public boolean hasHirelingClass() { return hasHirelingClass; }
    public int getHirelingClass() { return hirelingClass_; }
    
    // required sfixed32 gbid_name = 2;
    public static final int GBID_NAME_FIELD_NUMBER = 2;
    private boolean hasGbidName;
    private int gbidName_ = 0;
    public boolean hasGbidName() { return hasGbidName; }
    public int getGbidName() { return gbidName_; }
    
    // required sint32 level = 3;
    public static final int LEVEL_FIELD_NUMBER = 3;
    private boolean hasLevel;
    private int level_ = 0;
    public boolean hasLevel() { return hasLevel; }
    public int getLevel() { return level_; }
    
    // required uint32 attribute_experience_next = 4;
    public static final int ATTRIBUTE_EXPERIENCE_NEXT_FIELD_NUMBER = 4;
    private boolean hasAttributeExperienceNext;
    private int attributeExperienceNext_ = 0;
    public boolean hasAttributeExperienceNext() { return hasAttributeExperienceNext; }
    public int getAttributeExperienceNext() { return attributeExperienceNext_; }
    
    // repeated sint32 power_key_params = 11;
    public static final int POWER_KEY_PARAMS_FIELD_NUMBER = 11;
    private java.util.List<java.lang.Integer> powerKeyParams_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.Integer> getPowerKeyParamsList() {
      return powerKeyParams_;
    }
    public int getPowerKeyParamsCount() { return powerKeyParams_.size(); }
    public int getPowerKeyParams(int index) {
      return powerKeyParams_.get(index);
    }
    
    // required bool dead = 12;
    public static final int DEAD_FIELD_NUMBER = 12;
    private boolean hasDead;
    private boolean dead_ = false;
    public boolean hasDead() { return hasDead; }
    public boolean getDead() { return dead_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasHirelingClass) return false;
      if (!hasGbidName) return false;
      if (!hasLevel) return false;
      if (!hasAttributeExperienceNext) return false;
      if (!hasDead) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasHirelingClass()) {
        output.writeSInt32(1, getHirelingClass());
      }
      if (hasGbidName()) {
        output.writeSFixed32(2, getGbidName());
      }
      if (hasLevel()) {
        output.writeSInt32(3, getLevel());
      }
      if (hasAttributeExperienceNext()) {
        output.writeUInt32(4, getAttributeExperienceNext());
      }
      for (int element : getPowerKeyParamsList()) {
        output.writeSInt32(11, element);
      }
      if (hasDead()) {
        output.writeBool(12, getDead());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasHirelingClass()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(1, getHirelingClass());
      }
      if (hasGbidName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed32Size(2, getGbidName());
      }
      if (hasLevel()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(3, getLevel());
      }
      if (hasAttributeExperienceNext()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, getAttributeExperienceNext());
      }
      {
        int dataSize = 0;
        for (int element : getPowerKeyParamsList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeSInt32SizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getPowerKeyParamsList().size();
      }
      if (hasDead()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, getDead());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static D3.Hireling.Hireling.Info parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.Hireling.Hireling.Info parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.Hireling.Hireling.Info parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.Hireling.Hireling.Info parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.Hireling.Hireling.Info parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.Hireling.Hireling.Info parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static D3.Hireling.Hireling.Info parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.Hireling.Hireling.Info parseDelimitedFrom(
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
    public static D3.Hireling.Hireling.Info parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.Hireling.Hireling.Info parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(D3.Hireling.Hireling.Info prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private D3.Hireling.Hireling.Info result;
      
      // Construct using D3.Hireling.Hireling.Info.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new D3.Hireling.Hireling.Info();
        return builder;
      }
      
      protected D3.Hireling.Hireling.Info internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new D3.Hireling.Hireling.Info();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return D3.Hireling.Hireling.Info.getDescriptor();
      }
      
      public D3.Hireling.Hireling.Info getDefaultInstanceForType() {
        return D3.Hireling.Hireling.Info.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public D3.Hireling.Hireling.Info build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private D3.Hireling.Hireling.Info buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public D3.Hireling.Hireling.Info buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.powerKeyParams_ != java.util.Collections.EMPTY_LIST) {
          result.powerKeyParams_ =
            java.util.Collections.unmodifiableList(result.powerKeyParams_);
        }
        D3.Hireling.Hireling.Info returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof D3.Hireling.Hireling.Info) {
          return mergeFrom((D3.Hireling.Hireling.Info)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(D3.Hireling.Hireling.Info other) {
        if (other == D3.Hireling.Hireling.Info.getDefaultInstance()) return this;
        if (other.hasHirelingClass()) {
          setHirelingClass(other.getHirelingClass());
        }
        if (other.hasGbidName()) {
          setGbidName(other.getGbidName());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasAttributeExperienceNext()) {
          setAttributeExperienceNext(other.getAttributeExperienceNext());
        }
        if (!other.powerKeyParams_.isEmpty()) {
          if (result.powerKeyParams_.isEmpty()) {
            result.powerKeyParams_ = new java.util.ArrayList<java.lang.Integer>();
          }
          result.powerKeyParams_.addAll(other.powerKeyParams_);
        }
        if (other.hasDead()) {
          setDead(other.getDead());
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
              setHirelingClass(input.readSInt32());
              break;
            }
            case 21: {
              setGbidName(input.readSFixed32());
              break;
            }
            case 24: {
              setLevel(input.readSInt32());
              break;
            }
            case 32: {
              setAttributeExperienceNext(input.readUInt32());
              break;
            }
            case 88: {
              addPowerKeyParams(input.readSInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addPowerKeyParams(input.readSInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {
              setDead(input.readBool());
              break;
            }
          }
        }
      }
      
      
      // required sint32 hireling_class = 1;
      public boolean hasHirelingClass() {
        return result.hasHirelingClass();
      }
      public int getHirelingClass() {
        return result.getHirelingClass();
      }
      public Builder setHirelingClass(int value) {
        result.hasHirelingClass = true;
        result.hirelingClass_ = value;
        return this;
      }
      public Builder clearHirelingClass() {
        result.hasHirelingClass = false;
        result.hirelingClass_ = 0;
        return this;
      }
      
      // required sfixed32 gbid_name = 2;
      public boolean hasGbidName() {
        return result.hasGbidName();
      }
      public int getGbidName() {
        return result.getGbidName();
      }
      public Builder setGbidName(int value) {
        result.hasGbidName = true;
        result.gbidName_ = value;
        return this;
      }
      public Builder clearGbidName() {
        result.hasGbidName = false;
        result.gbidName_ = 0;
        return this;
      }
      
      // required sint32 level = 3;
      public boolean hasLevel() {
        return result.hasLevel();
      }
      public int getLevel() {
        return result.getLevel();
      }
      public Builder setLevel(int value) {
        result.hasLevel = true;
        result.level_ = value;
        return this;
      }
      public Builder clearLevel() {
        result.hasLevel = false;
        result.level_ = 0;
        return this;
      }
      
      // required uint32 attribute_experience_next = 4;
      public boolean hasAttributeExperienceNext() {
        return result.hasAttributeExperienceNext();
      }
      public int getAttributeExperienceNext() {
        return result.getAttributeExperienceNext();
      }
      public Builder setAttributeExperienceNext(int value) {
        result.hasAttributeExperienceNext = true;
        result.attributeExperienceNext_ = value;
        return this;
      }
      public Builder clearAttributeExperienceNext() {
        result.hasAttributeExperienceNext = false;
        result.attributeExperienceNext_ = 0;
        return this;
      }
      
      // repeated sint32 power_key_params = 11;
      public java.util.List<java.lang.Integer> getPowerKeyParamsList() {
        return java.util.Collections.unmodifiableList(result.powerKeyParams_);
      }
      public int getPowerKeyParamsCount() {
        return result.getPowerKeyParamsCount();
      }
      public int getPowerKeyParams(int index) {
        return result.getPowerKeyParams(index);
      }
      public Builder setPowerKeyParams(int index, int value) {
        result.powerKeyParams_.set(index, value);
        return this;
      }
      public Builder addPowerKeyParams(int value) {
        if (result.powerKeyParams_.isEmpty()) {
          result.powerKeyParams_ = new java.util.ArrayList<java.lang.Integer>();
        }
        result.powerKeyParams_.add(value);
        return this;
      }
      public Builder addAllPowerKeyParams(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        if (result.powerKeyParams_.isEmpty()) {
          result.powerKeyParams_ = new java.util.ArrayList<java.lang.Integer>();
        }
        super.addAll(values, result.powerKeyParams_);
        return this;
      }
      public Builder clearPowerKeyParams() {
        result.powerKeyParams_ = java.util.Collections.emptyList();
        return this;
      }
      
      // required bool dead = 12;
      public boolean hasDead() {
        return result.hasDead();
      }
      public boolean getDead() {
        return result.getDead();
      }
      public Builder setDead(boolean value) {
        result.hasDead = true;
        result.dead_ = value;
        return this;
      }
      public Builder clearDead() {
        result.hasDead = false;
        result.dead_ = false;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:D3.Hireling.Info)
    }
    
    static {
      defaultInstance = new Info(true);
      D3.Hireling.Hireling.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:D3.Hireling.Info)
  }
  
  public static final class SavedData extends
      com.google.protobuf.GeneratedMessage {
    // Use SavedData.newBuilder() to construct.
    private SavedData() {
      initFields();
    }
    private SavedData(boolean noInit) {}
    
    private static final SavedData defaultInstance;
    public static SavedData getDefaultInstance() {
      return defaultInstance;
    }
    
    public SavedData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return D3.Hireling.Hireling.internal_static_D3_Hireling_SavedData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return D3.Hireling.Hireling.internal_static_D3_Hireling_SavedData_fieldAccessorTable;
    }
    
    // repeated .D3.Hireling.Info hirelings = 1;
    public static final int HIRELINGS_FIELD_NUMBER = 1;
    private java.util.List<D3.Hireling.Hireling.Info> hirelings_ =
      java.util.Collections.emptyList();
    public java.util.List<D3.Hireling.Hireling.Info> getHirelingsList() {
      return hirelings_;
    }
    public int getHirelingsCount() { return hirelings_.size(); }
    public D3.Hireling.Hireling.Info getHirelings(int index) {
      return hirelings_.get(index);
    }
    
    // required uint32 active_hireling = 2;
    public static final int ACTIVE_HIRELING_FIELD_NUMBER = 2;
    private boolean hasActiveHireling;
    private int activeHireling_ = 0;
    public boolean hasActiveHireling() { return hasActiveHireling; }
    public int getActiveHireling() { return activeHireling_; }
    
    // required uint32 available_hirelings_bitfield = 3;
    public static final int AVAILABLE_HIRELINGS_BITFIELD_FIELD_NUMBER = 3;
    private boolean hasAvailableHirelingsBitfield;
    private int availableHirelingsBitfield_ = 0;
    public boolean hasAvailableHirelingsBitfield() { return hasAvailableHirelingsBitfield; }
    public int getAvailableHirelingsBitfield() { return availableHirelingsBitfield_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasActiveHireling) return false;
      if (!hasAvailableHirelingsBitfield) return false;
      for (D3.Hireling.Hireling.Info element : getHirelingsList()) {
        if (!element.isInitialized()) return false;
      }
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (D3.Hireling.Hireling.Info element : getHirelingsList()) {
        output.writeMessage(1, element);
      }
      if (hasActiveHireling()) {
        output.writeUInt32(2, getActiveHireling());
      }
      if (hasAvailableHirelingsBitfield()) {
        output.writeUInt32(3, getAvailableHirelingsBitfield());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (D3.Hireling.Hireling.Info element : getHirelingsList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, element);
      }
      if (hasActiveHireling()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, getActiveHireling());
      }
      if (hasAvailableHirelingsBitfield()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, getAvailableHirelingsBitfield());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static D3.Hireling.Hireling.SavedData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.Hireling.Hireling.SavedData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.Hireling.Hireling.SavedData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static D3.Hireling.Hireling.SavedData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static D3.Hireling.Hireling.SavedData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.Hireling.Hireling.SavedData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static D3.Hireling.Hireling.SavedData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static D3.Hireling.Hireling.SavedData parseDelimitedFrom(
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
    public static D3.Hireling.Hireling.SavedData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static D3.Hireling.Hireling.SavedData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(D3.Hireling.Hireling.SavedData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private D3.Hireling.Hireling.SavedData result;
      
      // Construct using D3.Hireling.Hireling.SavedData.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new D3.Hireling.Hireling.SavedData();
        return builder;
      }
      
      protected D3.Hireling.Hireling.SavedData internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new D3.Hireling.Hireling.SavedData();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return D3.Hireling.Hireling.SavedData.getDescriptor();
      }
      
      public D3.Hireling.Hireling.SavedData getDefaultInstanceForType() {
        return D3.Hireling.Hireling.SavedData.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public D3.Hireling.Hireling.SavedData build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private D3.Hireling.Hireling.SavedData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public D3.Hireling.Hireling.SavedData buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.hirelings_ != java.util.Collections.EMPTY_LIST) {
          result.hirelings_ =
            java.util.Collections.unmodifiableList(result.hirelings_);
        }
        D3.Hireling.Hireling.SavedData returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof D3.Hireling.Hireling.SavedData) {
          return mergeFrom((D3.Hireling.Hireling.SavedData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(D3.Hireling.Hireling.SavedData other) {
        if (other == D3.Hireling.Hireling.SavedData.getDefaultInstance()) return this;
        if (!other.hirelings_.isEmpty()) {
          if (result.hirelings_.isEmpty()) {
            result.hirelings_ = new java.util.ArrayList<D3.Hireling.Hireling.Info>();
          }
          result.hirelings_.addAll(other.hirelings_);
        }
        if (other.hasActiveHireling()) {
          setActiveHireling(other.getActiveHireling());
        }
        if (other.hasAvailableHirelingsBitfield()) {
          setAvailableHirelingsBitfield(other.getAvailableHirelingsBitfield());
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
              D3.Hireling.Hireling.Info.Builder subBuilder = D3.Hireling.Hireling.Info.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addHirelings(subBuilder.buildPartial());
              break;
            }
            case 16: {
              setActiveHireling(input.readUInt32());
              break;
            }
            case 24: {
              setAvailableHirelingsBitfield(input.readUInt32());
              break;
            }
          }
        }
      }
      
      
      // repeated .D3.Hireling.Info hirelings = 1;
      public java.util.List<D3.Hireling.Hireling.Info> getHirelingsList() {
        return java.util.Collections.unmodifiableList(result.hirelings_);
      }
      public int getHirelingsCount() {
        return result.getHirelingsCount();
      }
      public D3.Hireling.Hireling.Info getHirelings(int index) {
        return result.getHirelings(index);
      }
      public Builder setHirelings(int index, D3.Hireling.Hireling.Info value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hirelings_.set(index, value);
        return this;
      }
      public Builder setHirelings(int index, D3.Hireling.Hireling.Info.Builder builderForValue) {
        result.hirelings_.set(index, builderForValue.build());
        return this;
      }
      public Builder addHirelings(D3.Hireling.Hireling.Info value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.hirelings_.isEmpty()) {
          result.hirelings_ = new java.util.ArrayList<D3.Hireling.Hireling.Info>();
        }
        result.hirelings_.add(value);
        return this;
      }
      public Builder addHirelings(D3.Hireling.Hireling.Info.Builder builderForValue) {
        if (result.hirelings_.isEmpty()) {
          result.hirelings_ = new java.util.ArrayList<D3.Hireling.Hireling.Info>();
        }
        result.hirelings_.add(builderForValue.build());
        return this;
      }
      public Builder addAllHirelings(
          java.lang.Iterable<? extends D3.Hireling.Hireling.Info> values) {
        if (result.hirelings_.isEmpty()) {
          result.hirelings_ = new java.util.ArrayList<D3.Hireling.Hireling.Info>();
        }
        super.addAll(values, result.hirelings_);
        return this;
      }
      public Builder clearHirelings() {
        result.hirelings_ = java.util.Collections.emptyList();
        return this;
      }
      
      // required uint32 active_hireling = 2;
      public boolean hasActiveHireling() {
        return result.hasActiveHireling();
      }
      public int getActiveHireling() {
        return result.getActiveHireling();
      }
      public Builder setActiveHireling(int value) {
        result.hasActiveHireling = true;
        result.activeHireling_ = value;
        return this;
      }
      public Builder clearActiveHireling() {
        result.hasActiveHireling = false;
        result.activeHireling_ = 0;
        return this;
      }
      
      // required uint32 available_hirelings_bitfield = 3;
      public boolean hasAvailableHirelingsBitfield() {
        return result.hasAvailableHirelingsBitfield();
      }
      public int getAvailableHirelingsBitfield() {
        return result.getAvailableHirelingsBitfield();
      }
      public Builder setAvailableHirelingsBitfield(int value) {
        result.hasAvailableHirelingsBitfield = true;
        result.availableHirelingsBitfield_ = value;
        return this;
      }
      public Builder clearAvailableHirelingsBitfield() {
        result.hasAvailableHirelingsBitfield = false;
        result.availableHirelingsBitfield_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:D3.Hireling.SavedData)
    }
    
    static {
      defaultInstance = new SavedData(true);
      D3.Hireling.Hireling.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:D3.Hireling.SavedData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_D3_Hireling_Info_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_D3_Hireling_Info_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_D3_Hireling_SavedData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_D3_Hireling_SavedData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Hireling.proto\022\013D3.Hireling\"\213\001\n\004Info\022\026" +
      "\n\016hireling_class\030\001 \002(\021\022\021\n\tgbid_name\030\002 \002(" +
      "\017\022\r\n\005level\030\003 \002(\021\022!\n\031attribute_experience" +
      "_next\030\004 \002(\r\022\030\n\020power_key_params\030\013 \003(\021\022\014\n" +
      "\004dead\030\014 \002(\010\"p\n\tSavedData\022$\n\thirelings\030\001 " +
      "\003(\0132\021.D3.Hireling.Info\022\027\n\017active_hirelin" +
      "g\030\002 \002(\r\022$\n\034available_hirelings_bitfield\030" +
      "\003 \002(\r"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_D3_Hireling_Info_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_D3_Hireling_Info_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_D3_Hireling_Info_descriptor,
              new java.lang.String[] { "HirelingClass", "GbidName", "Level", "AttributeExperienceNext", "PowerKeyParams", "Dead", },
              D3.Hireling.Hireling.Info.class,
              D3.Hireling.Hireling.Info.Builder.class);
          internal_static_D3_Hireling_SavedData_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_D3_Hireling_SavedData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_D3_Hireling_SavedData_descriptor,
              new java.lang.String[] { "Hirelings", "ActiveHireling", "AvailableHirelingsBitfield", },
              D3.Hireling.Hireling.SavedData.class,
              D3.Hireling.Hireling.SavedData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
