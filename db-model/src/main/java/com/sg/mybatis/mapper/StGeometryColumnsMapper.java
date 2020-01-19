package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.StGeometryColumnsDynamicSqlSupport.*;

import com.sg.mybatis.model.StGeometryColumns;
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
public interface StGeometryColumnsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    BasicColumn[] selectList = BasicColumn.columnList(tableCatalog, tableSchema, tableName, columnName, srsName, srsId, geometryTypeName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StGeometryColumns> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<StGeometryColumns> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StGeometryColumnsResult")
    Optional<StGeometryColumns> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StGeometryColumnsResult", value = {
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SRS_NAME", property="srsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SRS_ID", property="srsId", jdbcType=JdbcType.INTEGER),
        @Result(column="GEOMETRY_TYPE_NAME", property="geometryTypeName", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<StGeometryColumns> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, stGeometryColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, stGeometryColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    default int insert(StGeometryColumns record) {
        return MyBatis3Utils.insert(this::insert, record, stGeometryColumns, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(srsName).toProperty("srsName")
            .map(srsId).toProperty("srsId")
            .map(geometryTypeName).toProperty("geometryTypeName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    default int insertMultiple(Collection<StGeometryColumns> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, stGeometryColumns, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(srsName).toProperty("srsName")
            .map(srsId).toProperty("srsId")
            .map(geometryTypeName).toProperty("geometryTypeName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    default int insertSelective(StGeometryColumns record) {
        return MyBatis3Utils.insert(this::insert, record, stGeometryColumns, c ->
            c.map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(srsName).toPropertyWhenPresent("srsName", record::getSrsName)
            .map(srsId).toPropertyWhenPresent("srsId", record::getSrsId)
            .map(geometryTypeName).toPropertyWhenPresent("geometryTypeName", record::getGeometryTypeName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    default Optional<StGeometryColumns> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, stGeometryColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    default List<StGeometryColumns> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, stGeometryColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    default List<StGeometryColumns> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, stGeometryColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, stGeometryColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    static UpdateDSL<UpdateModel> updateAllColumns(StGeometryColumns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(columnName).equalTo(record::getColumnName)
                .set(srsName).equalTo(record::getSrsName)
                .set(srsId).equalTo(record::getSrsId)
                .set(geometryTypeName).equalTo(record::getGeometryTypeName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.378+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StGeometryColumns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(srsName).equalToWhenPresent(record::getSrsName)
                .set(srsId).equalToWhenPresent(record::getSrsId)
                .set(geometryTypeName).equalToWhenPresent(record::getGeometryTypeName);
    }
}