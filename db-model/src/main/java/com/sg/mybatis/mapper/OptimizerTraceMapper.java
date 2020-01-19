package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.OptimizerTraceDynamicSqlSupport.*;

import com.sg.mybatis.model.OptimizerTrace;
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
public interface OptimizerTraceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.15+07:00", comments="Source Table: OPTIMIZER_TRACE")
    BasicColumn[] selectList = BasicColumn.columnList(query, trace, missingBytesBeyondMaxMemSize, insufficientPrivileges);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source Table: OPTIMIZER_TRACE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source Table: OPTIMIZER_TRACE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source Table: OPTIMIZER_TRACE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OptimizerTrace> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source Table: OPTIMIZER_TRACE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OptimizerTrace> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source Table: OPTIMIZER_TRACE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OptimizerTraceResult")
    Optional<OptimizerTrace> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source Table: OPTIMIZER_TRACE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OptimizerTraceResult", value = {
        @Result(column="QUERY", property="query", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRACE", property="trace", jdbcType=JdbcType.VARCHAR),
        @Result(column="MISSING_BYTES_BEYOND_MAX_MEM_SIZE", property="missingBytesBeyondMaxMemSize", jdbcType=JdbcType.INTEGER),
        @Result(column="INSUFFICIENT_PRIVILEGES", property="insufficientPrivileges", jdbcType=JdbcType.BIT)
    })
    List<OptimizerTrace> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source Table: OPTIMIZER_TRACE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source Table: OPTIMIZER_TRACE")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, optimizerTrace, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.149+07:00", comments="Source Table: OPTIMIZER_TRACE")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, optimizerTrace, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.149+07:00", comments="Source Table: OPTIMIZER_TRACE")
    default int insert(OptimizerTrace record) {
        return MyBatis3Utils.insert(this::insert, record, optimizerTrace, c ->
            c.map(query).toProperty("query")
            .map(trace).toProperty("trace")
            .map(missingBytesBeyondMaxMemSize).toProperty("missingBytesBeyondMaxMemSize")
            .map(insufficientPrivileges).toProperty("insufficientPrivileges")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.149+07:00", comments="Source Table: OPTIMIZER_TRACE")
    default int insertMultiple(Collection<OptimizerTrace> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, optimizerTrace, c ->
            c.map(query).toProperty("query")
            .map(trace).toProperty("trace")
            .map(missingBytesBeyondMaxMemSize).toProperty("missingBytesBeyondMaxMemSize")
            .map(insufficientPrivileges).toProperty("insufficientPrivileges")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.149+07:00", comments="Source Table: OPTIMIZER_TRACE")
    default int insertSelective(OptimizerTrace record) {
        return MyBatis3Utils.insert(this::insert, record, optimizerTrace, c ->
            c.map(query).toPropertyWhenPresent("query", record::getQuery)
            .map(trace).toPropertyWhenPresent("trace", record::getTrace)
            .map(missingBytesBeyondMaxMemSize).toPropertyWhenPresent("missingBytesBeyondMaxMemSize", record::getMissingBytesBeyondMaxMemSize)
            .map(insufficientPrivileges).toPropertyWhenPresent("insufficientPrivileges", record::getInsufficientPrivileges)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.15+07:00", comments="Source Table: OPTIMIZER_TRACE")
    default Optional<OptimizerTrace> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, optimizerTrace, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.15+07:00", comments="Source Table: OPTIMIZER_TRACE")
    default List<OptimizerTrace> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, optimizerTrace, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.15+07:00", comments="Source Table: OPTIMIZER_TRACE")
    default List<OptimizerTrace> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, optimizerTrace, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.15+07:00", comments="Source Table: OPTIMIZER_TRACE")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, optimizerTrace, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.15+07:00", comments="Source Table: OPTIMIZER_TRACE")
    static UpdateDSL<UpdateModel> updateAllColumns(OptimizerTrace record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(query).equalTo(record::getQuery)
                .set(trace).equalTo(record::getTrace)
                .set(missingBytesBeyondMaxMemSize).equalTo(record::getMissingBytesBeyondMaxMemSize)
                .set(insufficientPrivileges).equalTo(record::getInsufficientPrivileges);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.15+07:00", comments="Source Table: OPTIMIZER_TRACE")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OptimizerTrace record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(query).equalToWhenPresent(record::getQuery)
                .set(trace).equalToWhenPresent(record::getTrace)
                .set(missingBytesBeyondMaxMemSize).equalToWhenPresent(record::getMissingBytesBeyondMaxMemSize)
                .set(insufficientPrivileges).equalToWhenPresent(record::getInsufficientPrivileges);
    }
}