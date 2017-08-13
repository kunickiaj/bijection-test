/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.streamsets.bijection.avro;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BijectionTest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BijectionTest\",\"namespace\":\"com.streamsets.bijection.avro\",\"fields\":[{\"name\":\"f1\",\"type\":\"long\"},{\"name\":\"f2\",\"type\":\"string\"},{\"name\":\"f3\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long f1;
  @Deprecated public java.lang.CharSequence f2;
  @Deprecated public boolean f3;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BijectionTest() {}

  /**
   * All-args constructor.
   */
  public BijectionTest(java.lang.Long f1, java.lang.CharSequence f2, java.lang.Boolean f3) {
    this.f1 = f1;
    this.f2 = f2;
    this.f3 = f3;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return f1;
    case 1: return f2;
    case 2: return f3;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: f1 = (java.lang.Long)value$; break;
    case 1: f2 = (java.lang.CharSequence)value$; break;
    case 2: f3 = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'f1' field.
   */
  public java.lang.Long getF1() {
    return f1;
  }

  /**
   * Sets the value of the 'f1' field.
   * @param value the value to set.
   */
  public void setF1(java.lang.Long value) {
    this.f1 = value;
  }

  /**
   * Gets the value of the 'f2' field.
   */
  public java.lang.CharSequence getF2() {
    return f2;
  }

  /**
   * Sets the value of the 'f2' field.
   * @param value the value to set.
   */
  public void setF2(java.lang.CharSequence value) {
    this.f2 = value;
  }

  /**
   * Gets the value of the 'f3' field.
   */
  public java.lang.Boolean getF3() {
    return f3;
  }

  /**
   * Sets the value of the 'f3' field.
   * @param value the value to set.
   */
  public void setF3(java.lang.Boolean value) {
    this.f3 = value;
  }

  /** Creates a new BijectionTest RecordBuilder */
  public static com.streamsets.bijection.avro.BijectionTest.Builder newBuilder() {
    return new com.streamsets.bijection.avro.BijectionTest.Builder();
  }

  /** Creates a new BijectionTest RecordBuilder by copying an existing Builder */
  public static com.streamsets.bijection.avro.BijectionTest.Builder newBuilder(com.streamsets.bijection.avro.BijectionTest.Builder other) {
    return new com.streamsets.bijection.avro.BijectionTest.Builder(other);
  }

  /** Creates a new BijectionTest RecordBuilder by copying an existing BijectionTest instance */
  public static com.streamsets.bijection.avro.BijectionTest.Builder newBuilder(com.streamsets.bijection.avro.BijectionTest other) {
    return new com.streamsets.bijection.avro.BijectionTest.Builder(other);
  }

  /**
   * RecordBuilder for BijectionTest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BijectionTest>
    implements org.apache.avro.data.RecordBuilder<BijectionTest> {

    private long f1;
    private java.lang.CharSequence f2;
    private boolean f3;

    /** Creates a new Builder */
    private Builder() {
      super(com.streamsets.bijection.avro.BijectionTest.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(com.streamsets.bijection.avro.BijectionTest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.f1)) {
        this.f1 = data().deepCopy(fields()[0].schema(), other.f1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.f2)) {
        this.f2 = data().deepCopy(fields()[1].schema(), other.f2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.f3)) {
        this.f3 = data().deepCopy(fields()[2].schema(), other.f3);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing BijectionTest instance */
    private Builder(com.streamsets.bijection.avro.BijectionTest other) {
            super(com.streamsets.bijection.avro.BijectionTest.SCHEMA$);
      if (isValidValue(fields()[0], other.f1)) {
        this.f1 = data().deepCopy(fields()[0].schema(), other.f1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.f2)) {
        this.f2 = data().deepCopy(fields()[1].schema(), other.f2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.f3)) {
        this.f3 = data().deepCopy(fields()[2].schema(), other.f3);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'f1' field */
    public java.lang.Long getF1() {
      return f1;
    }

    /** Sets the value of the 'f1' field */
    public com.streamsets.bijection.avro.BijectionTest.Builder setF1(long value) {
      validate(fields()[0], value);
      this.f1 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'f1' field has been set */
    public boolean hasF1() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'f1' field */
    public com.streamsets.bijection.avro.BijectionTest.Builder clearF1() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'f2' field */
    public java.lang.CharSequence getF2() {
      return f2;
    }

    /** Sets the value of the 'f2' field */
    public com.streamsets.bijection.avro.BijectionTest.Builder setF2(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.f2 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'f2' field has been set */
    public boolean hasF2() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'f2' field */
    public com.streamsets.bijection.avro.BijectionTest.Builder clearF2() {
      f2 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'f3' field */
    public java.lang.Boolean getF3() {
      return f3;
    }

    /** Sets the value of the 'f3' field */
    public com.streamsets.bijection.avro.BijectionTest.Builder setF3(boolean value) {
      validate(fields()[2], value);
      this.f3 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'f3' field has been set */
    public boolean hasF3() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'f3' field */
    public com.streamsets.bijection.avro.BijectionTest.Builder clearF3() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public BijectionTest build() {
      try {
        BijectionTest record = new BijectionTest();
        record.f1 = fieldSetFlags()[0] ? this.f1 : (java.lang.Long) defaultValue(fields()[0]);
        record.f2 = fieldSetFlags()[1] ? this.f2 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.f3 = fieldSetFlags()[2] ? this.f3 : (java.lang.Boolean) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}