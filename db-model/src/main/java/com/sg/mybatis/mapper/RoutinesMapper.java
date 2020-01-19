package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.RoutinesDynamicSqlSupport.*;

import com.sg.mybatis.model.Routines;
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
public interface RoutinesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    BasicColumn[] selectList = BasicColumn.columnList(specificName, routineCatalog, routineSchema, routineName, routineType, characterMaximumLength, characterOctetLength, numericPrecision, numericScale, datetimePrecision, characterSetName, collationName, routineBody, externalLanguage, parameterStyle, isDeterministic, sqlDataAccess, securityType, created, lastAltered, sqlMode, definer, characterSetClient, collationConnection, databaseCollation, dataType, dtdIdentifier, routineDefinition, externalName, sqlPath, routineComment);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source Table: ROUTINES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source Table: ROUTINES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source Table: ROUTINES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Routines> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source Table: ROUTINES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Routines> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source Table: ROUTINES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoutinesResult")
    Optional<Routines> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source Table: ROUTINES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoutinesResult", value = {
        @Result(column="SPECIFIC_NAME", property="specificName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_CATALOG", property="routineCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_SCHEMA", property="routineSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_NAME", property="routineName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_TYPE", property="routineType", jdbcType=JdbcType.CHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.INTEGER),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.INTEGER),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_BODY", property="routineBody", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTERNAL_LANGUAGE", property="externalLanguage", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARAMETER_STYLE", property="parameterStyle", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_DETERMINISTIC", property="isDeterministic", jdbcType=JdbcType.VARCHAR),
        @Result(column="SQL_DATA_ACCESS", property="sqlDataAccess", jdbcType=JdbcType.CHAR),
        @Result(column="SECURITY_TYPE", property="securityType", jdbcType=JdbcType.CHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_ALTERED", property="lastAltered", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.CHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="DTD_IDENTIFIER", property="dtdIdentifier", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="ROUTINE_DEFINITION", property="routineDefinition", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="EXTERNAL_NAME", property="externalName", jdbcType=JdbcType.BINARY),
        @Result(column="SQL_PATH", property="sqlPath", jdbcType=JdbcType.BINARY),
        @Result(column="ROUTINE_COMMENT", property="routineComment", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Routines> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, routines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, routines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    default int insert(Routines record) {
        return MyBatis3Utils.insert(this::insert, record, routines, c ->
            c.map(specificName).toProperty("specificName")
            .map(routineCatalog).toProperty("routineCatalog")
            .map(routineSchema).toProperty("routineSchema")
            .map(routineName).toProperty("routineName")
            .map(routineType).toProperty("routineType")
            .map(characterMaximumLength).toProperty("characterMaximumLength")
            .map(characterOctetLength).toProperty("characterOctetLength")
            .map(numericPrecision).toProperty("numericPrecision")
            .map(numericScale).toProperty("numericScale")
            .map(datetimePrecision).toProperty("datetimePrecision")
            .map(characterSetName).toProperty("characterSetName")
            .map(collationName).toProperty("collationName")
            .map(routineBody).toProperty("routineBody")
            .map(externalLanguage).toProperty("externalLanguage")
            .map(parameterStyle).toProperty("parameterStyle")
            .map(isDeterministic).toProperty("isDeterministic")
            .map(sqlDataAccess).toProperty("sqlDataAccess")
            .map(securityType).toProperty("securityType")
            .map(created).toProperty("created")
            .map(lastAltered).toProperty("lastAltered")
            .map(sqlMode).toProperty("sqlMode")
            .map(definer).toProperty("definer")
            .map(characterSetClient).toProperty("characterSetClient")
            .map(collationConnection).toProperty("collationConnection")
            .map(databaseCollation).toProperty("databaseCollation")
            .map(dataType).toProperty("dataType")
            .map(dtdIdentifier).toProperty("dtdIdentifier")
            .map(routineDefinition).toProperty("routineDefinition")
            .map(externalName).toProperty("externalName")
            .map(sqlPath).toProperty("sqlPath")
            .map(routineComment).toProperty("routineComment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    default int insertMultiple(Collection<Routines> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, routines, c ->
            c.map(specificName).toProperty("specificName")
            .map(routineCatalog).toProperty("routineCatalog")
            .map(routineSchema).toProperty("routineSchema")
            .map(routineName).toProperty("routineName")
            .map(routineType).toProperty("routineType")
            .map(characterMaximumLength).toProperty("characterMaximumLength")
            .map(characterOctetLength).toProperty("characterOctetLength")
            .map(numericPrecision).toProperty("numericPrecision")
            .map(numericScale).toProperty("numericScale")
            .map(datetimePrecision).toProperty("datetimePrecision")
            .map(characterSetName).toProperty("characterSetName")
            .map(collationName).toProperty("collationName")
            .map(routineBody).toProperty("routineBody")
            .map(externalLanguage).toProperty("externalLanguage")
            .map(parameterStyle).toProperty("parameterStyle")
            .map(isDeterministic).toProperty("isDeterministic")
            .map(sqlDataAccess).toProperty("sqlDataAccess")
            .map(securityType).toProperty("securityType")
            .map(created).toProperty("created")
            .map(lastAltered).toProperty("lastAltered")
            .map(sqlMode).toProperty("sqlMode")
            .map(definer).toProperty("definer")
            .map(characterSetClient).toProperty("characterSetClient")
            .map(collationConnection).toProperty("collationConnection")
            .map(databaseCollation).toProperty("databaseCollation")
            .map(dataType).toProperty("dataType")
            .map(dtdIdentifier).toProperty("dtdIdentifier")
            .map(routineDefinition).toProperty("routineDefinition")
            .map(externalName).toProperty("externalName")
            .map(sqlPath).toProperty("sqlPath")
            .map(routineComment).toProperty("routineComment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    default int insertSelective(Routines record) {
        return MyBatis3Utils.insert(this::insert, record, routines, c ->
            c.map(specificName).toPropertyWhenPresent("specificName", record::getSpecificName)
            .map(routineCatalog).toPropertyWhenPresent("routineCatalog", record::getRoutineCatalog)
            .map(routineSchema).toPropertyWhenPresent("routineSchema", record::getRoutineSchema)
            .map(routineName).toPropertyWhenPresent("routineName", record::getRoutineName)
            .map(routineType).toPropertyWhenPresent("routineType", record::getRoutineType)
            .map(characterMaximumLength).toPropertyWhenPresent("characterMaximumLength", record::getCharacterMaximumLength)
            .map(characterOctetLength).toPropertyWhenPresent("characterOctetLength", record::getCharacterOctetLength)
            .map(numericPrecision).toPropertyWhenPresent("numericPrecision", record::getNumericPrecision)
            .map(numericScale).toPropertyWhenPresent("numericScale", record::getNumericScale)
            .map(datetimePrecision).toPropertyWhenPresent("datetimePrecision", record::getDatetimePrecision)
            .map(characterSetName).toPropertyWhenPresent("characterSetName", record::getCharacterSetName)
            .map(collationName).toPropertyWhenPresent("collationName", record::getCollationName)
            .map(routineBody).toPropertyWhenPresent("routineBody", record::getRoutineBody)
            .map(externalLanguage).toPropertyWhenPresent("externalLanguage", record::getExternalLanguage)
            .map(parameterStyle).toPropertyWhenPresent("parameterStyle", record::getParameterStyle)
            .map(isDeterministic).toPropertyWhenPresent("isDeterministic", record::getIsDeterministic)
            .map(sqlDataAccess).toPropertyWhenPresent("sqlDataAccess", record::getSqlDataAccess)
            .map(securityType).toPropertyWhenPresent("securityType", record::getSecurityType)
            .map(created).toPropertyWhenPresent("created", record::getCreated)
            .map(lastAltered).toPropertyWhenPresent("lastAltered", record::getLastAltered)
            .map(sqlMode).toPropertyWhenPresent("sqlMode", record::getSqlMode)
            .map(definer).toPropertyWhenPresent("definer", record::getDefiner)
            .map(characterSetClient).toPropertyWhenPresent("characterSetClient", record::getCharacterSetClient)
            .map(collationConnection).toPropertyWhenPresent("collationConnection", record::getCollationConnection)
            .map(databaseCollation).toPropertyWhenPresent("databaseCollation", record::getDatabaseCollation)
            .map(dataType).toPropertyWhenPresent("dataType", record::getDataType)
            .map(dtdIdentifier).toPropertyWhenPresent("dtdIdentifier", record::getDtdIdentifier)
            .map(routineDefinition).toPropertyWhenPresent("routineDefinition", record::getRoutineDefinition)
            .map(externalName).toPropertyWhenPresent("externalName", record::getExternalName)
            .map(sqlPath).toPropertyWhenPresent("sqlPath", record::getSqlPath)
            .map(routineComment).toPropertyWhenPresent("routineComment", record::getRoutineComment)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    default Optional<Routines> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, routines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    default List<Routines> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, routines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    default List<Routines> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, routines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, routines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.374+07:00", comments="Source Table: ROUTINES")
    static UpdateDSL<UpdateModel> updateAllColumns(Routines record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(specificName).equalTo(record::getSpecificName)
                .set(routineCatalog).equalTo(record::getRoutineCatalog)
                .set(routineSchema).equalTo(record::getRoutineSchema)
                .set(routineName).equalTo(record::getRoutineName)
                .set(routineType).equalTo(record::getRoutineType)
                .set(characterMaximumLength).equalTo(record::getCharacterMaximumLength)
                .set(characterOctetLength).equalTo(record::getCharacterOctetLength)
                .set(numericPrecision).equalTo(record::getNumericPrecision)
                .set(numericScale).equalTo(record::getNumericScale)
                .set(datetimePrecision).equalTo(record::getDatetimePrecision)
                .set(characterSetName).equalTo(record::getCharacterSetName)
                .set(collationName).equalTo(record::getCollationName)
                .set(routineBody).equalTo(record::getRoutineBody)
                .set(externalLanguage).equalTo(record::getExternalLanguage)
                .set(parameterStyle).equalTo(record::getParameterStyle)
                .set(isDeterministic).equalTo(record::getIsDeterministic)
                .set(sqlDataAccess).equalTo(record::getSqlDataAccess)
                .set(securityType).equalTo(record::getSecurityType)
                .set(created).equalTo(record::getCreated)
                .set(lastAltered).equalTo(record::getLastAltered)
                .set(sqlMode).equalTo(record::getSqlMode)
                .set(definer).equalTo(record::getDefiner)
                .set(characterSetClient).equalTo(record::getCharacterSetClient)
                .set(collationConnection).equalTo(record::getCollationConnection)
                .set(databaseCollation).equalTo(record::getDatabaseCollation)
                .set(dataType).equalTo(record::getDataType)
                .set(dtdIdentifier).equalTo(record::getDtdIdentifier)
                .set(routineDefinition).equalTo(record::getRoutineDefinition)
                .set(externalName).equalTo(record::getExternalName)
                .set(sqlPath).equalTo(record::getSqlPath)
                .set(routineComment).equalTo(record::getRoutineComment);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.375+07:00", comments="Source Table: ROUTINES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Routines record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(specificName).equalToWhenPresent(record::getSpecificName)
                .set(routineCatalog).equalToWhenPresent(record::getRoutineCatalog)
                .set(routineSchema).equalToWhenPresent(record::getRoutineSchema)
                .set(routineName).equalToWhenPresent(record::getRoutineName)
                .set(routineType).equalToWhenPresent(record::getRoutineType)
                .set(characterMaximumLength).equalToWhenPresent(record::getCharacterMaximumLength)
                .set(characterOctetLength).equalToWhenPresent(record::getCharacterOctetLength)
                .set(numericPrecision).equalToWhenPresent(record::getNumericPrecision)
                .set(numericScale).equalToWhenPresent(record::getNumericScale)
                .set(datetimePrecision).equalToWhenPresent(record::getDatetimePrecision)
                .set(characterSetName).equalToWhenPresent(record::getCharacterSetName)
                .set(collationName).equalToWhenPresent(record::getCollationName)
                .set(routineBody).equalToWhenPresent(record::getRoutineBody)
                .set(externalLanguage).equalToWhenPresent(record::getExternalLanguage)
                .set(parameterStyle).equalToWhenPresent(record::getParameterStyle)
                .set(isDeterministic).equalToWhenPresent(record::getIsDeterministic)
                .set(sqlDataAccess).equalToWhenPresent(record::getSqlDataAccess)
                .set(securityType).equalToWhenPresent(record::getSecurityType)
                .set(created).equalToWhenPresent(record::getCreated)
                .set(lastAltered).equalToWhenPresent(record::getLastAltered)
                .set(sqlMode).equalToWhenPresent(record::getSqlMode)
                .set(definer).equalToWhenPresent(record::getDefiner)
                .set(characterSetClient).equalToWhenPresent(record::getCharacterSetClient)
                .set(collationConnection).equalToWhenPresent(record::getCollationConnection)
                .set(databaseCollation).equalToWhenPresent(record::getDatabaseCollation)
                .set(dataType).equalToWhenPresent(record::getDataType)
                .set(dtdIdentifier).equalToWhenPresent(record::getDtdIdentifier)
                .set(routineDefinition).equalToWhenPresent(record::getRoutineDefinition)
                .set(externalName).equalToWhenPresent(record::getExternalName)
                .set(sqlPath).equalToWhenPresent(record::getSqlPath)
                .set(routineComment).equalToWhenPresent(record::getRoutineComment);
    }
}