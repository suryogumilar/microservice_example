package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ColumnsDynamicSqlSupport.*;

import com.sg.mybatis.model.Columns;
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
public interface ColumnsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.361+07:00", comments="Source Table: COLUMNS")
    BasicColumn[] selectList = BasicColumn.columnList(tableCatalog, tableSchema, tableName, columnName, ordinalPosition, isNullable, characterMaximumLength, characterOctetLength, numericPrecision, numericScale, datetimePrecision, characterSetName, collationName, columnKey, extra, privileges, srsId, columnDefault, dataType, columnType, columnComment, generationExpression);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source Table: COLUMNS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Columns> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Columns> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ColumnsResult")
    Optional<Columns> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ColumnsResult", value = {
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.INTEGER),
        @Result(column="IS_NULLABLE", property="isNullable", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.BIGINT),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.INTEGER),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_KEY", property="columnKey", jdbcType=JdbcType.CHAR),
        @Result(column="EXTRA", property="extra", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGES", property="privileges", jdbcType=JdbcType.VARCHAR),
        @Result(column="SRS_ID", property="srsId", jdbcType=JdbcType.INTEGER),
        @Result(column="COLUMN_DEFAULT", property="columnDefault", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="COLUMN_TYPE", property="columnType", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="COLUMN_COMMENT", property="columnComment", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="GENERATION_EXPRESSION", property="generationExpression", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Columns> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, columns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, columns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    default int insert(Columns record) {
        return MyBatis3Utils.insert(this::insert, record, columns, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(ordinalPosition).toProperty("ordinalPosition")
            .map(isNullable).toProperty("isNullable")
            .map(characterMaximumLength).toProperty("characterMaximumLength")
            .map(characterOctetLength).toProperty("characterOctetLength")
            .map(numericPrecision).toProperty("numericPrecision")
            .map(numericScale).toProperty("numericScale")
            .map(datetimePrecision).toProperty("datetimePrecision")
            .map(characterSetName).toProperty("characterSetName")
            .map(collationName).toProperty("collationName")
            .map(columnKey).toProperty("columnKey")
            .map(extra).toProperty("extra")
            .map(privileges).toProperty("privileges")
            .map(srsId).toProperty("srsId")
            .map(columnDefault).toProperty("columnDefault")
            .map(dataType).toProperty("dataType")
            .map(columnType).toProperty("columnType")
            .map(columnComment).toProperty("columnComment")
            .map(generationExpression).toProperty("generationExpression")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    default int insertMultiple(Collection<Columns> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, columns, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(ordinalPosition).toProperty("ordinalPosition")
            .map(isNullable).toProperty("isNullable")
            .map(characterMaximumLength).toProperty("characterMaximumLength")
            .map(characterOctetLength).toProperty("characterOctetLength")
            .map(numericPrecision).toProperty("numericPrecision")
            .map(numericScale).toProperty("numericScale")
            .map(datetimePrecision).toProperty("datetimePrecision")
            .map(characterSetName).toProperty("characterSetName")
            .map(collationName).toProperty("collationName")
            .map(columnKey).toProperty("columnKey")
            .map(extra).toProperty("extra")
            .map(privileges).toProperty("privileges")
            .map(srsId).toProperty("srsId")
            .map(columnDefault).toProperty("columnDefault")
            .map(dataType).toProperty("dataType")
            .map(columnType).toProperty("columnType")
            .map(columnComment).toProperty("columnComment")
            .map(generationExpression).toProperty("generationExpression")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.36+07:00", comments="Source Table: COLUMNS")
    default int insertSelective(Columns record) {
        return MyBatis3Utils.insert(this::insert, record, columns, c ->
            c.map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(ordinalPosition).toPropertyWhenPresent("ordinalPosition", record::getOrdinalPosition)
            .map(isNullable).toPropertyWhenPresent("isNullable", record::getIsNullable)
            .map(characterMaximumLength).toPropertyWhenPresent("characterMaximumLength", record::getCharacterMaximumLength)
            .map(characterOctetLength).toPropertyWhenPresent("characterOctetLength", record::getCharacterOctetLength)
            .map(numericPrecision).toPropertyWhenPresent("numericPrecision", record::getNumericPrecision)
            .map(numericScale).toPropertyWhenPresent("numericScale", record::getNumericScale)
            .map(datetimePrecision).toPropertyWhenPresent("datetimePrecision", record::getDatetimePrecision)
            .map(characterSetName).toPropertyWhenPresent("characterSetName", record::getCharacterSetName)
            .map(collationName).toPropertyWhenPresent("collationName", record::getCollationName)
            .map(columnKey).toPropertyWhenPresent("columnKey", record::getColumnKey)
            .map(extra).toPropertyWhenPresent("extra", record::getExtra)
            .map(privileges).toPropertyWhenPresent("privileges", record::getPrivileges)
            .map(srsId).toPropertyWhenPresent("srsId", record::getSrsId)
            .map(columnDefault).toPropertyWhenPresent("columnDefault", record::getColumnDefault)
            .map(dataType).toPropertyWhenPresent("dataType", record::getDataType)
            .map(columnType).toPropertyWhenPresent("columnType", record::getColumnType)
            .map(columnComment).toPropertyWhenPresent("columnComment", record::getColumnComment)
            .map(generationExpression).toPropertyWhenPresent("generationExpression", record::getGenerationExpression)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.361+07:00", comments="Source Table: COLUMNS")
    default Optional<Columns> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, columns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.361+07:00", comments="Source Table: COLUMNS")
    default List<Columns> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, columns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.361+07:00", comments="Source Table: COLUMNS")
    default List<Columns> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, columns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.361+07:00", comments="Source Table: COLUMNS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, columns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.361+07:00", comments="Source Table: COLUMNS")
    static UpdateDSL<UpdateModel> updateAllColumns(Columns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(columnName).equalTo(record::getColumnName)
                .set(ordinalPosition).equalTo(record::getOrdinalPosition)
                .set(isNullable).equalTo(record::getIsNullable)
                .set(characterMaximumLength).equalTo(record::getCharacterMaximumLength)
                .set(characterOctetLength).equalTo(record::getCharacterOctetLength)
                .set(numericPrecision).equalTo(record::getNumericPrecision)
                .set(numericScale).equalTo(record::getNumericScale)
                .set(datetimePrecision).equalTo(record::getDatetimePrecision)
                .set(characterSetName).equalTo(record::getCharacterSetName)
                .set(collationName).equalTo(record::getCollationName)
                .set(columnKey).equalTo(record::getColumnKey)
                .set(extra).equalTo(record::getExtra)
                .set(privileges).equalTo(record::getPrivileges)
                .set(srsId).equalTo(record::getSrsId)
                .set(columnDefault).equalTo(record::getColumnDefault)
                .set(dataType).equalTo(record::getDataType)
                .set(columnType).equalTo(record::getColumnType)
                .set(columnComment).equalTo(record::getColumnComment)
                .set(generationExpression).equalTo(record::getGenerationExpression);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.361+07:00", comments="Source Table: COLUMNS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Columns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(ordinalPosition).equalToWhenPresent(record::getOrdinalPosition)
                .set(isNullable).equalToWhenPresent(record::getIsNullable)
                .set(characterMaximumLength).equalToWhenPresent(record::getCharacterMaximumLength)
                .set(characterOctetLength).equalToWhenPresent(record::getCharacterOctetLength)
                .set(numericPrecision).equalToWhenPresent(record::getNumericPrecision)
                .set(numericScale).equalToWhenPresent(record::getNumericScale)
                .set(datetimePrecision).equalToWhenPresent(record::getDatetimePrecision)
                .set(characterSetName).equalToWhenPresent(record::getCharacterSetName)
                .set(collationName).equalToWhenPresent(record::getCollationName)
                .set(columnKey).equalToWhenPresent(record::getColumnKey)
                .set(extra).equalToWhenPresent(record::getExtra)
                .set(privileges).equalToWhenPresent(record::getPrivileges)
                .set(srsId).equalToWhenPresent(record::getSrsId)
                .set(columnDefault).equalToWhenPresent(record::getColumnDefault)
                .set(dataType).equalToWhenPresent(record::getDataType)
                .set(columnType).equalToWhenPresent(record::getColumnType)
                .set(columnComment).equalToWhenPresent(record::getColumnComment)
                .set(generationExpression).equalToWhenPresent(record::getGenerationExpression);
    }
}