package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ColumnStatisticsDynamicSqlSupport.*;

import com.sg.mybatis.model.ColumnStatistics;
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
public interface ColumnStatisticsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    BasicColumn[] selectList = BasicColumn.columnList(schemaName, tableName, columnName, histogram);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ColumnStatistics> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ColumnStatistics> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ColumnStatisticsResult")
    Optional<ColumnStatistics> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ColumnStatisticsResult", value = {
        @Result(column="SCHEMA_NAME", property="schemaName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="HISTOGRAM", property="histogram", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ColumnStatistics> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, columnStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, columnStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    default int insert(ColumnStatistics record) {
        return MyBatis3Utils.insert(this::insert, record, columnStatistics, c ->
            c.map(schemaName).toProperty("schemaName")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(histogram).toProperty("histogram")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    default int insertMultiple(Collection<ColumnStatistics> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, columnStatistics, c ->
            c.map(schemaName).toProperty("schemaName")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(histogram).toProperty("histogram")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    default int insertSelective(ColumnStatistics record) {
        return MyBatis3Utils.insert(this::insert, record, columnStatistics, c ->
            c.map(schemaName).toPropertyWhenPresent("schemaName", record::getSchemaName)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(histogram).toPropertyWhenPresent("histogram", record::getHistogram)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    default Optional<ColumnStatistics> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, columnStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.199+07:00", comments="Source Table: COLUMN_STATISTICS")
    default List<ColumnStatistics> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, columnStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.2+07:00", comments="Source Table: COLUMN_STATISTICS")
    default List<ColumnStatistics> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, columnStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.2+07:00", comments="Source Table: COLUMN_STATISTICS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, columnStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.2+07:00", comments="Source Table: COLUMN_STATISTICS")
    static UpdateDSL<UpdateModel> updateAllColumns(ColumnStatistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(schemaName).equalTo(record::getSchemaName)
                .set(tableName).equalTo(record::getTableName)
                .set(columnName).equalTo(record::getColumnName)
                .set(histogram).equalTo(record::getHistogram);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.2+07:00", comments="Source Table: COLUMN_STATISTICS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ColumnStatistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(schemaName).equalToWhenPresent(record::getSchemaName)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(histogram).equalToWhenPresent(record::getHistogram);
    }
}