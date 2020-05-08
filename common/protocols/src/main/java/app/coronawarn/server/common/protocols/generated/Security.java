// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security.proto

package app.coronawarn.server.common.protocols.generated;

public final class Security {
  private Security() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SignedPayloadOrBuilder extends
      // @@protoc_insertion_point(interface_extends:app.coronawarn.server.common.protocols.generated.SignedPayload)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * serialized Payload message
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     * @return The payload.
     */
    com.google.protobuf.ByteString getPayload();

    /**
     * <pre>
     * X509 certificate chain
     * </pre>
     *
     * <code>bytes certificateChain = 2;</code>
     * @return The certificateChain.
     */
    com.google.protobuf.ByteString getCertificateChain();

    /**
     * <pre>
     * signature of payload
     * </pre>
     *
     * <code>bytes signature = 3;</code>
     * @return The signature.
     */
    com.google.protobuf.ByteString getSignature();
  }
  /**
   * Protobuf type {@code app.coronawarn.server.common.protocols.generated.SignedPayload}
   */
  public  static final class SignedPayload extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:app.coronawarn.server.common.protocols.generated.SignedPayload)
      SignedPayloadOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SignedPayload.newBuilder() to construct.
    private SignedPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SignedPayload() {
      payload_ = com.google.protobuf.ByteString.EMPTY;
      certificateChain_ = com.google.protobuf.ByteString.EMPTY;
      signature_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SignedPayload();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SignedPayload(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {

              payload_ = input.readBytes();
              break;
            }
            case 18: {

              certificateChain_ = input.readBytes();
              break;
            }
            case 26: {

              signature_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.coronawarn.server.common.protocols.generated.Security.internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.coronawarn.server.common.protocols.generated.Security.internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.coronawarn.server.common.protocols.generated.Security.SignedPayload.class, app.coronawarn.server.common.protocols.generated.Security.SignedPayload.Builder.class);
    }

    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString payload_;
    /**
     * <pre>
     * serialized Payload message
     * </pre>
     *
     * <code>bytes payload = 1;</code>
     * @return The payload.
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }

    public static final int CERTIFICATECHAIN_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString certificateChain_;
    /**
     * <pre>
     * X509 certificate chain
     * </pre>
     *
     * <code>bytes certificateChain = 2;</code>
     * @return The certificateChain.
     */
    public com.google.protobuf.ByteString getCertificateChain() {
      return certificateChain_;
    }

    public static final int SIGNATURE_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString signature_;
    /**
     * <pre>
     * signature of payload
     * </pre>
     *
     * <code>bytes signature = 3;</code>
     * @return The signature.
     */
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!payload_.isEmpty()) {
        output.writeBytes(1, payload_);
      }
      if (!certificateChain_.isEmpty()) {
        output.writeBytes(2, certificateChain_);
      }
      if (!signature_.isEmpty()) {
        output.writeBytes(3, signature_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!payload_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, payload_);
      }
      if (!certificateChain_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, certificateChain_);
      }
      if (!signature_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, signature_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof app.coronawarn.server.common.protocols.generated.Security.SignedPayload)) {
        return super.equals(obj);
      }
      app.coronawarn.server.common.protocols.generated.Security.SignedPayload other = (app.coronawarn.server.common.protocols.generated.Security.SignedPayload) obj;

      if (!getPayload()
          .equals(other.getPayload())) return false;
      if (!getCertificateChain()
          .equals(other.getCertificateChain())) return false;
      if (!getSignature()
          .equals(other.getSignature())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
      hash = (37 * hash) + CERTIFICATECHAIN_FIELD_NUMBER;
      hash = (53 * hash) + getCertificateChain().hashCode();
      hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
      hash = (53 * hash) + getSignature().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(app.coronawarn.server.common.protocols.generated.Security.SignedPayload prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code app.coronawarn.server.common.protocols.generated.SignedPayload}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:app.coronawarn.server.common.protocols.generated.SignedPayload)
        app.coronawarn.server.common.protocols.generated.Security.SignedPayloadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return app.coronawarn.server.common.protocols.generated.Security.internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return app.coronawarn.server.common.protocols.generated.Security.internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                app.coronawarn.server.common.protocols.generated.Security.SignedPayload.class, app.coronawarn.server.common.protocols.generated.Security.SignedPayload.Builder.class);
      }

      // Construct using app.coronawarn.server.common.protocols.generated.Security.SignedPayload.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        payload_ = com.google.protobuf.ByteString.EMPTY;

        certificateChain_ = com.google.protobuf.ByteString.EMPTY;

        signature_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return app.coronawarn.server.common.protocols.generated.Security.internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_descriptor;
      }

      @java.lang.Override
      public app.coronawarn.server.common.protocols.generated.Security.SignedPayload getDefaultInstanceForType() {
        return app.coronawarn.server.common.protocols.generated.Security.SignedPayload.getDefaultInstance();
      }

      @java.lang.Override
      public app.coronawarn.server.common.protocols.generated.Security.SignedPayload build() {
        app.coronawarn.server.common.protocols.generated.Security.SignedPayload result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public app.coronawarn.server.common.protocols.generated.Security.SignedPayload buildPartial() {
        app.coronawarn.server.common.protocols.generated.Security.SignedPayload result = new app.coronawarn.server.common.protocols.generated.Security.SignedPayload(this);
        result.payload_ = payload_;
        result.certificateChain_ = certificateChain_;
        result.signature_ = signature_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof app.coronawarn.server.common.protocols.generated.Security.SignedPayload) {
          return mergeFrom((app.coronawarn.server.common.protocols.generated.Security.SignedPayload)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(app.coronawarn.server.common.protocols.generated.Security.SignedPayload other) {
        if (other == app.coronawarn.server.common.protocols.generated.Security.SignedPayload.getDefaultInstance()) return this;
        if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
          setPayload(other.getPayload());
        }
        if (other.getCertificateChain() != com.google.protobuf.ByteString.EMPTY) {
          setCertificateChain(other.getCertificateChain());
        }
        if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
          setSignature(other.getSignature());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        app.coronawarn.server.common.protocols.generated.Security.SignedPayload parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (app.coronawarn.server.common.protocols.generated.Security.SignedPayload) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * serialized Payload message
       * </pre>
       *
       * <code>bytes payload = 1;</code>
       * @return The payload.
       */
      public com.google.protobuf.ByteString getPayload() {
        return payload_;
      }
      /**
       * <pre>
       * serialized Payload message
       * </pre>
       *
       * <code>bytes payload = 1;</code>
       * @param value The payload to set.
       * @return This builder for chaining.
       */
      public Builder setPayload(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        payload_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * serialized Payload message
       * </pre>
       *
       * <code>bytes payload = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPayload() {
        
        payload_ = getDefaultInstance().getPayload();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString certificateChain_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * X509 certificate chain
       * </pre>
       *
       * <code>bytes certificateChain = 2;</code>
       * @return The certificateChain.
       */
      public com.google.protobuf.ByteString getCertificateChain() {
        return certificateChain_;
      }
      /**
       * <pre>
       * X509 certificate chain
       * </pre>
       *
       * <code>bytes certificateChain = 2;</code>
       * @param value The certificateChain to set.
       * @return This builder for chaining.
       */
      public Builder setCertificateChain(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        certificateChain_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * X509 certificate chain
       * </pre>
       *
       * <code>bytes certificateChain = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCertificateChain() {
        
        certificateChain_ = getDefaultInstance().getCertificateChain();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * signature of payload
       * </pre>
       *
       * <code>bytes signature = 3;</code>
       * @return The signature.
       */
      public com.google.protobuf.ByteString getSignature() {
        return signature_;
      }
      /**
       * <pre>
       * signature of payload
       * </pre>
       *
       * <code>bytes signature = 3;</code>
       * @param value The signature to set.
       * @return This builder for chaining.
       */
      public Builder setSignature(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        signature_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * signature of payload
       * </pre>
       *
       * <code>bytes signature = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSignature() {
        
        signature_ = getDefaultInstance().getSignature();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:app.coronawarn.server.common.protocols.generated.SignedPayload)
    }

    // @@protoc_insertion_point(class_scope:app.coronawarn.server.common.protocols.generated.SignedPayload)
    private static final app.coronawarn.server.common.protocols.generated.Security.SignedPayload DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new app.coronawarn.server.common.protocols.generated.Security.SignedPayload();
    }

    public static app.coronawarn.server.common.protocols.generated.Security.SignedPayload getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SignedPayload>
        PARSER = new com.google.protobuf.AbstractParser<SignedPayload>() {
      @java.lang.Override
      public SignedPayload parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SignedPayload(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SignedPayload> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SignedPayload> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public app.coronawarn.server.common.protocols.generated.Security.SignedPayload getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016security.proto\0220app.coronawarn.server." +
      "common.protocols.generated\"M\n\rSignedPayl" +
      "oad\022\017\n\007payload\030\001 \001(\014\022\030\n\020certificateChain" +
      "\030\002 \001(\014\022\021\n\tsignature\030\003 \001(\014b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_app_coronawarn_server_common_protocols_generated_SignedPayload_descriptor,
        new java.lang.String[] { "Payload", "CertificateChain", "Signature", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}