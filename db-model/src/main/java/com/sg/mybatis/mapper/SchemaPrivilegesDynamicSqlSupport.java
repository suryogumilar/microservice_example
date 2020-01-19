package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaPrivilegesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.076+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    public static final SchemaPrivileges schemaPrivileges = new SchemaPrivileges();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.076+07:00", comments="Source field: SCHEMA_PRIVILEGES.GRANTEE")
    public static final SqlColumn<String> grantee = schemaPrivileges.grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source field: SCHEMA_PRIVILEGES.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = schemaPrivileges.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source field: SCHEMA_PRIVILEGES.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = schemaPrivileges.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source field: SCHEMA_PRIVILEGES.PRIVILEGE_TYPE")
    public static final SqlColumn<String> privilegeType = schemaPrivileges.privilegeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.077+07:00", comments="Source field: SCHEMA_PRIVILEGES.IS_GRANTABLE")
    public static final SqlColumn<String> isGrantable = schemaPrivileges.isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.076+07:00", comments="Source Table: SCHEMA_PRIVILEGES")
    public static final class SchemaPrivileges extends SqlTable {
        public final SqlColumn<String> grantee = column("GRANTEE", JDBCType.VARCHAR);

        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> privilegeType = column("PRIVILEGE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> isGrantable = column("IS_GRANTABLE", JDBCType.VARCHAR);

        public SchemaPrivileges() {
            super("SCHEMA_PRIVILEGES");
        }
    }
}