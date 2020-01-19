package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbFields {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.508+07:00", comments="Source field: INNODB_FIELDS.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.508+07:00", comments="Source field: INNODB_FIELDS.POS")
    private Long pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.508+07:00", comments="Source field: INNODB_FIELDS.INDEX_ID")
    private byte[] indexId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.508+07:00", comments="Source field: INNODB_FIELDS.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.508+07:00", comments="Source field: INNODB_FIELDS.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.508+07:00", comments="Source field: INNODB_FIELDS.POS")
    public Long getPos() {
        return pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.508+07:00", comments="Source field: INNODB_FIELDS.POS")
    public void setPos(Long pos) {
        this.pos = pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.508+07:00", comments="Source field: INNODB_FIELDS.INDEX_ID")
    public byte[] getIndexId() {
        return indexId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.508+07:00", comments="Source field: INNODB_FIELDS.INDEX_ID")
    public void setIndexId(byte[] indexId) {
        this.indexId = indexId;
    }
}