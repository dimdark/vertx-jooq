/*
 * This file is generated by jOOQ.
 */
package generated.rx3.reactive.guice.tables.records;


import generated.rx3.reactive.guice.enums.Someenum;
import generated.rx3.reactive.guice.tables.Something;
import generated.rx3.reactive.guice.tables.interfaces.ISomething;

import io.github.jklingsporn.vertx.jooq.generate.converter.SomeJsonPojo;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingRecord extends UpdatableRecordImpl<SomethingRecord> implements VertxPojo, Record18<Integer, String, Long, Short, Integer, BigDecimal, Double, Someenum, JsonObject, SomeJsonPojo, JsonArray, JsonObject, LocalTime, LocalDate, LocalDateTime, OffsetDateTime, byte[], List<String>>, ISomething {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vertx.something.someId</code>.
     */
    @Override
    public SomethingRecord setSomeid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someId</code>.
     */
    @Override
    public Integer getSomeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vertx.something.someString</code>.
     */
    @Override
    public SomethingRecord setSomestring(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someString</code>.
     */
    @Override
    public String getSomestring() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vertx.something.someHugeNumber</code>.
     */
    @Override
    public SomethingRecord setSomehugenumber(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someHugeNumber</code>.
     */
    @Override
    public Long getSomehugenumber() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>vertx.something.someSmallNumber</code>.
     */
    @Override
    public SomethingRecord setSomesmallnumber(Short value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someSmallNumber</code>.
     */
    @Override
    public Short getSomesmallnumber() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>vertx.something.someRegularNumber</code>.
     */
    @Override
    public SomethingRecord setSomeregularnumber(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someRegularNumber</code>.
     */
    @Override
    public Integer getSomeregularnumber() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>vertx.something.someDecimal</code>.
     */
    @Override
    public SomethingRecord setSomedecimal(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someDecimal</code>.
     */
    @Override
    public BigDecimal getSomedecimal() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>vertx.something.someDouble</code>.
     */
    @Override
    public SomethingRecord setSomedouble(Double value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someDouble</code>.
     */
    @Override
    public Double getSomedouble() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>vertx.something.someEnum</code>.
     */
    @Override
    public SomethingRecord setSomeenum(Someenum value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someEnum</code>.
     */
    @Override
    public Someenum getSomeenum() {
        return (Someenum) get(7);
    }

    /**
     * Setter for <code>vertx.something.someJsonObject</code>.
     */
    @Override
    public SomethingRecord setSomejsonobject(JsonObject value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someJsonObject</code>.
     */
    @Override
    public JsonObject getSomejsonobject() {
        return (JsonObject) get(8);
    }

    /**
     * Setter for <code>vertx.something.someCustomJsonObject</code>.
     */
    @Override
    public SomethingRecord setSomecustomjsonobject(SomeJsonPojo value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someCustomJsonObject</code>.
     */
    @Override
    public SomeJsonPojo getSomecustomjsonobject() {
        return (SomeJsonPojo) get(9);
    }

    /**
     * Setter for <code>vertx.something.someJsonArray</code>.
     */
    @Override
    public SomethingRecord setSomejsonarray(JsonArray value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someJsonArray</code>.
     */
    @Override
    public JsonArray getSomejsonarray() {
        return (JsonArray) get(10);
    }

    /**
     * Setter for <code>vertx.something.someVertxJsonObject</code>.
     */
    @Override
    public SomethingRecord setSomevertxjsonobject(JsonObject value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someVertxJsonObject</code>.
     */
    @Override
    public JsonObject getSomevertxjsonobject() {
        return (JsonObject) get(11);
    }

    /**
     * Setter for <code>vertx.something.someTime</code>.
     */
    @Override
    public SomethingRecord setSometime(LocalTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someTime</code>.
     */
    @Override
    public LocalTime getSometime() {
        return (LocalTime) get(12);
    }

    /**
     * Setter for <code>vertx.something.someDate</code>.
     */
    @Override
    public SomethingRecord setSomedate(LocalDate value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someDate</code>.
     */
    @Override
    public LocalDate getSomedate() {
        return (LocalDate) get(13);
    }

    /**
     * Setter for <code>vertx.something.someTimestamp</code>.
     */
    @Override
    public SomethingRecord setSometimestamp(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someTimestamp</code>.
     */
    @Override
    public LocalDateTime getSometimestamp() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>vertx.something.someTimestampWithTZ</code>.
     */
    @Override
    public SomethingRecord setSometimestampwithtz(OffsetDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someTimestampWithTZ</code>.
     */
    @Override
    public OffsetDateTime getSometimestampwithtz() {
        return (OffsetDateTime) get(15);
    }

    /**
     * Setter for <code>vertx.something.someByteA</code>.
     */
    @Override
    public SomethingRecord setSomebytea(byte[] value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someByteA</code>.
     */
    @Override
    public byte[] getSomebytea() {
        return (byte[]) get(16);
    }

    /**
     * Setter for <code>vertx.something.someStringAsList</code>.
     */
    @Override
    public SomethingRecord setSomestringaslist(List<String> value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vertx.something.someStringAsList</code>.
     */
    @Override
    public List<String> getSomestringaslist() {
        return (List<String>) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, String, Long, Short, Integer, BigDecimal, Double, Someenum, JsonObject, SomeJsonPojo, JsonArray, JsonObject, LocalTime, LocalDate, LocalDateTime, OffsetDateTime, byte[], List<String>> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Integer, String, Long, Short, Integer, BigDecimal, Double, Someenum, JsonObject, SomeJsonPojo, JsonArray, JsonObject, LocalTime, LocalDate, LocalDateTime, OffsetDateTime, byte[], List<String>> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Something.SOMETHING.SOMEID;
    }

    @Override
    public Field<String> field2() {
        return Something.SOMETHING.SOMESTRING;
    }

    @Override
    public Field<Long> field3() {
        return Something.SOMETHING.SOMEHUGENUMBER;
    }

    @Override
    public Field<Short> field4() {
        return Something.SOMETHING.SOMESMALLNUMBER;
    }

    @Override
    public Field<Integer> field5() {
        return Something.SOMETHING.SOMEREGULARNUMBER;
    }

    @Override
    public Field<BigDecimal> field6() {
        return Something.SOMETHING.SOMEDECIMAL;
    }

    @Override
    public Field<Double> field7() {
        return Something.SOMETHING.SOMEDOUBLE;
    }

    @Override
    public Field<Someenum> field8() {
        return Something.SOMETHING.SOMEENUM;
    }

    @Override
    public Field<JsonObject> field9() {
        return Something.SOMETHING.SOMEJSONOBJECT;
    }

    @Override
    public Field<SomeJsonPojo> field10() {
        return Something.SOMETHING.SOMECUSTOMJSONOBJECT;
    }

    @Override
    public Field<JsonArray> field11() {
        return Something.SOMETHING.SOMEJSONARRAY;
    }

    @Override
    public Field<JsonObject> field12() {
        return Something.SOMETHING.SOMEVERTXJSONOBJECT;
    }

    @Override
    public Field<LocalTime> field13() {
        return Something.SOMETHING.SOMETIME;
    }

    @Override
    public Field<LocalDate> field14() {
        return Something.SOMETHING.SOMEDATE;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return Something.SOMETHING.SOMETIMESTAMP;
    }

    @Override
    public Field<OffsetDateTime> field16() {
        return Something.SOMETHING.SOMETIMESTAMPWITHTZ;
    }

    @Override
    public Field<byte[]> field17() {
        return Something.SOMETHING.SOMEBYTEA;
    }

    @Override
    public Field<List<String>> field18() {
        return Something.SOMETHING.SOMESTRINGASLIST;
    }

    @Override
    public Integer component1() {
        return getSomeid();
    }

    @Override
    public String component2() {
        return getSomestring();
    }

    @Override
    public Long component3() {
        return getSomehugenumber();
    }

    @Override
    public Short component4() {
        return getSomesmallnumber();
    }

    @Override
    public Integer component5() {
        return getSomeregularnumber();
    }

    @Override
    public BigDecimal component6() {
        return getSomedecimal();
    }

    @Override
    public Double component7() {
        return getSomedouble();
    }

    @Override
    public Someenum component8() {
        return getSomeenum();
    }

    @Override
    public JsonObject component9() {
        return getSomejsonobject();
    }

    @Override
    public SomeJsonPojo component10() {
        return getSomecustomjsonobject();
    }

    @Override
    public JsonArray component11() {
        return getSomejsonarray();
    }

    @Override
    public JsonObject component12() {
        return getSomevertxjsonobject();
    }

    @Override
    public LocalTime component13() {
        return getSometime();
    }

    @Override
    public LocalDate component14() {
        return getSomedate();
    }

    @Override
    public LocalDateTime component15() {
        return getSometimestamp();
    }

    @Override
    public OffsetDateTime component16() {
        return getSometimestampwithtz();
    }

    @Override
    public byte[] component17() {
        return getSomebytea();
    }

    @Override
    public List<String> component18() {
        return getSomestringaslist();
    }

    @Override
    public Integer value1() {
        return getSomeid();
    }

    @Override
    public String value2() {
        return getSomestring();
    }

    @Override
    public Long value3() {
        return getSomehugenumber();
    }

    @Override
    public Short value4() {
        return getSomesmallnumber();
    }

    @Override
    public Integer value5() {
        return getSomeregularnumber();
    }

    @Override
    public BigDecimal value6() {
        return getSomedecimal();
    }

    @Override
    public Double value7() {
        return getSomedouble();
    }

    @Override
    public Someenum value8() {
        return getSomeenum();
    }

    @Override
    public JsonObject value9() {
        return getSomejsonobject();
    }

    @Override
    public SomeJsonPojo value10() {
        return getSomecustomjsonobject();
    }

    @Override
    public JsonArray value11() {
        return getSomejsonarray();
    }

    @Override
    public JsonObject value12() {
        return getSomevertxjsonobject();
    }

    @Override
    public LocalTime value13() {
        return getSometime();
    }

    @Override
    public LocalDate value14() {
        return getSomedate();
    }

    @Override
    public LocalDateTime value15() {
        return getSometimestamp();
    }

    @Override
    public OffsetDateTime value16() {
        return getSometimestampwithtz();
    }

    @Override
    public byte[] value17() {
        return getSomebytea();
    }

    @Override
    public List<String> value18() {
        return getSomestringaslist();
    }

    @Override
    public SomethingRecord value1(Integer value) {
        setSomeid(value);
        return this;
    }

    @Override
    public SomethingRecord value2(String value) {
        setSomestring(value);
        return this;
    }

    @Override
    public SomethingRecord value3(Long value) {
        setSomehugenumber(value);
        return this;
    }

    @Override
    public SomethingRecord value4(Short value) {
        setSomesmallnumber(value);
        return this;
    }

    @Override
    public SomethingRecord value5(Integer value) {
        setSomeregularnumber(value);
        return this;
    }

    @Override
    public SomethingRecord value6(BigDecimal value) {
        setSomedecimal(value);
        return this;
    }

    @Override
    public SomethingRecord value7(Double value) {
        setSomedouble(value);
        return this;
    }

    @Override
    public SomethingRecord value8(Someenum value) {
        setSomeenum(value);
        return this;
    }

    @Override
    public SomethingRecord value9(JsonObject value) {
        setSomejsonobject(value);
        return this;
    }

    @Override
    public SomethingRecord value10(SomeJsonPojo value) {
        setSomecustomjsonobject(value);
        return this;
    }

    @Override
    public SomethingRecord value11(JsonArray value) {
        setSomejsonarray(value);
        return this;
    }

    @Override
    public SomethingRecord value12(JsonObject value) {
        setSomevertxjsonobject(value);
        return this;
    }

    @Override
    public SomethingRecord value13(LocalTime value) {
        setSometime(value);
        return this;
    }

    @Override
    public SomethingRecord value14(LocalDate value) {
        setSomedate(value);
        return this;
    }

    @Override
    public SomethingRecord value15(LocalDateTime value) {
        setSometimestamp(value);
        return this;
    }

    @Override
    public SomethingRecord value16(OffsetDateTime value) {
        setSometimestampwithtz(value);
        return this;
    }

    @Override
    public SomethingRecord value17(byte[] value) {
        setSomebytea(value);
        return this;
    }

    @Override
    public SomethingRecord value18(List<String> value) {
        setSomestringaslist(value);
        return this;
    }

    @Override
    public SomethingRecord values(Integer value1, String value2, Long value3, Short value4, Integer value5, BigDecimal value6, Double value7, Someenum value8, JsonObject value9, SomeJsonPojo value10, JsonArray value11, JsonObject value12, LocalTime value13, LocalDate value14, LocalDateTime value15, OffsetDateTime value16, byte[] value17, List<String> value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISomething from) {
        setSomeid(from.getSomeid());
        setSomestring(from.getSomestring());
        setSomehugenumber(from.getSomehugenumber());
        setSomesmallnumber(from.getSomesmallnumber());
        setSomeregularnumber(from.getSomeregularnumber());
        setSomedecimal(from.getSomedecimal());
        setSomedouble(from.getSomedouble());
        setSomeenum(from.getSomeenum());
        setSomejsonobject(from.getSomejsonobject());
        setSomecustomjsonobject(from.getSomecustomjsonobject());
        setSomejsonarray(from.getSomejsonarray());
        setSomevertxjsonobject(from.getSomevertxjsonobject());
        setSometime(from.getSometime());
        setSomedate(from.getSomedate());
        setSometimestamp(from.getSometimestamp());
        setSometimestampwithtz(from.getSometimestampwithtz());
        setSomebytea(from.getSomebytea());
        setSomestringaslist(from.getSomestringaslist());
    }

    @Override
    public <E extends ISomething> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SomethingRecord
     */
    public SomethingRecord() {
        super(Something.SOMETHING);
    }

    /**
     * Create a detached, initialised SomethingRecord
     */
    public SomethingRecord(Integer someid, String somestring, Long somehugenumber, Short somesmallnumber, Integer someregularnumber, BigDecimal somedecimal, Double somedouble, Someenum someenum, JsonObject somejsonobject, SomeJsonPojo somecustomjsonobject, JsonArray somejsonarray, JsonObject somevertxjsonobject, LocalTime sometime, LocalDate somedate, LocalDateTime sometimestamp, OffsetDateTime sometimestampwithtz, byte[] somebytea, List<String> somestringaslist) {
        super(Something.SOMETHING);

        setSomeid(someid);
        setSomestring(somestring);
        setSomehugenumber(somehugenumber);
        setSomesmallnumber(somesmallnumber);
        setSomeregularnumber(someregularnumber);
        setSomedecimal(somedecimal);
        setSomedouble(somedouble);
        setSomeenum(someenum);
        setSomejsonobject(somejsonobject);
        setSomecustomjsonobject(somecustomjsonobject);
        setSomejsonarray(somejsonarray);
        setSomevertxjsonobject(somevertxjsonobject);
        setSometime(sometime);
        setSomedate(somedate);
        setSometimestamp(sometimestamp);
        setSometimestampwithtz(sometimestampwithtz);
        setSomebytea(somebytea);
        setSomestringaslist(somestringaslist);
    }

    /**
     * Create a detached, initialised SomethingRecord
     */
    public SomethingRecord(generated.rx3.reactive.guice.tables.pojos.Something value) {
        super(Something.SOMETHING);

        if (value != null) {
            setSomeid(value.getSomeid());
            setSomestring(value.getSomestring());
            setSomehugenumber(value.getSomehugenumber());
            setSomesmallnumber(value.getSomesmallnumber());
            setSomeregularnumber(value.getSomeregularnumber());
            setSomedecimal(value.getSomedecimal());
            setSomedouble(value.getSomedouble());
            setSomeenum(value.getSomeenum());
            setSomejsonobject(value.getSomejsonobject());
            setSomecustomjsonobject(value.getSomecustomjsonobject());
            setSomejsonarray(value.getSomejsonarray());
            setSomevertxjsonobject(value.getSomevertxjsonobject());
            setSometime(value.getSometime());
            setSomedate(value.getSomedate());
            setSometimestamp(value.getSometimestamp());
            setSometimestampwithtz(value.getSometimestampwithtz());
            setSomebytea(value.getSomebytea());
            setSomestringaslist(value.getSomestringaslist());
        }
    }

        public SomethingRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
