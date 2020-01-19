package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ProcesslistDynamicSqlSupport.*;

import com.sg.mybatis.model.Processlist;
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
public interface ProcesslistMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.414+07:00", comments="Source Table: PROCESSLIST")
    BasicColumn[] selectList = BasicColumn.columnList(id, user, host, db, command, time, state, info);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.411+07:00", comments="Source Table: PROCESSLIST")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Processlist> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Processlist> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProcesslistResult")
    Optional<Processlist> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProcesslistResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="USER", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOST", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="DB", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMAND", property="command", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME", property="time", jdbcType=JdbcType.INTEGER),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="INFO", property="info", jdbcType=JdbcType.VARCHAR)
    })
    List<Processlist> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, processlist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, processlist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    default int insert(Processlist record) {
        return MyBatis3Utils.insert(this::insert, record, processlist, c ->
            c.map(id).toProperty("id")
            .map(user).toProperty("user")
            .map(host).toProperty("host")
            .map(db).toProperty("db")
            .map(command).toProperty("command")
            .map(time).toProperty("time")
            .map(state).toProperty("state")
            .map(info).toProperty("info")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    default int insertMultiple(Collection<Processlist> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, processlist, c ->
            c.map(id).toProperty("id")
            .map(user).toProperty("user")
            .map(host).toProperty("host")
            .map(db).toProperty("db")
            .map(command).toProperty("command")
            .map(time).toProperty("time")
            .map(state).toProperty("state")
            .map(info).toProperty("info")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.412+07:00", comments="Source Table: PROCESSLIST")
    default int insertSelective(Processlist record) {
        return MyBatis3Utils.insert(this::insert, record, processlist, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(db).toPropertyWhenPresent("db", record::getDb)
            .map(command).toPropertyWhenPresent("command", record::getCommand)
            .map(time).toPropertyWhenPresent("time", record::getTime)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(info).toPropertyWhenPresent("info", record::getInfo)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.414+07:00", comments="Source Table: PROCESSLIST")
    default Optional<Processlist> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, processlist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.415+07:00", comments="Source Table: PROCESSLIST")
    default List<Processlist> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, processlist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.415+07:00", comments="Source Table: PROCESSLIST")
    default List<Processlist> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, processlist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.415+07:00", comments="Source Table: PROCESSLIST")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, processlist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.415+07:00", comments="Source Table: PROCESSLIST")
    static UpdateDSL<UpdateModel> updateAllColumns(Processlist record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(user).equalTo(record::getUser)
                .set(host).equalTo(record::getHost)
                .set(db).equalTo(record::getDb)
                .set(command).equalTo(record::getCommand)
                .set(time).equalTo(record::getTime)
                .set(state).equalTo(record::getState)
                .set(info).equalTo(record::getInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.415+07:00", comments="Source Table: PROCESSLIST")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Processlist record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(user).equalToWhenPresent(record::getUser)
                .set(host).equalToWhenPresent(record::getHost)
                .set(db).equalToWhenPresent(record::getDb)
                .set(command).equalToWhenPresent(record::getCommand)
                .set(time).equalToWhenPresent(record::getTime)
                .set(state).equalToWhenPresent(record::getState)
                .set(info).equalToWhenPresent(record::getInfo);
    }
}