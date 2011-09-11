# Generated by the protocol buffer compiler.  DO NOT EDIT!

from google.protobuf import descriptor
from google.protobuf import message
from google.protobuf import reflection
from google.protobuf import service
from google.protobuf import service_reflection
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)


DESCRIPTOR = descriptor.FileDescriptor(
  name='lib/rpc/connection.proto',
  package='bnet.protocol.connection',
  serialized_pb='\n\x18lib/rpc/connection.proto\x12\x18\x62net.protocol.connection\x1a\x11lib/rpc/rpc.proto\"=\n\x0e\x43onnectRequest\x12+\n\tclient_id\x18\x01 \x01(\x0b\x32\x18.bnet.protocol.ProcessId\"k\n\x0f\x43onnectResponse\x12+\n\tserver_id\x18\x01 \x02(\x0b\x32\x18.bnet.protocol.ProcessId\x12+\n\tclient_id\x18\x02 \x01(\x0b\x32\x18.bnet.protocol.ProcessId\"(\n\x0c\x42oundService\x12\x0c\n\x04hash\x18\x01 \x02(\x07\x12\n\n\x02id\x18\x02 \x02(\r\"r\n\x0b\x42indRequest\x12!\n\x15imported_service_hash\x18\x01 \x03(\x07\x42\x02\x10\x01\x12@\n\x10\x65xported_service\x18\x02 \x03(\x0b\x32&.bnet.protocol.connection.BoundService\"/\n\x0c\x42indResponse\x12\x1f\n\x13imported_service_id\x18\x01 \x03(\rB\x02\x10\x01\"I\n\x0b\x45\x63hoRequest\x12\x0c\n\x04time\x18\x01 \x01(\x06\x12\x1b\n\x0cnetwork_only\x18\x02 \x01(\x08:\x05\x66\x61lse\x12\x0f\n\x07payload\x18\x03 \x01(\x0c\"-\n\x0c\x45\x63hoResponse\x12\x0c\n\x04time\x18\x01 \x01(\x06\x12\x0f\n\x07payload\x18\x02 \x01(\x0c\"\'\n\x11\x44isconnectRequest\x12\x12\n\nerror_code\x18\x01 \x02(\r\"<\n\x16\x44isconnectNotification\x12\x12\n\nerror_code\x18\x01 \x02(\r\x12\x0e\n\x06reason\x18\x02 \x01(\t\"\r\n\x0bNullRequest\"\x10\n\x0e\x45ncryptRequest2\xf7\x04\n\x11\x43onnectionService\x12^\n\x07\x43onnect\x12(.bnet.protocol.connection.ConnectRequest\x1a).bnet.protocol.connection.ConnectResponse\x12U\n\x04\x42ind\x12%.bnet.protocol.connection.BindRequest\x1a&.bnet.protocol.connection.BindResponse\x12U\n\x04\x45\x63ho\x12%.bnet.protocol.connection.EchoRequest\x1a&.bnet.protocol.connection.EchoResponse\x12_\n\x0f\x46orceDisconnect\x12\x30.bnet.protocol.connection.DisconnectNotification\x1a\x1a.bnet.protocol.NO_RESPONSE\x12I\n\x04Null\x12%.bnet.protocol.connection.NullRequest\x1a\x1a.bnet.protocol.NO_RESPONSE\x12J\n\x07\x45ncrypt\x12(.bnet.protocol.connection.EncryptRequest\x1a\x15.bnet.protocol.NoData\x12\\\n\x11RequestDisconnect\x12+.bnet.protocol.connection.DisconnectRequest\x1a\x1a.bnet.protocol.NO_RESPONSEB\x03\x80\x01\x01')




_CONNECTREQUEST = descriptor.Descriptor(
  name='ConnectRequest',
  full_name='bnet.protocol.connection.ConnectRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='client_id', full_name='bnet.protocol.connection.ConnectRequest.client_id', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=73,
  serialized_end=134,
)


