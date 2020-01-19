package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbTablespacesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source Table: INNODB_TABLESPACES")
    public static final InnodbTablespaces innodbTablespaces = new InnodbTablespaces();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.SPACE")
    public static final SqlColumn<Integer> space = innodbTablespaces.space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.NAME")
    public static final SqlColumn<String> name = innodbTablespaces.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.FLAG")
    public static final SqlColumn<Integer> flag = innodbTablespaces.flag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.ROW_FORMAT")
    public static final SqlColumn<String> rowFormat = innodbTablespaces.rowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.PAGE_SIZE")
    public static final SqlColumn<Integer> pageSize = innodbTablespaces.pageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.ZIP_PAGE_SIZE")
    public static final SqlColumn<Integer> zipPageSize = innodbTablespaces.zipPageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.SPACE_TYPE")
    public static final SqlColumn<String> spaceType = innodbTablespaces.spaceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.FS_BLOCK_SIZE")
    public static final SqlColumn<Integer> fsBlockSize = innodbTablespaces.fsBlockSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.FILE_SIZE")
    public static final SqlColumn<Long> fileSize = innodbTablespaces.fileSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.ALLOCATED_SIZE")
    public static final SqlColumn<Long> allocatedSize = innodbTablespaces.allocatedSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.SERVER_VERSION")
    public static final SqlColumn<String> serverVersion = innodbTablespaces.serverVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.SPACE_VERSION")
    public static final SqlColumn<Integer> spaceVersion = innodbTablespaces.spaceVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.ENCRYPTION")
    public static final SqlColumn<String> encryption = innodbTablespaces.encryption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source field: INNODB_TABLESPACES.STATE")
    public static final SqlColumn<String> state = innodbTablespaces.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source Table: INNODB_TABLESPACES")
    public static final class InnodbTablespaces extends SqlTable {
        public final SqlColumn<Integer> space = column("SPACE", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> flag = column("FLAG", JDBCType.INTEGER);

        public final SqlColumn<String> rowFormat = column("ROW_FORMAT", JDBCType.VARCHAR);

        public final SqlColumn<Integer> pageSize = column("PAGE_SIZE", JDBCType.INTEGER);

        public final SqlColumn<Integer> zipPageSize = column("ZIP_PAGE_SIZE", JDBCType.INTEGER);

        public final SqlColumn<String> spaceType = column("SPACE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> fsBlockSize = column("FS_BLOCK_SIZE", JDBCType.INTEGER);

        public final SqlColumn<Long> fileSize = column("FILE_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> allocatedSize = column("ALLOCATED_SIZE", JDBCType.BIGINT);

        public final SqlColumn<String> serverVersion = column("SERVER_VERSION", JDBCType.VARCHAR);

        public final SqlColumn<Integer> spaceVersion = column("SPACE_VERSION", JDBCType.INTEGER);

        public final SqlColumn<String> encryption = column("ENCRYPTION", JDBCType.VARCHAR);

        public final SqlColumn<String> state = column("STATE", JDBCType.VARCHAR);

        public InnodbTablespaces() {
            super("INNODB_TABLESPACES");
        }
    }
}