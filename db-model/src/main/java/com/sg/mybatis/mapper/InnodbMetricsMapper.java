package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbMetricsDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbMetrics;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface InnodbMetricsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.383+07:00", comments="Source Table: INNODB_METRICS")
    BasicColumn[] selectList = BasicColumn.columnList(name, subsystem, count, maxCount, minCount, avgCount, countReset, maxCountReset, minCountReset, avgCountReset, timeEnabled, timeDisabled, timeElapsed, timeReset, status, type, comment);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbMetrics> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbMetrics> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbMetricsResult")
    Optional<InnodbMetrics> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbMetricsResult", value = {
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBSYSTEM", property="subsystem", jdbcType=JdbcType.VARCHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_COUNT", property="maxCount", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_COUNT", property="minCount", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_COUNT", property="avgCount", jdbcType=JdbcType.REAL),
        @Result(column="COUNT_RESET", property="countReset", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_COUNT_RESET", property="maxCountReset", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_COUNT_RESET", property="minCountReset", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_COUNT_RESET", property="avgCountReset", jdbcType=JdbcType.REAL),
        @Result(column="TIME_ENABLED", property="timeEnabled", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TIME_DISABLED", property="timeDisabled", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TIME_ELAPSED", property="timeElapsed", jdbcType=JdbcType.BIGINT),
        @Result(column="TIME_RESET", property="timeReset", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbMetrics> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbMetrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbMetrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.383+07:00", comments="Source Table: INNODB_METRICS")
    default int insert(InnodbMetrics record) {
        return MyBatis3Utils.insert(this::insert, record, innodbMetrics, c ->
            c.map(name).toProperty("name")
            .map(subsystem).toProperty("subsystem")
            .map(count).toProperty("count")
            .map(maxCount).toProperty("maxCount")
            .map(minCount).toProperty("minCount")
            .map(avgCount).toProperty("avgCount")
            .map(countReset).toProperty("countReset")
            .map(maxCountReset).toProperty("maxCountReset")
            .map(minCountReset).toProperty("minCountReset")
            .map(avgCountReset).toProperty("avgCountReset")
            .map(timeEnabled).toProperty("timeEnabled")
            .map(timeDisabled).toProperty("timeDisabled")
            .map(timeElapsed).toProperty("timeElapsed")
            .map(timeReset).toProperty("timeReset")
            .map(status).toProperty("status")
            .map(type).toProperty("type")
            .map(comment).toProperty("comment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.383+07:00", comments="Source Table: INNODB_METRICS")
    default int insertMultiple(Collection<InnodbMetrics> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbMetrics, c ->
            c.map(name).toProperty("name")
            .map(subsystem).toProperty("subsystem")
            .map(count).toProperty("count")
            .map(maxCount).toProperty("maxCount")
            .map(minCount).toProperty("minCount")
            .map(avgCount).toProperty("avgCount")
            .map(countReset).toProperty("countReset")
            .map(maxCountReset).toProperty("maxCountReset")
            .map(minCountReset).toProperty("minCountReset")
            .map(avgCountReset).toProperty("avgCountReset")
            .map(timeEnabled).toProperty("timeEnabled")
            .map(timeDisabled).toProperty("timeDisabled")
            .map(timeElapsed).toProperty("timeElapsed")
            .map(timeReset).toProperty("timeReset")
            .map(status).toProperty("status")
            .map(type).toProperty("type")
            .map(comment).toProperty("comment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.383+07:00", comments="Source Table: INNODB_METRICS")
    default int insertSelective(InnodbMetrics record) {
        return MyBatis3Utils.insert(this::insert, record, innodbMetrics, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(subsystem).toPropertyWhenPresent("subsystem", record::getSubsystem)
            .map(count).toPropertyWhenPresent("count", record::getCount)
            .map(maxCount).toPropertyWhenPresent("maxCount", record::getMaxCount)
            .map(minCount).toPropertyWhenPresent("minCount", record::getMinCount)
            .map(avgCount).toPropertyWhenPresent("avgCount", record::getAvgCount)
            .map(countReset).toPropertyWhenPresent("countReset", record::getCountReset)
            .map(maxCountReset).toPropertyWhenPresent("maxCountReset", record::getMaxCountReset)
            .map(minCountReset).toPropertyWhenPresent("minCountReset", record::getMinCountReset)
            .map(avgCountReset).toPropertyWhenPresent("avgCountReset", record::getAvgCountReset)
            .map(timeEnabled).toPropertyWhenPresent("timeEnabled", record::getTimeEnabled)
            .map(timeDisabled).toPropertyWhenPresent("timeDisabled", record::getTimeDisabled)
            .map(timeElapsed).toPropertyWhenPresent("timeElapsed", record::getTimeElapsed)
            .map(timeReset).toPropertyWhenPresent("timeReset", record::getTimeReset)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(comment).toPropertyWhenPresent("comment", record::getComment)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.383+07:00", comments="Source Table: INNODB_METRICS")
    default Optional<InnodbMetrics> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbMetrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.383+07:00", comments="Source Table: INNODB_METRICS")
    default List<InnodbMetrics> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbMetrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.383+07:00", comments="Source Table: INNODB_METRICS")
    default List<InnodbMetrics> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbMetrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.383+07:00", comments="Source Table: INNODB_METRICS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbMetrics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.383+07:00", comments="Source Table: INNODB_METRICS")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbMetrics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(subsystem).equalTo(record::getSubsystem)
                .set(count).equalTo(record::getCount)
                .set(maxCount).equalTo(record::getMaxCount)
                .set(minCount).equalTo(record::getMinCount)
                .set(avgCount).equalTo(record::getAvgCount)
                .set(countReset).equalTo(record::getCountReset)
                .set(maxCountReset).equalTo(record::getMaxCountReset)
                .set(minCountReset).equalTo(record::getMinCountReset)
                .set(avgCountReset).equalTo(record::getAvgCountReset)
                .set(timeEnabled).equalTo(record::getTimeEnabled)
                .set(timeDisabled).equalTo(record::getTimeDisabled)
                .set(timeElapsed).equalTo(record::getTimeElapsed)
                .set(timeReset).equalTo(record::getTimeReset)
                .set(status).equalTo(record::getStatus)
                .set(type).equalTo(record::getType)
                .set(comment).equalTo(record::getComment);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.384+07:00", comments="Source Table: INNODB_METRICS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbMetrics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(subsystem).equalToWhenPresent(record::getSubsystem)
                .set(count).equalToWhenPresent(record::getCount)
                .set(maxCount).equalToWhenPresent(record::getMaxCount)
                .set(minCount).equalToWhenPresent(record::getMinCount)
                .set(avgCount).equalToWhenPresent(record::getAvgCount)
                .set(countReset).equalToWhenPresent(record::getCountReset)
                .set(maxCountReset).equalToWhenPresent(record::getMaxCountReset)
                .set(minCountReset).equalToWhenPresent(record::getMinCountReset)
                .set(avgCountReset).equalToWhenPresent(record::getAvgCountReset)
                .set(timeEnabled).equalToWhenPresent(record::getTimeEnabled)
                .set(timeDisabled).equalToWhenPresent(record::getTimeDisabled)
                .set(timeElapsed).equalToWhenPresent(record::getTimeElapsed)
                .set(timeReset).equalToWhenPresent(record::getTimeReset)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(type).equalToWhenPresent(record::getType)
                .set(comment).equalToWhenPresent(record::getComment);
    }
}