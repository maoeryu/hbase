/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Addresses a single cell or multiple cells
 * in a HBase table by column family and optionally
 * a column qualifier and timestamp
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-12-28")
public class TColumn implements org.apache.thrift.TBase<TColumn, TColumn._Fields>, java.io.Serializable, Cloneable, Comparable<TColumn> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TColumn");

  private static final org.apache.thrift.protocol.TField FAMILY_FIELD_DESC = new org.apache.thrift.protocol.TField("family", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QUALIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("qualifier", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TColumnStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TColumnTupleSchemeFactory());
  }

  public ByteBuffer family; // required
  public ByteBuffer qualifier; // optional
  public long timestamp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FAMILY((short)1, "family"),
    QUALIFIER((short)2, "qualifier"),
    TIMESTAMP((short)3, "timestamp");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FAMILY
          return FAMILY;
        case 2: // QUALIFIER
          return QUALIFIER;
        case 3: // TIMESTAMP
          return TIMESTAMP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.QUALIFIER,_Fields.TIMESTAMP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FAMILY, new org.apache.thrift.meta_data.FieldMetaData("family", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.QUALIFIER, new org.apache.thrift.meta_data.FieldMetaData("qualifier", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TColumn.class, metaDataMap);
  }

  public TColumn() {
  }

  public TColumn(
    ByteBuffer family)
  {
    this();
    this.family = org.apache.thrift.TBaseHelper.copyBinary(family);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TColumn(TColumn other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFamily()) {
      this.family = org.apache.thrift.TBaseHelper.copyBinary(other.family);
    }
    if (other.isSetQualifier()) {
      this.qualifier = org.apache.thrift.TBaseHelper.copyBinary(other.qualifier);
    }
    this.timestamp = other.timestamp;
  }

  public TColumn deepCopy() {
    return new TColumn(this);
  }

  @Override
  public void clear() {
    this.family = null;
    this.qualifier = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
  }

  public byte[] getFamily() {
    setFamily(org.apache.thrift.TBaseHelper.rightSize(family));
    return family == null ? null : family.array();
  }

  public ByteBuffer bufferForFamily() {
    return org.apache.thrift.TBaseHelper.copyBinary(family);
  }

  public TColumn setFamily(byte[] family) {
    this.family = family == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(family, family.length));
    return this;
  }

  public TColumn setFamily(ByteBuffer family) {
    this.family = org.apache.thrift.TBaseHelper.copyBinary(family);
    return this;
  }

  public void unsetFamily() {
    this.family = null;
  }

  /** Returns true if field family is set (has been assigned a value) and false otherwise */
  public boolean isSetFamily() {
    return this.family != null;
  }

  public void setFamilyIsSet(boolean value) {
    if (!value) {
      this.family = null;
    }
  }

  public byte[] getQualifier() {
    setQualifier(org.apache.thrift.TBaseHelper.rightSize(qualifier));
    return qualifier == null ? null : qualifier.array();
  }

  public ByteBuffer bufferForQualifier() {
    return org.apache.thrift.TBaseHelper.copyBinary(qualifier);
  }

  public TColumn setQualifier(byte[] qualifier) {
    this.qualifier = qualifier == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(qualifier, qualifier.length));
    return this;
  }

  public TColumn setQualifier(ByteBuffer qualifier) {
    this.qualifier = org.apache.thrift.TBaseHelper.copyBinary(qualifier);
    return this;
  }

  public void unsetQualifier() {
    this.qualifier = null;
  }

  /** Returns true if field qualifier is set (has been assigned a value) and false otherwise */
  public boolean isSetQualifier() {
    return this.qualifier != null;
  }

  public void setQualifierIsSet(boolean value) {
    if (!value) {
      this.qualifier = null;
    }
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public TColumn setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FAMILY:
      if (value == null) {
        unsetFamily();
      } else {
        setFamily((ByteBuffer)value);
      }
      break;

    case QUALIFIER:
      if (value == null) {
        unsetQualifier();
      } else {
        setQualifier((ByteBuffer)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FAMILY:
      return getFamily();

    case QUALIFIER:
      return getQualifier();

    case TIMESTAMP:
      return getTimestamp();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FAMILY:
      return isSetFamily();
    case QUALIFIER:
      return isSetQualifier();
    case TIMESTAMP:
      return isSetTimestamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TColumn)
      return this.equals((TColumn)that);
    return false;
  }

  public boolean equals(TColumn that) {
    if (that == null)
      return false;

    boolean this_present_family = true && this.isSetFamily();
    boolean that_present_family = true && that.isSetFamily();
    if (this_present_family || that_present_family) {
      if (!(this_present_family && that_present_family))
        return false;
      if (!this.family.equals(that.family))
        return false;
    }

    boolean this_present_qualifier = true && this.isSetQualifier();
    boolean that_present_qualifier = true && that.isSetQualifier();
    if (this_present_qualifier || that_present_qualifier) {
      if (!(this_present_qualifier && that_present_qualifier))
        return false;
      if (!this.qualifier.equals(that.qualifier))
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_family = true && (isSetFamily());
    list.add(present_family);
    if (present_family)
      list.add(family);

    boolean present_qualifier = true && (isSetQualifier());
    list.add(present_qualifier);
    if (present_qualifier)
      list.add(qualifier);

    boolean present_timestamp = true && (isSetTimestamp());
    list.add(present_timestamp);
    if (present_timestamp)
      list.add(timestamp);

    return list.hashCode();
  }

  @Override
  public int compareTo(TColumn other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFamily()).compareTo(other.isSetFamily());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFamily()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.family, other.family);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQualifier()).compareTo(other.isSetQualifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQualifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.qualifier, other.qualifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TColumn(");
    boolean first = true;

    sb.append("family:");
    if (this.family == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.family, sb);
    }
    first = false;
    if (isSetQualifier()) {
      if (!first) sb.append(", ");
      sb.append("qualifier:");
      if (this.qualifier == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.qualifier, sb);
      }
      first = false;
    }
    if (isSetTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (family == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'family' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TColumnStandardSchemeFactory implements SchemeFactory {
    public TColumnStandardScheme getScheme() {
      return new TColumnStandardScheme();
    }
  }

  private static class TColumnStandardScheme extends StandardScheme<TColumn> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TColumn struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FAMILY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.family = iprot.readBinary();
              struct.setFamilyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUALIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.qualifier = iprot.readBinary();
              struct.setQualifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TColumn struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.family != null) {
        oprot.writeFieldBegin(FAMILY_FIELD_DESC);
        oprot.writeBinary(struct.family);
        oprot.writeFieldEnd();
      }
      if (struct.qualifier != null) {
        if (struct.isSetQualifier()) {
          oprot.writeFieldBegin(QUALIFIER_FIELD_DESC);
          oprot.writeBinary(struct.qualifier);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTimestamp()) {
        oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.timestamp);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TColumnTupleSchemeFactory implements SchemeFactory {
    public TColumnTupleScheme getScheme() {
      return new TColumnTupleScheme();
    }
  }

  private static class TColumnTupleScheme extends TupleScheme<TColumn> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TColumn struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBinary(struct.family);
      BitSet optionals = new BitSet();
      if (struct.isSetQualifier()) {
        optionals.set(0);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetQualifier()) {
        oprot.writeBinary(struct.qualifier);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TColumn struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.family = iprot.readBinary();
      struct.setFamilyIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.qualifier = iprot.readBinary();
        struct.setQualifierIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
    }
  }

}

