package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbCachedIndexes {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.386+07:00", comments="Source field: INNODB_CACHED_INDEXES.SPACE_ID")
    private Integer spaceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.386+07:00", comments="Source field: INNODB_CACHED_INDEXES.INDEX_ID")
    private Long indexId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.386+07:00", comments="Source field: INNODB_CACHED_INDEXES.N_CACHED_PAGES")
    private Long nCachedPages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.386+07:00", comments="Source field: INNODB_CACHED_INDEXES.SPACE_ID")
    public Integer getSpaceId() {
        return spaceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.386+07:00", comments="Source field: INNODB_CACHED_INDEXES.SPACE_ID")
    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.386+07:00", comments="Source field: INNODB_CACHED_INDEXES.INDEX_ID")
    public Long getIndexId() {
        return indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.386+07:00", comments="Source field: INNODB_CACHED_INDEXES.INDEX_ID")
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.386+07:00", comments="Source field: INNODB_CACHED_INDEXES.N_CACHED_PAGES")
    public Long getnCachedPages() {
        return nCachedPages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.386+07:00", comments="Source field: INNODB_CACHED_INDEXES.N_CACHED_PAGES")
    public void setnCachedPages(Long nCachedPages) {
        this.nCachedPages = nCachedPages;
    }
}