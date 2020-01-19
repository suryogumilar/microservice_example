package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.TriggersDynamicSqlSupport.*;

import com.sg.mybatis.model.Triggers;
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
public interface TriggersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.158+07:00", comments="Source Table: TRIGGERS")
    BasicColumn[] selectList = BasicColumn.columnList(triggerCatalog, triggerSchema, triggerName, eventManipulation, eventObjectCatalog, eventObjectSchema, eventObjectTable, actionOrder, actionOrientation, actionTiming, actionReferenceOldRow, actionReferenceNewRow, created, sqlMode, definer, characterSetClient, collationConnection, databaseCollation, actionCondition, actionStatement, actionReferenceOldTable, actionReferenceNewTable);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source Table: TRIGGERS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source Table: TRIGGERS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source Table: TRIGGERS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Triggers> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.157+07:00", comments="Source Table: TRIGGERS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Triggers> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.157+07:00", comments="Source Table: TRIGGERS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TriggersResult")
    Optional<Triggers> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.157+07:00", comments="Source Table: TRIGGERS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TriggersResult", value = {
        @Result(column="TRIGGER_CATALOG", property="triggerCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_SCHEMA", property="triggerSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_NAME", property="triggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_MANIPULATION", property="eventManipulation", jdbcType=JdbcType.CHAR),
        @Result(column="EVENT_OBJECT_CATALOG", property="eventObjectCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_SCHEMA", property="eventObjectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_TABLE", property="eventObjectTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_ORDER", property="actionOrder", jdbcType=JdbcType.INTEGER),
        @Result(column="ACTION_ORIENTATION", property="actionOrientation", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_TIMING", property="actionTiming", jdbcType=JdbcType.CHAR),
        @Result(column="ACTION_REFERENCE_OLD_ROW", property="actionReferenceOldRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_NEW_ROW", property="actionReferenceNewRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.CHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_CONDITION", property="actionCondition", jdbcType=JdbcType.BINARY),
        @Result(column="ACTION_STATEMENT", property="actionStatement", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="ACTION_REFERENCE_OLD_TABLE", property="actionReferenceOldTable", jdbcType=JdbcType.BINARY),
        @Result(column="ACTION_REFERENCE_NEW_TABLE", property="actionReferenceNewTable", jdbcType=JdbcType.BINARY)
    })
    List<Triggers> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.157+07:00", comments="Source Table: TRIGGERS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.157+07:00", comments="Source Table: TRIGGERS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, triggers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.157+07:00", comments="Source Table: TRIGGERS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, triggers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.157+07:00", comments="Source Table: TRIGGERS")
    default int insert(Triggers record) {
        return MyBatis3Utils.insert(this::insert, record, triggers, c ->
            c.map(triggerCatalog).toProperty("triggerCatalog")
            .map(triggerSchema).toProperty("triggerSchema")
            .map(triggerName).toProperty("triggerName")
            .map(eventManipulation).toProperty("eventManipulation")
            .map(eventObjectCatalog).toProperty("eventObjectCatalog")
            .map(eventObjectSchema).toProperty("eventObjectSchema")
            .map(eventObjectTable).toProperty("eventObjectTable")
            .map(actionOrder).toProperty("actionOrder")
            .map(actionOrientation).toProperty("actionOrientation")
            .map(actionTiming).toProperty("actionTiming")
            .map(actionReferenceOldRow).toProperty("actionReferenceOldRow")
            .map(actionReferenceNewRow).toProperty("actionReferenceNewRow")
            .map(created).toProperty("created")
            .map(sqlMode).toProperty("sqlMode")
            .map(definer).toProperty("definer")
            .map(characterSetClient).toProperty("characterSetClient")
            .map(collationConnection).toProperty("collationConnection")
            .map(databaseCollation).toProperty("databaseCollation")
            .map(actionCondition).toProperty("actionCondition")
            .map(actionStatement).toProperty("actionStatement")
            .map(actionReferenceOldTable).toProperty("actionReferenceOldTable")
            .map(actionReferenceNewTable).toProperty("actionReferenceNewTable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.157+07:00", comments="Source Table: TRIGGERS")
    default int insertMultiple(Collection<Triggers> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, triggers, c ->
            c.map(triggerCatalog).toProperty("triggerCatalog")
            .map(triggerSchema).toProperty("triggerSchema")
            .map(triggerName).toProperty("triggerName")
            .map(eventManipulation).toProperty("eventManipulation")
            .map(eventObjectCatalog).toProperty("eventObjectCatalog")
            .map(eventObjectSchema).toProperty("eventObjectSchema")
            .map(eventObjectTable).toProperty("eventObjectTable")
            .map(actionOrder).toProperty("actionOrder")
            .map(actionOrientation).toProperty("actionOrientation")
            .map(actionTiming).toProperty("actionTiming")
            .map(actionReferenceOldRow).toProperty("actionReferenceOldRow")
            .map(actionReferenceNewRow).toProperty("actionReferenceNewRow")
            .map(created).toProperty("created")
            .map(sqlMode).toProperty("sqlMode")
            .map(definer).toProperty("definer")
            .map(characterSetClient).toProperty("characterSetClient")
            .map(collationConnection).toProperty("collationConnection")
            .map(databaseCollation).toProperty("databaseCollation")
            .map(actionCondition).toProperty("actionCondition")
            .map(actionStatement).toProperty("actionStatement")
            .map(actionReferenceOldTable).toProperty("actionReferenceOldTable")
            .map(actionReferenceNewTable).toProperty("actionReferenceNewTable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.157+07:00", comments="Source Table: TRIGGERS")
    default int insertSelective(Triggers record) {
        return MyBatis3Utils.insert(this::insert, record, triggers, c ->
            c.map(triggerCatalog).toPropertyWhenPresent("triggerCatalog", record::getTriggerCatalog)
            .map(triggerSchema).toPropertyWhenPresent("triggerSchema", record::getTriggerSchema)
            .map(triggerName).toPropertyWhenPresent("triggerName", record::getTriggerName)
            .map(eventManipulation).toPropertyWhenPresent("eventManipulation", record::getEventManipulation)
            .map(eventObjectCatalog).toPropertyWhenPresent("eventObjectCatalog", record::getEventObjectCatalog)
            .map(eventObjectSchema).toPropertyWhenPresent("eventObjectSchema", record::getEventObjectSchema)
            .map(eventObjectTable).toPropertyWhenPresent("eventObjectTable", record::getEventObjectTable)
            .map(actionOrder).toPropertyWhenPresent("actionOrder", record::getActionOrder)
            .map(actionOrientation).toPropertyWhenPresent("actionOrientation", record::getActionOrientation)
            .map(actionTiming).toPropertyWhenPresent("actionTiming", record::getActionTiming)
            .map(actionReferenceOldRow).toPropertyWhenPresent("actionReferenceOldRow", record::getActionReferenceOldRow)
            .map(actionReferenceNewRow).toPropertyWhenPresent("actionReferenceNewRow", record::getActionReferenceNewRow)
            .map(created).toPropertyWhenPresent("created", record::getCreated)
            .map(sqlMode).toPropertyWhenPresent("sqlMode", record::getSqlMode)
            .map(definer).toPropertyWhenPresent("definer", record::getDefiner)
            .map(characterSetClient).toPropertyWhenPresent("characterSetClient", record::getCharacterSetClient)
            .map(collationConnection).toPropertyWhenPresent("collationConnection", record::getCollationConnection)
            .map(databaseCollation).toPropertyWhenPresent("databaseCollation", record::getDatabaseCollation)
            .map(actionCondition).toPropertyWhenPresent("actionCondition", record::getActionCondition)
            .map(actionStatement).toPropertyWhenPresent("actionStatement", record::getActionStatement)
            .map(actionReferenceOldTable).toPropertyWhenPresent("actionReferenceOldTable", record::getActionReferenceOldTable)
            .map(actionReferenceNewTable).toPropertyWhenPresent("actionReferenceNewTable", record::getActionReferenceNewTable)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.158+07:00", comments="Source Table: TRIGGERS")
    default Optional<Triggers> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, triggers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.158+07:00", comments="Source Table: TRIGGERS")
    default List<Triggers> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, triggers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.158+07:00", comments="Source Table: TRIGGERS")
    default List<Triggers> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, triggers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.158+07:00", comments="Source Table: TRIGGERS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, triggers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.158+07:00", comments="Source Table: TRIGGERS")
    static UpdateDSL<UpdateModel> updateAllColumns(Triggers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(triggerCatalog).equalTo(record::getTriggerCatalog)
                .set(triggerSchema).equalTo(record::getTriggerSchema)
                .set(triggerName).equalTo(record::getTriggerName)
                .set(eventManipulation).equalTo(record::getEventManipulation)
                .set(eventObjectCatalog).equalTo(record::getEventObjectCatalog)
                .set(eventObjectSchema).equalTo(record::getEventObjectSchema)
                .set(eventObjectTable).equalTo(record::getEventObjectTable)
                .set(actionOrder).equalTo(record::getActionOrder)
                .set(actionOrientation).equalTo(record::getActionOrientation)
                .set(actionTiming).equalTo(record::getActionTiming)
                .set(actionReferenceOldRow).equalTo(record::getActionReferenceOldRow)
                .set(actionReferenceNewRow).equalTo(record::getActionReferenceNewRow)
                .set(created).equalTo(record::getCreated)
                .set(sqlMode).equalTo(record::getSqlMode)
                .set(definer).equalTo(record::getDefiner)
                .set(characterSetClient).equalTo(record::getCharacterSetClient)
                .set(collationConnection).equalTo(record::getCollationConnection)
                .set(databaseCollation).equalTo(record::getDatabaseCollation)
                .set(actionCondition).equalTo(record::getActionCondition)
                .set(actionStatement).equalTo(record::getActionStatement)
                .set(actionReferenceOldTable).equalTo(record::getActionReferenceOldTable)
                .set(actionReferenceNewTable).equalTo(record::getActionReferenceNewTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.158+07:00", comments="Source Table: TRIGGERS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Triggers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(triggerCatalog).equalToWhenPresent(record::getTriggerCatalog)
                .set(triggerSchema).equalToWhenPresent(record::getTriggerSchema)
                .set(triggerName).equalToWhenPresent(record::getTriggerName)
                .set(eventManipulation).equalToWhenPresent(record::getEventManipulation)
                .set(eventObjectCatalog).equalToWhenPresent(record::getEventObjectCatalog)
                .set(eventObjectSchema).equalToWhenPresent(record::getEventObjectSchema)
                .set(eventObjectTable).equalToWhenPresent(record::getEventObjectTable)
                .set(actionOrder).equalToWhenPresent(record::getActionOrder)
                .set(actionOrientation).equalToWhenPresent(record::getActionOrientation)
                .set(actionTiming).equalToWhenPresent(record::getActionTiming)
                .set(actionReferenceOldRow).equalToWhenPresent(record::getActionReferenceOldRow)
                .set(actionReferenceNewRow).equalToWhenPresent(record::getActionReferenceNewRow)
                .set(created).equalToWhenPresent(record::getCreated)
                .set(sqlMode).equalToWhenPresent(record::getSqlMode)
                .set(definer).equalToWhenPresent(record::getDefiner)
                .set(characterSetClient).equalToWhenPresent(record::getCharacterSetClient)
                .set(collationConnection).equalToWhenPresent(record::getCollationConnection)
                .set(databaseCollation).equalToWhenPresent(record::getDatabaseCollation)
                .set(actionCondition).equalToWhenPresent(record::getActionCondition)
                .set(actionStatement).equalToWhenPresent(record::getActionStatement)
                .set(actionReferenceOldTable).equalToWhenPresent(record::getActionReferenceOldTable)
                .set(actionReferenceNewTable).equalToWhenPresent(record::getActionReferenceNewTable);
    }
}