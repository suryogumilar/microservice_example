package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbSessionTempTablespacesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.303+07:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    public static final InnodbSessionTempTablespaces innodbSessionTempTablespaces = new InnodbSessionTempTablespaces();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.303+07:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.ID")
    public static final SqlColumn<Integer> id = innodbSessionTempTablespaces.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.303+07:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.SPACE")
    public static final SqlColumn<Integer> space = innodbSessionTempTablespaces.space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.303+07:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.PATH")
    public static final SqlColumn<String> path = innodbSessionTempTablespaces.path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.303+07:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.SIZE")
    public static final SqlColumn<Long> size = innodbSessionTempTablespaces.size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.303+07:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.STATE")
    public static final SqlColumn<String> state = innodbSessionTempTablespaces.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.303+07:00", comments="Source field: INNODB_SESSION_TEMP_TABLESPACES.PURPOSE")
    public static final SqlColumn<String> purpose = innodbSessionTempTablespaces.purpose;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.303+07:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    public static final class InnodbSessionTempTablespaces extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> space = column("SPACE", JDBCType.INTEGER);

        public final SqlColumn<String> path = column("PATH", JDBCType.VARCHAR);

        public final SqlColumn<Long> size = column("SIZE", JDBCType.BIGINT);

        public final SqlColumn<String> state = column("STATE", JDBCType.VARCHAR);

        public final SqlColumn<String> purpose = column("PURPOSE", JDBCType.VARCHAR);

        public InnodbSessionTempTablespaces() {
            super("INNODB_SESSION_TEMP_TABLESPACES");
        }
    }
}