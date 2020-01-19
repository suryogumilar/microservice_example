package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbTempTableInfo {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.2+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.TABLE_ID")
    private Long tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.N_COLS")
    private Integer nCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.SPACE")
    private Integer space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.TABLE_ID")
    public Long getTableId() {
        return tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.TABLE_ID")
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.N_COLS")
    public Integer getnCols() {
        return nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.N_COLS")
    public void setnCols(Integer nCols) {
        this.nCols = nCols;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.SPACE")
    public Integer getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.201+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.SPACE")
    public void setSpace(Integer space) {
        this.space = space;
    }
}