package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbBufferPageDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    public static final InnodbBufferPage innodbBufferPage = new InnodbBufferPage();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.POOL_ID")
    public static final SqlColumn<Long> poolId = innodbBufferPage.poolId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.BLOCK_ID")
    public static final SqlColumn<Long> blockId = innodbBufferPage.blockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.SPACE")
    public static final SqlColumn<Long> space = innodbBufferPage.space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_NUMBER")
    public static final SqlColumn<Long> pageNumber = innodbBufferPage.pageNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_TYPE")
    public static final SqlColumn<String> pageType = innodbBufferPage.pageType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.FLUSH_TYPE")
    public static final SqlColumn<Long> flushType = innodbBufferPage.flushType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.FIX_COUNT")
    public static final SqlColumn<Long> fixCount = innodbBufferPage.fixCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.IS_HASHED")
    public static final SqlColumn<String> isHashed = innodbBufferPage.isHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.NEWEST_MODIFICATION")
    public static final SqlColumn<Long> newestModification = innodbBufferPage.newestModification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.OLDEST_MODIFICATION")
    public static final SqlColumn<Long> oldestModification = innodbBufferPage.oldestModification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.ACCESS_TIME")
    public static final SqlColumn<Long> accessTime = innodbBufferPage.accessTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.429+07:00", comments="Source field: INNODB_BUFFER_PAGE.TABLE_NAME")
    public static final SqlColumn<String> tableName = innodbBufferPage.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.43+07:00", comments="Source field: INNODB_BUFFER_PAGE.INDEX_NAME")
    public static final SqlColumn<String> indexName = innodbBufferPage.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.43+07:00", comments="Source field: INNODB_BUFFER_PAGE.NUMBER_RECORDS")
    public static final SqlColumn<Long> numberRecords = innodbBufferPage.numberRecords;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.43+07:00", comments="Source field: INNODB_BUFFER_PAGE.DATA_SIZE")
    public static final SqlColumn<Long> dataSize = innodbBufferPage.dataSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.43+07:00", comments="Source field: INNODB_BUFFER_PAGE.COMPRESSED_SIZE")
    public static final SqlColumn<Long> compressedSize = innodbBufferPage.compressedSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.43+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_STATE")
    public static final SqlColumn<String> pageState = innodbBufferPage.pageState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.43+07:00", comments="Source field: INNODB_BUFFER_PAGE.IO_FIX")
    public static final SqlColumn<String> ioFix = innodbBufferPage.ioFix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.431+07:00", comments="Source field: INNODB_BUFFER_PAGE.IS_OLD")
    public static final SqlColumn<String> isOld = innodbBufferPage.isOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.431+07:00", comments="Source field: INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK")
    public static final SqlColumn<Long> freePageClock = innodbBufferPage.freePageClock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    public static final class InnodbBufferPage extends SqlTable {
        public final SqlColumn<Long> poolId = column("POOL_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> blockId = column("BLOCK_ID", JDBCType.BIGINT);

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

        public final SqlColumn<String> pageState = column("PAGE_STATE", JDBCType.VARCHAR);

        public final SqlColumn<String> ioFix = column("IO_FIX", JDBCType.VARCHAR);

        public final SqlColumn<String> isOld = column("IS_OLD", JDBCType.VARCHAR);

        public final SqlColumn<Long> freePageClock = column("FREE_PAGE_CLOCK", JDBCType.BIGINT);

        public InnodbBufferPage() {
            super("INNODB_BUFFER_PAGE");
        }
    }
}