package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbTablespacesBriefDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    public static final InnodbTablespacesBrief innodbTablespacesBrief = new InnodbTablespacesBrief();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.NAME")
    public static final SqlColumn<String> name = innodbTablespacesBrief.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.PATH")
    public static final SqlColumn<String> path = innodbTablespacesBrief.path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE_TYPE")
    public static final SqlColumn<String> spaceType = innodbTablespacesBrief.spaceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.SPACE")
    public static final SqlColumn<byte[]> space = innodbTablespacesBrief.space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source field: INNODB_TABLESPACES_BRIEF.FLAG")
    public static final SqlColumn<byte[]> flag = innodbTablespacesBrief.flag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.209+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    public static final class InnodbTablespacesBrief extends SqlTable {
        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> path = column("PATH", JDBCType.VARCHAR);

        public final SqlColumn<String> spaceType = column("SPACE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> space = column("SPACE", JDBCType.VARBINARY);

        public final SqlColumn<byte[]> flag = column("FLAG", JDBCType.VARBINARY);

        public InnodbTablespacesBrief() {
            super("INNODB_TABLESPACES_BRIEF");
        }
    }
}