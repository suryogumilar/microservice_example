package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ColumnPrivilegesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.082+07:00", comments="Source Table: COLUMN_PRIVILEGES")
    public static final ColumnPrivileges columnPrivileges = new ColumnPrivileges();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.083+07:00", comments="Source field: COLUMN_PRIVILEGES.GRANTEE")
    public static final SqlColumn<String> grantee = columnPrivileges.grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.083+07:00", comments="Source field: COLUMN_PRIVILEGES.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = columnPrivileges.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.084+07:00", comments="Source field: COLUMN_PRIVILEGES.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = columnPrivileges.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.084+07:00", comments="Source field: COLUMN_PRIVILEGES.TABLE_NAME")
    public static final SqlColumn<String> tableName = columnPrivileges.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.084+07:00", comments="Source field: COLUMN_PRIVILEGES.COLUMN_NAME")
    public static final SqlColumn<String> columnName = columnPrivileges.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.084+07:00", comments="Source field: COLUMN_PRIVILEGES.PRIVILEGE_TYPE")
    public static final SqlColumn<String> privilegeType = columnPrivileges.privilegeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.084+07:00", comments="Source field: COLUMN_PRIVILEGES.IS_GRANTABLE")
    public static final SqlColumn<String> isGrantable = columnPrivileges.isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.082+07:00", comments="Source Table: COLUMN_PRIVILEGES")
    public static final class ColumnPrivileges extends SqlTable {
        public final SqlColumn<String> grantee = column("GRANTEE", JDBCType.VARCHAR);

        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> columnName = column("COLUMN_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> privilegeType = column("PRIVILEGE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> isGrantable = column("IS_GRANTABLE", JDBCType.VARCHAR);

        public ColumnPrivileges() {
            super("COLUMN_PRIVILEGES");
        }
    }
}