package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ViewTableUsageDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.039+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    public static final ViewTableUsage viewTableUsage = new ViewTableUsage();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.039+07:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_CATALOG")
    public static final SqlColumn<String> viewCatalog = viewTableUsage.viewCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.04+07:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_SCHEMA")
    public static final SqlColumn<String> viewSchema = viewTableUsage.viewSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.04+07:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_NAME")
    public static final SqlColumn<String> viewName = viewTableUsage.viewName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.04+07:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = viewTableUsage.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.04+07:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = viewTableUsage.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.04+07:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_NAME")
    public static final SqlColumn<String> tableName = viewTableUsage.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.039+07:00", comments="Source Table: VIEW_TABLE_USAGE")
    public static final class ViewTableUsage extends SqlTable {
        public final SqlColumn<String> viewCatalog = column("VIEW_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> viewSchema = column("VIEW_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> viewName = column("VIEW_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public ViewTableUsage() {
            super("VIEW_TABLE_USAGE");
        }
    }
}