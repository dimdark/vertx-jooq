/*
 * This file is generated by jOOQ.
 */
package generated.classic.jdbc.guice.vertx.tables.records;


import generated.classic.jdbc.guice.vertx.tables.Something;
import generated.classic.jdbc.guice.vertx.tables.interfaces.ISomething;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingRecord extends UpdatableRecordImpl<SomethingRecord> implements VertxPojo, Record11<Integer, String, Long, Short, Integer, BigDecimal, Boolean, Double, JsonObject, JsonArray, LocalDateTime>, ISomething {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEID</code>.
     */
    @Override
    public SomethingRecord setSomeid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEID</code>.
     */
    @Override
    public Integer getSomeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    @Override
    public SomethingRecord setSomestring(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    @Override
    public String getSomestring() {
        return (String) get(1);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    @Override
    public SomethingRecord setSomehugenumber(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    @Override
    public Long getSomehugenumber() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    @Override
    public SomethingRecord setSomesmallnumber(Short value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    @Override
    public Short getSomesmallnumber() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    @Override
    public SomethingRecord setSomeregularnumber(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    @Override
    public Integer getSomeregularnumber() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEDECIMAL</code>.
     */
    @Override
    public SomethingRecord setSomedecimal(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEDECIMAL</code>.
     */
    @Override
    public BigDecimal getSomedecimal() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    @Override
    public SomethingRecord setSomeboolean(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    @Override
    public Boolean getSomeboolean() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    @Override
    public SomethingRecord setSomedouble(Double value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    @Override
    public Double getSomedouble() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    @Override
    public SomethingRecord setSomejsonobject(JsonObject value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    @Override
    public JsonObject getSomejsonobject() {
        return (JsonObject) get(8);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    @Override
    public SomethingRecord setSomejsonarray(JsonArray value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    @Override
    public JsonArray getSomejsonarray() {
        return (JsonArray) get(9);
    }

    /**
     * Setter for <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    @Override
    public SomethingRecord setSometimestamp(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    @Override
    public LocalDateTime getSometimestamp() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, Long, Short, Integer, BigDecimal, Boolean, Double, JsonObject, JsonArray, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, Long, Short, Integer, BigDecimal, Boolean, Double, JsonObject, JsonArray, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
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
    public Field<Boolean> field7() {
        return Something.SOMETHING.SOMEBOOLEAN;
    }

    @Override
    public Field<Double> field8() {
        return Something.SOMETHING.SOMEDOUBLE;
    }

    @Override
    public Field<JsonObject> field9() {
        return Something.SOMETHING.SOMEJSONOBJECT;
    }

    @Override
    public Field<JsonArray> field10() {
        return Something.SOMETHING.SOMEJSONARRAY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return Something.SOMETHING.SOMETIMESTAMP;
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
    public Boolean component7() {
        return getSomeboolean();
    }

    @Override
    public Double component8() {
        return getSomedouble();
    }

    @Override
    public JsonObject component9() {
        return getSomejsonobject();
    }

    @Override
    public JsonArray component10() {
        return getSomejsonarray();
    }

    @Override
    public LocalDateTime component11() {
        return getSometimestamp();
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
    public Boolean value7() {
        return getSomeboolean();
    }

    @Override
    public Double value8() {
        return getSomedouble();
    }

    @Override
    public JsonObject value9() {
        return getSomejsonobject();
    }

    @Override
    public JsonArray value10() {
        return getSomejsonarray();
    }

    @Override
    public LocalDateTime value11() {
        return getSometimestamp();
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
    public SomethingRecord value7(Boolean value) {
        setSomeboolean(value);
        return this;
    }

    @Override
    public SomethingRecord value8(Double value) {
        setSomedouble(value);
        return this;
    }

    @Override
    public SomethingRecord value9(JsonObject value) {
        setSomejsonobject(value);
        return this;
    }

    @Override
    public SomethingRecord value10(JsonArray value) {
        setSomejsonarray(value);
        return this;
    }

    @Override
    public SomethingRecord value11(LocalDateTime value) {
        setSometimestamp(value);
        return this;
    }

    @Override
    public SomethingRecord values(Integer value1, String value2, Long value3, Short value4, Integer value5, BigDecimal value6, Boolean value7, Double value8, JsonObject value9, JsonArray value10, LocalDateTime value11) {
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
        setSomeboolean(from.getSomeboolean());
        setSomedouble(from.getSomedouble());
        setSomejsonobject(from.getSomejsonobject());
        setSomejsonarray(from.getSomejsonarray());
        setSometimestamp(from.getSometimestamp());
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
    public SomethingRecord(Integer someid, String somestring, Long somehugenumber, Short somesmallnumber, Integer someregularnumber, BigDecimal somedecimal, Boolean someboolean, Double somedouble, JsonObject somejsonobject, JsonArray somejsonarray, LocalDateTime sometimestamp) {
        super(Something.SOMETHING);

        setSomeid(someid);
        setSomestring(somestring);
        setSomehugenumber(somehugenumber);
        setSomesmallnumber(somesmallnumber);
        setSomeregularnumber(someregularnumber);
        setSomedecimal(somedecimal);
        setSomeboolean(someboolean);
        setSomedouble(somedouble);
        setSomejsonobject(somejsonobject);
        setSomejsonarray(somejsonarray);
        setSometimestamp(sometimestamp);
    }

    /**
     * Create a detached, initialised SomethingRecord
     */
    public SomethingRecord(generated.classic.jdbc.guice.vertx.tables.pojos.Something value) {
        super(Something.SOMETHING);

        if (value != null) {
            setSomeid(value.getSomeid());
            setSomestring(value.getSomestring());
            setSomehugenumber(value.getSomehugenumber());
            setSomesmallnumber(value.getSomesmallnumber());
            setSomeregularnumber(value.getSomeregularnumber());
            setSomedecimal(value.getSomedecimal());
            setSomeboolean(value.getSomeboolean());
            setSomedouble(value.getSomedouble());
            setSomejsonobject(value.getSomejsonobject());
            setSomejsonarray(value.getSomejsonarray());
            setSometimestamp(value.getSometimestamp());
        }
    }

        public SomethingRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
