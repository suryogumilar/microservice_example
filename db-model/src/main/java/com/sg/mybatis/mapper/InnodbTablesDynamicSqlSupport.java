package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbTablesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.045+07:00", comments="Source Table: INNODB_TABLES")
    public static final InnodbTables innodbTables = new InnodbTables();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.046+07:00", comments="Source field: INNODB_TABLES.TABLE_ID")
    public static final SqlColumn<Long> tableId = innodbTables.tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.046+07:00", comments="Source field: INNODB_TABLES.NAME")
    public static final SqlColumn<String> name = innodbTables.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.046+07:00", comments="Source field: INNODB_TABLES.FLAG")
    public static final SqlColumn<Integer> flag = innodbTables.flag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.046+07:00", comments="Source field: INNODB_TABLES.N_COLS")
    public static final SqlColumn<Integer> nCols = innodbTables.nCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.046+07:00", comments="Source field: INNODB_TABLES.SPACE")
    public static final SqlColumn<Long> space = innodbTables.space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.046+07:00", comments="Source field: INNODB_TABLES.ROW_FORMAT")
    public static final SqlColumn<String> rowFormat = innodbTables.rowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.046+07:00", comments="Source field: INNODB_TABLES.ZIP_PAGE_SIZE")
    public static final SqlColumn<Integer> zipPageSize = innodbTables.zipPageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.046+07:00", comments="Source field: INNODB_TABLES.SPACE_TYPE")
    public static final SqlColumn<String> spaceType = innodbTables.spaceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.046+07:00", comments="Source field: INNODB_TABLES.INSTANT_COLS")
    public static final SqlColumn<Integer> instantCols = innodbTables.instantCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.045+07:00", comments="Source Table: INNODB_TABLES")
    public static final class InnodbTables extends SqlTable {
        public final SqlColumn<Long> tableId = column("TABLE_ID", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> flag = column("FLAG", JDBCType.INTEGER);

        public final SqlColumn<Integer> nCols = column("N_COLS", JDBCType.INTEGER);

        public final SqlColumn<Long> space = column("SPACE", JDBCType.BIGINT);

        public final SqlColumn<String> rowFormat = column("ROW_FORMAT", JDBCType.VARCHAR);

        public final SqlColumn<Integer> zipPageSize = column("ZIP_PAGE_SIZE", JDBCType.INTEGER);

        public final SqlColumn<String> spaceType = column("SPACE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> instantCols = column("INSTANT_COLS", JDBCType.INTEGER);

        public InnodbTables() {
            super("INNODB_TABLES");
        }
    }
}