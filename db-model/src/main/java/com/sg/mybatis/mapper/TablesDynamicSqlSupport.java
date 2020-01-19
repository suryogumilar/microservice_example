package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TablesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.254+07:00", comments="Source Table: TABLES")
    public static final Tables tables = new Tables();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.257+07:00", comments="Source field: TABLES.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = tables.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.257+07:00", comments="Source field: TABLES.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = tables.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.257+07:00", comments="Source field: TABLES.TABLE_NAME")
    public static final SqlColumn<String> tableName = tables.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.257+07:00", comments="Source field: TABLES.TABLE_TYPE")
    public static final SqlColumn<String> tableType = tables.tableType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.258+07:00", comments="Source field: TABLES.ENGINE")
    public static final SqlColumn<String> engine = tables.engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.258+07:00", comments="Source field: TABLES.VERSION")
    public static final SqlColumn<Integer> version = tables.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.ROW_FORMAT")
    public static final SqlColumn<String> rowFormat = tables.rowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.TABLE_ROWS")
    public static final SqlColumn<Long> tableRows = tables.tableRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.AVG_ROW_LENGTH")
    public static final SqlColumn<Long> avgRowLength = tables.avgRowLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.DATA_LENGTH")
    public static final SqlColumn<Long> dataLength = tables.dataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.MAX_DATA_LENGTH")
    public static final SqlColumn<Long> maxDataLength = tables.maxDataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.INDEX_LENGTH")
    public static final SqlColumn<Long> indexLength = tables.indexLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.DATA_FREE")
    public static final SqlColumn<Long> dataFree = tables.dataFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.AUTO_INCREMENT")
    public static final SqlColumn<Long> autoIncrement = tables.autoIncrement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.CREATE_TIME")
    public static final SqlColumn<Date> createTime = tables.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.UPDATE_TIME")
    public static final SqlColumn<Date> updateTime = tables.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.CHECK_TIME")
    public static final SqlColumn<Date> checkTime = tables.checkTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.TABLE_COLLATION")
    public static final SqlColumn<String> tableCollation = tables.tableCollation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.CHECKSUM")
    public static final SqlColumn<Long> checksum = tables.checksum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.CREATE_OPTIONS")
    public static final SqlColumn<String> createOptions = tables.createOptions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source field: TABLES.TABLE_COMMENT")
    public static final SqlColumn<String> tableComment = tables.tableComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.257+07:00", comments="Source Table: TABLES")
    public static final class Tables extends SqlTable {
        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> tableType = column("TABLE_TYPE", JDBCType.CHAR);

        public final SqlColumn<String> engine = column("ENGINE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> version = column("VERSION", JDBCType.INTEGER);

        public final SqlColumn<String> rowFormat = column("ROW_FORMAT", JDBCType.CHAR);

        public final SqlColumn<Long> tableRows = column("TABLE_ROWS", JDBCType.BIGINT);

        public final SqlColumn<Long> avgRowLength = column("AVG_ROW_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> dataLength = column("DATA_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> maxDataLength = column("MAX_DATA_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> indexLength = column("INDEX_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> dataFree = column("DATA_FREE", JDBCType.BIGINT);

        public final SqlColumn<Long> autoIncrement = column("AUTO_INCREMENT", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("CREATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("UPDATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> checkTime = column("CHECK_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<String> tableCollation = column("TABLE_COLLATION", JDBCType.VARCHAR);

        public final SqlColumn<Long> checksum = column("CHECKSUM", JDBCType.BIGINT);

        public final SqlColumn<String> createOptions = column("CREATE_OPTIONS", JDBCType.VARCHAR);

        public final SqlColumn<String> tableComment = column("TABLE_COMMENT", JDBCType.VARCHAR);

        public Tables() {
            super("TABLES");
        }
    }
}