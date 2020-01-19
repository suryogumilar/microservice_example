package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbDatafiles {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source field: INNODB_DATAFILES.PATH")
    private String path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source field: INNODB_DATAFILES.SPACE")
    private byte[] space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source field: INNODB_DATAFILES.PATH")
    public String getPath() {
        return path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source field: INNODB_DATAFILES.PATH")
    public void setPath(String path) {
        this.path = path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source field: INNODB_DATAFILES.SPACE")
    public byte[] getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source field: INNODB_DATAFILES.SPACE")
    public void setSpace(byte[] space) {
        this.space = space;
    }
}