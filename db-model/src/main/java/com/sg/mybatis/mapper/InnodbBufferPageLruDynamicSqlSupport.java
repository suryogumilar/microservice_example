package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbBufferPageLruDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.278+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    public static final InnodbBufferPageLru innodbBufferPageLru = new InnodbBufferPageLru();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.278+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.POOL_ID")
    public static final SqlColumn<Long> poolId = innodbBufferPageLru.poolId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.278+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.LRU_POSITION")
    public static final SqlColumn<Long> lruPosition = innodbBufferPageLru.lruPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.278+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.SPACE")
    public static final SqlColumn<Long> space = innodbBufferPageLru.space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER")
    public static final SqlColumn<Long> pageNumber = innodbBufferPageLru.pageNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.PAGE_TYPE")
    public static final SqlColumn<String> pageType = innodbBufferPageLru.pageType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE")
    public static final SqlColumn<Long> flushType = innodbBufferPageLru.flushType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.FIX_COUNT")
    public static final SqlColumn<Long> fixCount = innodbBufferPageLru.fixCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.IS_HASHED")
    public static final SqlColumn<String> isHashed = innodbBufferPageLru.isHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION")
    public static final SqlColumn<Long> newestModification = innodbBufferPageLru.newestModification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION")
    public static final SqlColumn<Long> oldestModification = innodbBufferPageLru.oldestModification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.ACCESS_TIME")
    public static final SqlColumn<Long> accessTime = innodbBufferPageLru.accessTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.TABLE_NAME")
    public static final SqlColumn<String> tableName = innodbBufferPageLru.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.INDEX_NAME")
    public static final SqlColumn<String> indexName = innodbBufferPageLru.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS")
    public static final SqlColumn<Long> numberRecords = innodbBufferPageLru.numberRecords;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.DATA_SIZE")
    public static final SqlColumn<Long> dataSize = innodbBufferPageLru.dataSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE")
    public static final SqlColumn<Long> compressedSize = innodbBufferPageLru.compressedSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.COMPRESSED")
    public static final SqlColumn<String> compressed = innodbBufferPageLru.compressed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.IO_FIX")
    public static final SqlColumn<String> ioFix = innodbBufferPageLru.ioFix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.IS_OLD")
    public static final SqlColumn<String> isOld = innodbBufferPageLru.isOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.279+07:00", comments="Source field: INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK")
    public static final SqlColumn<Long> freePageClock = innodbBufferPageLru.freePageClock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.278+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    public static final class InnodbBufferPageLru extends SqlTable {
        public final SqlColumn<Long> poolId = column("POOL_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> lruPosition = column("LRU_POSITION", JDBCType.BIGINT);

        public final SqlColumn<Long> space = column("SPACE", JDBCType.BIGINT);

        public final SqlColumn<Long> pageNumber = column("PAGE_NUMBER", JDBCType.BIGINT);

        public final SqlColumn<String> pageType = column("PAGE_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<Long> flushType = column("FLUSH_TYPE", JDBCType.BIGINT);

        public final SqlColumn<Long> fixCount = column("FIX_COUNT", JDBCType.BIGINT);

        public final SqlColumn<String> isHashed = column("IS_HASHED", JDBCType.VARCHAR);

        public final SqlColumn<Long> newestModification = column("NEWEST_MODIFICATION", JDBCType.BIGINT);

        public final SqlColumn<Long> oldestModification = column("OLDEST_MODIFICATION", JDBCType.BIGINT);

        public final SqlColumn<Long> accessTime = column("ACCESS_TIME", JDBCType.BIGINT);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("INDEX_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> numberRecords = column("NUMBER_RECORDS", JDBCType.BIGINT);

        public final SqlColumn<Long> dataSize = column("DATA_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> compressedSize = column("COMPRESSED_SIZE", JDBCType.BIGINT);

        public final SqlColumn<String> compressed = column("COMPRESSED", JDBCType.VARCHAR);

        public final SqlColumn<String> ioFix = column("IO_FIX", JDBCType.VARCHAR);

        public final SqlColumn<String> isOld = column("IS_OLD", JDBCType.VARCHAR);

        public final SqlColumn<Long> freePageClock = column("FREE_PAGE_CLOCK", JDBCType.BIGINT);

        public InnodbBufferPageLru() {
            super("INNODB_BUFFER_PAGE_LRU");
        }
    }
}