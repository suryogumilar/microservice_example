package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CredentialWebappDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: CREDENTIAL_WEBAPP")
    public static final CredentialWebapp credentialWebapp = new CredentialWebapp();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.ID")
    public static final SqlColumn<Integer> id = credentialWebapp.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.USERNAME")
    public static final SqlColumn<String> username = credentialWebapp.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.PASSWORD")
    public static final SqlColumn<String> password = credentialWebapp.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: CREDENTIAL_WEBAPP")
    public static final class CredentialWebapp extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> username = column("USERNAME", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("PASSWORD", JDBCType.VARCHAR);

        public CredentialWebapp() {
            super("CREDENTIAL_WEBAPP");
        }
    }
}