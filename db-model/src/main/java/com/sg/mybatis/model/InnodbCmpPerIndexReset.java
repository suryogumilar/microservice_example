package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbCmpPerIndexReset {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.05+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.database_name")
    private String databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.index_name")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops")
    private Integer compressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops_ok")
    private Integer compressOpsOk;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_time")
    private Integer compressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_ops")
    private Integer uncompressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.052+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_time")
    private Integer uncompressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.05+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.database_name")
    public String getDatabaseName() {
        return databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.database_name")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.index_name")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.index_name")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops")
    public Integer getCompressOps() {
        return compressOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops")
    public void setCompressOps(Integer compressOps) {
        this.compressOps = compressOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops_ok")
    public Integer getCompressOpsOk() {
        return compressOpsOk;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops_ok")
    public void setCompressOpsOk(Integer compressOpsOk) {
        this.compressOpsOk = compressOpsOk;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_time")
    public Integer getCompressTime() {
        return compressTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.051+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_time")
    public void setCompressTime(Integer compressTime) {
        this.compressTime = compressTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.052+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_ops")
    public Integer getUncompressOps() {
        return uncompressOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.052+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_ops")
    public void setUncompressOps(Integer uncompressOps) {
        this.uncompressOps = uncompressOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.052+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_time")
    public Integer getUncompressTime() {
        return uncompressTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.052+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_time")
    public void setUncompressTime(Integer uncompressTime) {
        this.uncompressTime = uncompressTime;
    }
}