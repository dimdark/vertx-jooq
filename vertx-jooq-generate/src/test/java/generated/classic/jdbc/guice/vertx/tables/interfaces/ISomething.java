/*
 * This file is generated by jOOQ.
 */
package generated.classic.jdbc.guice.vertx.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISomething extends VertxPojo, Serializable {

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEID</code>.
     */
    public ISomething setSomeid(Integer value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEID</code>.
     */
    public Integer getSomeid();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    public ISomething setSomestring(String value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    public String getSomestring();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    public ISomething setSomehugenumber(Long value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    public Long getSomehugenumber();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    public ISomething setSomesmallnumber(Short value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    public Short getSomesmallnumber();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    public ISomething setSomeregularnumber(Integer value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    public Integer getSomeregularnumber();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEDECIMAL</code>.
     */
    public ISomething setSomedecimal(BigDecimal value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEDECIMAL</code>.
     */
    public BigDecimal getSomedecimal();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    public ISomething setSomeboolean(Boolean value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    public Boolean getSomeboolean();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    public ISomething setSomedouble(Double value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    public Double getSomedouble();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    public ISomething setSomejsonobject(JsonObject value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    public JsonObject getSomejsonobject();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    public ISomething setSomejsonarray(JsonArray value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    public JsonArray getSomejsonarray();

    /**
     * Setter for <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    public ISomething setSometimestamp(LocalDateTime value);

    /**
     * Getter for <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    public LocalDateTime getSometimestamp();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ISomething
     */
    public void from(ISomething from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ISomething
     */
    public <E extends ISomething> E into(E into);

        @Override
        public default ISomething fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setSomeid,json::getInteger,"SOMEID","java.lang.Integer");
                setOrThrow(this::setSomestring,json::getString,"SOMESTRING","java.lang.String");
                setOrThrow(this::setSomehugenumber,json::getLong,"SOMEHUGENUMBER","java.lang.Long");
                setOrThrow(this::setSomesmallnumber,key -> {Integer i = json.getInteger(key); return i==null?null:i.shortValue();},"SOMESMALLNUMBER","java.lang.Short");
                setOrThrow(this::setSomeregularnumber,json::getInteger,"SOMEREGULARNUMBER","java.lang.Integer");
                setOrThrow(this::setSomedecimal,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"SOMEDECIMAL","java.math.BigDecimal");
                setOrThrow(this::setSomeboolean,json::getBoolean,"SOMEBOOLEAN","java.lang.Boolean");
                setOrThrow(this::setSomedouble,json::getDouble,"SOMEDOUBLE","java.lang.Double");
                setOrThrow(this::setSomejsonobject,json::getJsonObject,"SOMEJSONOBJECT","io.vertx.core.json.JsonObject");
                setOrThrow(this::setSomejsonarray,json::getJsonArray,"SOMEJSONARRAY","io.vertx.core.json.JsonArray");
                setOrThrow(this::setSometimestamp,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"SOMETIMESTAMP","java.time.LocalDateTime");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("SOMEID",getSomeid());
                json.put("SOMESTRING",getSomestring());
                json.put("SOMEHUGENUMBER",getSomehugenumber());
                json.put("SOMESMALLNUMBER",getSomesmallnumber());
                json.put("SOMEREGULARNUMBER",getSomeregularnumber());
                json.put("SOMEDECIMAL",getSomedecimal()==null?null:getSomedecimal().toString());
                json.put("SOMEBOOLEAN",getSomeboolean());
                json.put("SOMEDOUBLE",getSomedouble());
                json.put("SOMEJSONOBJECT",getSomejsonobject());
                json.put("SOMEJSONARRAY",getSomejsonarray());
                json.put("SOMETIMESTAMP",getSometimestamp()==null?null:getSometimestamp().toString());
                return json;
        }

}
