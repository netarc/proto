// Generated by the protocol buffer compiler.  DO NOT EDIT!

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "PartyMessage.pb.h"
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)

namespace D3 {
namespace PartyMessage {

namespace {

const ::google::protobuf::Descriptor* ScreenStatus_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  ScreenStatus_reflection_ = NULL;
const ::google::protobuf::Descriptor* SearchForPublicGameParams_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  SearchForPublicGameParams_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_PartyMessage_2eproto() {
  protobuf_AddDesc_PartyMessage_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "PartyMessage.proto");
  GOOGLE_CHECK(file != NULL);
  ScreenStatus_descriptor_ = file->message_type(0);
  static const int ScreenStatus_offsets_[2] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ScreenStatus, screen_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ScreenStatus, status_),
  };
  ScreenStatus_reflection_ =
    new ::google::protobuf::internal::GeneratedMessageReflection(
      ScreenStatus_descriptor_,
      ScreenStatus::default_instance_,
      ScreenStatus_offsets_,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ScreenStatus, _has_bits_[0]),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(ScreenStatus, _unknown_fields_),
      -1,
      ::google::protobuf::DescriptorPool::generated_pool(),
      ::google::protobuf::MessageFactory::generated_factory(),
      sizeof(ScreenStatus));
  SearchForPublicGameParams_descriptor_ = file->message_type(1);
  static const int SearchForPublicGameParams_offsets_[4] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SearchForPublicGameParams, start_time_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SearchForPublicGameParams, seconds_to_search_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SearchForPublicGameParams, game_params_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SearchForPublicGameParams, remove_reason_),
  };
  SearchForPublicGameParams_reflection_ =
    new ::google::protobuf::internal::GeneratedMessageReflection(
      SearchForPublicGameParams_descriptor_,
      SearchForPublicGameParams::default_instance_,
      SearchForPublicGameParams_offsets_,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SearchForPublicGameParams, _has_bits_[0]),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SearchForPublicGameParams, _unknown_fields_),
      -1,
      ::google::protobuf::DescriptorPool::generated_pool(),
      ::google::protobuf::MessageFactory::generated_factory(),
      sizeof(SearchForPublicGameParams));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
inline void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_PartyMessage_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
    ScreenStatus_descriptor_, &ScreenStatus::default_instance());
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
    SearchForPublicGameParams_descriptor_, &SearchForPublicGameParams::default_instance());
}

}  // namespace

void protobuf_ShutdownFile_PartyMessage_2eproto() {
  delete ScreenStatus::default_instance_;
  delete ScreenStatus_reflection_;
  delete SearchForPublicGameParams::default_instance_;
  delete SearchForPublicGameParams_reflection_;
}

void protobuf_AddDesc_PartyMessage_2eproto() {
  static bool already_here = false;
  if (already_here) return;
  already_here = true;
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::D3::OnlineService::protobuf_AddDesc_OnlineService_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\022PartyMessage.proto\022\017D3.PartyMessage\032\023O"
    "nlineService.proto\".\n\014ScreenStatus\022\016\n\006sc"
    "reen\030\001 \002(\005\022\016\n\006status\030\002 \002(\005\"\232\001\n\031SearchFor"
    "PublicGameParams\022\022\n\nstart_time\030\001 \001(\022\022\031\n\021"
    "seconds_to_search\030\002 \001(\r\0227\n\013game_params\030\003"
    " \001(\0132\".D3.OnlineService.GameCreateParams"
    "\022\025\n\rremove_reason\030\004 \001(\005", 263);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "PartyMessage.proto", &protobuf_RegisterTypes);
  ScreenStatus::default_instance_ = new ScreenStatus();
  SearchForPublicGameParams::default_instance_ = new SearchForPublicGameParams();
  ScreenStatus::default_instance_->InitAsDefaultInstance();
  SearchForPublicGameParams::default_instance_->InitAsDefaultInstance();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_PartyMessage_2eproto);
}

// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_PartyMessage_2eproto {
  StaticDescriptorInitializer_PartyMessage_2eproto() {
    protobuf_AddDesc_PartyMessage_2eproto();
  }
} static_descriptor_initializer_PartyMessage_2eproto_;


// ===================================================================

#ifndef _MSC_VER
const int ScreenStatus::kScreenFieldNumber;
const int ScreenStatus::kStatusFieldNumber;
#endif  // !_MSC_VER

ScreenStatus::ScreenStatus()
  : ::google::protobuf::Message() {
  SharedCtor();
}

void ScreenStatus::InitAsDefaultInstance() {
}

ScreenStatus::ScreenStatus(const ScreenStatus& from)
  : ::google::protobuf::Message() {
  SharedCtor();
  MergeFrom(from);
}

