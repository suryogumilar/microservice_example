package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.TablePrivilegesDynamicSqlSupport.*;

import com.sg.mybatis.model.TablePrivileges;
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
public interface TablePrivilegesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    BasicColumn[] selectList = BasicColumn.columnList(grantee, tableCatalog, tableSchema, tableName, privilegeType, isGrantable);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source Table: TABLE_PRIVILEGES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source Table: TABLE_PRIVILEGES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source Table: TABLE_PRIVILEGES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TablePrivileges> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source Table: TABLE_PRIVILEGES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TablePrivileges> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source Table: TABLE_PRIVILEGES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TablePrivilegesResult")
    Optional<TablePrivileges> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source Table: TABLE_PRIVILEGES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TablePrivilegesResult", value = {
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<TablePrivileges> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tablePrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tablePrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    default int insert(TablePrivileges record) {
        return MyBatis3Utils.insert(this::insert, record, tablePrivileges, c ->
            c.map(grantee).toProperty("grantee")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(privilegeType).toProperty("privilegeType")
            .map(isGrantable).toProperty("isGrantable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    default int insertMultiple(Collection<TablePrivileges> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tablePrivileges, c ->
            c.map(grantee).toProperty("grantee")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(privilegeType).toProperty("privilegeType")
            .map(isGrantable).toProperty("isGrantable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    default int insertSelective(TablePrivileges record) {
        return MyBatis3Utils.insert(this::insert, record, tablePrivileges, c ->
            c.map(grantee).toPropertyWhenPresent("grantee", record::getGrantee)
            .map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(privilegeType).toPropertyWhenPresent("privilegeType", record::getPrivilegeType)
            .map(isGrantable).toPropertyWhenPresent("isGrantable", record::getIsGrantable)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    default Optional<TablePrivileges> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tablePrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    default List<TablePrivileges> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tablePrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    default List<TablePrivileges> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tablePrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tablePrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    static UpdateDSL<UpdateModel> updateAllColumns(TablePrivileges record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantee).equalTo(record::getGrantee)
                .set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(privilegeType).equalTo(record::getPrivilegeType)
                .set(isGrantable).equalTo(record::getIsGrantable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.335+07:00", comments="Source Table: TABLE_PRIVILEGES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TablePrivileges record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantee).equalToWhenPresent(record::getGrantee)
                .set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(privilegeType).equalToWhenPresent(record::getPrivilegeType)
                .set(isGrantable).equalToWhenPresent(record::getIsGrantable);
    }
}