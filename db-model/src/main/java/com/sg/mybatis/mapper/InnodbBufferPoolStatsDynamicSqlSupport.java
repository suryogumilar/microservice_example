package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbBufferPoolStatsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    public static final InnodbBufferPoolStats innodbBufferPoolStats = new InnodbBufferPoolStats();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_ID")
    public static final SqlColumn<Long> poolId = innodbBufferPoolStats.poolId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_SIZE")
    public static final SqlColumn<Long> poolSize = innodbBufferPoolStats.poolSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.FREE_BUFFERS")
    public static final SqlColumn<Long> freeBuffers = innodbBufferPoolStats.freeBuffers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.DATABASE_PAGES")
    public static final SqlColumn<Long> databasePages = innodbBufferPoolStats.databasePages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES")
    public static final SqlColumn<Long> oldDatabasePages = innodbBufferPoolStats.oldDatabasePages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES")
    public static final SqlColumn<Long> modifiedDatabasePages = innodbBufferPoolStats.modifiedDatabasePages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS")
    public static final SqlColumn<Long> pendingDecompress = innodbBufferPoolStats.pendingDecompress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_READS")
    public static final SqlColumn<Long> pendingReads = innodbBufferPoolStats.pendingReads;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU")
    public static final SqlColumn<Long> pendingFlushLru = innodbBufferPoolStats.pendingFlushLru;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST")
    public static final SqlColumn<Long> pendingFlushList = innodbBufferPoolStats.pendingFlushList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG")
    public static final SqlColumn<Long> pagesMadeYoung = innodbBufferPoolStats.pagesMadeYoung;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG")
    public static final SqlColumn<Long> pagesNotMadeYoung = innodbBufferPoolStats.pagesNotMadeYoung;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE")
    public static final SqlColumn<Float> pagesMadeYoungRate = innodbBufferPoolStats.pagesMadeYoungRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE")
    public static final SqlColumn<Float> pagesMadeNotYoungRate = innodbBufferPoolStats.pagesMadeNotYoungRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ")
    public static final SqlColumn<Long> numberPagesRead = innodbBufferPoolStats.numberPagesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED")
    public static final SqlColumn<Long> numberPagesCreated = innodbBufferPoolStats.numberPagesCreated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN")
    public static final SqlColumn<Long> numberPagesWritten = innodbBufferPoolStats.numberPagesWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE")
    public static final SqlColumn<Float> pagesReadRate = innodbBufferPoolStats.pagesReadRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE")
    public static final SqlColumn<Float> pagesCreateRate = innodbBufferPoolStats.pagesCreateRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE")
    public static final SqlColumn<Float> pagesWrittenRate = innodbBufferPoolStats.pagesWrittenRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET")
    public static final SqlColumn<Long> numberPagesGet = innodbBufferPoolStats.numberPagesGet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.HIT_RATE")
    public static final SqlColumn<Long> hitRate = innodbBufferPoolStats.hitRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS")
    public static final SqlColumn<Long> youngMakePerThousandGets = innodbBufferPoolStats.youngMakePerThousandGets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
    public static final SqlColumn<Long> notYoungMakePerThousandGets = innodbBufferPoolStats.notYoungMakePerThousandGets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD")
    public static final SqlColumn<Long> numberPagesReadAhead = innodbBufferPoolStats.numberPagesReadAhead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED")
    public static final SqlColumn<Long> numberReadAheadEvicted = innodbBufferPoolStats.numberReadAheadEvicted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE")
    public static final SqlColumn<Float> readAheadRate = innodbBufferPoolStats.readAheadRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE")
    public static final SqlColumn<Float> readAheadEvictedRate = innodbBufferPoolStats.readAheadEvictedRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL")
    public static final SqlColumn<Long> lruIoTotal = innodbBufferPoolStats.lruIoTotal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT")
    public static final SqlColumn<Long> lruIoCurrent = innodbBufferPoolStats.lruIoCurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL")
    public static final SqlColumn<Long> uncompressTotal = innodbBufferPoolStats.uncompressTotal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT")
    public static final SqlColumn<Long> uncompressCurrent = innodbBufferPoolStats.uncompressCurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    public static final class InnodbBufferPoolStats extends SqlTable {
        public final SqlColumn<Long> poolId = column("POOL_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> poolSize = column("POOL_SIZE", JDBCType.BIGINT);

        public final SqlColumn<Long> freeBuffers = column("FREE_BUFFERS", JDBCType.BIGINT);

        public final SqlColumn<Long> databasePages = column("DATABASE_PAGES", JDBCType.BIGINT);

        public final SqlColumn<Long> oldDatabasePages = column("OLD_DATABASE_PAGES", JDBCType.BIGINT);

        public final SqlColumn<Long> modifiedDatabasePages = column("MODIFIED_DATABASE_PAGES", JDBCType.BIGINT);

        public final SqlColumn<Long> pendingDecompress = column("PENDING_DECOMPRESS", JDBCType.BIGINT);

        public final SqlColumn<Long> pendingReads = column("PENDING_READS", JDBCType.BIGINT);

        public final SqlColumn<Long> pendingFlushLru = column("PENDING_FLUSH_LRU", JDBCType.BIGINT);

        public final SqlColumn<Long> pendingFlushList = column("PENDING_FLUSH_LIST", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesMadeYoung = column("PAGES_MADE_YOUNG", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesNotMadeYoung = column("PAGES_NOT_MADE_YOUNG", JDBCType.BIGINT);

        public final SqlColumn<Float> pagesMadeYoungRate = column("PAGES_MADE_YOUNG_RATE", JDBCType.REAL);

        public final SqlColumn<Float> pagesMadeNotYoungRate = column("PAGES_MADE_NOT_YOUNG_RATE", JDBCType.REAL);

        public final SqlColumn<Long> numberPagesRead = column("NUMBER_PAGES_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> numberPagesCreated = column("NUMBER_PAGES_CREATED", JDBCType.BIGINT);

        public final SqlColumn<Long> numberPagesWritten = column("NUMBER_PAGES_WRITTEN", JDBCType.BIGINT);

        public final SqlColumn<Float> pagesReadRate = column("PAGES_READ_RATE", JDBCType.REAL);

        public final SqlColumn<Float> pagesCreateRate = column("PAGES_CREATE_RATE", JDBCType.REAL);

        public final SqlColumn<Float> pagesWrittenRate = column("PAGES_WRITTEN_RATE", JDBCType.REAL);

        public final SqlColumn<Long> numberPagesGet = column("NUMBER_PAGES_GET", JDBCType.BIGINT);

        public final SqlColumn<Long> hitRate = column("HIT_RATE", JDBCType.BIGINT);

        public final SqlColumn<Long> youngMakePerThousandGets = column("YOUNG_MAKE_PER_THOUSAND_GETS", JDBCType.BIGINT);

        public final SqlColumn<Long> notYoungMakePerThousandGets = column("NOT_YOUNG_MAKE_PER_THOUSAND_GETS", JDBCType.BIGINT);

        public final SqlColumn<Long> numberPagesReadAhead = column("NUMBER_PAGES_READ_AHEAD", JDBCType.BIGINT);

        public final SqlColumn<Long> numberReadAheadEvicted = column("NUMBER_READ_AHEAD_EVICTED", JDBCType.BIGINT);

        public final SqlColumn<Float> readAheadRate = column("READ_AHEAD_RATE", JDBCType.REAL);

        public final SqlColumn<Float> readAheadEvictedRate = column("READ_AHEAD_EVICTED_RATE", JDBCType.REAL);

        public final SqlColumn<Long> lruIoTotal = column("LRU_IO_TOTAL", JDBCType.BIGINT);

        public final SqlColumn<Long> lruIoCurrent = column("LRU_IO_CURRENT", JDBCType.BIGINT);

        public final SqlColumn<Long> uncompressTotal = column("UNCOMPRESS_TOTAL", JDBCType.BIGINT);

        public final SqlColumn<Long> uncompressCurrent = column("UNCOMPRESS_CURRENT", JDBCType.BIGINT);

        public InnodbBufferPoolStats() {
            super("INNODB_BUFFER_POOL_STATS");
        }
    }
}