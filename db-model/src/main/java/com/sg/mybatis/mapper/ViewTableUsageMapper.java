package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ViewTableUsageDynamicSqlSupport.*;

import com.sg.mybatis.model.ViewTableUsage;
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
public interface ViewTableUsageMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.042+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    BasicColumn[] selectList = BasicColumn.columnList(viewCatalog, viewSchema, viewName, tableCatalog, tableSchema, tableName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.04+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.04+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.041+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ViewTableUsage> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.041+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ViewTableUsage> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.041+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ViewTableUsageResult")
    Optional<ViewTableUsage> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.041+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ViewTableUsageResult", value = {
        @Result(column="VIEW_CATALOG", property="viewCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="VIEW_SCHEMA", property="viewSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="VIEW_NAME", property="viewName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR)
    })
    List<ViewTableUsage> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.041+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.041+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, viewTableUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.041+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, viewTableUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.041+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    default int insert(ViewTableUsage record) {
        return MyBatis3Utils.insert(this::insert, record, viewTableUsage, c ->
            c.map(viewCatalog).toProperty("viewCatalog")
            .map(viewSchema).toProperty("viewSchema")
            .map(viewName).toProperty("viewName")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.042+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    default int insertMultiple(Collection<ViewTableUsage> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, viewTableUsage, c ->
            c.map(viewCatalog).toProperty("viewCatalog")
            .map(viewSchema).toProperty("viewSchema")
            .map(viewName).toProperty("viewName")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.042+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    default int insertSelective(ViewTableUsage record) {
        return MyBatis3Utils.insert(this::insert, record, viewTableUsage, c ->
            c.map(viewCatalog).toPropertyWhenPresent("viewCatalog", record::getViewCatalog)
            .map(viewSchema).toPropertyWhenPresent("viewSchema", record::getViewSchema)
            .map(viewName).toPropertyWhenPresent("viewName", record::getViewName)
            .map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.042+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    default Optional<ViewTableUsage> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, viewTableUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.042+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    default List<ViewTableUsage> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, viewTableUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.042+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    default List<ViewTableUsage> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, viewTableUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.042+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, viewTableUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.042+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    static UpdateDSL<UpdateModel> updateAllColumns(ViewTableUsage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(viewCatalog).equalTo(record::getViewCatalog)
                .set(viewSchema).equalTo(record::getViewSchema)
                .set(viewName).equalTo(record::getViewName)
                .set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.043+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ViewTableUsage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(viewCatalog).equalToWhenPresent(record::getViewCatalog)
                .set(viewSchema).equalToWhenPresent(record::getViewSchema)
                .set(viewName).equalToWhenPresent(record::getViewName)
                .set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName);
    }
}