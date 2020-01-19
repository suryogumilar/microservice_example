package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.SchemataDynamicSqlSupport.*;

import com.sg.mybatis.model.Schemata;
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
public interface SchemataMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.341+07:00", comments="Source Table: SCHEMATA")
    BasicColumn[] selectList = BasicColumn.columnList(catalogName, schemaName, defaultCharacterSetName, defaultCollationName, sqlPath);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Schemata> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Schemata> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SchemataResult")
    Optional<Schemata> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SchemataResult", value = {
        @Result(column="CATALOG_NAME", property="catalogName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SCHEMA_NAME", property="schemaName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_CHARACTER_SET_NAME", property="defaultCharacterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_COLLATION_NAME", property="defaultCollationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SQL_PATH", property="sqlPath", jdbcType=JdbcType.BINARY)
    })
    List<Schemata> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, schemata, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, schemata, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.34+07:00", comments="Source Table: SCHEMATA")
    default int insert(Schemata record) {
        return MyBatis3Utils.insert(this::insert, record, schemata, c ->
            c.map(catalogName).toProperty("catalogName")
            .map(schemaName).toProperty("schemaName")
            .map(defaultCharacterSetName).toProperty("defaultCharacterSetName")
            .map(defaultCollationName).toProperty("defaultCollationName")
            .map(sqlPath).toProperty("sqlPath")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.341+07:00", comments="Source Table: SCHEMATA")
    default int insertMultiple(Collection<Schemata> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, schemata, c ->
            c.map(catalogName).toProperty("catalogName")
            .map(schemaName).toProperty("schemaName")
            .map(defaultCharacterSetName).toProperty("defaultCharacterSetName")
            .map(defaultCollationName).toProperty("defaultCollationName")
            .map(sqlPath).toProperty("sqlPath")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.341+07:00", comments="Source Table: SCHEMATA")
    default int insertSelective(Schemata record) {
        return MyBatis3Utils.insert(this::insert, record, schemata, c ->
            c.map(catalogName).toPropertyWhenPresent("catalogName", record::getCatalogName)
            .map(schemaName).toPropertyWhenPresent("schemaName", record::getSchemaName)
            .map(defaultCharacterSetName).toPropertyWhenPresent("defaultCharacterSetName", record::getDefaultCharacterSetName)
            .map(defaultCollationName).toPropertyWhenPresent("defaultCollationName", record::getDefaultCollationName)
            .map(sqlPath).toPropertyWhenPresent("sqlPath", record::getSqlPath)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.341+07:00", comments="Source Table: SCHEMATA")
    default Optional<Schemata> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, schemata, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.341+07:00", comments="Source Table: SCHEMATA")
    default List<Schemata> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, schemata, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.341+07:00", comments="Source Table: SCHEMATA")
    default List<Schemata> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, schemata, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.341+07:00", comments="Source Table: SCHEMATA")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, schemata, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.341+07:00", comments="Source Table: SCHEMATA")
    static UpdateDSL<UpdateModel> updateAllColumns(Schemata record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(catalogName).equalTo(record::getCatalogName)
                .set(schemaName).equalTo(record::getSchemaName)
                .set(defaultCharacterSetName).equalTo(record::getDefaultCharacterSetName)
                .set(defaultCollationName).equalTo(record::getDefaultCollationName)
                .set(sqlPath).equalTo(record::getSqlPath);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.341+07:00", comments="Source Table: SCHEMATA")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Schemata record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(catalogName).equalToWhenPresent(record::getCatalogName)
                .set(schemaName).equalToWhenPresent(record::getSchemaName)
                .set(defaultCharacterSetName).equalToWhenPresent(record::getDefaultCharacterSetName)
                .set(defaultCollationName).equalToWhenPresent(record::getDefaultCollationName)
                .set(sqlPath).equalToWhenPresent(record::getSqlPath);
    }
}