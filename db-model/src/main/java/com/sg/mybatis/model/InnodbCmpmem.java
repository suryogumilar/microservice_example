package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbCmpmem {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.page_size")
    private Integer pageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.buffer_pool_instance")
    private Integer bufferPoolInstance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.pages_used")
    private Integer pagesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.pages_free")
    private Integer pagesFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.relocation_ops")
    private Long relocationOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.relocation_time")
    private Integer relocationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.page_size")
    public Integer getPageSize() {
        return pageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.page_size")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.buffer_pool_instance")
    public Integer getBufferPoolInstance() {
        return bufferPoolInstance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.buffer_pool_instance")
    public void setBufferPoolInstance(Integer bufferPoolInstance) {
        this.bufferPoolInstance = bufferPoolInstance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.pages_used")
    public Integer getPagesUsed() {
        return pagesUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.pages_used")
    public void setPagesUsed(Integer pagesUsed) {
        this.pagesUsed = pagesUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.pages_free")
    public Integer getPagesFree() {
        return pagesFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.pages_free")
    public void setPagesFree(Integer pagesFree) {
        this.pagesFree = pagesFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.relocation_ops")
    public Long getRelocationOps() {
        return relocationOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.relocation_ops")
    public void setRelocationOps(Long relocationOps) {
        this.relocationOps = relocationOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.relocation_time")
    public Integer getRelocationTime() {
        return relocationTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.342+07:00", comments="Source field: INNODB_CMPMEM.relocation_time")
    public void setRelocationTime(Integer relocationTime) {
        this.relocationTime = relocationTime;
    }
}