void ScreenStatus::SharedCtor() {
  _cached_size_ = 0;
  screen_ = 0;
  status_ = 0;
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

ScreenStatus::~ScreenStatus() {
  SharedDtor();
}

void ScreenStatus::SharedDtor() {
  if (this != default_instance_) {
  }
}

void ScreenStatus::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* ScreenStatus::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return ScreenStatus_descriptor_;
}

const ScreenStatus& ScreenStatus::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_PartyMessage_2eproto();  return *default_instance_;
}

ScreenStatus* ScreenStatus::default_instance_ = NULL;

ScreenStatus* ScreenStatus::New() const {
  return new ScreenStatus;
}

void ScreenStatus::Clear() {
  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    screen_ = 0;
    status_ = 0;
  }
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
  mutable_unknown_fields()->Clear();
}

bool ScreenStatus::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!(EXPRESSION)) return false
  ::google::protobuf::uint32 tag;
  while ((tag = input->ReadTag()) != 0) {
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // required int32 screen = 1;
      case 1: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &screen_)));
          _set_bit(0);
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectTag(16)) goto parse_status;
        break;
      }
      
      // required int32 status = 2;
      case 2: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
         parse_status:
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &status_)));
          _set_bit(1);
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectAtEnd()) return true;
        break;
      }
      
      default: {
      handle_uninterpreted:
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          return true;
        }
        DO_(::google::protobuf::internal::WireFormat::SkipField(
              input, tag, mutable_unknown_fields()));
        break;
      }
    }
  }
  return true;
#undef DO_
}

void ScreenStatus::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // required int32 screen = 1;
  if (_has_bit(0)) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(1, this->screen(), output);
  }
  
  // required int32 status = 2;
  if (_has_bit(1)) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(2, this->status(), output);
  }
  
  if (!unknown_fields().empty()) {
    ::google::protobuf::internal::WireFormat::SerializeUnknownFields(
        unknown_fields(), output);
  }
}

::google::protobuf::uint8* ScreenStatus::SerializeWithCachedSizesToArray(
    ::google::protobuf::uint8* target) const {
  // required int32 screen = 1;
  if (_has_bit(0)) {
    target = ::google::protobuf::internal::WireFormatLite::WriteInt32ToArray(1, this->screen(), target);
  }
  
  // required int32 status = 2;
  if (_has_bit(1)) {
    target = ::google::protobuf::internal::WireFormatLite::WriteInt32ToArray(2, this->status(), target);
  }
  
  if (!unknown_fields().empty()) {
    target = ::google::protobuf::internal::WireFormat::SerializeUnknownFieldsToArray(
        unknown_fields(), target);
  }
  return target;
}

int ScreenStatus::ByteSize() const {
  int total_size = 0;
  
  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    // required int32 screen = 1;
    if (has_screen()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::Int32Size(
          this->screen());
    }
    
    // required int32 status = 2;
    if (has_status()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::Int32Size(
          this->status());
    }
    
  }
  if (!unknown_fields().empty()) {
    total_size +=
      ::google::protobuf::internal::WireFormat::ComputeUnknownFieldsSize(
        unknown_fields());
  }
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = total_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void ScreenStatus::MergeFrom(const ::google::protobuf::Message& from) {
  GOOGLE_CHECK_NE(&from, this);
  const ScreenStatus* source =
    ::google::protobuf::internal::dynamic_cast_if_available<const ScreenStatus*>(
      &from);
  if (source == NULL) {
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
    MergeFrom(*source);
  }
}

void ScreenStatus::MergeFrom(const ScreenStatus& from) {
  GOOGLE_CHECK_NE(&from, this);
  if (from._has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    if (from._has_bit(0)) {
      set_screen(from.screen());
    }
    if (from._has_bit(1)) {
      set_status(from.status());
    }
  }
  mutable_unknown_fields()->MergeFrom(from.unknown_fields());
}

