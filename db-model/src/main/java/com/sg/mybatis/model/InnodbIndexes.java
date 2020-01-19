package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbIndexes {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.INDEX_ID")
    private Long indexId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.TABLE_ID")
    private Long tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.TYPE")
    private Integer type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.N_FIELDS")
    private Integer nFields;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.PAGE_NO")
    private Integer pageNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.SPACE")
    private Integer space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.MERGE_THRESHOLD")
    private Integer mergeThreshold;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.INDEX_ID")
    public Long getIndexId() {
        return indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.INDEX_ID")
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.TABLE_ID")
    public Long getTableId() {
        return tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.TABLE_ID")
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.TYPE")
    public Integer getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.TYPE")
    public void setType(Integer type) {
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.N_FIELDS")
    public Integer getnFields() {
        return nFields;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.N_FIELDS")
    public void setnFields(Integer nFields) {
        this.nFields = nFields;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.PAGE_NO")
    public Integer getPageNo() {
        return pageNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.PAGE_NO")
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.SPACE")
    public Integer getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.SPACE")
    public void setSpace(Integer space) {
        this.space = space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.MERGE_THRESHOLD")
    public Integer getMergeThreshold() {
        return mergeThreshold;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.MERGE_THRESHOLD")
    public void setMergeThreshold(Integer mergeThreshold) {
        this.mergeThreshold = mergeThreshold;
    }
}