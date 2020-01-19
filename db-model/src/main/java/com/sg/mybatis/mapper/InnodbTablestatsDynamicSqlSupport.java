package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbTablestatsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source Table: INNODB_TABLESTATS")
    public static final InnodbTablestats innodbTablestats = new InnodbTablestats();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source field: INNODB_TABLESTATS.TABLE_ID")
    public static final SqlColumn<Long> tableId = innodbTablestats.tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source field: INNODB_TABLESTATS.NAME")
    public static final SqlColumn<String> name = innodbTablestats.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source field: INNODB_TABLESTATS.STATS_INITIALIZED")
    public static final SqlColumn<String> statsInitialized = innodbTablestats.statsInitialized;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source field: INNODB_TABLESTATS.NUM_ROWS")
    public static final SqlColumn<Long> numRows = innodbTablestats.numRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source field: INNODB_TABLESTATS.CLUST_INDEX_SIZE")
    public static final SqlColumn<Long> clustIndexSize = innodbTablestats.clustIndexSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source field: INNODB_TABLESTATS.OTHER_INDEX_SIZE")
    public static final SqlColumn<Long> otherIndexSize = innodbTablestats.otherIndexSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source field: INNODB_TABLESTATS.MODIFIED_COUNTER")
    public static final SqlColumn<Long> modifiedCounter = innodbTablestats.modifiedCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source field: INNODB_TABLESTATS.AUTOINC")
    public static final SqlColumn<Long> autoinc = innodbTablestats.autoinc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source field: INNODB_TABLESTATS.REF_COUNT")
    public static final SqlColumn<Integer> refCount = innodbTablestats.refCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.287+07:00", comments="Source Table: INNODB_TABLESTATS")
    public static final class InnodbTablestats extends SqlTable {
        public final SqlColumn<Long> tableId = column("TABLE_ID", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> statsInitialized = column("STATS_INITIALIZED", JDBCType.VARCHAR);

        public final SqlColumn<Long> numRows = column("NUM_ROWS", JDBCType.BIGINT);

        public final SqlColumn<Long> clustIndexSize = column("CLUST_INDEX_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> otherIndexSize = column("OTHER_INDEX_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> modifiedCounter = column("MODIFIED_COUNTER", JDBCType.BIGINT);

        public final SqlColumn<Long> autoinc = column("AUTOINC", JDBCType.BIGINT);

        public final SqlColumn<Integer> refCount = column("REF_COUNT", JDBCType.INTEGER);

        public InnodbTablestats() {
            super("INNODB_TABLESTATS");
        }
    }
}