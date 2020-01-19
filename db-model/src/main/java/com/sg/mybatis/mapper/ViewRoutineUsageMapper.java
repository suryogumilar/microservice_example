package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ViewRoutineUsageDynamicSqlSupport.*;

import com.sg.mybatis.model.ViewRoutineUsage;
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
public interface ViewRoutineUsageMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    BasicColumn[] selectList = BasicColumn.columnList(tableCatalog, tableSchema, tableName, specificCatalog, specificSchema, specificName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ViewRoutineUsage> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ViewRoutineUsage> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ViewRoutineUsageResult")
    Optional<ViewRoutineUsage> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ViewRoutineUsageResult", value = {
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_CATALOG", property="specificCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_SCHEMA", property="specificSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_NAME", property="specificName", jdbcType=JdbcType.VARCHAR)
    })
    List<ViewRoutineUsage> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, viewRoutineUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, viewRoutineUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    default int insert(ViewRoutineUsage record) {
        return MyBatis3Utils.insert(this::insert, record, viewRoutineUsage, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(specificCatalog).toProperty("specificCatalog")
            .map(specificSchema).toProperty("specificSchema")
            .map(specificName).toProperty("specificName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    default int insertMultiple(Collection<ViewRoutineUsage> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, viewRoutineUsage, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(specificCatalog).toProperty("specificCatalog")
            .map(specificSchema).toProperty("specificSchema")
            .map(specificName).toProperty("specificName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    default int insertSelective(ViewRoutineUsage record) {
        return MyBatis3Utils.insert(this::insert, record, viewRoutineUsage, c ->
            c.map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(specificCatalog).toPropertyWhenPresent("specificCatalog", record::getSpecificCatalog)
            .map(specificSchema).toPropertyWhenPresent("specificSchema", record::getSpecificSchema)
            .map(specificName).toPropertyWhenPresent("specificName", record::getSpecificName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    default Optional<ViewRoutineUsage> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, viewRoutineUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    default List<ViewRoutineUsage> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, viewRoutineUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.101+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    default List<ViewRoutineUsage> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, viewRoutineUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.114+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, viewRoutineUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.116+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    static UpdateDSL<UpdateModel> updateAllColumns(ViewRoutineUsage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(specificCatalog).equalTo(record::getSpecificCatalog)
                .set(specificSchema).equalTo(record::getSpecificSchema)
                .set(specificName).equalTo(record::getSpecificName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.117+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ViewRoutineUsage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(specificCatalog).equalToWhenPresent(record::getSpecificCatalog)
                .set(specificSchema).equalToWhenPresent(record::getSpecificSchema)
                .set(specificName).equalToWhenPresent(record::getSpecificName);
    }
}