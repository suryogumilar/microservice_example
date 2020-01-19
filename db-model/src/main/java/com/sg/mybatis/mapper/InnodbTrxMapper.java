package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbTrxDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbTrx;
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
public interface InnodbTrxMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.067+07:00", comments="Source Table: INNODB_TRX")
    BasicColumn[] selectList = BasicColumn.columnList(trxId, trxState, trxStarted, trxRequestedLockId, trxWaitStarted, trxWeight, trxMysqlThreadId, trxQuery, trxOperationState, trxTablesInUse, trxTablesLocked, trxLockStructs, trxLockMemoryBytes, trxRowsLocked, trxRowsModified, trxConcurrencyTickets, trxIsolationLevel, trxUniqueChecks, trxForeignKeyChecks, trxLastForeignKeyError, trxAdaptiveHashLatched, trxAdaptiveHashTimeout, trxIsReadOnly, trxAutocommitNonLocking);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source Table: INNODB_TRX")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source Table: INNODB_TRX")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source Table: INNODB_TRX")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbTrx> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source Table: INNODB_TRX")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbTrx> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.066+07:00", comments="Source Table: INNODB_TRX")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbTrxResult")
    Optional<InnodbTrx> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.066+07:00", comments="Source Table: INNODB_TRX")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbTrxResult", value = {
        @Result(column="trx_id", property="trxId", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_state", property="trxState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_started", property="trxStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trx_requested_lock_id", property="trxRequestedLockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_wait_started", property="trxWaitStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trx_weight", property="trxWeight", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_mysql_thread_id", property="trxMysqlThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_query", property="trxQuery", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_operation_state", property="trxOperationState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_tables_in_use", property="trxTablesInUse", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_tables_locked", property="trxTablesLocked", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_lock_structs", property="trxLockStructs", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_lock_memory_bytes", property="trxLockMemoryBytes", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_rows_locked", property="trxRowsLocked", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_rows_modified", property="trxRowsModified", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_concurrency_tickets", property="trxConcurrencyTickets", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_isolation_level", property="trxIsolationLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_unique_checks", property="trxUniqueChecks", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_foreign_key_checks", property="trxForeignKeyChecks", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_last_foreign_key_error", property="trxLastForeignKeyError", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_adaptive_hash_latched", property="trxAdaptiveHashLatched", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_adaptive_hash_timeout", property="trxAdaptiveHashTimeout", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_is_read_only", property="trxIsReadOnly", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_autocommit_non_locking", property="trxAutocommitNonLocking", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbTrx> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.066+07:00", comments="Source Table: INNODB_TRX")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.066+07:00", comments="Source Table: INNODB_TRX")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbTrx, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.066+07:00", comments="Source Table: INNODB_TRX")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbTrx, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.066+07:00", comments="Source Table: INNODB_TRX")
    default int insert(InnodbTrx record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTrx, c ->
            c.map(trxId).toProperty("trxId")
            .map(trxState).toProperty("trxState")
            .map(trxStarted).toProperty("trxStarted")
            .map(trxRequestedLockId).toProperty("trxRequestedLockId")
            .map(trxWaitStarted).toProperty("trxWaitStarted")
            .map(trxWeight).toProperty("trxWeight")
            .map(trxMysqlThreadId).toProperty("trxMysqlThreadId")
            .map(trxQuery).toProperty("trxQuery")
            .map(trxOperationState).toProperty("trxOperationState")
            .map(trxTablesInUse).toProperty("trxTablesInUse")
            .map(trxTablesLocked).toProperty("trxTablesLocked")
            .map(trxLockStructs).toProperty("trxLockStructs")
            .map(trxLockMemoryBytes).toProperty("trxLockMemoryBytes")
            .map(trxRowsLocked).toProperty("trxRowsLocked")
            .map(trxRowsModified).toProperty("trxRowsModified")
            .map(trxConcurrencyTickets).toProperty("trxConcurrencyTickets")
            .map(trxIsolationLevel).toProperty("trxIsolationLevel")
            .map(trxUniqueChecks).toProperty("trxUniqueChecks")
            .map(trxForeignKeyChecks).toProperty("trxForeignKeyChecks")
            .map(trxLastForeignKeyError).toProperty("trxLastForeignKeyError")
            .map(trxAdaptiveHashLatched).toProperty("trxAdaptiveHashLatched")
            .map(trxAdaptiveHashTimeout).toProperty("trxAdaptiveHashTimeout")
            .map(trxIsReadOnly).toProperty("trxIsReadOnly")
            .map(trxAutocommitNonLocking).toProperty("trxAutocommitNonLocking")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.066+07:00", comments="Source Table: INNODB_TRX")
    default int insertMultiple(Collection<InnodbTrx> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbTrx, c ->
            c.map(trxId).toProperty("trxId")
            .map(trxState).toProperty("trxState")
            .map(trxStarted).toProperty("trxStarted")
            .map(trxRequestedLockId).toProperty("trxRequestedLockId")
            .map(trxWaitStarted).toProperty("trxWaitStarted")
            .map(trxWeight).toProperty("trxWeight")
            .map(trxMysqlThreadId).toProperty("trxMysqlThreadId")
            .map(trxQuery).toProperty("trxQuery")
            .map(trxOperationState).toProperty("trxOperationState")
            .map(trxTablesInUse).toProperty("trxTablesInUse")
            .map(trxTablesLocked).toProperty("trxTablesLocked")
            .map(trxLockStructs).toProperty("trxLockStructs")
            .map(trxLockMemoryBytes).toProperty("trxLockMemoryBytes")
            .map(trxRowsLocked).toProperty("trxRowsLocked")
            .map(trxRowsModified).toProperty("trxRowsModified")
            .map(trxConcurrencyTickets).toProperty("trxConcurrencyTickets")
            .map(trxIsolationLevel).toProperty("trxIsolationLevel")
            .map(trxUniqueChecks).toProperty("trxUniqueChecks")
            .map(trxForeignKeyChecks).toProperty("trxForeignKeyChecks")
            .map(trxLastForeignKeyError).toProperty("trxLastForeignKeyError")
            .map(trxAdaptiveHashLatched).toProperty("trxAdaptiveHashLatched")
            .map(trxAdaptiveHashTimeout).toProperty("trxAdaptiveHashTimeout")
            .map(trxIsReadOnly).toProperty("trxIsReadOnly")
            .map(trxAutocommitNonLocking).toProperty("trxAutocommitNonLocking")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.066+07:00", comments="Source Table: INNODB_TRX")
    default int insertSelective(InnodbTrx record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTrx, c ->
            c.map(trxId).toPropertyWhenPresent("trxId", record::getTrxId)
            .map(trxState).toPropertyWhenPresent("trxState", record::getTrxState)
            .map(trxStarted).toPropertyWhenPresent("trxStarted", record::getTrxStarted)
            .map(trxRequestedLockId).toPropertyWhenPresent("trxRequestedLockId", record::getTrxRequestedLockId)
            .map(trxWaitStarted).toPropertyWhenPresent("trxWaitStarted", record::getTrxWaitStarted)
            .map(trxWeight).toPropertyWhenPresent("trxWeight", record::getTrxWeight)
            .map(trxMysqlThreadId).toPropertyWhenPresent("trxMysqlThreadId", record::getTrxMysqlThreadId)
            .map(trxQuery).toPropertyWhenPresent("trxQuery", record::getTrxQuery)
            .map(trxOperationState).toPropertyWhenPresent("trxOperationState", record::getTrxOperationState)
            .map(trxTablesInUse).toPropertyWhenPresent("trxTablesInUse", record::getTrxTablesInUse)
            .map(trxTablesLocked).toPropertyWhenPresent("trxTablesLocked", record::getTrxTablesLocked)
            .map(trxLockStructs).toPropertyWhenPresent("trxLockStructs", record::getTrxLockStructs)
            .map(trxLockMemoryBytes).toPropertyWhenPresent("trxLockMemoryBytes", record::getTrxLockMemoryBytes)
            .map(trxRowsLocked).toPropertyWhenPresent("trxRowsLocked", record::getTrxRowsLocked)
            .map(trxRowsModified).toPropertyWhenPresent("trxRowsModified", record::getTrxRowsModified)
            .map(trxConcurrencyTickets).toPropertyWhenPresent("trxConcurrencyTickets", record::getTrxConcurrencyTickets)
            .map(trxIsolationLevel).toPropertyWhenPresent("trxIsolationLevel", record::getTrxIsolationLevel)
            .map(trxUniqueChecks).toPropertyWhenPresent("trxUniqueChecks", record::getTrxUniqueChecks)
            .map(trxForeignKeyChecks).toPropertyWhenPresent("trxForeignKeyChecks", record::getTrxForeignKeyChecks)
            .map(trxLastForeignKeyError).toPropertyWhenPresent("trxLastForeignKeyError", record::getTrxLastForeignKeyError)
            .map(trxAdaptiveHashLatched).toPropertyWhenPresent("trxAdaptiveHashLatched", record::getTrxAdaptiveHashLatched)
            .map(trxAdaptiveHashTimeout).toPropertyWhenPresent("trxAdaptiveHashTimeout", record::getTrxAdaptiveHashTimeout)
            .map(trxIsReadOnly).toPropertyWhenPresent("trxIsReadOnly", record::getTrxIsReadOnly)
            .map(trxAutocommitNonLocking).toPropertyWhenPresent("trxAutocommitNonLocking", record::getTrxAutocommitNonLocking)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.067+07:00", comments="Source Table: INNODB_TRX")
    default Optional<InnodbTrx> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbTrx, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.067+07:00", comments="Source Table: INNODB_TRX")
    default List<InnodbTrx> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbTrx, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.067+07:00", comments="Source Table: INNODB_TRX")
    default List<InnodbTrx> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbTrx, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.067+07:00", comments="Source Table: INNODB_TRX")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbTrx, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.067+07:00", comments="Source Table: INNODB_TRX")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbTrx record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(trxId).equalTo(record::getTrxId)
                .set(trxState).equalTo(record::getTrxState)
                .set(trxStarted).equalTo(record::getTrxStarted)
                .set(trxRequestedLockId).equalTo(record::getTrxRequestedLockId)
                .set(trxWaitStarted).equalTo(record::getTrxWaitStarted)
                .set(trxWeight).equalTo(record::getTrxWeight)
                .set(trxMysqlThreadId).equalTo(record::getTrxMysqlThreadId)
                .set(trxQuery).equalTo(record::getTrxQuery)
                .set(trxOperationState).equalTo(record::getTrxOperationState)
                .set(trxTablesInUse).equalTo(record::getTrxTablesInUse)
                .set(trxTablesLocked).equalTo(record::getTrxTablesLocked)
                .set(trxLockStructs).equalTo(record::getTrxLockStructs)
                .set(trxLockMemoryBytes).equalTo(record::getTrxLockMemoryBytes)
                .set(trxRowsLocked).equalTo(record::getTrxRowsLocked)
                .set(trxRowsModified).equalTo(record::getTrxRowsModified)
                .set(trxConcurrencyTickets).equalTo(record::getTrxConcurrencyTickets)
                .set(trxIsolationLevel).equalTo(record::getTrxIsolationLevel)
                .set(trxUniqueChecks).equalTo(record::getTrxUniqueChecks)
                .set(trxForeignKeyChecks).equalTo(record::getTrxForeignKeyChecks)
                .set(trxLastForeignKeyError).equalTo(record::getTrxLastForeignKeyError)
                .set(trxAdaptiveHashLatched).equalTo(record::getTrxAdaptiveHashLatched)
                .set(trxAdaptiveHashTimeout).equalTo(record::getTrxAdaptiveHashTimeout)
                .set(trxIsReadOnly).equalTo(record::getTrxIsReadOnly)
                .set(trxAutocommitNonLocking).equalTo(record::getTrxAutocommitNonLocking);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.067+07:00", comments="Source Table: INNODB_TRX")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbTrx record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(trxId).equalToWhenPresent(record::getTrxId)
                .set(trxState).equalToWhenPresent(record::getTrxState)
                .set(trxStarted).equalToWhenPresent(record::getTrxStarted)
                .set(trxRequestedLockId).equalToWhenPresent(record::getTrxRequestedLockId)
                .set(trxWaitStarted).equalToWhenPresent(record::getTrxWaitStarted)
                .set(trxWeight).equalToWhenPresent(record::getTrxWeight)
                .set(trxMysqlThreadId).equalToWhenPresent(record::getTrxMysqlThreadId)
                .set(trxQuery).equalToWhenPresent(record::getTrxQuery)
                .set(trxOperationState).equalToWhenPresent(record::getTrxOperationState)
                .set(trxTablesInUse).equalToWhenPresent(record::getTrxTablesInUse)
                .set(trxTablesLocked).equalToWhenPresent(record::getTrxTablesLocked)
                .set(trxLockStructs).equalToWhenPresent(record::getTrxLockStructs)
                .set(trxLockMemoryBytes).equalToWhenPresent(record::getTrxLockMemoryBytes)
                .set(trxRowsLocked).equalToWhenPresent(record::getTrxRowsLocked)
                .set(trxRowsModified).equalToWhenPresent(record::getTrxRowsModified)
                .set(trxConcurrencyTickets).equalToWhenPresent(record::getTrxConcurrencyTickets)
                .set(trxIsolationLevel).equalToWhenPresent(record::getTrxIsolationLevel)
                .set(trxUniqueChecks).equalToWhenPresent(record::getTrxUniqueChecks)
                .set(trxForeignKeyChecks).equalToWhenPresent(record::getTrxForeignKeyChecks)
                .set(trxLastForeignKeyError).equalToWhenPresent(record::getTrxLastForeignKeyError)
                .set(trxAdaptiveHashLatched).equalToWhenPresent(record::getTrxAdaptiveHashLatched)
                .set(trxAdaptiveHashTimeout).equalToWhenPresent(record::getTrxAdaptiveHashTimeout)
                .set(trxIsReadOnly).equalToWhenPresent(record::getTrxIsReadOnly)
                .set(trxAutocommitNonLocking).equalToWhenPresent(record::getTrxAutocommitNonLocking);
    }
}