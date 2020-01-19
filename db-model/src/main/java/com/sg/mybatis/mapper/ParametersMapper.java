package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ParametersDynamicSqlSupport.*;

import com.sg.mybatis.model.Parameters;
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
public interface ParametersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    BasicColumn[] selectList = BasicColumn.columnList(specificCatalog, specificSchema, specificName, ordinalPosition, parameterMode, parameterName, characterMaximumLength, characterOctetLength, numericPrecision, numericScale, datetimePrecision, characterSetName, collationName, routineType, dataType, dtdIdentifier);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source Table: PARAMETERS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source Table: PARAMETERS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source Table: PARAMETERS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Parameters> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source Table: PARAMETERS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Parameters> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source Table: PARAMETERS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ParametersResult")
    Optional<Parameters> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ParametersResult", value = {
        @Result(column="SPECIFIC_CATALOG", property="specificCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_SCHEMA", property="specificSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_NAME", property="specificName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="PARAMETER_MODE", property="parameterMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARAMETER_NAME", property="parameterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.BIGINT),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.INTEGER),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_TYPE", property="routineType", jdbcType=JdbcType.CHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="DTD_IDENTIFIER", property="dtdIdentifier", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Parameters> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, parameters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, parameters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    default int insert(Parameters record) {
        return MyBatis3Utils.insert(this::insert, record, parameters, c ->
            c.map(specificCatalog).toProperty("specificCatalog")
            .map(specificSchema).toProperty("specificSchema")
            .map(specificName).toProperty("specificName")
            .map(ordinalPosition).toProperty("ordinalPosition")
            .map(parameterMode).toProperty("parameterMode")
            .map(parameterName).toProperty("parameterName")
            .map(characterMaximumLength).toProperty("characterMaximumLength")
            .map(characterOctetLength).toProperty("characterOctetLength")
            .map(numericPrecision).toProperty("numericPrecision")
            .map(numericScale).toProperty("numericScale")
            .map(datetimePrecision).toProperty("datetimePrecision")
            .map(characterSetName).toProperty("characterSetName")
            .map(collationName).toProperty("collationName")
            .map(routineType).toProperty("routineType")
            .map(dataType).toProperty("dataType")
            .map(dtdIdentifier).toProperty("dtdIdentifier")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    default int insertMultiple(Collection<Parameters> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, parameters, c ->
            c.map(specificCatalog).toProperty("specificCatalog")
            .map(specificSchema).toProperty("specificSchema")
            .map(specificName).toProperty("specificName")
            .map(ordinalPosition).toProperty("ordinalPosition")
            .map(parameterMode).toProperty("parameterMode")
            .map(parameterName).toProperty("parameterName")
            .map(characterMaximumLength).toProperty("characterMaximumLength")
            .map(characterOctetLength).toProperty("characterOctetLength")
            .map(numericPrecision).toProperty("numericPrecision")
            .map(numericScale).toProperty("numericScale")
            .map(datetimePrecision).toProperty("datetimePrecision")
            .map(characterSetName).toProperty("characterSetName")
            .map(collationName).toProperty("collationName")
            .map(routineType).toProperty("routineType")
            .map(dataType).toProperty("dataType")
            .map(dtdIdentifier).toProperty("dtdIdentifier")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    default int insertSelective(Parameters record) {
        return MyBatis3Utils.insert(this::insert, record, parameters, c ->
            c.map(specificCatalog).toPropertyWhenPresent("specificCatalog", record::getSpecificCatalog)
            .map(specificSchema).toPropertyWhenPresent("specificSchema", record::getSpecificSchema)
            .map(specificName).toPropertyWhenPresent("specificName", record::getSpecificName)
            .map(ordinalPosition).toPropertyWhenPresent("ordinalPosition", record::getOrdinalPosition)
            .map(parameterMode).toPropertyWhenPresent("parameterMode", record::getParameterMode)
            .map(parameterName).toPropertyWhenPresent("parameterName", record::getParameterName)
            .map(characterMaximumLength).toPropertyWhenPresent("characterMaximumLength", record::getCharacterMaximumLength)
            .map(characterOctetLength).toPropertyWhenPresent("characterOctetLength", record::getCharacterOctetLength)
            .map(numericPrecision).toPropertyWhenPresent("numericPrecision", record::getNumericPrecision)
            .map(numericScale).toPropertyWhenPresent("numericScale", record::getNumericScale)
            .map(datetimePrecision).toPropertyWhenPresent("datetimePrecision", record::getDatetimePrecision)
            .map(characterSetName).toPropertyWhenPresent("characterSetName", record::getCharacterSetName)
            .map(collationName).toPropertyWhenPresent("collationName", record::getCollationName)
            .map(routineType).toPropertyWhenPresent("routineType", record::getRoutineType)
            .map(dataType).toPropertyWhenPresent("dataType", record::getDataType)
            .map(dtdIdentifier).toPropertyWhenPresent("dtdIdentifier", record::getDtdIdentifier)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    default Optional<Parameters> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, parameters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    default List<Parameters> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, parameters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    default List<Parameters> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, parameters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, parameters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.436+07:00", comments="Source Table: PARAMETERS")
    static UpdateDSL<UpdateModel> updateAllColumns(Parameters record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(specificCatalog).equalTo(record::getSpecificCatalog)
                .set(specificSchema).equalTo(record::getSpecificSchema)
                .set(specificName).equalTo(record::getSpecificName)
                .set(ordinalPosition).equalTo(record::getOrdinalPosition)
                .set(parameterMode).equalTo(record::getParameterMode)
                .set(parameterName).equalTo(record::getParameterName)
                .set(characterMaximumLength).equalTo(record::getCharacterMaximumLength)
                .set(characterOctetLength).equalTo(record::getCharacterOctetLength)
                .set(numericPrecision).equalTo(record::getNumericPrecision)
                .set(numericScale).equalTo(record::getNumericScale)
                .set(datetimePrecision).equalTo(record::getDatetimePrecision)
                .set(characterSetName).equalTo(record::getCharacterSetName)
                .set(collationName).equalTo(record::getCollationName)
                .set(routineType).equalTo(record::getRoutineType)
                .set(dataType).equalTo(record::getDataType)
                .set(dtdIdentifier).equalTo(record::getDtdIdentifier);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.437+07:00", comments="Source Table: PARAMETERS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Parameters record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(specificCatalog).equalToWhenPresent(record::getSpecificCatalog)
                .set(specificSchema).equalToWhenPresent(record::getSpecificSchema)
                .set(specificName).equalToWhenPresent(record::getSpecificName)
                .set(ordinalPosition).equalToWhenPresent(record::getOrdinalPosition)
                .set(parameterMode).equalToWhenPresent(record::getParameterMode)
                .set(parameterName).equalToWhenPresent(record::getParameterName)
                .set(characterMaximumLength).equalToWhenPresent(record::getCharacterMaximumLength)
                .set(characterOctetLength).equalToWhenPresent(record::getCharacterOctetLength)
                .set(numericPrecision).equalToWhenPresent(record::getNumericPrecision)
                .set(numericScale).equalToWhenPresent(record::getNumericScale)
                .set(datetimePrecision).equalToWhenPresent(record::getDatetimePrecision)
                .set(characterSetName).equalToWhenPresent(record::getCharacterSetName)
                .set(collationName).equalToWhenPresent(record::getCollationName)
                .set(routineType).equalToWhenPresent(record::getRoutineType)
                .set(dataType).equalToWhenPresent(record::getDataType)
                .set(dtdIdentifier).equalToWhenPresent(record::getDtdIdentifier);
    }
}