package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.EventsDynamicSqlSupport.*;

import com.sg.mybatis.model.Events;
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
public interface EventsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    BasicColumn[] selectList = BasicColumn.columnList(eventCatalog, eventSchema, eventName, definer, timeZone, eventBody, eventType, executeAt, intervalValue, intervalField, sqlMode, starts, ends, status, onCompletion, created, lastAltered, lastExecuted, eventComment, originator, characterSetClient, collationConnection, databaseCollation, eventDefinition);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source Table: EVENTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source Table: EVENTS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source Table: EVENTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Events> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source Table: EVENTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Events> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source Table: EVENTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsResult")
    Optional<Events> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source Table: EVENTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsResult", value = {
        @Result(column="EVENT_CATALOG", property="eventCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_SCHEMA", property="eventSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_ZONE", property="timeZone", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_BODY", property="eventBody", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_TYPE", property="eventType", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXECUTE_AT", property="executeAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="INTERVAL_VALUE", property="intervalValue", jdbcType=JdbcType.INTEGER),
        @Result(column="INTERVAL_FIELD", property="intervalField", jdbcType=JdbcType.CHAR),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.CHAR),
        @Result(column="STARTS", property="starts", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ENDS", property="ends", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="ON_COMPLETION", property="onCompletion", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_ALTERED", property="lastAltered", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_EXECUTED", property="lastExecuted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EVENT_COMMENT", property="eventComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORIGINATOR", property="originator", jdbcType=JdbcType.INTEGER),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_DEFINITION", property="eventDefinition", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Events> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source Table: EVENTS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source Table: EVENTS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, events, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, events, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    default int insert(Events record) {
        return MyBatis3Utils.insert(this::insert, record, events, c ->
            c.map(eventCatalog).toProperty("eventCatalog")
            .map(eventSchema).toProperty("eventSchema")
            .map(eventName).toProperty("eventName")
            .map(definer).toProperty("definer")
            .map(timeZone).toProperty("timeZone")
            .map(eventBody).toProperty("eventBody")
            .map(eventType).toProperty("eventType")
            .map(executeAt).toProperty("executeAt")
            .map(intervalValue).toProperty("intervalValue")
            .map(intervalField).toProperty("intervalField")
            .map(sqlMode).toProperty("sqlMode")
            .map(starts).toProperty("starts")
            .map(ends).toProperty("ends")
            .map(status).toProperty("status")
            .map(onCompletion).toProperty("onCompletion")
            .map(created).toProperty("created")
            .map(lastAltered).toProperty("lastAltered")
            .map(lastExecuted).toProperty("lastExecuted")
            .map(eventComment).toProperty("eventComment")
            .map(originator).toProperty("originator")
            .map(characterSetClient).toProperty("characterSetClient")
            .map(collationConnection).toProperty("collationConnection")
            .map(databaseCollation).toProperty("databaseCollation")
            .map(eventDefinition).toProperty("eventDefinition")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    default int insertMultiple(Collection<Events> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, events, c ->
            c.map(eventCatalog).toProperty("eventCatalog")
            .map(eventSchema).toProperty("eventSchema")
            .map(eventName).toProperty("eventName")
            .map(definer).toProperty("definer")
            .map(timeZone).toProperty("timeZone")
            .map(eventBody).toProperty("eventBody")
            .map(eventType).toProperty("eventType")
            .map(executeAt).toProperty("executeAt")
            .map(intervalValue).toProperty("intervalValue")
            .map(intervalField).toProperty("intervalField")
            .map(sqlMode).toProperty("sqlMode")
            .map(starts).toProperty("starts")
            .map(ends).toProperty("ends")
            .map(status).toProperty("status")
            .map(onCompletion).toProperty("onCompletion")
            .map(created).toProperty("created")
            .map(lastAltered).toProperty("lastAltered")
            .map(lastExecuted).toProperty("lastExecuted")
            .map(eventComment).toProperty("eventComment")
            .map(originator).toProperty("originator")
            .map(characterSetClient).toProperty("characterSetClient")
            .map(collationConnection).toProperty("collationConnection")
            .map(databaseCollation).toProperty("databaseCollation")
            .map(eventDefinition).toProperty("eventDefinition")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    default int insertSelective(Events record) {
        return MyBatis3Utils.insert(this::insert, record, events, c ->
            c.map(eventCatalog).toPropertyWhenPresent("eventCatalog", record::getEventCatalog)
            .map(eventSchema).toPropertyWhenPresent("eventSchema", record::getEventSchema)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(definer).toPropertyWhenPresent("definer", record::getDefiner)
            .map(timeZone).toPropertyWhenPresent("timeZone", record::getTimeZone)
            .map(eventBody).toPropertyWhenPresent("eventBody", record::getEventBody)
            .map(eventType).toPropertyWhenPresent("eventType", record::getEventType)
            .map(executeAt).toPropertyWhenPresent("executeAt", record::getExecuteAt)
            .map(intervalValue).toPropertyWhenPresent("intervalValue", record::getIntervalValue)
            .map(intervalField).toPropertyWhenPresent("intervalField", record::getIntervalField)
            .map(sqlMode).toPropertyWhenPresent("sqlMode", record::getSqlMode)
            .map(starts).toPropertyWhenPresent("starts", record::getStarts)
            .map(ends).toPropertyWhenPresent("ends", record::getEnds)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(onCompletion).toPropertyWhenPresent("onCompletion", record::getOnCompletion)
            .map(created).toPropertyWhenPresent("created", record::getCreated)
            .map(lastAltered).toPropertyWhenPresent("lastAltered", record::getLastAltered)
            .map(lastExecuted).toPropertyWhenPresent("lastExecuted", record::getLastExecuted)
            .map(eventComment).toPropertyWhenPresent("eventComment", record::getEventComment)
            .map(originator).toPropertyWhenPresent("originator", record::getOriginator)
            .map(characterSetClient).toPropertyWhenPresent("characterSetClient", record::getCharacterSetClient)
            .map(collationConnection).toPropertyWhenPresent("collationConnection", record::getCollationConnection)
            .map(databaseCollation).toPropertyWhenPresent("databaseCollation", record::getDatabaseCollation)
            .map(eventDefinition).toPropertyWhenPresent("eventDefinition", record::getEventDefinition)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    default Optional<Events> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, events, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    default List<Events> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, events, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    default List<Events> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, events, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, events, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    static UpdateDSL<UpdateModel> updateAllColumns(Events record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventCatalog).equalTo(record::getEventCatalog)
                .set(eventSchema).equalTo(record::getEventSchema)
                .set(eventName).equalTo(record::getEventName)
                .set(definer).equalTo(record::getDefiner)
                .set(timeZone).equalTo(record::getTimeZone)
                .set(eventBody).equalTo(record::getEventBody)
                .set(eventType).equalTo(record::getEventType)
                .set(executeAt).equalTo(record::getExecuteAt)
                .set(intervalValue).equalTo(record::getIntervalValue)
                .set(intervalField).equalTo(record::getIntervalField)
                .set(sqlMode).equalTo(record::getSqlMode)
                .set(starts).equalTo(record::getStarts)
                .set(ends).equalTo(record::getEnds)
                .set(status).equalTo(record::getStatus)
                .set(onCompletion).equalTo(record::getOnCompletion)
                .set(created).equalTo(record::getCreated)
                .set(lastAltered).equalTo(record::getLastAltered)
                .set(lastExecuted).equalTo(record::getLastExecuted)
                .set(eventComment).equalTo(record::getEventComment)
                .set(originator).equalTo(record::getOriginator)
                .set(characterSetClient).equalTo(record::getCharacterSetClient)
                .set(collationConnection).equalTo(record::getCollationConnection)
                .set(databaseCollation).equalTo(record::getDatabaseCollation)
                .set(eventDefinition).equalTo(record::getEventDefinition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.35+07:00", comments="Source Table: EVENTS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Events record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventCatalog).equalToWhenPresent(record::getEventCatalog)
                .set(eventSchema).equalToWhenPresent(record::getEventSchema)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(definer).equalToWhenPresent(record::getDefiner)
                .set(timeZone).equalToWhenPresent(record::getTimeZone)
                .set(eventBody).equalToWhenPresent(record::getEventBody)
                .set(eventType).equalToWhenPresent(record::getEventType)
                .set(executeAt).equalToWhenPresent(record::getExecuteAt)
                .set(intervalValue).equalToWhenPresent(record::getIntervalValue)
                .set(intervalField).equalToWhenPresent(record::getIntervalField)
                .set(sqlMode).equalToWhenPresent(record::getSqlMode)
                .set(starts).equalToWhenPresent(record::getStarts)
                .set(ends).equalToWhenPresent(record::getEnds)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(onCompletion).equalToWhenPresent(record::getOnCompletion)
                .set(created).equalToWhenPresent(record::getCreated)
                .set(lastAltered).equalToWhenPresent(record::getLastAltered)
                .set(lastExecuted).equalToWhenPresent(record::getLastExecuted)
                .set(eventComment).equalToWhenPresent(record::getEventComment)
                .set(originator).equalToWhenPresent(record::getOriginator)
                .set(characterSetClient).equalToWhenPresent(record::getCharacterSetClient)
                .set(collationConnection).equalToWhenPresent(record::getCollationConnection)
                .set(databaseCollation).equalToWhenPresent(record::getDatabaseCollation)
                .set(eventDefinition).equalToWhenPresent(record::getEventDefinition);
    }
}