void ScreenStatus::CopyFrom(const ::google::protobuf::Message& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void ScreenStatus::CopyFrom(const ScreenStatus& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool ScreenStatus::IsInitialized() const {
  if ((_has_bits_[0] & 0x00000003) != 0x00000003) return false;
  
  return true;
}

void ScreenStatus::Swap(ScreenStatus* other) {
  if (other != this) {
    std::swap(screen_, other->screen_);
    std::swap(status_, other->status_);
    std::swap(_has_bits_[0], other->_has_bits_[0]);
    _unknown_fields_.Swap(&other->_unknown_fields_);
    std::swap(_cached_size_, other->_cached_size_);
  }
}

::google::protobuf::Metadata ScreenStatus::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = ScreenStatus_descriptor_;
  metadata.reflection = ScreenStatus_reflection_;
  return metadata;
}


// ===================================================================

#ifndef _MSC_VER
const int SearchForPublicGameParams::kStartTimeFieldNumber;
const int SearchForPublicGameParams::kSecondsToSearchFieldNumber;
const int SearchForPublicGameParams::kGameParamsFieldNumber;
const int SearchForPublicGameParams::kRemoveReasonFieldNumber;
#endif  // !_MSC_VER

SearchForPublicGameParams::SearchForPublicGameParams()
  : ::google::protobuf::Message() {
  SharedCtor();
}

void SearchForPublicGameParams::InitAsDefaultInstance() {
  game_params_ = const_cast< ::D3::OnlineService::GameCreateParams*>(&::D3::OnlineService::GameCreateParams::default_instance());
}

SearchForPublicGameParams::SearchForPublicGameParams(const SearchForPublicGameParams& from)
  : ::google::protobuf::Message() {
  SharedCtor();
  MergeFrom(from);
}

void SearchForPublicGameParams::SharedCtor() {
  _cached_size_ = 0;
  start_time_ = GOOGLE_LONGLONG(0);
  seconds_to_search_ = 0u;
  game_params_ = NULL;
  remove_reason_ = 0;
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

SearchForPublicGameParams::~SearchForPublicGameParams() {
  SharedDtor();
}

void SearchForPublicGameParams::SharedDtor() {
  if (this != default_instance_) {
    delete game_params_;
  }
}

void SearchForPublicGameParams::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* SearchForPublicGameParams::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return SearchForPublicGameParams_descriptor_;
}

const SearchForPublicGameParams& SearchForPublicGameParams::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_PartyMessage_2eproto();  return *default_instance_;
}

SearchForPublicGameParams* SearchForPublicGameParams::default_instance_ = NULL;

SearchForPublicGameParams* SearchForPublicGameParams::New() const {
  return new SearchForPublicGameParams;
}

void SearchForPublicGameParams::Clear() {
  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    start_time_ = GOOGLE_LONGLONG(0);
    seconds_to_search_ = 0u;
    if (_has_bit(2)) {
      if (game_params_ != NULL) game_params_->::D3::OnlineService::GameCreateParams::Clear();
    }
    remove_reason_ = 0;
  }
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
  mutable_unknown_fields()->Clear();
}

bool SearchForPublicGameParams::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!(EXPRESSION)) return false
  ::google::protobuf::uint32 tag;
  while ((tag = input->ReadTag()) != 0) {
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // optional sint64 start_time = 1;
      case 1: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int64, ::google::protobuf::internal::WireFormatLite::TYPE_SINT64>(
                 input, &start_time_)));
          _set_bit(0);
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectTag(16)) goto parse_seconds_to_search;
        break;
      }
      
      // optional uint32 seconds_to_search = 2;
      case 2: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
         parse_seconds_to_search:
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::uint32, ::google::protobuf::internal::WireFormatLite::TYPE_UINT32>(
                 input, &seconds_to_search_)));
          _set_bit(1);
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectTag(26)) goto parse_game_params;
        break;
      }
      
      // optional .D3.OnlineService.GameCreateParams game_params = 3;
      case 3: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_LENGTH_DELIMITED) {
         parse_game_params:
          DO_(::google::protobuf::internal::WireFormatLite::ReadMessageNoVirtual(
               input, mutable_game_params()));
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectTag(32)) goto parse_remove_reason;
        break;
      }
      
      // optional int32 remove_reason = 4;
      case 4: {
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_VARINT) {
         parse_remove_reason:
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &remove_reason_)));
          _set_bit(3);
        } else {
          goto handle_uninterpreted;
        }
        if (input->ExpectAtEnd()) return true;
        break;
      }
      
      default: {
      handle_uninterpreted:
        if (::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          return true;
        }
        DO_(::google::protobuf::internal::WireFormat::SkipField(
              input, tag, mutable_unknown_fields()));
        break;
      }
    }
  }
  return true;
#undef DO_
}

void SearchForPublicGameParams::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // optional sint64 start_time = 1;
  if (_has_bit(0)) {
    ::google::protobuf::internal::WireFormatLite::WriteSInt64(1, this->start_time(), output);
  }
  
  // optional uint32 seconds_to_search = 2;
  if (_has_bit(1)) {
    ::google::protobuf::internal::WireFormatLite::WriteUInt32(2, this->seconds_to_search(), output);
  }
  
  // optional .D3.OnlineService.GameCreateParams game_params = 3;
  if (_has_bit(2)) {
    ::google::protobuf::internal::WireFormatLite::WriteMessageMaybeToArray(
      3, this->game_params(), output);
  }
  
  // optional int32 remove_reason = 4;
  if (_has_bit(3)) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(4, this->remove_reason(), output);
  }
  
  if (!unknown_fields().empty()) {
    ::google::protobuf::internal::WireFormat::SerializeUnknownFields(
        unknown_fields(), output);
  }
}

