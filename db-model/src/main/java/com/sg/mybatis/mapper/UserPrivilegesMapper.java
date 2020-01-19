package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.UserPrivilegesDynamicSqlSupport.*;

import com.sg.mybatis.model.UserPrivileges;
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
public interface UserPrivilegesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.122+07:00", comments="Source Table: USER_PRIVILEGES")
    BasicColumn[] selectList = BasicColumn.columnList(grantee, tableCatalog, privilegeType, isGrantable);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.12+07:00", comments="Source Table: USER_PRIVILEGES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.12+07:00", comments="Source Table: USER_PRIVILEGES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.12+07:00", comments="Source Table: USER_PRIVILEGES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserPrivileges> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.12+07:00", comments="Source Table: USER_PRIVILEGES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UserPrivileges> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.12+07:00", comments="Source Table: USER_PRIVILEGES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserPrivilegesResult")
    Optional<UserPrivileges> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.12+07:00", comments="Source Table: USER_PRIVILEGES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserPrivilegesResult", value = {
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<UserPrivileges> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.12+07:00", comments="Source Table: USER_PRIVILEGES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.121+07:00", comments="Source Table: USER_PRIVILEGES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.121+07:00", comments="Source Table: USER_PRIVILEGES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.121+07:00", comments="Source Table: USER_PRIVILEGES")
    default int insert(UserPrivileges record) {
        return MyBatis3Utils.insert(this::insert, record, userPrivileges, c ->
            c.map(grantee).toProperty("grantee")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(privilegeType).toProperty("privilegeType")
            .map(isGrantable).toProperty("isGrantable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.121+07:00", comments="Source Table: USER_PRIVILEGES")
    default int insertMultiple(Collection<UserPrivileges> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, userPrivileges, c ->
            c.map(grantee).toProperty("grantee")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(privilegeType).toProperty("privilegeType")
            .map(isGrantable).toProperty("isGrantable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.121+07:00", comments="Source Table: USER_PRIVILEGES")
    default int insertSelective(UserPrivileges record) {
        return MyBatis3Utils.insert(this::insert, record, userPrivileges, c ->
            c.map(grantee).toPropertyWhenPresent("grantee", record::getGrantee)
            .map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(privilegeType).toPropertyWhenPresent("privilegeType", record::getPrivilegeType)
            .map(isGrantable).toPropertyWhenPresent("isGrantable", record::getIsGrantable)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.123+07:00", comments="Source Table: USER_PRIVILEGES")
    default Optional<UserPrivileges> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.123+07:00", comments="Source Table: USER_PRIVILEGES")
    default List<UserPrivileges> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.123+07:00", comments="Source Table: USER_PRIVILEGES")
    default List<UserPrivileges> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.123+07:00", comments="Source Table: USER_PRIVILEGES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userPrivileges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.123+07:00", comments="Source Table: USER_PRIVILEGES")
    static UpdateDSL<UpdateModel> updateAllColumns(UserPrivileges record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantee).equalTo(record::getGrantee)
                .set(tableCatalog).equalTo(record::getTableCatalog)
                .set(privilegeType).equalTo(record::getPrivilegeType)
                .set(isGrantable).equalTo(record::getIsGrantable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.123+07:00", comments="Source Table: USER_PRIVILEGES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserPrivileges record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantee).equalToWhenPresent(record::getGrantee)
                .set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(privilegeType).equalToWhenPresent(record::getPrivilegeType)
                .set(isGrantable).equalToWhenPresent(record::getIsGrantable);
    }
}