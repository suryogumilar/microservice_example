package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.TableConstraintsDynamicSqlSupport.*;

import com.sg.mybatis.model.TableConstraints;
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
public interface TableConstraintsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.321+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    BasicColumn[] selectList = BasicColumn.columnList(constraintCatalog, constraintSchema, constraintName, tableSchema, tableName, constraintType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.319+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.319+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.319+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TableConstraints> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.319+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TableConstraints> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.32+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TableConstraintsResult")
    Optional<TableConstraints> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.32+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TableConstraintsResult", value = {
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_TYPE", property="constraintType", jdbcType=JdbcType.VARCHAR)
    })
    List<TableConstraints> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.32+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.32+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tableConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.32+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tableConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.32+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    default int insert(TableConstraints record) {
        return MyBatis3Utils.insert(this::insert, record, tableConstraints, c ->
            c.map(constraintCatalog).toProperty("constraintCatalog")
            .map(constraintSchema).toProperty("constraintSchema")
            .map(constraintName).toProperty("constraintName")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(constraintType).toProperty("constraintType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.32+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    default int insertMultiple(Collection<TableConstraints> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tableConstraints, c ->
            c.map(constraintCatalog).toProperty("constraintCatalog")
            .map(constraintSchema).toProperty("constraintSchema")
            .map(constraintName).toProperty("constraintName")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(constraintType).toProperty("constraintType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.32+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    default int insertSelective(TableConstraints record) {
        return MyBatis3Utils.insert(this::insert, record, tableConstraints, c ->
            c.map(constraintCatalog).toPropertyWhenPresent("constraintCatalog", record::getConstraintCatalog)
            .map(constraintSchema).toPropertyWhenPresent("constraintSchema", record::getConstraintSchema)
            .map(constraintName).toPropertyWhenPresent("constraintName", record::getConstraintName)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(constraintType).toPropertyWhenPresent("constraintType", record::getConstraintType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.321+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    default Optional<TableConstraints> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tableConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.321+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    default List<TableConstraints> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tableConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.321+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    default List<TableConstraints> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tableConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.321+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tableConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.321+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    static UpdateDSL<UpdateModel> updateAllColumns(TableConstraints record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(constraintCatalog).equalTo(record::getConstraintCatalog)
                .set(constraintSchema).equalTo(record::getConstraintSchema)
                .set(constraintName).equalTo(record::getConstraintName)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(constraintType).equalTo(record::getConstraintType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.321+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TableConstraints record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(constraintCatalog).equalToWhenPresent(record::getConstraintCatalog)
                .set(constraintSchema).equalToWhenPresent(record::getConstraintSchema)
                .set(constraintName).equalToWhenPresent(record::getConstraintName)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(constraintType).equalToWhenPresent(record::getConstraintType);
    }
}