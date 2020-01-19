package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ProfilingDynamicSqlSupport.*;

import com.sg.mybatis.model.Profiling;
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
public interface ProfilingMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.448+07:00", comments="Source Table: PROFILING")
    BasicColumn[] selectList = BasicColumn.columnList(queryId, seq, state, duration, cpuUser, cpuSystem, contextVoluntary, contextInvoluntary, blockOpsIn, blockOpsOut, messagesSent, messagesReceived, pageFaultsMajor, pageFaultsMinor, swaps, sourceFunction, sourceFile, sourceLine);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Profiling> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Profiling> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProfilingResult")
    Optional<Profiling> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProfilingResult", value = {
        @Result(column="QUERY_ID", property="queryId", jdbcType=JdbcType.INTEGER),
        @Result(column="SEQ", property="seq", jdbcType=JdbcType.INTEGER),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="DURATION", property="duration", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPU_USER", property="cpuUser", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPU_SYSTEM", property="cpuSystem", jdbcType=JdbcType.DECIMAL),
        @Result(column="CONTEXT_VOLUNTARY", property="contextVoluntary", jdbcType=JdbcType.INTEGER),
        @Result(column="CONTEXT_INVOLUNTARY", property="contextInvoluntary", jdbcType=JdbcType.INTEGER),
        @Result(column="BLOCK_OPS_IN", property="blockOpsIn", jdbcType=JdbcType.INTEGER),
        @Result(column="BLOCK_OPS_OUT", property="blockOpsOut", jdbcType=JdbcType.INTEGER),
        @Result(column="MESSAGES_SENT", property="messagesSent", jdbcType=JdbcType.INTEGER),
        @Result(column="MESSAGES_RECEIVED", property="messagesReceived", jdbcType=JdbcType.INTEGER),
        @Result(column="PAGE_FAULTS_MAJOR", property="pageFaultsMajor", jdbcType=JdbcType.INTEGER),
        @Result(column="PAGE_FAULTS_MINOR", property="pageFaultsMinor", jdbcType=JdbcType.INTEGER),
        @Result(column="SWAPS", property="swaps", jdbcType=JdbcType.INTEGER),
        @Result(column="SOURCE_FUNCTION", property="sourceFunction", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE_FILE", property="sourceFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE_LINE", property="sourceLine", jdbcType=JdbcType.INTEGER)
    })
    List<Profiling> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, profiling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, profiling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    default int insert(Profiling record) {
        return MyBatis3Utils.insert(this::insert, record, profiling, c ->
            c.map(queryId).toProperty("queryId")
            .map(seq).toProperty("seq")
            .map(state).toProperty("state")
            .map(duration).toProperty("duration")
            .map(cpuUser).toProperty("cpuUser")
            .map(cpuSystem).toProperty("cpuSystem")
            .map(contextVoluntary).toProperty("contextVoluntary")
            .map(contextInvoluntary).toProperty("contextInvoluntary")
            .map(blockOpsIn).toProperty("blockOpsIn")
            .map(blockOpsOut).toProperty("blockOpsOut")
            .map(messagesSent).toProperty("messagesSent")
            .map(messagesReceived).toProperty("messagesReceived")
            .map(pageFaultsMajor).toProperty("pageFaultsMajor")
            .map(pageFaultsMinor).toProperty("pageFaultsMinor")
            .map(swaps).toProperty("swaps")
            .map(sourceFunction).toProperty("sourceFunction")
            .map(sourceFile).toProperty("sourceFile")
            .map(sourceLine).toProperty("sourceLine")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source Table: PROFILING")
    default int insertMultiple(Collection<Profiling> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, profiling, c ->
            c.map(queryId).toProperty("queryId")
            .map(seq).toProperty("seq")
            .map(state).toProperty("state")
            .map(duration).toProperty("duration")
            .map(cpuUser).toProperty("cpuUser")
            .map(cpuSystem).toProperty("cpuSystem")
            .map(contextVoluntary).toProperty("contextVoluntary")
            .map(contextInvoluntary).toProperty("contextInvoluntary")
            .map(blockOpsIn).toProperty("blockOpsIn")
            .map(blockOpsOut).toProperty("blockOpsOut")
            .map(messagesSent).toProperty("messagesSent")
            .map(messagesReceived).toProperty("messagesReceived")
            .map(pageFaultsMajor).toProperty("pageFaultsMajor")
            .map(pageFaultsMinor).toProperty("pageFaultsMinor")
            .map(swaps).toProperty("swaps")
            .map(sourceFunction).toProperty("sourceFunction")
            .map(sourceFile).toProperty("sourceFile")
            .map(sourceLine).toProperty("sourceLine")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.448+07:00", comments="Source Table: PROFILING")
    default int insertSelective(Profiling record) {
        return MyBatis3Utils.insert(this::insert, record, profiling, c ->
            c.map(queryId).toPropertyWhenPresent("queryId", record::getQueryId)
            .map(seq).toPropertyWhenPresent("seq", record::getSeq)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(duration).toPropertyWhenPresent("duration", record::getDuration)
            .map(cpuUser).toPropertyWhenPresent("cpuUser", record::getCpuUser)
            .map(cpuSystem).toPropertyWhenPresent("cpuSystem", record::getCpuSystem)
            .map(contextVoluntary).toPropertyWhenPresent("contextVoluntary", record::getContextVoluntary)
            .map(contextInvoluntary).toPropertyWhenPresent("contextInvoluntary", record::getContextInvoluntary)
            .map(blockOpsIn).toPropertyWhenPresent("blockOpsIn", record::getBlockOpsIn)
            .map(blockOpsOut).toPropertyWhenPresent("blockOpsOut", record::getBlockOpsOut)
            .map(messagesSent).toPropertyWhenPresent("messagesSent", record::getMessagesSent)
            .map(messagesReceived).toPropertyWhenPresent("messagesReceived", record::getMessagesReceived)
            .map(pageFaultsMajor).toPropertyWhenPresent("pageFaultsMajor", record::getPageFaultsMajor)
            .map(pageFaultsMinor).toPropertyWhenPresent("pageFaultsMinor", record::getPageFaultsMinor)
            .map(swaps).toPropertyWhenPresent("swaps", record::getSwaps)
            .map(sourceFunction).toPropertyWhenPresent("sourceFunction", record::getSourceFunction)
            .map(sourceFile).toPropertyWhenPresent("sourceFile", record::getSourceFile)
            .map(sourceLine).toPropertyWhenPresent("sourceLine", record::getSourceLine)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.448+07:00", comments="Source Table: PROFILING")
    default Optional<Profiling> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, profiling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.448+07:00", comments="Source Table: PROFILING")
    default List<Profiling> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, profiling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.448+07:00", comments="Source Table: PROFILING")
    default List<Profiling> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, profiling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.448+07:00", comments="Source Table: PROFILING")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, profiling, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.448+07:00", comments="Source Table: PROFILING")
    static UpdateDSL<UpdateModel> updateAllColumns(Profiling record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(queryId).equalTo(record::getQueryId)
                .set(seq).equalTo(record::getSeq)
                .set(state).equalTo(record::getState)
                .set(duration).equalTo(record::getDuration)
                .set(cpuUser).equalTo(record::getCpuUser)
                .set(cpuSystem).equalTo(record::getCpuSystem)
                .set(contextVoluntary).equalTo(record::getContextVoluntary)
                .set(contextInvoluntary).equalTo(record::getContextInvoluntary)
                .set(blockOpsIn).equalTo(record::getBlockOpsIn)
                .set(blockOpsOut).equalTo(record::getBlockOpsOut)
                .set(messagesSent).equalTo(record::getMessagesSent)
                .set(messagesReceived).equalTo(record::getMessagesReceived)
                .set(pageFaultsMajor).equalTo(record::getPageFaultsMajor)
                .set(pageFaultsMinor).equalTo(record::getPageFaultsMinor)
                .set(swaps).equalTo(record::getSwaps)
                .set(sourceFunction).equalTo(record::getSourceFunction)
                .set(sourceFile).equalTo(record::getSourceFile)
                .set(sourceLine).equalTo(record::getSourceLine);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.448+07:00", comments="Source Table: PROFILING")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Profiling record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(queryId).equalToWhenPresent(record::getQueryId)
                .set(seq).equalToWhenPresent(record::getSeq)
                .set(state).equalToWhenPresent(record::getState)
                .set(duration).equalToWhenPresent(record::getDuration)
                .set(cpuUser).equalToWhenPresent(record::getCpuUser)
                .set(cpuSystem).equalToWhenPresent(record::getCpuSystem)
                .set(contextVoluntary).equalToWhenPresent(record::getContextVoluntary)
                .set(contextInvoluntary).equalToWhenPresent(record::getContextInvoluntary)
                .set(blockOpsIn).equalToWhenPresent(record::getBlockOpsIn)
                .set(blockOpsOut).equalToWhenPresent(record::getBlockOpsOut)
                .set(messagesSent).equalToWhenPresent(record::getMessagesSent)
                .set(messagesReceived).equalToWhenPresent(record::getMessagesReceived)
                .set(pageFaultsMajor).equalToWhenPresent(record::getPageFaultsMajor)
                .set(pageFaultsMinor).equalToWhenPresent(record::getPageFaultsMinor)
                .set(swaps).equalToWhenPresent(record::getSwaps)
                .set(sourceFunction).equalToWhenPresent(record::getSourceFunction)
                .set(sourceFile).equalToWhenPresent(record::getSourceFile)
                .set(sourceLine).equalToWhenPresent(record::getSourceLine);
    }
}