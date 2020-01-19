package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.EnginesDynamicSqlSupport.*;

import com.sg.mybatis.model.Engines;
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
public interface EnginesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    BasicColumn[] selectList = BasicColumn.columnList(engine, support, comment, transactions, xa, savepoints);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source Table: ENGINES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source Table: ENGINES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source Table: ENGINES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Engines> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source Table: ENGINES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Engines> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source Table: ENGINES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EnginesResult")
    Optional<Engines> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source Table: ENGINES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EnginesResult", value = {
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUPPORT", property="support", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRANSACTIONS", property="transactions", jdbcType=JdbcType.VARCHAR),
        @Result(column="XA", property="xa", jdbcType=JdbcType.VARCHAR),
        @Result(column="SAVEPOINTS", property="savepoints", jdbcType=JdbcType.VARCHAR)
    })
    List<Engines> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source Table: ENGINES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source Table: ENGINES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, engines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source Table: ENGINES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, engines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    default int insert(Engines record) {
        return MyBatis3Utils.insert(this::insert, record, engines, c ->
            c.map(engine).toProperty("engine")
            .map(support).toProperty("support")
            .map(comment).toProperty("comment")
            .map(transactions).toProperty("transactions")
            .map(xa).toProperty("xa")
            .map(savepoints).toProperty("savepoints")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    default int insertMultiple(Collection<Engines> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, engines, c ->
            c.map(engine).toProperty("engine")
            .map(support).toProperty("support")
            .map(comment).toProperty("comment")
            .map(transactions).toProperty("transactions")
            .map(xa).toProperty("xa")
            .map(savepoints).toProperty("savepoints")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    default int insertSelective(Engines record) {
        return MyBatis3Utils.insert(this::insert, record, engines, c ->
            c.map(engine).toPropertyWhenPresent("engine", record::getEngine)
            .map(support).toPropertyWhenPresent("support", record::getSupport)
            .map(comment).toPropertyWhenPresent("comment", record::getComment)
            .map(transactions).toPropertyWhenPresent("transactions", record::getTransactions)
            .map(xa).toPropertyWhenPresent("xa", record::getXa)
            .map(savepoints).toPropertyWhenPresent("savepoints", record::getSavepoints)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    default Optional<Engines> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, engines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    default List<Engines> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, engines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    default List<Engines> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, engines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, engines, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    static UpdateDSL<UpdateModel> updateAllColumns(Engines record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(engine).equalTo(record::getEngine)
                .set(support).equalTo(record::getSupport)
                .set(comment).equalTo(record::getComment)
                .set(transactions).equalTo(record::getTransactions)
                .set(xa).equalTo(record::getXa)
                .set(savepoints).equalTo(record::getSavepoints);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.09+07:00", comments="Source Table: ENGINES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Engines record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(engine).equalToWhenPresent(record::getEngine)
                .set(support).equalToWhenPresent(record::getSupport)
                .set(comment).equalToWhenPresent(record::getComment)
                .set(transactions).equalToWhenPresent(record::getTransactions)
                .set(xa).equalToWhenPresent(record::getXa)
                .set(savepoints).equalToWhenPresent(record::getSavepoints);
    }
}