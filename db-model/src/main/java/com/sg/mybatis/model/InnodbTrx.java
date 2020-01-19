package com.sg.mybatis.model;

import java.util.Date;
import javax.annotation.Generated;

public class InnodbTrx {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.056+07:00", comments="Source field: INNODB_TRX.trx_id")
    private String trxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_state")
    private String trxState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_started")
    private Date trxStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_requested_lock_id")
    private String trxRequestedLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_wait_started")
    private Date trxWaitStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_weight")
    private Long trxWeight;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_mysql_thread_id")
    private Long trxMysqlThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_query")
    private String trxQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_operation_state")
    private String trxOperationState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_tables_in_use")
    private Long trxTablesInUse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_tables_locked")
    private Long trxTablesLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_lock_structs")
    private Long trxLockStructs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_lock_memory_bytes")
    private Long trxLockMemoryBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_rows_locked")
    private Long trxRowsLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_rows_modified")
    private Long trxRowsModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_concurrency_tickets")
    private Long trxConcurrencyTickets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_isolation_level")
    private String trxIsolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_unique_checks")
    private Integer trxUniqueChecks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_foreign_key_checks")
    private Integer trxForeignKeyChecks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_last_foreign_key_error")
    private String trxLastForeignKeyError;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_latched")
    private Integer trxAdaptiveHashLatched;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_timeout")
    private Long trxAdaptiveHashTimeout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.061+07:00", comments="Source field: INNODB_TRX.trx_is_read_only")
    private Integer trxIsReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.061+07:00", comments="Source field: INNODB_TRX.trx_autocommit_non_locking")
    private Integer trxAutocommitNonLocking;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.056+07:00", comments="Source field: INNODB_TRX.trx_id")
    public String getTrxId() {
        return trxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_id")
    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_state")
    public String getTrxState() {
        return trxState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_state")
    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_started")
    public Date getTrxStarted() {
        return trxStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_started")
    public void setTrxStarted(Date trxStarted) {
        this.trxStarted = trxStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_requested_lock_id")
    public String getTrxRequestedLockId() {
        return trxRequestedLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_requested_lock_id")
    public void setTrxRequestedLockId(String trxRequestedLockId) {
        this.trxRequestedLockId = trxRequestedLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_wait_started")
    public Date getTrxWaitStarted() {
        return trxWaitStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.057+07:00", comments="Source field: INNODB_TRX.trx_wait_started")
    public void setTrxWaitStarted(Date trxWaitStarted) {
        this.trxWaitStarted = trxWaitStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_weight")
    public Long getTrxWeight() {
        return trxWeight;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_weight")
    public void setTrxWeight(Long trxWeight) {
        this.trxWeight = trxWeight;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_mysql_thread_id")
    public Long getTrxMysqlThreadId() {
        return trxMysqlThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_mysql_thread_id")
    public void setTrxMysqlThreadId(Long trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_query")
    public String getTrxQuery() {
        return trxQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_query")
    public void setTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_operation_state")
    public String getTrxOperationState() {
        return trxOperationState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_operation_state")
    public void setTrxOperationState(String trxOperationState) {
        this.trxOperationState = trxOperationState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_tables_in_use")
    public Long getTrxTablesInUse() {
        return trxTablesInUse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_tables_in_use")
    public void setTrxTablesInUse(Long trxTablesInUse) {
        this.trxTablesInUse = trxTablesInUse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_tables_locked")
    public Long getTrxTablesLocked() {
        return trxTablesLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_tables_locked")
    public void setTrxTablesLocked(Long trxTablesLocked) {
        this.trxTablesLocked = trxTablesLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_lock_structs")
    public Long getTrxLockStructs() {
        return trxLockStructs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.058+07:00", comments="Source field: INNODB_TRX.trx_lock_structs")
    public void setTrxLockStructs(Long trxLockStructs) {
        this.trxLockStructs = trxLockStructs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_lock_memory_bytes")
    public Long getTrxLockMemoryBytes() {
        return trxLockMemoryBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_lock_memory_bytes")
    public void setTrxLockMemoryBytes(Long trxLockMemoryBytes) {
        this.trxLockMemoryBytes = trxLockMemoryBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_rows_locked")
    public Long getTrxRowsLocked() {
        return trxRowsLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_rows_locked")
    public void setTrxRowsLocked(Long trxRowsLocked) {
        this.trxRowsLocked = trxRowsLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_rows_modified")
    public Long getTrxRowsModified() {
        return trxRowsModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_rows_modified")
    public void setTrxRowsModified(Long trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_concurrency_tickets")
    public Long getTrxConcurrencyTickets() {
        return trxConcurrencyTickets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_concurrency_tickets")
    public void setTrxConcurrencyTickets(Long trxConcurrencyTickets) {
        this.trxConcurrencyTickets = trxConcurrencyTickets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_isolation_level")
    public String getTrxIsolationLevel() {
        return trxIsolationLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.059+07:00", comments="Source field: INNODB_TRX.trx_isolation_level")
    public void setTrxIsolationLevel(String trxIsolationLevel) {
        this.trxIsolationLevel = trxIsolationLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_unique_checks")
    public Integer getTrxUniqueChecks() {
        return trxUniqueChecks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_unique_checks")
    public void setTrxUniqueChecks(Integer trxUniqueChecks) {
        this.trxUniqueChecks = trxUniqueChecks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_foreign_key_checks")
    public Integer getTrxForeignKeyChecks() {
        return trxForeignKeyChecks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_foreign_key_checks")
    public void setTrxForeignKeyChecks(Integer trxForeignKeyChecks) {
        this.trxForeignKeyChecks = trxForeignKeyChecks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_last_foreign_key_error")
    public String getTrxLastForeignKeyError() {
        return trxLastForeignKeyError;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_last_foreign_key_error")
    public void setTrxLastForeignKeyError(String trxLastForeignKeyError) {
        this.trxLastForeignKeyError = trxLastForeignKeyError;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_latched")
    public Integer getTrxAdaptiveHashLatched() {
        return trxAdaptiveHashLatched;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_latched")
    public void setTrxAdaptiveHashLatched(Integer trxAdaptiveHashLatched) {
        this.trxAdaptiveHashLatched = trxAdaptiveHashLatched;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_timeout")
    public Long getTrxAdaptiveHashTimeout() {
        return trxAdaptiveHashTimeout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.06+07:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_timeout")
    public void setTrxAdaptiveHashTimeout(Long trxAdaptiveHashTimeout) {
        this.trxAdaptiveHashTimeout = trxAdaptiveHashTimeout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.061+07:00", comments="Source field: INNODB_TRX.trx_is_read_only")
    public Integer getTrxIsReadOnly() {
        return trxIsReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.061+07:00", comments="Source field: INNODB_TRX.trx_is_read_only")
    public void setTrxIsReadOnly(Integer trxIsReadOnly) {
        this.trxIsReadOnly = trxIsReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.061+07:00", comments="Source field: INNODB_TRX.trx_autocommit_non_locking")
    public Integer getTrxAutocommitNonLocking() {
        return trxAutocommitNonLocking;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.061+07:00", comments="Source field: INNODB_TRX.trx_autocommit_non_locking")
    public void setTrxAutocommitNonLocking(Integer trxAutocommitNonLocking) {
        this.trxAutocommitNonLocking = trxAutocommitNonLocking;
    }
}