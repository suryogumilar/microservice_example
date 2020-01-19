package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.KeyColumnUsageDynamicSqlSupport.*;

import com.sg.mybatis.model.KeyColumnUsage;
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
public interface KeyColumnUsageMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    BasicColumn[] selectList = BasicColumn.columnList(constraintCatalog, constraintSchema, constraintName, tableCatalog, tableSchema, tableName, columnName, ordinalPosition, positionInUniqueConstraint, referencedTableSchema, referencedTableName, referencedColumnName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<KeyColumnUsage> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<KeyColumnUsage> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("KeyColumnUsageResult")
    Optional<KeyColumnUsage> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="KeyColumnUsageResult", value = {
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.INTEGER),
        @Result(column="POSITION_IN_UNIQUE_CONSTRAINT", property="positionInUniqueConstraint", jdbcType=JdbcType.BINARY),
        @Result(column="REFERENCED_TABLE_SCHEMA", property="referencedTableSchema", jdbcType=JdbcType.BINARY),
        @Result(column="REFERENCED_TABLE_NAME", property="referencedTableName", jdbcType=JdbcType.BINARY),
        @Result(column="REFERENCED_COLUMN_NAME", property="referencedColumnName", jdbcType=JdbcType.BINARY)
    })
    List<KeyColumnUsage> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, keyColumnUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, keyColumnUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    default int insert(KeyColumnUsage record) {
        return MyBatis3Utils.insert(this::insert, record, keyColumnUsage, c ->
            c.map(constraintCatalog).toProperty("constraintCatalog")
            .map(constraintSchema).toProperty("constraintSchema")
            .map(constraintName).toProperty("constraintName")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(ordinalPosition).toProperty("ordinalPosition")
            .map(positionInUniqueConstraint).toProperty("positionInUniqueConstraint")
            .map(referencedTableSchema).toProperty("referencedTableSchema")
            .map(referencedTableName).toProperty("referencedTableName")
            .map(referencedColumnName).toProperty("referencedColumnName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    default int insertMultiple(Collection<KeyColumnUsage> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, keyColumnUsage, c ->
            c.map(constraintCatalog).toProperty("constraintCatalog")
            .map(constraintSchema).toProperty("constraintSchema")
            .map(constraintName).toProperty("constraintName")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(ordinalPosition).toProperty("ordinalPosition")
            .map(positionInUniqueConstraint).toProperty("positionInUniqueConstraint")
            .map(referencedTableSchema).toProperty("referencedTableSchema")
            .map(referencedTableName).toProperty("referencedTableName")
            .map(referencedColumnName).toProperty("referencedColumnName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    default int insertSelective(KeyColumnUsage record) {
        return MyBatis3Utils.insert(this::insert, record, keyColumnUsage, c ->
            c.map(constraintCatalog).toPropertyWhenPresent("constraintCatalog", record::getConstraintCatalog)
            .map(constraintSchema).toPropertyWhenPresent("constraintSchema", record::getConstraintSchema)
            .map(constraintName).toPropertyWhenPresent("constraintName", record::getConstraintName)
            .map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(ordinalPosition).toPropertyWhenPresent("ordinalPosition", record::getOrdinalPosition)
            .map(positionInUniqueConstraint).toPropertyWhenPresent("positionInUniqueConstraint", record::getPositionInUniqueConstraint)
            .map(referencedTableSchema).toPropertyWhenPresent("referencedTableSchema", record::getReferencedTableSchema)
            .map(referencedTableName).toPropertyWhenPresent("referencedTableName", record::getReferencedTableName)
            .map(referencedColumnName).toPropertyWhenPresent("referencedColumnName", record::getReferencedColumnName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    default Optional<KeyColumnUsage> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, keyColumnUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    default List<KeyColumnUsage> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, keyColumnUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.418+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    default List<KeyColumnUsage> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, keyColumnUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.419+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, keyColumnUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.419+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    static UpdateDSL<UpdateModel> updateAllColumns(KeyColumnUsage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(constraintCatalog).equalTo(record::getConstraintCatalog)
                .set(constraintSchema).equalTo(record::getConstraintSchema)
                .set(constraintName).equalTo(record::getConstraintName)
                .set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(columnName).equalTo(record::getColumnName)
                .set(ordinalPosition).equalTo(record::getOrdinalPosition)
                .set(positionInUniqueConstraint).equalTo(record::getPositionInUniqueConstraint)
                .set(referencedTableSchema).equalTo(record::getReferencedTableSchema)
                .set(referencedTableName).equalTo(record::getReferencedTableName)
                .set(referencedColumnName).equalTo(record::getReferencedColumnName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.419+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(KeyColumnUsage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(constraintCatalog).equalToWhenPresent(record::getConstraintCatalog)
                .set(constraintSchema).equalToWhenPresent(record::getConstraintSchema)
                .set(constraintName).equalToWhenPresent(record::getConstraintName)
                .set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(ordinalPosition).equalToWhenPresent(record::getOrdinalPosition)
                .set(positionInUniqueConstraint).equalToWhenPresent(record::getPositionInUniqueConstraint)
                .set(referencedTableSchema).equalToWhenPresent(record::getReferencedTableSchema)
                .set(referencedTableName).equalToWhenPresent(record::getReferencedTableName)
                .set(referencedColumnName).equalToWhenPresent(record::getReferencedColumnName);
    }
}