::google::protobuf::uint8* SearchForPublicGameParams::SerializeWithCachedSizesToArray(
    ::google::protobuf::uint8* target) const {
  // optional sint64 start_time = 1;
  if (_has_bit(0)) {
    target = ::google::protobuf::internal::WireFormatLite::WriteSInt64ToArray(1, this->start_time(), target);
  }
  
  // optional uint32 seconds_to_search = 2;
  if (_has_bit(1)) {
    target = ::google::protobuf::internal::WireFormatLite::WriteUInt32ToArray(2, this->seconds_to_search(), target);
  }
  
  // optional .D3.OnlineService.GameCreateParams game_params = 3;
  if (_has_bit(2)) {
    target = ::google::protobuf::internal::WireFormatLite::
      WriteMessageNoVirtualToArray(
        3, this->game_params(), target);
  }
  
  // optional int32 remove_reason = 4;
  if (_has_bit(3)) {
    target = ::google::protobuf::internal::WireFormatLite::WriteInt32ToArray(4, this->remove_reason(), target);
  }
  
  if (!unknown_fields().empty()) {
    target = ::google::protobuf::internal::WireFormat::SerializeUnknownFieldsToArray(
        unknown_fields(), target);
  }
  return target;
}

int SearchForPublicGameParams::ByteSize() const {
  int total_size = 0;
  
  if (_has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    // optional sint64 start_time = 1;
    if (has_start_time()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::SInt64Size(
          this->start_time());
    }
    
    // optional uint32 seconds_to_search = 2;
    if (has_seconds_to_search()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::UInt32Size(
          this->seconds_to_search());
    }
    
    // optional .D3.OnlineService.GameCreateParams game_params = 3;
    if (has_game_params()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::MessageSizeNoVirtual(
          this->game_params());
    }
    
    // optional int32 remove_reason = 4;
    if (has_remove_reason()) {
      total_size += 1 +
        ::google::protobuf::internal::WireFormatLite::Int32Size(
          this->remove_reason());
    }
    
  }
  if (!unknown_fields().empty()) {
    total_size +=
      ::google::protobuf::internal::WireFormat::ComputeUnknownFieldsSize(
        unknown_fields());
  }
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = total_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void SearchForPublicGameParams::MergeFrom(const ::google::protobuf::Message& from) {
  GOOGLE_CHECK_NE(&from, this);
  const SearchForPublicGameParams* source =
    ::google::protobuf::internal::dynamic_cast_if_available<const SearchForPublicGameParams*>(
      &from);
  if (source == NULL) {
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
    MergeFrom(*source);
  }
}

void SearchForPublicGameParams::MergeFrom(const SearchForPublicGameParams& from) {
  GOOGLE_CHECK_NE(&from, this);
  if (from._has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    if (from._has_bit(0)) {
      set_start_time(from.start_time());
    }
    if (from._has_bit(1)) {
      set_seconds_to_search(from.seconds_to_search());
    }
    if (from._has_bit(2)) {
      mutable_game_params()->::D3::OnlineService::GameCreateParams::MergeFrom(from.game_params());
    }
    if (from._has_bit(3)) {
      set_remove_reason(from.remove_reason());
    }
  }
  mutable_unknown_fields()->MergeFrom(from.unknown_fields());
}

void SearchForPublicGameParams::CopyFrom(const ::google::protobuf::Message& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void SearchForPublicGameParams::CopyFrom(const SearchForPublicGameParams& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool SearchForPublicGameParams::IsInitialized() const {
  
  if (has_game_params()) {
    if (!this->game_params().IsInitialized()) return false;
  }
  return true;
}

void SearchForPublicGameParams::Swap(SearchForPublicGameParams* other) {
  if (other != this) {
    std::swap(start_time_, other->start_time_);
    std::swap(seconds_to_search_, other->seconds_to_search_);
    std::swap(game_params_, other->game_params_);
    std::swap(remove_reason_, other->remove_reason_);
    std::swap(_has_bits_[0], other->_has_bits_[0]);
    _unknown_fields_.Swap(&other->_unknown_fields_);
    std::swap(_cached_size_, other->_cached_size_);
  }
}

::google::protobuf::Metadata SearchForPublicGameParams::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = SearchForPublicGameParams_descriptor_;
  metadata.reflection = SearchForPublicGameParams_reflection_;
  return metadata;
}


// @@protoc_insertion_point(namespace_scope)

}  // namespace PartyMessage
}  // namespace D3

// @@protoc_insertion_point(global_scope)
