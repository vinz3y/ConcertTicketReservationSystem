// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticketing.proto

// Protobuf Java Version: 3.25.3
package ticketing;

/**
 * Protobuf type {@code ticketing.Booking}
 */
public final class Booking extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ticketing.Booking)
    BookingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Booking.newBuilder() to construct.
  private Booking(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Booking() {
    bookingId_ = "";
    userId_ = "";
    concertId_ = "";
    seatType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Booking();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ticketing.Ticketing.internal_static_ticketing_Booking_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ticketing.Ticketing.internal_static_ticketing_Booking_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ticketing.Booking.class, ticketing.Booking.Builder.class);
  }

  public static final int BOOKING_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bookingId_ = "";
  /**
   * <code>string booking_id = 1;</code>
   * @return The bookingId.
   */
  @java.lang.Override
  public java.lang.String getBookingId() {
    java.lang.Object ref = bookingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bookingId_ = s;
      return s;
    }
  }
  /**
   * <code>string booking_id = 1;</code>
   * @return The bytes for bookingId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBookingIdBytes() {
    java.lang.Object ref = bookingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bookingId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <code>string user_id = 2;</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 2;</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONCERT_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object concertId_ = "";
  /**
   * <code>string concert_id = 3;</code>
   * @return The concertId.
   */
  @java.lang.Override
  public java.lang.String getConcertId() {
    java.lang.Object ref = concertId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      concertId_ = s;
      return s;
    }
  }
  /**
   * <code>string concert_id = 3;</code>
   * @return The bytes for concertId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConcertIdBytes() {
    java.lang.Object ref = concertId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      concertId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEAT_TYPE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object seatType_ = "";
  /**
   * <code>string seat_type = 4;</code>
   * @return The seatType.
   */
  @java.lang.Override
  public java.lang.String getSeatType() {
    java.lang.Object ref = seatType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      seatType_ = s;
      return s;
    }
  }
  /**
   * <code>string seat_type = 4;</code>
   * @return The bytes for seatType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSeatTypeBytes() {
    java.lang.Object ref = seatType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      seatType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 5;
  private int quantity_ = 0;
  /**
   * <code>int32 quantity = 5;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
  }

  public static final int AFTER_PARTY_FIELD_NUMBER = 6;
  private boolean afterParty_ = false;
  /**
   * <code>bool after_party = 6;</code>
   * @return The afterParty.
   */
  @java.lang.Override
  public boolean getAfterParty() {
    return afterParty_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bookingId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bookingId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(concertId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, concertId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(seatType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, seatType_);
    }
    if (quantity_ != 0) {
      output.writeInt32(5, quantity_);
    }
    if (afterParty_ != false) {
      output.writeBool(6, afterParty_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bookingId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bookingId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(concertId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, concertId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(seatType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, seatType_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, quantity_);
    }
    if (afterParty_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, afterParty_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ticketing.Booking)) {
      return super.equals(obj);
    }
    ticketing.Booking other = (ticketing.Booking) obj;

    if (!getBookingId()
        .equals(other.getBookingId())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getConcertId()
        .equals(other.getConcertId())) return false;
    if (!getSeatType()
        .equals(other.getSeatType())) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
    if (getAfterParty()
        != other.getAfterParty()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BOOKING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBookingId().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + CONCERT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConcertId().hashCode();
    hash = (37 * hash) + SEAT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSeatType().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (37 * hash) + AFTER_PARTY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAfterParty());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ticketing.Booking parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ticketing.Booking parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ticketing.Booking parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ticketing.Booking parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ticketing.Booking parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ticketing.Booking parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ticketing.Booking parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ticketing.Booking parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ticketing.Booking parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ticketing.Booking parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ticketing.Booking parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ticketing.Booking parseFrom(
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
  public static Builder newBuilder(ticketing.Booking prototype) {
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
   * Protobuf type {@code ticketing.Booking}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ticketing.Booking)
      ticketing.BookingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ticketing.Ticketing.internal_static_ticketing_Booking_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ticketing.Ticketing.internal_static_ticketing_Booking_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ticketing.Booking.class, ticketing.Booking.Builder.class);
    }

    // Construct using ticketing.Booking.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      bookingId_ = "";
      userId_ = "";
      concertId_ = "";
      seatType_ = "";
      quantity_ = 0;
      afterParty_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ticketing.Ticketing.internal_static_ticketing_Booking_descriptor;
    }

    @java.lang.Override
    public ticketing.Booking getDefaultInstanceForType() {
      return ticketing.Booking.getDefaultInstance();
    }

    @java.lang.Override
    public ticketing.Booking build() {
      ticketing.Booking result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ticketing.Booking buildPartial() {
      ticketing.Booking result = new ticketing.Booking(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ticketing.Booking result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bookingId_ = bookingId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.concertId_ = concertId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.seatType_ = seatType_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.quantity_ = quantity_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.afterParty_ = afterParty_;
      }
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
      if (other instanceof ticketing.Booking) {
        return mergeFrom((ticketing.Booking)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ticketing.Booking other) {
      if (other == ticketing.Booking.getDefaultInstance()) return this;
      if (!other.getBookingId().isEmpty()) {
        bookingId_ = other.bookingId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getConcertId().isEmpty()) {
        concertId_ = other.concertId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getSeatType().isEmpty()) {
        seatType_ = other.seatType_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
      }
      if (other.getAfterParty() != false) {
        setAfterParty(other.getAfterParty());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              bookingId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              concertId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              seatType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              quantity_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              afterParty_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object bookingId_ = "";
    /**
     * <code>string booking_id = 1;</code>
     * @return The bookingId.
     */
    public java.lang.String getBookingId() {
      java.lang.Object ref = bookingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bookingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string booking_id = 1;</code>
     * @return The bytes for bookingId.
     */
    public com.google.protobuf.ByteString
        getBookingIdBytes() {
      java.lang.Object ref = bookingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bookingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string booking_id = 1;</code>
     * @param value The bookingId to set.
     * @return This builder for chaining.
     */
    public Builder setBookingId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bookingId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string booking_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBookingId() {
      bookingId_ = getDefaultInstance().getBookingId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string booking_id = 1;</code>
     * @param value The bytes for bookingId to set.
     * @return This builder for chaining.
     */
    public Builder setBookingIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bookingId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 2;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 2;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 2;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object concertId_ = "";
    /**
     * <code>string concert_id = 3;</code>
     * @return The concertId.
     */
    public java.lang.String getConcertId() {
      java.lang.Object ref = concertId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        concertId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string concert_id = 3;</code>
     * @return The bytes for concertId.
     */
    public com.google.protobuf.ByteString
        getConcertIdBytes() {
      java.lang.Object ref = concertId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        concertId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string concert_id = 3;</code>
     * @param value The concertId to set.
     * @return This builder for chaining.
     */
    public Builder setConcertId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      concertId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string concert_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConcertId() {
      concertId_ = getDefaultInstance().getConcertId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string concert_id = 3;</code>
     * @param value The bytes for concertId to set.
     * @return This builder for chaining.
     */
    public Builder setConcertIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      concertId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object seatType_ = "";
    /**
     * <code>string seat_type = 4;</code>
     * @return The seatType.
     */
    public java.lang.String getSeatType() {
      java.lang.Object ref = seatType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        seatType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string seat_type = 4;</code>
     * @return The bytes for seatType.
     */
    public com.google.protobuf.ByteString
        getSeatTypeBytes() {
      java.lang.Object ref = seatType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        seatType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string seat_type = 4;</code>
     * @param value The seatType to set.
     * @return This builder for chaining.
     */
    public Builder setSeatType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      seatType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string seat_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeatType() {
      seatType_ = getDefaultInstance().getSeatType();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string seat_type = 4;</code>
     * @param value The bytes for seatType to set.
     * @return This builder for chaining.
     */
    public Builder setSeatTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      seatType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 5;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 5;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {

      quantity_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      bitField0_ = (bitField0_ & ~0x00000010);
      quantity_ = 0;
      onChanged();
      return this;
    }

    private boolean afterParty_ ;
    /**
     * <code>bool after_party = 6;</code>
     * @return The afterParty.
     */
    @java.lang.Override
    public boolean getAfterParty() {
      return afterParty_;
    }
    /**
     * <code>bool after_party = 6;</code>
     * @param value The afterParty to set.
     * @return This builder for chaining.
     */
    public Builder setAfterParty(boolean value) {

      afterParty_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bool after_party = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearAfterParty() {
      bitField0_ = (bitField0_ & ~0x00000020);
      afterParty_ = false;
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


    // @@protoc_insertion_point(builder_scope:ticketing.Booking)
  }

  // @@protoc_insertion_point(class_scope:ticketing.Booking)
  private static final ticketing.Booking DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ticketing.Booking();
  }

  public static ticketing.Booking getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Booking>
      PARSER = new com.google.protobuf.AbstractParser<Booking>() {
    @java.lang.Override
    public Booking parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Booking> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Booking> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ticketing.Booking getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

