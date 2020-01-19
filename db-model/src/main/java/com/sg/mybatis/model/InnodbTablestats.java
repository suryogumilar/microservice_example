package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbTablestats {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.TABLE_ID")
    private Long tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.STATS_INITIALIZED")
    private String statsInitialized;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.NUM_ROWS")
    private Long numRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.CLUST_INDEX_SIZE")
    private Long clustIndexSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.OTHER_INDEX_SIZE")
    private Long otherIndexSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.MODIFIED_COUNTER")
    private Long modifiedCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.AUTOINC")
    private Long autoinc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.REF_COUNT")
    private Integer refCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.TABLE_ID")
    public Long getTableId() {
        return tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.TABLE_ID")
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.STATS_INITIALIZED")
    public String getStatsInitialized() {
        return statsInitialized;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.STATS_INITIALIZED")
    public void setStatsInitialized(String statsInitialized) {
        this.statsInitialized = statsInitialized;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.NUM_ROWS")
    public Long getNumRows() {
        return numRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.NUM_ROWS")
    public void setNumRows(Long numRows) {
        this.numRows = numRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.CLUST_INDEX_SIZE")
    public Long getClustIndexSize() {
        return clustIndexSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.CLUST_INDEX_SIZE")
    public void setClustIndexSize(Long clustIndexSize) {
        this.clustIndexSize = clustIndexSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.OTHER_INDEX_SIZE")
    public Long getOtherIndexSize() {
        return otherIndexSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.OTHER_INDEX_SIZE")
    public void setOtherIndexSize(Long otherIndexSize) {
        this.otherIndexSize = otherIndexSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.MODIFIED_COUNTER")
    public Long getModifiedCounter() {
        return modifiedCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.MODIFIED_COUNTER")
    public void setModifiedCounter(Long modifiedCounter) {
        this.modifiedCounter = modifiedCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.AUTOINC")
    public Long getAutoinc() {
        return autoinc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.AUTOINC")
    public void setAutoinc(Long autoinc) {
        this.autoinc = autoinc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.REF_COUNT")
    public Integer getRefCount() {
        return refCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source field: INNODB_TABLESTATS.REF_COUNT")
    public void setRefCount(Integer refCount) {
        this.refCount = refCount;
    }
}