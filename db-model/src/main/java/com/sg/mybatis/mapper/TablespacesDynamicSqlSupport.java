package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TablespacesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.284+07:00", comments="Source Table: TABLESPACES")
    public static final Tablespaces tablespaces = new Tablespaces();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.284+07:00", comments="Source field: TABLESPACES.TABLESPACE_NAME")
    public static final SqlColumn<String> tablespaceName = tablespaces.tablespaceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.284+07:00", comments="Source field: TABLESPACES.ENGINE")
    public static final SqlColumn<String> engine = tablespaces.engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source field: TABLESPACES.TABLESPACE_TYPE")
    public static final SqlColumn<String> tablespaceType = tablespaces.tablespaceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source field: TABLESPACES.LOGFILE_GROUP_NAME")
    public static final SqlColumn<String> logfileGroupName = tablespaces.logfileGroupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source field: TABLESPACES.EXTENT_SIZE")
    public static final SqlColumn<Long> extentSize = tablespaces.extentSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source field: TABLESPACES.AUTOEXTEND_SIZE")
    public static final SqlColumn<Long> autoextendSize = tablespaces.autoextendSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source field: TABLESPACES.MAXIMUM_SIZE")
    public static final SqlColumn<Long> maximumSize = tablespaces.maximumSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source field: TABLESPACES.NODEGROUP_ID")
    public static final SqlColumn<Long> nodegroupId = tablespaces.nodegroupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source field: TABLESPACES.TABLESPACE_COMMENT")
    public static final SqlColumn<String> tablespaceComment = tablespaces.tablespaceComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.284+07:00", comments="Source Table: TABLESPACES")
    public static final class Tablespaces extends SqlTable {
        public final SqlColumn<String> tablespaceName = column("TABLESPACE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> engine = column("ENGINE", JDBCType.VARCHAR);

        public final SqlColumn<String> tablespaceType = column("TABLESPACE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> logfileGroupName = column("LOGFILE_GROUP_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> extentSize = column("EXTENT_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> autoextendSize = column("AUTOEXTEND_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> maximumSize = column("MAXIMUM_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> nodegroupId = column("NODEGROUP_ID", JDBCType.BIGINT);

        public final SqlColumn<String> tablespaceComment = column("TABLESPACE_COMMENT", JDBCType.VARCHAR);

        public Tablespaces() {
            super("TABLESPACES");
        }
    }
}