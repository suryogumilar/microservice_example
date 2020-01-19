package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ReferentialConstraintsDynamicSqlSupport.*;

import com.sg.mybatis.model.ReferentialConstraints;
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
public interface ReferentialConstraintsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.073+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    BasicColumn[] selectList = BasicColumn.columnList(constraintCatalog, constraintSchema, constraintName, uniqueConstraintCatalog, uniqueConstraintSchema, uniqueConstraintName, matchOption, updateRule, deleteRule, tableName, referencedTableName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReferentialConstraints> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ReferentialConstraints> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReferentialConstraintsResult")
    Optional<ReferentialConstraints> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReferentialConstraintsResult", value = {
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIQUE_CONSTRAINT_CATALOG", property="uniqueConstraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIQUE_CONSTRAINT_SCHEMA", property="uniqueConstraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIQUE_CONSTRAINT_NAME", property="uniqueConstraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MATCH_OPTION", property="matchOption", jdbcType=JdbcType.CHAR),
        @Result(column="UPDATE_RULE", property="updateRule", jdbcType=JdbcType.CHAR),
        @Result(column="DELETE_RULE", property="deleteRule", jdbcType=JdbcType.CHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REFERENCED_TABLE_NAME", property="referencedTableName", jdbcType=JdbcType.VARCHAR)
    })
    List<ReferentialConstraints> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, referentialConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, referentialConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    default int insert(ReferentialConstraints record) {
        return MyBatis3Utils.insert(this::insert, record, referentialConstraints, c ->
            c.map(constraintCatalog).toProperty("constraintCatalog")
            .map(constraintSchema).toProperty("constraintSchema")
            .map(constraintName).toProperty("constraintName")
            .map(uniqueConstraintCatalog).toProperty("uniqueConstraintCatalog")
            .map(uniqueConstraintSchema).toProperty("uniqueConstraintSchema")
            .map(uniqueConstraintName).toProperty("uniqueConstraintName")
            .map(matchOption).toProperty("matchOption")
            .map(updateRule).toProperty("updateRule")
            .map(deleteRule).toProperty("deleteRule")
            .map(tableName).toProperty("tableName")
            .map(referencedTableName).toProperty("referencedTableName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.073+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    default int insertMultiple(Collection<ReferentialConstraints> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, referentialConstraints, c ->
            c.map(constraintCatalog).toProperty("constraintCatalog")
            .map(constraintSchema).toProperty("constraintSchema")
            .map(constraintName).toProperty("constraintName")
            .map(uniqueConstraintCatalog).toProperty("uniqueConstraintCatalog")
            .map(uniqueConstraintSchema).toProperty("uniqueConstraintSchema")
            .map(uniqueConstraintName).toProperty("uniqueConstraintName")
            .map(matchOption).toProperty("matchOption")
            .map(updateRule).toProperty("updateRule")
            .map(deleteRule).toProperty("deleteRule")
            .map(tableName).toProperty("tableName")
            .map(referencedTableName).toProperty("referencedTableName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.073+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    default int insertSelective(ReferentialConstraints record) {
        return MyBatis3Utils.insert(this::insert, record, referentialConstraints, c ->
            c.map(constraintCatalog).toPropertyWhenPresent("constraintCatalog", record::getConstraintCatalog)
            .map(constraintSchema).toPropertyWhenPresent("constraintSchema", record::getConstraintSchema)
            .map(constraintName).toPropertyWhenPresent("constraintName", record::getConstraintName)
            .map(uniqueConstraintCatalog).toPropertyWhenPresent("uniqueConstraintCatalog", record::getUniqueConstraintCatalog)
            .map(uniqueConstraintSchema).toPropertyWhenPresent("uniqueConstraintSchema", record::getUniqueConstraintSchema)
            .map(uniqueConstraintName).toPropertyWhenPresent("uniqueConstraintName", record::getUniqueConstraintName)
            .map(matchOption).toPropertyWhenPresent("matchOption", record::getMatchOption)
            .map(updateRule).toPropertyWhenPresent("updateRule", record::getUpdateRule)
            .map(deleteRule).toPropertyWhenPresent("deleteRule", record::getDeleteRule)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(referencedTableName).toPropertyWhenPresent("referencedTableName", record::getReferencedTableName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.073+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    default Optional<ReferentialConstraints> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, referentialConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.073+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    default List<ReferentialConstraints> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, referentialConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.074+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    default List<ReferentialConstraints> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, referentialConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.074+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, referentialConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.074+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    static UpdateDSL<UpdateModel> updateAllColumns(ReferentialConstraints record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(constraintCatalog).equalTo(record::getConstraintCatalog)
                .set(constraintSchema).equalTo(record::getConstraintSchema)
                .set(constraintName).equalTo(record::getConstraintName)
                .set(uniqueConstraintCatalog).equalTo(record::getUniqueConstraintCatalog)
                .set(uniqueConstraintSchema).equalTo(record::getUniqueConstraintSchema)
                .set(uniqueConstraintName).equalTo(record::getUniqueConstraintName)
                .set(matchOption).equalTo(record::getMatchOption)
                .set(updateRule).equalTo(record::getUpdateRule)
                .set(deleteRule).equalTo(record::getDeleteRule)
                .set(tableName).equalTo(record::getTableName)
                .set(referencedTableName).equalTo(record::getReferencedTableName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.074+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReferentialConstraints record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(constraintCatalog).equalToWhenPresent(record::getConstraintCatalog)
                .set(constraintSchema).equalToWhenPresent(record::getConstraintSchema)
                .set(constraintName).equalToWhenPresent(record::getConstraintName)
                .set(uniqueConstraintCatalog).equalToWhenPresent(record::getUniqueConstraintCatalog)
                .set(uniqueConstraintSchema).equalToWhenPresent(record::getUniqueConstraintSchema)
                .set(uniqueConstraintName).equalToWhenPresent(record::getUniqueConstraintName)
                .set(matchOption).equalToWhenPresent(record::getMatchOption)
                .set(updateRule).equalToWhenPresent(record::getUpdateRule)
                .set(deleteRule).equalToWhenPresent(record::getDeleteRule)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(referencedTableName).equalToWhenPresent(record::getReferencedTableName);
    }
}