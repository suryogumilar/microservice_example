package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.SchemaPrivilegesDynamicSqlSupport.*;

import com.sg.mybatis.model.SchemaPrivileges;
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
public interface SchemaPrivilegesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.078+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    BasicColumn[] selectList = BasicColumn.columnList(grantee, tableCatalog, tableSchema, privilegeType, isGrantable);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SchemaPrivileges> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SchemaPrivileges> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SchemaPrivilegesResult")
    Optional<SchemaPrivileges> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SchemaPrivilegesResult", value = {
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<SchemaPrivileges> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, schemaPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, schemaPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.078+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    default int insert(SchemaPrivileges record) {
        return MyBatis3Utils.insert(this::insert, record, schemaPrivileges, c ->
            c.map(grantee).toProperty("grantee")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(privilegeType).toProperty("privilegeType")
            .map(isGrantable).toProperty("isGrantable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.078+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    default int insertMultiple(Collection<SchemaPrivileges> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, schemaPrivileges, c ->
            c.map(grantee).toProperty("grantee")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(privilegeType).toProperty("privilegeType")
            .map(isGrantable).toProperty("isGrantable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.078+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    default int insertSelective(SchemaPrivileges record) {
        return MyBatis3Utils.insert(this::insert, record, schemaPrivileges, c ->
            c.map(grantee).toPropertyWhenPresent("grantee", record::getGrantee)
            .map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(privilegeType).toPropertyWhenPresent("privilegeType", record::getPrivilegeType)
            .map(isGrantable).toPropertyWhenPresent("isGrantable", record::getIsGrantable)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.078+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    default Optional<SchemaPrivileges> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, schemaPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.079+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    default List<SchemaPrivileges> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, schemaPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.079+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    default List<SchemaPrivileges> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, schemaPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.079+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, schemaPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.079+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    static UpdateDSL<UpdateModel> updateAllColumns(SchemaPrivileges record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantee).equalTo(record::getGrantee)
                .set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(privilegeType).equalTo(record::getPrivilegeType)
                .set(isGrantable).equalTo(record::getIsGrantable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.079+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SchemaPrivileges record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantee).equalToWhenPresent(record::getGrantee)
                .set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(privilegeType).equalToWhenPresent(record::getPrivilegeType)
                .set(isGrantable).equalToWhenPresent(record::getIsGrantable);
    }
}