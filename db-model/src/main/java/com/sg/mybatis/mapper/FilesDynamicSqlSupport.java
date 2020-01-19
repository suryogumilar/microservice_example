package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FilesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.225+07:00", comments="Source Table: FILES")
    public static final Files files = new Files();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.225+07:00", comments="Source field: FILES.FILE_ID")
    public static final SqlColumn<Long> fileId = files.fileId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.225+07:00", comments="Source field: FILES.FILE_TYPE")
    public static final SqlColumn<String> fileType = files.fileType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.225+07:00", comments="Source field: FILES.TABLESPACE_NAME")
    public static final SqlColumn<String> tablespaceName = files.tablespaceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.225+07:00", comments="Source field: FILES.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = files.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.225+07:00", comments="Source field: FILES.LOGFILE_GROUP_NAME")
    public static final SqlColumn<String> logfileGroupName = files.logfileGroupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.225+07:00", comments="Source field: FILES.LOGFILE_GROUP_NUMBER")
    public static final SqlColumn<Long> logfileGroupNumber = files.logfileGroupNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.225+07:00", comments="Source field: FILES.ENGINE")
    public static final SqlColumn<String> engine = files.engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.FREE_EXTENTS")
    public static final SqlColumn<Long> freeExtents = files.freeExtents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.TOTAL_EXTENTS")
    public static final SqlColumn<Long> totalExtents = files.totalExtents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.EXTENT_SIZE")
    public static final SqlColumn<Long> extentSize = files.extentSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.INITIAL_SIZE")
    public static final SqlColumn<Long> initialSize = files.initialSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.MAXIMUM_SIZE")
    public static final SqlColumn<Long> maximumSize = files.maximumSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.AUTOEXTEND_SIZE")
    public static final SqlColumn<Long> autoextendSize = files.autoextendSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.VERSION")
    public static final SqlColumn<Long> version = files.version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.ROW_FORMAT")
    public static final SqlColumn<String> rowFormat = files.rowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.DATA_FREE")
    public static final SqlColumn<Long> dataFree = files.dataFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.STATUS")
    public static final SqlColumn<String> status = files.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.FILE_NAME")
    public static final SqlColumn<String> fileName = files.fileName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.TABLE_SCHEMA")
    public static final SqlColumn<byte[]> tableSchema = files.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.TABLE_NAME")
    public static final SqlColumn<byte[]> tableName = files.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.FULLTEXT_KEYS")
    public static final SqlColumn<byte[]> fulltextKeys = files.fulltextKeys;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.DELETED_ROWS")
    public static final SqlColumn<byte[]> deletedRows = files.deletedRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.UPDATE_COUNT")
    public static final SqlColumn<byte[]> updateCount = files.updateCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.226+07:00", comments="Source field: FILES.CREATION_TIME")
    public static final SqlColumn<byte[]> creationTime = files.creationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.LAST_UPDATE_TIME")
    public static final SqlColumn<byte[]> lastUpdateTime = files.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.LAST_ACCESS_TIME")
    public static final SqlColumn<byte[]> lastAccessTime = files.lastAccessTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.RECOVER_TIME")
    public static final SqlColumn<byte[]> recoverTime = files.recoverTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.TRANSACTION_COUNTER")
    public static final SqlColumn<byte[]> transactionCounter = files.transactionCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.TABLE_ROWS")
    public static final SqlColumn<byte[]> tableRows = files.tableRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.AVG_ROW_LENGTH")
    public static final SqlColumn<byte[]> avgRowLength = files.avgRowLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.DATA_LENGTH")
    public static final SqlColumn<byte[]> dataLength = files.dataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.MAX_DATA_LENGTH")
    public static final SqlColumn<byte[]> maxDataLength = files.maxDataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.INDEX_LENGTH")
    public static final SqlColumn<byte[]> indexLength = files.indexLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.CREATE_TIME")
    public static final SqlColumn<byte[]> createTime = files.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.227+07:00", comments="Source field: FILES.UPDATE_TIME")
    public static final SqlColumn<byte[]> updateTime = files.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source field: FILES.CHECK_TIME")
    public static final SqlColumn<byte[]> checkTime = files.checkTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source field: FILES.CHECKSUM")
    public static final SqlColumn<byte[]> checksum = files.checksum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source field: FILES.EXTRA")
    public static final SqlColumn<byte[]> extra = files.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.225+07:00", comments="Source Table: FILES")
    public static final class Files extends SqlTable {
        public final SqlColumn<Long> fileId = column("FILE_ID", JDBCType.BIGINT);

        public final SqlColumn<String> fileType = column("FILE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> tablespaceName = column("TABLESPACE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.CHAR);

        public final SqlColumn<String> logfileGroupName = column("LOGFILE_GROUP_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> logfileGroupNumber = column("LOGFILE_GROUP_NUMBER", JDBCType.BIGINT);

        public final SqlColumn<String> engine = column("ENGINE", JDBCType.VARCHAR);

        public final SqlColumn<Long> freeExtents = column("FREE_EXTENTS", JDBCType.BIGINT);

        public final SqlColumn<Long> totalExtents = column("TOTAL_EXTENTS", JDBCType.BIGINT);

        public final SqlColumn<Long> extentSize = column("EXTENT_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> initialSize = column("INITIAL_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> maximumSize = column("MAXIMUM_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> autoextendSize = column("AUTOEXTEND_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> version = column("VERSION", JDBCType.BIGINT);

        public final SqlColumn<String> rowFormat = column("ROW_FORMAT", JDBCType.VARCHAR);

        public final SqlColumn<Long> dataFree = column("DATA_FREE", JDBCType.BIGINT);

        public final SqlColumn<String> status = column("STATUS", JDBCType.VARCHAR);

        public final SqlColumn<String> fileName = column("FILE_NAME", JDBCType.LONGVARCHAR);

        public final SqlColumn<byte[]> tableSchema = column("TABLE_SCHEMA", JDBCType.BINARY);

        public final SqlColumn<byte[]> tableName = column("TABLE_NAME", JDBCType.BINARY);

        public final SqlColumn<byte[]> fulltextKeys = column("FULLTEXT_KEYS", JDBCType.BINARY);

        public final SqlColumn<byte[]> deletedRows = column("DELETED_ROWS", JDBCType.BINARY);

        public final SqlColumn<byte[]> updateCount = column("UPDATE_COUNT", JDBCType.BINARY);

        public final SqlColumn<byte[]> creationTime = column("CREATION_TIME", JDBCType.BINARY);

        public final SqlColumn<byte[]> lastUpdateTime = column("LAST_UPDATE_TIME", JDBCType.BINARY);

        public final SqlColumn<byte[]> lastAccessTime = column("LAST_ACCESS_TIME", JDBCType.BINARY);

        public final SqlColumn<byte[]> recoverTime = column("RECOVER_TIME", JDBCType.BINARY);

        public final SqlColumn<byte[]> transactionCounter = column("TRANSACTION_COUNTER", JDBCType.BINARY);

        public final SqlColumn<byte[]> tableRows = column("TABLE_ROWS", JDBCType.BINARY);

        public final SqlColumn<byte[]> avgRowLength = column("AVG_ROW_LENGTH", JDBCType.BINARY);

        public final SqlColumn<byte[]> dataLength = column("DATA_LENGTH", JDBCType.BINARY);

        public final SqlColumn<byte[]> maxDataLength = column("MAX_DATA_LENGTH", JDBCType.BINARY);

        public final SqlColumn<byte[]> indexLength = column("INDEX_LENGTH", JDBCType.BINARY);

        public final SqlColumn<byte[]> createTime = column("CREATE_TIME", JDBCType.BINARY);

        public final SqlColumn<byte[]> updateTime = column("UPDATE_TIME", JDBCType.BINARY);

        public final SqlColumn<byte[]> checkTime = column("CHECK_TIME", JDBCType.BINARY);

        public final SqlColumn<byte[]> checksum = column("CHECKSUM", JDBCType.BINARY);

        public final SqlColumn<byte[]> extra = column("EXTRA", JDBCType.BINARY);

        public Files() {
            super("FILES");
        }
    }
}