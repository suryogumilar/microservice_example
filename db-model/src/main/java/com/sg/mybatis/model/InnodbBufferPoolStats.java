package com.sg.mybatis.model;

import javax.annotation.Generated;

public class InnodbBufferPoolStats {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_ID")
    private Long poolId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_SIZE")
    private Long poolSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.FREE_BUFFERS")
    private Long freeBuffers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.DATABASE_PAGES")
    private Long databasePages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES")
    private Long oldDatabasePages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES")
    private Long modifiedDatabasePages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS")
    private Long pendingDecompress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_READS")
    private Long pendingReads;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU")
    private Long pendingFlushLru;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST")
    private Long pendingFlushList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG")
    private Long pagesMadeYoung;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG")
    private Long pagesNotMadeYoung;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE")
    private Float pagesMadeYoungRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE")
    private Float pagesMadeNotYoungRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ")
    private Long numberPagesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED")
    private Long numberPagesCreated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN")
    private Long numberPagesWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE")
    private Float pagesReadRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE")
    private Float pagesCreateRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE")
    private Float pagesWrittenRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET")
    private Long numberPagesGet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.HIT_RATE")
    private Long hitRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS")
    private Long youngMakePerThousandGets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
    private Long notYoungMakePerThousandGets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD")
    private Long numberPagesReadAhead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED")
    private Long numberReadAheadEvicted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE")
    private Float readAheadRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE")
    private Float readAheadEvictedRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL")
    private Long lruIoTotal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT")
    private Long lruIoCurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL")
    private Long uncompressTotal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT")
    private Long uncompressCurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_ID")
    public Long getPoolId() {
        return poolId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_ID")
    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_SIZE")
    public Long getPoolSize() {
        return poolSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_SIZE")
    public void setPoolSize(Long poolSize) {
        this.poolSize = poolSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.FREE_BUFFERS")
    public Long getFreeBuffers() {
        return freeBuffers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.FREE_BUFFERS")
    public void setFreeBuffers(Long freeBuffers) {
        this.freeBuffers = freeBuffers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.DATABASE_PAGES")
    public Long getDatabasePages() {
        return databasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.DATABASE_PAGES")
    public void setDatabasePages(Long databasePages) {
        this.databasePages = databasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES")
    public Long getOldDatabasePages() {
        return oldDatabasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES")
    public void setOldDatabasePages(Long oldDatabasePages) {
        this.oldDatabasePages = oldDatabasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES")
    public Long getModifiedDatabasePages() {
        return modifiedDatabasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES")
    public void setModifiedDatabasePages(Long modifiedDatabasePages) {
        this.modifiedDatabasePages = modifiedDatabasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS")
    public Long getPendingDecompress() {
        return pendingDecompress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS")
    public void setPendingDecompress(Long pendingDecompress) {
        this.pendingDecompress = pendingDecompress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.449+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_READS")
    public Long getPendingReads() {
        return pendingReads;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_READS")
    public void setPendingReads(Long pendingReads) {
        this.pendingReads = pendingReads;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU")
    public Long getPendingFlushLru() {
        return pendingFlushLru;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU")
    public void setPendingFlushLru(Long pendingFlushLru) {
        this.pendingFlushLru = pendingFlushLru;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST")
    public Long getPendingFlushList() {
        return pendingFlushList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST")
    public void setPendingFlushList(Long pendingFlushList) {
        this.pendingFlushList = pendingFlushList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG")
    public Long getPagesMadeYoung() {
        return pagesMadeYoung;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG")
    public void setPagesMadeYoung(Long pagesMadeYoung) {
        this.pagesMadeYoung = pagesMadeYoung;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG")
    public Long getPagesNotMadeYoung() {
        return pagesNotMadeYoung;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG")
    public void setPagesNotMadeYoung(Long pagesNotMadeYoung) {
        this.pagesNotMadeYoung = pagesNotMadeYoung;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE")
    public Float getPagesMadeYoungRate() {
        return pagesMadeYoungRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE")
    public void setPagesMadeYoungRate(Float pagesMadeYoungRate) {
        this.pagesMadeYoungRate = pagesMadeYoungRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE")
    public Float getPagesMadeNotYoungRate() {
        return pagesMadeNotYoungRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE")
    public void setPagesMadeNotYoungRate(Float pagesMadeNotYoungRate) {
        this.pagesMadeNotYoungRate = pagesMadeNotYoungRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ")
    public Long getNumberPagesRead() {
        return numberPagesRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ")
    public void setNumberPagesRead(Long numberPagesRead) {
        this.numberPagesRead = numberPagesRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED")
    public Long getNumberPagesCreated() {
        return numberPagesCreated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED")
    public void setNumberPagesCreated(Long numberPagesCreated) {
        this.numberPagesCreated = numberPagesCreated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN")
    public Long getNumberPagesWritten() {
        return numberPagesWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN")
    public void setNumberPagesWritten(Long numberPagesWritten) {
        this.numberPagesWritten = numberPagesWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE")
    public Float getPagesReadRate() {
        return pagesReadRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE")
    public void setPagesReadRate(Float pagesReadRate) {
        this.pagesReadRate = pagesReadRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE")
    public Float getPagesCreateRate() {
        return pagesCreateRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE")
    public void setPagesCreateRate(Float pagesCreateRate) {
        this.pagesCreateRate = pagesCreateRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE")
    public Float getPagesWrittenRate() {
        return pagesWrittenRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE")
    public void setPagesWrittenRate(Float pagesWrittenRate) {
        this.pagesWrittenRate = pagesWrittenRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET")
    public Long getNumberPagesGet() {
        return numberPagesGet;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET")
    public void setNumberPagesGet(Long numberPagesGet) {
        this.numberPagesGet = numberPagesGet;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.HIT_RATE")
    public Long getHitRate() {
        return hitRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.HIT_RATE")
    public void setHitRate(Long hitRate) {
        this.hitRate = hitRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS")
    public Long getYoungMakePerThousandGets() {
        return youngMakePerThousandGets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS")
    public void setYoungMakePerThousandGets(Long youngMakePerThousandGets) {
        this.youngMakePerThousandGets = youngMakePerThousandGets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
    public Long getNotYoungMakePerThousandGets() {
        return notYoungMakePerThousandGets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
    public void setNotYoungMakePerThousandGets(Long notYoungMakePerThousandGets) {
        this.notYoungMakePerThousandGets = notYoungMakePerThousandGets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD")
    public Long getNumberPagesReadAhead() {
        return numberPagesReadAhead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD")
    public void setNumberPagesReadAhead(Long numberPagesReadAhead) {
        this.numberPagesReadAhead = numberPagesReadAhead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED")
    public Long getNumberReadAheadEvicted() {
        return numberReadAheadEvicted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED")
    public void setNumberReadAheadEvicted(Long numberReadAheadEvicted) {
        this.numberReadAheadEvicted = numberReadAheadEvicted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE")
    public Float getReadAheadRate() {
        return readAheadRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE")
    public void setReadAheadRate(Float readAheadRate) {
        this.readAheadRate = readAheadRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE")
    public Float getReadAheadEvictedRate() {
        return readAheadEvictedRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE")
    public void setReadAheadEvictedRate(Float readAheadEvictedRate) {
        this.readAheadEvictedRate = readAheadEvictedRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL")
    public Long getLruIoTotal() {
        return lruIoTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.45+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL")
    public void setLruIoTotal(Long lruIoTotal) {
        this.lruIoTotal = lruIoTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT")
    public Long getLruIoCurrent() {
        return lruIoCurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT")
    public void setLruIoCurrent(Long lruIoCurrent) {
        this.lruIoCurrent = lruIoCurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL")
    public Long getUncompressTotal() {
        return uncompressTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL")
    public void setUncompressTotal(Long uncompressTotal) {
        this.uncompressTotal = uncompressTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT")
    public Long getUncompressCurrent() {
        return uncompressCurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.451+07:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT")
    public void setUncompressCurrent(Long uncompressCurrent) {
        this.uncompressCurrent = uncompressCurrent;
    }
}