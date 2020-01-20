package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.CredentialWebappDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sg.mybatis.model.CredentialWebapp;
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
public interface CredentialWebappMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, password);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.273+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.273+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.273+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CredentialWebapp> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.273+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<CredentialWebapp> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.274+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CredentialWebappResult")
    Optional<CredentialWebapp> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.274+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CredentialWebappResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USERNAME", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR)
    })
    List<CredentialWebapp> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.274+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.274+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, credentialWebapp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.274+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, credentialWebapp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.274+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.274+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default int insert(CredentialWebapp record) {
        return MyBatis3Utils.insert(this::insert, record, credentialWebapp, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.274+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default int insertMultiple(Collection<CredentialWebapp> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, credentialWebapp, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.274+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default int insertSelective(CredentialWebapp record) {
        return MyBatis3Utils.insert(this::insert, record, credentialWebapp, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default Optional<CredentialWebapp> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, credentialWebapp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default List<CredentialWebapp> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, credentialWebapp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default List<CredentialWebapp> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, credentialWebapp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default Optional<CredentialWebapp> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, credentialWebapp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    static UpdateDSL<UpdateModel> updateAllColumns(CredentialWebapp record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CredentialWebapp record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default int updateByPrimaryKey(CredentialWebapp record) {
        return update(c ->
            c.set(username).equalTo(record::getUsername)
            .set(password).equalTo(record::getPassword)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.275+07:00", comments="Source Table: CREDENTIAL_WEBAPP")
    default int updateByPrimaryKeySelective(CredentialWebapp record) {
        return update(c ->
            c.set(username).equalToWhenPresent(record::getUsername)
            .set(password).equalToWhenPresent(record::getPassword)
            .where(id, isEqualTo(record::getId))
        );
    }
}