_CONNECTRESPONSE = descriptor.Descriptor(
  name='ConnectResponse',
  full_name='bnet.protocol.connection.ConnectResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='server_id', full_name='bnet.protocol.connection.ConnectResponse.server_id', index=0,
      number=1, type=11, cpp_type=10, label=2,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='client_id', full_name='bnet.protocol.connection.ConnectResponse.client_id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=136,
  serialized_end=243,
)


_BOUNDSERVICE = descriptor.Descriptor(
  name='BoundService',
  full_name='bnet.protocol.connection.BoundService',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='hash', full_name='bnet.protocol.connection.BoundService.hash', index=0,
      number=1, type=7, cpp_type=3, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='id', full_name='bnet.protocol.connection.BoundService.id', index=1,
      number=2, type=13, cpp_type=3, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=245,
  serialized_end=285,
)


_BINDREQUEST = descriptor.Descriptor(
  name='BindRequest',
  full_name='bnet.protocol.connection.BindRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='imported_service_hash', full_name='bnet.protocol.connection.BindRequest.imported_service_hash', index=0,
      number=1, type=7, cpp_type=3, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=descriptor._ParseOptions(descriptor_pb2.FieldOptions(), '\020\001')),
    descriptor.FieldDescriptor(
      name='exported_service', full_name='bnet.protocol.connection.BindRequest.exported_service', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=287,
  serialized_end=401,
)


_BINDRESPONSE = descriptor.Descriptor(
  name='BindResponse',
  full_name='bnet.protocol.connection.BindResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='imported_service_id', full_name='bnet.protocol.connection.BindResponse.imported_service_id', index=0,
      number=1, type=13, cpp_type=3, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=descriptor._ParseOptions(descriptor_pb2.FieldOptions(), '\020\001')),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=403,
  serialized_end=450,
)


_ECHOREQUEST = descriptor.Descriptor(
  name='EchoRequest',
  full_name='bnet.protocol.connection.EchoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='time', full_name='bnet.protocol.connection.EchoRequest.time', index=0,
      number=1, type=6, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='network_only', full_name='bnet.protocol.connection.EchoRequest.network_only', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=True, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='payload', full_name='bnet.protocol.connection.EchoRequest.payload', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value="",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=452,
  serialized_end=525,
)


_ECHORESPONSE = descriptor.Descriptor(
  name='EchoResponse',
  full_name='bnet.protocol.connection.EchoResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='time', full_name='bnet.protocol.connection.EchoResponse.time', index=0,
      number=1, type=6, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='payload', full_name='bnet.protocol.connection.EchoResponse.payload', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value="",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=527,
  serialized_end=572,
)


_DISCONNECTREQUEST = descriptor.Descriptor(
  name='DisconnectRequest',
  full_name='bnet.protocol.connection.DisconnectRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='error_code', full_name='bnet.protocol.connection.DisconnectRequest.error_code', index=0,
      number=1, type=13, cpp_type=3, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=574,
  serialized_end=613,
)


