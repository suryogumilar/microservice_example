package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbTrxDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.061+07:00", comments="Source Table: INNODB_TRX")
    public static final InnodbTrx innodbTrx = new InnodbTrx();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.062+07:00", comments="Source field: INNODB_TRX.trx_id")
    public static final SqlColumn<String> trxId = innodbTrx.trxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.062+07:00", comments="Source field: INNODB_TRX.trx_state")
    public static final SqlColumn<String> trxState = innodbTrx.trxState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.062+07:00", comments="Source field: INNODB_TRX.trx_started")
    public static final SqlColumn<Date> trxStarted = innodbTrx.trxStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.062+07:00", comments="Source field: INNODB_TRX.trx_requested_lock_id")
    public static final SqlColumn<String> trxRequestedLockId = innodbTrx.trxRequestedLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.062+07:00", comments="Source field: INNODB_TRX.trx_wait_started")
    public static final SqlColumn<Date> trxWaitStarted = innodbTrx.trxWaitStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.063+07:00", comments="Source field: INNODB_TRX.trx_weight")
    public static final SqlColumn<Long> trxWeight = innodbTrx.trxWeight;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.063+07:00", comments="Source field: INNODB_TRX.trx_mysql_thread_id")
    public static final SqlColumn<Long> trxMysqlThreadId = innodbTrx.trxMysqlThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.063+07:00", comments="Source field: INNODB_TRX.trx_query")
    public static final SqlColumn<String> trxQuery = innodbTrx.trxQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.064+07:00", comments="Source field: INNODB_TRX.trx_operation_state")
    public static final SqlColumn<String> trxOperationState = innodbTrx.trxOperationState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.064+07:00", comments="Source field: INNODB_TRX.trx_tables_in_use")
    public static final SqlColumn<Long> trxTablesInUse = innodbTrx.trxTablesInUse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.064+07:00", comments="Source field: INNODB_TRX.trx_tables_locked")
    public static final SqlColumn<Long> trxTablesLocked = innodbTrx.trxTablesLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.064+07:00", comments="Source field: INNODB_TRX.trx_lock_structs")
    public static final SqlColumn<Long> trxLockStructs = innodbTrx.trxLockStructs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.064+07:00", comments="Source field: INNODB_TRX.trx_lock_memory_bytes")
    public static final SqlColumn<Long> trxLockMemoryBytes = innodbTrx.trxLockMemoryBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.064+07:00", comments="Source field: INNODB_TRX.trx_rows_locked")
    public static final SqlColumn<Long> trxRowsLocked = innodbTrx.trxRowsLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.064+07:00", comments="Source field: INNODB_TRX.trx_rows_modified")
    public static final SqlColumn<Long> trxRowsModified = innodbTrx.trxRowsModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.064+07:00", comments="Source field: INNODB_TRX.trx_concurrency_tickets")
    public static final SqlColumn<Long> trxConcurrencyTickets = innodbTrx.trxConcurrencyTickets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.064+07:00", comments="Source field: INNODB_TRX.trx_isolation_level")
    public static final SqlColumn<String> trxIsolationLevel = innodbTrx.trxIsolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source field: INNODB_TRX.trx_unique_checks")
    public static final SqlColumn<Integer> trxUniqueChecks = innodbTrx.trxUniqueChecks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source field: INNODB_TRX.trx_foreign_key_checks")
    public static final SqlColumn<Integer> trxForeignKeyChecks = innodbTrx.trxForeignKeyChecks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source field: INNODB_TRX.trx_last_foreign_key_error")
    public static final SqlColumn<String> trxLastForeignKeyError = innodbTrx.trxLastForeignKeyError;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_latched")
    public static final SqlColumn<Integer> trxAdaptiveHashLatched = innodbTrx.trxAdaptiveHashLatched;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_timeout")
    public static final SqlColumn<Long> trxAdaptiveHashTimeout = innodbTrx.trxAdaptiveHashTimeout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source field: INNODB_TRX.trx_is_read_only")
    public static final SqlColumn<Integer> trxIsReadOnly = innodbTrx.trxIsReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.065+07:00", comments="Source field: INNODB_TRX.trx_autocommit_non_locking")
    public static final SqlColumn<Integer> trxAutocommitNonLocking = innodbTrx.trxAutocommitNonLocking;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.061+07:00", comments="Source Table: INNODB_TRX")
    public static final class InnodbTrx extends SqlTable {
        public final SqlColumn<String> trxId = column("trx_id", JDBCType.VARCHAR);

        public final SqlColumn<String> trxState = column("trx_state", JDBCType.VARCHAR);

        public final SqlColumn<Date> trxStarted = column("trx_started", JDBCType.TIMESTAMP);

        public final SqlColumn<String> trxRequestedLockId = column("trx_requested_lock_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> trxWaitStarted = column("trx_wait_started", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> trxWeight = column("trx_weight", JDBCType.BIGINT);

        public final SqlColumn<Long> trxMysqlThreadId = column("trx_mysql_thread_id", JDBCType.BIGINT);

        public final SqlColumn<String> trxQuery = column("trx_query", JDBCType.VARCHAR);

        public final SqlColumn<String> trxOperationState = column("trx_operation_state", JDBCType.VARCHAR);

        public final SqlColumn<Long> trxTablesInUse = column("trx_tables_in_use", JDBCType.BIGINT);

        public final SqlColumn<Long> trxTablesLocked = column("trx_tables_locked", JDBCType.BIGINT);

        public final SqlColumn<Long> trxLockStructs = column("trx_lock_structs", JDBCType.BIGINT);

        public final SqlColumn<Long> trxLockMemoryBytes = column("trx_lock_memory_bytes", JDBCType.BIGINT);

        public final SqlColumn<Long> trxRowsLocked = column("trx_rows_locked", JDBCType.BIGINT);

        public final SqlColumn<Long> trxRowsModified = column("trx_rows_modified", JDBCType.BIGINT);

        public final SqlColumn<Long> trxConcurrencyTickets = column("trx_concurrency_tickets", JDBCType.BIGINT);

        public final SqlColumn<String> trxIsolationLevel = column("trx_isolation_level", JDBCType.VARCHAR);

        public final SqlColumn<Integer> trxUniqueChecks = column("trx_unique_checks", JDBCType.INTEGER);

        public final SqlColumn<Integer> trxForeignKeyChecks = column("trx_foreign_key_checks", JDBCType.INTEGER);

        public final SqlColumn<String> trxLastForeignKeyError = column("trx_last_foreign_key_error", JDBCType.VARCHAR);

        public final SqlColumn<Integer> trxAdaptiveHashLatched = column("trx_adaptive_hash_latched", JDBCType.INTEGER);

        public final SqlColumn<Long> trxAdaptiveHashTimeout = column("trx_adaptive_hash_timeout", JDBCType.BIGINT);

        public final SqlColumn<Integer> trxIsReadOnly = column("trx_is_read_only", JDBCType.INTEGER);

        public final SqlColumn<Integer> trxAutocommitNonLocking = column("trx_autocommit_non_locking", JDBCType.INTEGER);

        public InnodbTrx() {
            super("INNODB_TRX");
        }
    }
}