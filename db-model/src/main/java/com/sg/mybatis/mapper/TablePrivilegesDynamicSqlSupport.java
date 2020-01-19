package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TablePrivilegesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source Table: TABLE_PRIVILEGES")
    public static final TablePrivileges tablePrivileges = new TablePrivileges();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source field: TABLE_PRIVILEGES.GRANTEE")
    public static final SqlColumn<String> grantee = tablePrivileges.grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source field: TABLE_PRIVILEGES.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = tablePrivileges.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source field: TABLE_PRIVILEGES.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = tablePrivileges.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source field: TABLE_PRIVILEGES.TABLE_NAME")
    public static final SqlColumn<String> tableName = tablePrivileges.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source field: TABLE_PRIVILEGES.PRIVILEGE_TYPE")
    public static final SqlColumn<String> privilegeType = tablePrivileges.privilegeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source field: TABLE_PRIVILEGES.IS_GRANTABLE")
    public static final SqlColumn<String> isGrantable = tablePrivileges.isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.334+07:00", comments="Source Table: TABLE_PRIVILEGES")
    public static final class TablePrivileges extends SqlTable {
        public final SqlColumn<String> grantee = column("GRANTEE", JDBCType.VARCHAR);

        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> privilegeType = column("PRIVILEGE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> isGrantable = column("IS_GRANTABLE", JDBCType.VARCHAR);

        public TablePrivileges() {
            super("TABLE_PRIVILEGES");
        }
    }
}