_DISCONNECTNOTIFICATION = descriptor.Descriptor(
  name='DisconnectNotification',
  full_name='bnet.protocol.connection.DisconnectNotification',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    descriptor.FieldDescriptor(
      name='error_code', full_name='bnet.protocol.connection.DisconnectNotification.error_code', index=0,
      number=1, type=13, cpp_type=3, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    descriptor.FieldDescriptor(
      name='reason', full_name='bnet.protocol.connection.DisconnectNotification.reason', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=unicode("", "utf-8"),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=615,
  serialized_end=675,
)


_NULLREQUEST = descriptor.Descriptor(
  name='NullRequest',
  full_name='bnet.protocol.connection.NullRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=677,
  serialized_end=690,
)


_ENCRYPTREQUEST = descriptor.Descriptor(
  name='EncryptRequest',
  full_name='bnet.protocol.connection.EncryptRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=692,
  serialized_end=708,
)

import lib.rpc.rpc_pb2

_CONNECTREQUEST.fields_by_name['client_id'].message_type = lib.rpc.rpc_pb2._PROCESSID
_CONNECTRESPONSE.fields_by_name['server_id'].message_type = lib.rpc.rpc_pb2._PROCESSID
_CONNECTRESPONSE.fields_by_name['client_id'].message_type = lib.rpc.rpc_pb2._PROCESSID
_BINDREQUEST.fields_by_name['exported_service'].message_type = _BOUNDSERVICE

class ConnectRequest(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _CONNECTREQUEST
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.ConnectRequest)

class ConnectResponse(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _CONNECTRESPONSE
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.ConnectResponse)

class BoundService(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _BOUNDSERVICE
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.BoundService)

class BindRequest(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _BINDREQUEST
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.BindRequest)

class BindResponse(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _BINDRESPONSE
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.BindResponse)

class EchoRequest(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _ECHOREQUEST
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.EchoRequest)

class EchoResponse(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _ECHORESPONSE
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.EchoResponse)

class DisconnectRequest(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _DISCONNECTREQUEST
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.DisconnectRequest)

class DisconnectNotification(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _DISCONNECTNOTIFICATION
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.DisconnectNotification)

class NullRequest(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _NULLREQUEST
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.NullRequest)

class EncryptRequest(message.Message):
  __metaclass__ = reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _ENCRYPTREQUEST
  
  # @@protoc_insertion_point(class_scope:bnet.protocol.connection.EncryptRequest)


_CONNECTIONSERVICE = descriptor.ServiceDescriptor(
  name='ConnectionService',
  full_name='bnet.protocol.connection.ConnectionService',
  file=DESCRIPTOR,
  index=0,
  options=None,
  serialized_start=711,
  serialized_end=1342,
  methods=[
  descriptor.MethodDescriptor(
    name='Connect',
    full_name='bnet.protocol.connection.ConnectionService.Connect',
    index=0,
    containing_service=None,
    input_type=_CONNECTREQUEST,
    output_type=_CONNECTRESPONSE,
    options=None,
  ),
  descriptor.MethodDescriptor(
    name='Bind',
    full_name='bnet.protocol.connection.ConnectionService.Bind',
    index=1,
    containing_service=None,
    input_type=_BINDREQUEST,
    output_type=_BINDRESPONSE,
    options=None,
  ),
  descriptor.MethodDescriptor(
    name='Echo',
    full_name='bnet.protocol.connection.ConnectionService.Echo',
    index=2,
    containing_service=None,
    input_type=_ECHOREQUEST,
    output_type=_ECHORESPONSE,
    options=None,
  ),
  descriptor.MethodDescriptor(
    name='ForceDisconnect',
    full_name='bnet.protocol.connection.ConnectionService.ForceDisconnect',
    index=3,
    containing_service=None,
    input_type=_DISCONNECTNOTIFICATION,
    output_type=lib.rpc.rpc_pb2._NO_RESPONSE,
    options=None,
  ),
  descriptor.MethodDescriptor(
    name='Null',
    full_name='bnet.protocol.connection.ConnectionService.Null',
    index=4,
    containing_service=None,
    input_type=_NULLREQUEST,
    output_type=lib.rpc.rpc_pb2._NO_RESPONSE,
    options=None,
  ),
  descriptor.MethodDescriptor(
    name='Encrypt',
    full_name='bnet.protocol.connection.ConnectionService.Encrypt',
    index=5,
    containing_service=None,
    input_type=_ENCRYPTREQUEST,
    output_type=lib.rpc.rpc_pb2._NODATA,
    options=None,
  ),
  descriptor.MethodDescriptor(
    name='RequestDisconnect',
    full_name='bnet.protocol.connection.ConnectionService.RequestDisconnect',
    index=6,
    containing_service=None,
    input_type=_DISCONNECTREQUEST,
    output_type=lib.rpc.rpc_pb2._NO_RESPONSE,
    options=None,
  ),
])

class ConnectionService(service.Service):
  __metaclass__ = service_reflection.GeneratedServiceType
  DESCRIPTOR = _CONNECTIONSERVICE
class ConnectionService_Stub(ConnectionService):
  __metaclass__ = service_reflection.GeneratedServiceStubType
  DESCRIPTOR = _CONNECTIONSERVICE

# @@protoc_insertion_point(module_scope)
