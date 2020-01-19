package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbTablespacesBrief {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.208+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.208+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.PATH")
    private String path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE_TYPE")
    private String spaceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE")
    private byte[] space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.FLAG")
    private byte[] flag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.208+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.208+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.208+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.PATH")
    public String getPath() {
        return path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.PATH")
    public void setPath(String path) {
        this.path = path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE_TYPE")
    public String getSpaceType() {
        return spaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE_TYPE")
    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE")
    public byte[] getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE")
    public void setSpace(byte[] space) {
        this.space = space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.FLAG")
    public byte[] getFlag() {
        return flag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.FLAG")
    public void setFlag(byte[] flag) {
        this.flag = flag;
    }
}