package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbBufferPage {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.POOL_ID")
    private Long poolId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.BLOCK_ID")
    private Long blockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.SPACE")
    private Long space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_NUMBER")
    private Long pageNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_TYPE")
    private String pageType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.FLUSH_TYPE")
    private Long flushType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.FIX_COUNT")
    private Long fixCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.IS_HASHED")
    private String isHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.NEWEST_MODIFICATION")
    private Long newestModification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.OLDEST_MODIFICATION")
    private Long oldestModification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.ACCESS_TIME")
    private Long accessTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.INDEX_NAME")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.NUMBER_RECORDS")
    private Long numberRecords;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.DATA_SIZE")
    private Long dataSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.COMPRESSED_SIZE")
    private Long compressedSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_STATE")
    private String pageState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.IO_FIX")
    private String ioFix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.IS_OLD")
    private String isOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK")
    private Long freePageClock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.POOL_ID")
    public Long getPoolId() {
        return poolId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.POOL_ID")
    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.BLOCK_ID")
    public Long getBlockId() {
        return blockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.BLOCK_ID")
    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.SPACE")
    public Long getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.SPACE")
    public void setSpace(Long space) {
        this.space = space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_NUMBER")
    public Long getPageNumber() {
        return pageNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_NUMBER")
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_TYPE")
    public String getPageType() {
        return pageType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_TYPE")
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.FLUSH_TYPE")
    public Long getFlushType() {
        return flushType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.FLUSH_TYPE")
    public void setFlushType(Long flushType) {
        this.flushType = flushType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.FIX_COUNT")
    public Long getFixCount() {
        return fixCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.427+07:00", comments="Source field: INNODB_BUFFER_PAGE.FIX_COUNT")
    public void setFixCount(Long fixCount) {
        this.fixCount = fixCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.IS_HASHED")
    public String getIsHashed() {
        return isHashed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.IS_HASHED")
    public void setIsHashed(String isHashed) {
        this.isHashed = isHashed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.NEWEST_MODIFICATION")
    public Long getNewestModification() {
        return newestModification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.NEWEST_MODIFICATION")
    public void setNewestModification(Long newestModification) {
        this.newestModification = newestModification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.OLDEST_MODIFICATION")
    public Long getOldestModification() {
        return oldestModification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.OLDEST_MODIFICATION")
    public void setOldestModification(Long oldestModification) {
        this.oldestModification = oldestModification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.ACCESS_TIME")
    public Long getAccessTime() {
        return accessTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.ACCESS_TIME")
    public void setAccessTime(Long accessTime) {
        this.accessTime = accessTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.INDEX_NAME")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.INDEX_NAME")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.NUMBER_RECORDS")
    public Long getNumberRecords() {
        return numberRecords;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.NUMBER_RECORDS")
    public void setNumberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.DATA_SIZE")
    public Long getDataSize() {
        return dataSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.DATA_SIZE")
    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.COMPRESSED_SIZE")
    public Long getCompressedSize() {
        return compressedSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.COMPRESSED_SIZE")
    public void setCompressedSize(Long compressedSize) {
        this.compressedSize = compressedSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_STATE")
    public String getPageState() {
        return pageState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_STATE")
    public void setPageState(String pageState) {
        this.pageState = pageState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.IO_FIX")
    public String getIoFix() {
        return ioFix;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.IO_FIX")
    public void setIoFix(String ioFix) {
        this.ioFix = ioFix;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.IS_OLD")
    public String getIsOld() {
        return isOld;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.IS_OLD")
    public void setIsOld(String isOld) {
        this.isOld = isOld;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK")
    public Long getFreePageClock() {
        return freePageClock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.428+07:00", comments="Source field: INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK")
    public void setFreePageClock(Long freePageClock) {
        this.freePageClock = freePageClock;
    }
}