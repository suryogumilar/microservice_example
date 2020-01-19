package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ViewRoutineUsageDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.099+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    public static final ViewRoutineUsage viewRoutineUsage = new ViewRoutineUsage();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.099+07:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = viewRoutineUsage.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.099+07:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = viewRoutineUsage.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_NAME")
    public static final SqlColumn<String> tableName = viewRoutineUsage.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG")
    public static final SqlColumn<String> specificCatalog = viewRoutineUsage.specificCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA")
    public static final SqlColumn<String> specificSchema = viewRoutineUsage.specificSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.1+07:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_NAME")
    public static final SqlColumn<String> specificName = viewRoutineUsage.specificName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.099+07:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    public static final class ViewRoutineUsage extends SqlTable {
        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> specificCatalog = column("SPECIFIC_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> specificSchema = column("SPECIFIC_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> specificName = column("SPECIFIC_NAME", JDBCType.VARCHAR);

        public ViewRoutineUsage() {
            super("VIEW_ROUTINE_USAGE");
        }
    }
}