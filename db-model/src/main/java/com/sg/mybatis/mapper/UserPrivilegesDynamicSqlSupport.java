package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserPrivilegesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.118+07:00", comments="Source Table: USER_PRIVILEGES")
    public static final UserPrivileges userPrivileges = new UserPrivileges();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.119+07:00", comments="Source field: USER_PRIVILEGES.GRANTEE")
    public static final SqlColumn<String> grantee = userPrivileges.grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.119+07:00", comments="Source field: USER_PRIVILEGES.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = userPrivileges.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.119+07:00", comments="Source field: USER_PRIVILEGES.PRIVILEGE_TYPE")
    public static final SqlColumn<String> privilegeType = userPrivileges.privilegeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.119+07:00", comments="Source field: USER_PRIVILEGES.IS_GRANTABLE")
    public static final SqlColumn<String> isGrantable = userPrivileges.isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.119+07:00", comments="Source Table: USER_PRIVILEGES")
    public static final class UserPrivileges extends SqlTable {
        public final SqlColumn<String> grantee = column("GRANTEE", JDBCType.VARCHAR);

        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> privilegeType = column("PRIVILEGE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> isGrantable = column("IS_GRANTABLE", JDBCType.VARCHAR);

        public UserPrivileges() {
            super("USER_PRIVILEGES");
        }
    }
}