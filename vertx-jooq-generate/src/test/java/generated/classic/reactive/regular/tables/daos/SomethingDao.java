/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.regular.tables.daos;


import generated.classic.reactive.regular.enums.Someenum;
import generated.classic.reactive.regular.tables.Something;
import generated.classic.reactive.regular.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.generate.converter.SomeJsonPojo;
import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.List;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingDao extends AbstractReactiveVertxDAO<SomethingRecord, generated.classic.reactive.regular.tables.pojos.Something, Integer, Future<List<generated.classic.reactive.regular.tables.pojos.Something>>, Future<generated.classic.reactive.regular.tables.pojos.Something>, Future<Integer>, Future<Integer>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SomethingRecord,generated.classic.reactive.regular.tables.pojos.Something,Integer> {

        /**
     * @param configuration Used for rendering, so only SQLDialect must be set
     * and must be one of the POSTGREs types.
     *      * @param delegate A configured AsyncSQLClient that is used for query
     * execution
     */
        public SomethingDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
                super(Something.SOMETHING, generated.classic.reactive.regular.tables.pojos.Something.class, new ReactiveClassicQueryExecutor<SomethingRecord,generated.classic.reactive.regular.tables.pojos.Something,Integer>(configuration,delegate,generated.classic.reactive.regular.tables.mappers.RowMappers.getSomethingMapper()));
        }

        @Override
        protected Integer getId(generated.classic.reactive.regular.tables.pojos.Something object) {
                return object.getSomeid();
        }

        /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomestring(Collection<String> values) {
                return findManyByCondition(Something.SOMETHING.SOMESTRING.in(values));
        }

        /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomestring(Collection<String> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMESTRING.in(values),limit);
        }

        /**
     * Find records that have <code>someHugeNumber IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomehugenumber(Collection<Long> values) {
                return findManyByCondition(Something.SOMETHING.SOMEHUGENUMBER.in(values));
        }

        /**
     * Find records that have <code>someHugeNumber IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomehugenumber(Collection<Long> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEHUGENUMBER.in(values),limit);
        }

        /**
     * Find records that have <code>someSmallNumber IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomesmallnumber(Collection<Short> values) {
                return findManyByCondition(Something.SOMETHING.SOMESMALLNUMBER.in(values));
        }

        /**
     * Find records that have <code>someSmallNumber IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomesmallnumber(Collection<Short> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMESMALLNUMBER.in(values),limit);
        }

        /**
     * Find records that have <code>someRegularNumber IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomeregularnumber(Collection<Integer> values) {
                return findManyByCondition(Something.SOMETHING.SOMEREGULARNUMBER.in(values));
        }

        /**
     * Find records that have <code>someRegularNumber IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomeregularnumber(Collection<Integer> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEREGULARNUMBER.in(values),limit);
        }

        /**
     * Find records that have <code>someDecimal IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomedecimal(Collection<BigDecimal> values) {
                return findManyByCondition(Something.SOMETHING.SOMEDECIMAL.in(values));
        }

        /**
     * Find records that have <code>someDecimal IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomedecimal(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEDECIMAL.in(values),limit);
        }

        /**
     * Find records that have <code>someDouble IN (values)</code> asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomedouble(Collection<Double> values) {
                return findManyByCondition(Something.SOMETHING.SOMEDOUBLE.in(values));
        }

        /**
     * Find records that have <code>someDouble IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomedouble(Collection<Double> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEDOUBLE.in(values),limit);
        }

        /**
     * Find records that have <code>someEnum IN (values)</code> asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomeenum(Collection<Someenum> values) {
                return findManyByCondition(Something.SOMETHING.SOMEENUM.in(values));
        }

        /**
     * Find records that have <code>someEnum IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomeenum(Collection<Someenum> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEENUM.in(values),limit);
        }

        /**
     * Find records that have <code>someJsonObject IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomejsonobject(Collection<JsonObject> values) {
                return findManyByCondition(Something.SOMETHING.SOMEJSONOBJECT.in(values));
        }

        /**
     * Find records that have <code>someJsonObject IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomejsonobject(Collection<JsonObject> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEJSONOBJECT.in(values),limit);
        }

        /**
     * Find records that have <code>someCustomJsonObject IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomecustomjsonobject(Collection<SomeJsonPojo> values) {
                return findManyByCondition(Something.SOMETHING.SOMECUSTOMJSONOBJECT.in(values));
        }

        /**
     * Find records that have <code>someCustomJsonObject IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomecustomjsonobject(Collection<SomeJsonPojo> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMECUSTOMJSONOBJECT.in(values),limit);
        }

        /**
     * Find records that have <code>someJsonArray IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomejsonarray(Collection<JsonArray> values) {
                return findManyByCondition(Something.SOMETHING.SOMEJSONARRAY.in(values));
        }

        /**
     * Find records that have <code>someJsonArray IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomejsonarray(Collection<JsonArray> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEJSONARRAY.in(values),limit);
        }

        /**
     * Find records that have <code>someVertxJsonObject IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomevertxjsonobject(Collection<JsonObject> values) {
                return findManyByCondition(Something.SOMETHING.SOMEVERTXJSONOBJECT.in(values));
        }

        /**
     * Find records that have <code>someVertxJsonObject IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomevertxjsonobject(Collection<JsonObject> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEVERTXJSONOBJECT.in(values),limit);
        }

        /**
     * Find records that have <code>someTime IN (values)</code> asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySometime(Collection<LocalTime> values) {
                return findManyByCondition(Something.SOMETHING.SOMETIME.in(values));
        }

        /**
     * Find records that have <code>someTime IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySometime(Collection<LocalTime> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMETIME.in(values),limit);
        }

        /**
     * Find records that have <code>someDate IN (values)</code> asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomedate(Collection<LocalDate> values) {
                return findManyByCondition(Something.SOMETHING.SOMEDATE.in(values));
        }

        /**
     * Find records that have <code>someDate IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomedate(Collection<LocalDate> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEDATE.in(values),limit);
        }

        /**
     * Find records that have <code>someTimestamp IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySometimestamp(Collection<LocalDateTime> values) {
                return findManyByCondition(Something.SOMETHING.SOMETIMESTAMP.in(values));
        }

        /**
     * Find records that have <code>someTimestamp IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySometimestamp(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMETIMESTAMP.in(values),limit);
        }

        /**
     * Find records that have <code>someTimestampWithTZ IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySometimestampwithtz(Collection<OffsetDateTime> values) {
                return findManyByCondition(Something.SOMETHING.SOMETIMESTAMPWITHTZ.in(values));
        }

        /**
     * Find records that have <code>someTimestampWithTZ IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySometimestampwithtz(Collection<OffsetDateTime> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMETIMESTAMPWITHTZ.in(values),limit);
        }

        /**
     * Find records that have <code>someByteA IN (values)</code> asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomebytea(Collection<byte[]> values) {
                return findManyByCondition(Something.SOMETHING.SOMEBYTEA.in(values));
        }

        /**
     * Find records that have <code>someByteA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomebytea(Collection<byte[]> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMEBYTEA.in(values),limit);
        }

        /**
     * Find records that have <code>someStringAsList IN (values)</code>
     * asynchronously
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomestringaslist(Collection<List<String>> values) {
                return findManyByCondition(Something.SOMETHING.SOMESTRINGASLIST.in(values));
        }

        /**
     * Find records that have <code>someStringAsList IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<generated.classic.reactive.regular.tables.pojos.Something>> findManyBySomestringaslist(Collection<List<String>> values, int limit) {
                return findManyByCondition(Something.SOMETHING.SOMESTRINGASLIST.in(values),limit);
        }

        @Override
        public ReactiveClassicQueryExecutor<SomethingRecord,generated.classic.reactive.regular.tables.pojos.Something,Integer> queryExecutor(){
                return (ReactiveClassicQueryExecutor<SomethingRecord,generated.classic.reactive.regular.tables.pojos.Something,Integer>) super.queryExecutor();
        }
}
