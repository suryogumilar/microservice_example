package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbForeignCols {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.ID")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.FOR_COL_NAME")
    private String forColName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.REF_COL_NAME")
    private String refColName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.POS")
    private Integer pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.ID")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.ID")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.FOR_COL_NAME")
    public String getForColName() {
        return forColName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.FOR_COL_NAME")
    public void setForColName(String forColName) {
        this.forColName = forColName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.REF_COL_NAME")
    public String getRefColName() {
        return refColName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.REF_COL_NAME")
    public void setRefColName(String refColName) {
        this.refColName = refColName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.POS")
    public Integer getPos() {
        return pos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.159+07:00", comments="Source field: INNODB_FOREIGN_COLS.POS")
    public void setPos(Integer pos) {
        this.pos = pos;
    }
}