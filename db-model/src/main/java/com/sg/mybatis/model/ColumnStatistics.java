package com.sg.mybatis.model;

import javax.annotation.Generated;

public class ColumnStatistics {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.193+07:00", comments="Source field: COLUMN_STATISTICS.SCHEMA_NAME")
    private String schemaName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.193+07:00", comments="Source field: COLUMN_STATISTICS.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.193+07:00", comments="Source field: COLUMN_STATISTICS.COLUMN_NAME")
    private String columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.194+07:00", comments="Source field: COLUMN_STATISTICS.HISTOGRAM")
    private String histogram;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.193+07:00", comments="Source field: COLUMN_STATISTICS.SCHEMA_NAME")
    public String getSchemaName() {
        return schemaName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.193+07:00", comments="Source field: COLUMN_STATISTICS.SCHEMA_NAME")
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.193+07:00", comments="Source field: COLUMN_STATISTICS.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.193+07:00", comments="Source field: COLUMN_STATISTICS.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.193+07:00", comments="Source field: COLUMN_STATISTICS.COLUMN_NAME")
    public String getColumnName() {
        return columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.193+07:00", comments="Source field: COLUMN_STATISTICS.COLUMN_NAME")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.194+07:00", comments="Source field: COLUMN_STATISTICS.HISTOGRAM")
    public String getHistogram() {
        return histogram;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.194+07:00", comments="Source field: COLUMN_STATISTICS.HISTOGRAM")
    public void setHistogram(String histogram) {
        this.histogram = histogram;
    }
}