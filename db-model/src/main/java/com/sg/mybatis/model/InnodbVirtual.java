package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbVirtual {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.TABLE_ID")
    private Long tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.POS")
    private Integer pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.BASE_POS")
    private Integer basePos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.TABLE_ID")
    public Long getTableId() {
        return tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.TABLE_ID")
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.POS")
    public Integer getPos() {
        return pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.POS")
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.BASE_POS")
    public Integer getBasePos() {
        return basePos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.BASE_POS")
    public void setBasePos(Integer basePos) {
        this.basePos = basePos;
    }
}