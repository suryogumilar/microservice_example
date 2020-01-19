package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbForeign {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.ID")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.FOR_NAME")
    private String forName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.REF_NAME")
    private String refName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.N_COLS")
    private Long nCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.TYPE")
    private Integer type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.ID")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.ID")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.FOR_NAME")
    public String getForName() {
        return forName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.FOR_NAME")
    public void setForName(String forName) {
        this.forName = forName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.REF_NAME")
    public String getRefName() {
        return refName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.REF_NAME")
    public void setRefName(String refName) {
        this.refName = refName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.N_COLS")
    public Long getnCols() {
        return nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.N_COLS")
    public void setnCols(Long nCols) {
        this.nCols = nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.TYPE")
    public Integer getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.325+07:00", comments="Source field: INNODB_FOREIGN.TYPE")
    public void setType(Integer type) {
        this.type = type;
    }
}