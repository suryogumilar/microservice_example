package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbBufferPoolStatsDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbBufferPoolStats;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface InnodbBufferPoolStatsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    BasicColumn[] selectList = BasicColumn.columnList(poolId, poolSize, freeBuffers, databasePages, oldDatabasePages, modifiedDatabasePages, pendingDecompress, pendingReads, pendingFlushLru, pendingFlushList, pagesMadeYoung, pagesNotMadeYoung, pagesMadeYoungRate, pagesMadeNotYoungRate, numberPagesRead, numberPagesCreated, numberPagesWritten, pagesReadRate, pagesCreateRate, pagesWrittenRate, numberPagesGet, hitRate, youngMakePerThousandGets, notYoungMakePerThousandGets, numberPagesReadAhead, numberReadAheadEvicted, readAheadRate, readAheadEvictedRate, lruIoTotal, lruIoCurrent, uncompressTotal, uncompressCurrent);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbBufferPoolStats> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.452+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbBufferPoolStats> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbBufferPoolStatsResult")
    Optional<InnodbBufferPoolStats> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbBufferPoolStatsResult", value = {
        @Result(column="POOL_ID", property="poolId", jdbcType=JdbcType.BIGINT),
        @Result(column="POOL_SIZE", property="poolSize", jdbcType=JdbcType.BIGINT),
        @Result(column="FREE_BUFFERS", property="freeBuffers", jdbcType=JdbcType.BIGINT),
        @Result(column="DATABASE_PAGES", property="databasePages", jdbcType=JdbcType.BIGINT),
        @Result(column="OLD_DATABASE_PAGES", property="oldDatabasePages", jdbcType=JdbcType.BIGINT),
        @Result(column="MODIFIED_DATABASE_PAGES", property="modifiedDatabasePages", jdbcType=JdbcType.BIGINT),
        @Result(column="PENDING_DECOMPRESS", property="pendingDecompress", jdbcType=JdbcType.BIGINT),
        @Result(column="PENDING_READS", property="pendingReads", jdbcType=JdbcType.BIGINT),
        @Result(column="PENDING_FLUSH_LRU", property="pendingFlushLru", jdbcType=JdbcType.BIGINT),
        @Result(column="PENDING_FLUSH_LIST", property="pendingFlushList", jdbcType=JdbcType.BIGINT),
        @Result(column="PAGES_MADE_YOUNG", property="pagesMadeYoung", jdbcType=JdbcType.BIGINT),
        @Result(column="PAGES_NOT_MADE_YOUNG", property="pagesNotMadeYoung", jdbcType=JdbcType.BIGINT),
        @Result(column="PAGES_MADE_YOUNG_RATE", property="pagesMadeYoungRate", jdbcType=JdbcType.REAL),
        @Result(column="PAGES_MADE_NOT_YOUNG_RATE", property="pagesMadeNotYoungRate", jdbcType=JdbcType.REAL),
        @Result(column="NUMBER_PAGES_READ", property="numberPagesRead", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMBER_PAGES_CREATED", property="numberPagesCreated", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMBER_PAGES_WRITTEN", property="numberPagesWritten", jdbcType=JdbcType.BIGINT),
        @Result(column="PAGES_READ_RATE", property="pagesReadRate", jdbcType=JdbcType.REAL),
        @Result(column="PAGES_CREATE_RATE", property="pagesCreateRate", jdbcType=JdbcType.REAL),
        @Result(column="PAGES_WRITTEN_RATE", property="pagesWrittenRate", jdbcType=JdbcType.REAL),
        @Result(column="NUMBER_PAGES_GET", property="numberPagesGet", jdbcType=JdbcType.BIGINT),
        @Result(column="HIT_RATE", property="hitRate", jdbcType=JdbcType.BIGINT),
        @Result(column="YOUNG_MAKE_PER_THOUSAND_GETS", property="youngMakePerThousandGets", jdbcType=JdbcType.BIGINT),
        @Result(column="NOT_YOUNG_MAKE_PER_THOUSAND_GETS", property="notYoungMakePerThousandGets", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMBER_PAGES_READ_AHEAD", property="numberPagesReadAhead", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMBER_READ_AHEAD_EVICTED", property="numberReadAheadEvicted", jdbcType=JdbcType.BIGINT),
        @Result(column="READ_AHEAD_RATE", property="readAheadRate", jdbcType=JdbcType.REAL),
        @Result(column="READ_AHEAD_EVICTED_RATE", property="readAheadEvictedRate", jdbcType=JdbcType.REAL),
        @Result(column="LRU_IO_TOTAL", property="lruIoTotal", jdbcType=JdbcType.BIGINT),
        @Result(column="LRU_IO_CURRENT", property="lruIoCurrent", jdbcType=JdbcType.BIGINT),
        @Result(column="UNCOMPRESS_TOTAL", property="uncompressTotal", jdbcType=JdbcType.BIGINT),
        @Result(column="UNCOMPRESS_CURRENT", property="uncompressCurrent", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbBufferPoolStats> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbBufferPoolStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbBufferPoolStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    default int insert(InnodbBufferPoolStats record) {
        return MyBatis3Utils.insert(this::insert, record, innodbBufferPoolStats, c ->
            c.map(poolId).toProperty("poolId")
            .map(poolSize).toProperty("poolSize")
            .map(freeBuffers).toProperty("freeBuffers")
            .map(databasePages).toProperty("databasePages")
            .map(oldDatabasePages).toProperty("oldDatabasePages")
            .map(modifiedDatabasePages).toProperty("modifiedDatabasePages")
            .map(pendingDecompress).toProperty("pendingDecompress")
            .map(pendingReads).toProperty("pendingReads")
            .map(pendingFlushLru).toProperty("pendingFlushLru")
            .map(pendingFlushList).toProperty("pendingFlushList")
            .map(pagesMadeYoung).toProperty("pagesMadeYoung")
            .map(pagesNotMadeYoung).toProperty("pagesNotMadeYoung")
            .map(pagesMadeYoungRate).toProperty("pagesMadeYoungRate")
            .map(pagesMadeNotYoungRate).toProperty("pagesMadeNotYoungRate")
            .map(numberPagesRead).toProperty("numberPagesRead")
            .map(numberPagesCreated).toProperty("numberPagesCreated")
            .map(numberPagesWritten).toProperty("numberPagesWritten")
            .map(pagesReadRate).toProperty("pagesReadRate")
            .map(pagesCreateRate).toProperty("pagesCreateRate")
            .map(pagesWrittenRate).toProperty("pagesWrittenRate")
            .map(numberPagesGet).toProperty("numberPagesGet")
            .map(hitRate).toProperty("hitRate")
            .map(youngMakePerThousandGets).toProperty("youngMakePerThousandGets")
            .map(notYoungMakePerThousandGets).toProperty("notYoungMakePerThousandGets")
            .map(numberPagesReadAhead).toProperty("numberPagesReadAhead")
            .map(numberReadAheadEvicted).toProperty("numberReadAheadEvicted")
            .map(readAheadRate).toProperty("readAheadRate")
            .map(readAheadEvictedRate).toProperty("readAheadEvictedRate")
            .map(lruIoTotal).toProperty("lruIoTotal")
            .map(lruIoCurrent).toProperty("lruIoCurrent")
            .map(uncompressTotal).toProperty("uncompressTotal")
            .map(uncompressCurrent).toProperty("uncompressCurrent")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    default int insertMultiple(Collection<InnodbBufferPoolStats> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbBufferPoolStats, c ->
            c.map(poolId).toProperty("poolId")
            .map(poolSize).toProperty("poolSize")
            .map(freeBuffers).toProperty("freeBuffers")
            .map(databasePages).toProperty("databasePages")
            .map(oldDatabasePages).toProperty("oldDatabasePages")
            .map(modifiedDatabasePages).toProperty("modifiedDatabasePages")
            .map(pendingDecompress).toProperty("pendingDecompress")
            .map(pendingReads).toProperty("pendingReads")
            .map(pendingFlushLru).toProperty("pendingFlushLru")
            .map(pendingFlushList).toProperty("pendingFlushList")
            .map(pagesMadeYoung).toProperty("pagesMadeYoung")
            .map(pagesNotMadeYoung).toProperty("pagesNotMadeYoung")
            .map(pagesMadeYoungRate).toProperty("pagesMadeYoungRate")
            .map(pagesMadeNotYoungRate).toProperty("pagesMadeNotYoungRate")
            .map(numberPagesRead).toProperty("numberPagesRead")
            .map(numberPagesCreated).toProperty("numberPagesCreated")
            .map(numberPagesWritten).toProperty("numberPagesWritten")
            .map(pagesReadRate).toProperty("pagesReadRate")
            .map(pagesCreateRate).toProperty("pagesCreateRate")
            .map(pagesWrittenRate).toProperty("pagesWrittenRate")
            .map(numberPagesGet).toProperty("numberPagesGet")
            .map(hitRate).toProperty("hitRate")
            .map(youngMakePerThousandGets).toProperty("youngMakePerThousandGets")
            .map(notYoungMakePerThousandGets).toProperty("notYoungMakePerThousandGets")
            .map(numberPagesReadAhead).toProperty("numberPagesReadAhead")
            .map(numberReadAheadEvicted).toProperty("numberReadAheadEvicted")
            .map(readAheadRate).toProperty("readAheadRate")
            .map(readAheadEvictedRate).toProperty("readAheadEvictedRate")
            .map(lruIoTotal).toProperty("lruIoTotal")
            .map(lruIoCurrent).toProperty("lruIoCurrent")
            .map(uncompressTotal).toProperty("uncompressTotal")
            .map(uncompressCurrent).toProperty("uncompressCurrent")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    default int insertSelective(InnodbBufferPoolStats record) {
        return MyBatis3Utils.insert(this::insert, record, innodbBufferPoolStats, c ->
            c.map(poolId).toPropertyWhenPresent("poolId", record::getPoolId)
            .map(poolSize).toPropertyWhenPresent("poolSize", record::getPoolSize)
            .map(freeBuffers).toPropertyWhenPresent("freeBuffers", record::getFreeBuffers)
            .map(databasePages).toPropertyWhenPresent("databasePages", record::getDatabasePages)
            .map(oldDatabasePages).toPropertyWhenPresent("oldDatabasePages", record::getOldDatabasePages)
            .map(modifiedDatabasePages).toPropertyWhenPresent("modifiedDatabasePages", record::getModifiedDatabasePages)
            .map(pendingDecompress).toPropertyWhenPresent("pendingDecompress", record::getPendingDecompress)
            .map(pendingReads).toPropertyWhenPresent("pendingReads", record::getPendingReads)
            .map(pendingFlushLru).toPropertyWhenPresent("pendingFlushLru", record::getPendingFlushLru)
            .map(pendingFlushList).toPropertyWhenPresent("pendingFlushList", record::getPendingFlushList)
            .map(pagesMadeYoung).toPropertyWhenPresent("pagesMadeYoung", record::getPagesMadeYoung)
            .map(pagesNotMadeYoung).toPropertyWhenPresent("pagesNotMadeYoung", record::getPagesNotMadeYoung)
            .map(pagesMadeYoungRate).toPropertyWhenPresent("pagesMadeYoungRate", record::getPagesMadeYoungRate)
            .map(pagesMadeNotYoungRate).toPropertyWhenPresent("pagesMadeNotYoungRate", record::getPagesMadeNotYoungRate)
            .map(numberPagesRead).toPropertyWhenPresent("numberPagesRead", record::getNumberPagesRead)
            .map(numberPagesCreated).toPropertyWhenPresent("numberPagesCreated", record::getNumberPagesCreated)
            .map(numberPagesWritten).toPropertyWhenPresent("numberPagesWritten", record::getNumberPagesWritten)
            .map(pagesReadRate).toPropertyWhenPresent("pagesReadRate", record::getPagesReadRate)
            .map(pagesCreateRate).toPropertyWhenPresent("pagesCreateRate", record::getPagesCreateRate)
            .map(pagesWrittenRate).toPropertyWhenPresent("pagesWrittenRate", record::getPagesWrittenRate)
            .map(numberPagesGet).toPropertyWhenPresent("numberPagesGet", record::getNumberPagesGet)
            .map(hitRate).toPropertyWhenPresent("hitRate", record::getHitRate)
            .map(youngMakePerThousandGets).toPropertyWhenPresent("youngMakePerThousandGets", record::getYoungMakePerThousandGets)
            .map(notYoungMakePerThousandGets).toPropertyWhenPresent("notYoungMakePerThousandGets", record::getNotYoungMakePerThousandGets)
            .map(numberPagesReadAhead).toPropertyWhenPresent("numberPagesReadAhead", record::getNumberPagesReadAhead)
            .map(numberReadAheadEvicted).toPropertyWhenPresent("numberReadAheadEvicted", record::getNumberReadAheadEvicted)
            .map(readAheadRate).toPropertyWhenPresent("readAheadRate", record::getReadAheadRate)
            .map(readAheadEvictedRate).toPropertyWhenPresent("readAheadEvictedRate", record::getReadAheadEvictedRate)
            .map(lruIoTotal).toPropertyWhenPresent("lruIoTotal", record::getLruIoTotal)
            .map(lruIoCurrent).toPropertyWhenPresent("lruIoCurrent", record::getLruIoCurrent)
            .map(uncompressTotal).toPropertyWhenPresent("uncompressTotal", record::getUncompressTotal)
            .map(uncompressCurrent).toPropertyWhenPresent("uncompressCurrent", record::getUncompressCurrent)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    default Optional<InnodbBufferPoolStats> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbBufferPoolStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    default List<InnodbBufferPoolStats> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbBufferPoolStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.453+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    default List<InnodbBufferPoolStats> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbBufferPoolStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.454+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbBufferPoolStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.454+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbBufferPoolStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(poolId).equalTo(record::getPoolId)
                .set(poolSize).equalTo(record::getPoolSize)
                .set(freeBuffers).equalTo(record::getFreeBuffers)
                .set(databasePages).equalTo(record::getDatabasePages)
                .set(oldDatabasePages).equalTo(record::getOldDatabasePages)
                .set(modifiedDatabasePages).equalTo(record::getModifiedDatabasePages)
                .set(pendingDecompress).equalTo(record::getPendingDecompress)
                .set(pendingReads).equalTo(record::getPendingReads)
                .set(pendingFlushLru).equalTo(record::getPendingFlushLru)
                .set(pendingFlushList).equalTo(record::getPendingFlushList)
                .set(pagesMadeYoung).equalTo(record::getPagesMadeYoung)
                .set(pagesNotMadeYoung).equalTo(record::getPagesNotMadeYoung)
                .set(pagesMadeYoungRate).equalTo(record::getPagesMadeYoungRate)
                .set(pagesMadeNotYoungRate).equalTo(record::getPagesMadeNotYoungRate)
                .set(numberPagesRead).equalTo(record::getNumberPagesRead)
                .set(numberPagesCreated).equalTo(record::getNumberPagesCreated)
                .set(numberPagesWritten).equalTo(record::getNumberPagesWritten)
                .set(pagesReadRate).equalTo(record::getPagesReadRate)
                .set(pagesCreateRate).equalTo(record::getPagesCreateRate)
                .set(pagesWrittenRate).equalTo(record::getPagesWrittenRate)
                .set(numberPagesGet).equalTo(record::getNumberPagesGet)
                .set(hitRate).equalTo(record::getHitRate)
                .set(youngMakePerThousandGets).equalTo(record::getYoungMakePerThousandGets)
                .set(notYoungMakePerThousandGets).equalTo(record::getNotYoungMakePerThousandGets)
                .set(numberPagesReadAhead).equalTo(record::getNumberPagesReadAhead)
                .set(numberReadAheadEvicted).equalTo(record::getNumberReadAheadEvicted)
                .set(readAheadRate).equalTo(record::getReadAheadRate)
                .set(readAheadEvictedRate).equalTo(record::getReadAheadEvictedRate)
                .set(lruIoTotal).equalTo(record::getLruIoTotal)
                .set(lruIoCurrent).equalTo(record::getLruIoCurrent)
                .set(uncompressTotal).equalTo(record::getUncompressTotal)
                .set(uncompressCurrent).equalTo(record::getUncompressCurrent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.454+07:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbBufferPoolStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(poolId).equalToWhenPresent(record::getPoolId)
                .set(poolSize).equalToWhenPresent(record::getPoolSize)
                .set(freeBuffers).equalToWhenPresent(record::getFreeBuffers)
                .set(databasePages).equalToWhenPresent(record::getDatabasePages)
                .set(oldDatabasePages).equalToWhenPresent(record::getOldDatabasePages)
                .set(modifiedDatabasePages).equalToWhenPresent(record::getModifiedDatabasePages)
                .set(pendingDecompress).equalToWhenPresent(record::getPendingDecompress)
                .set(pendingReads).equalToWhenPresent(record::getPendingReads)
                .set(pendingFlushLru).equalToWhenPresent(record::getPendingFlushLru)
                .set(pendingFlushList).equalToWhenPresent(record::getPendingFlushList)
                .set(pagesMadeYoung).equalToWhenPresent(record::getPagesMadeYoung)
                .set(pagesNotMadeYoung).equalToWhenPresent(record::getPagesNotMadeYoung)
                .set(pagesMadeYoungRate).equalToWhenPresent(record::getPagesMadeYoungRate)
                .set(pagesMadeNotYoungRate).equalToWhenPresent(record::getPagesMadeNotYoungRate)
                .set(numberPagesRead).equalToWhenPresent(record::getNumberPagesRead)
                .set(numberPagesCreated).equalToWhenPresent(record::getNumberPagesCreated)
                .set(numberPagesWritten).equalToWhenPresent(record::getNumberPagesWritten)
                .set(pagesReadRate).equalToWhenPresent(record::getPagesReadRate)
                .set(pagesCreateRate).equalToWhenPresent(record::getPagesCreateRate)
                .set(pagesWrittenRate).equalToWhenPresent(record::getPagesWrittenRate)
                .set(numberPagesGet).equalToWhenPresent(record::getNumberPagesGet)
                .set(hitRate).equalToWhenPresent(record::getHitRate)
                .set(youngMakePerThousandGets).equalToWhenPresent(record::getYoungMakePerThousandGets)
                .set(notYoungMakePerThousandGets).equalToWhenPresent(record::getNotYoungMakePerThousandGets)
                .set(numberPagesReadAhead).equalToWhenPresent(record::getNumberPagesReadAhead)
                .set(numberReadAheadEvicted).equalToWhenPresent(record::getNumberReadAheadEvicted)
                .set(readAheadRate).equalToWhenPresent(record::getReadAheadRate)
                .set(readAheadEvictedRate).equalToWhenPresent(record::getReadAheadEvictedRate)
                .set(lruIoTotal).equalToWhenPresent(record::getLruIoTotal)
                .set(lruIoCurrent).equalToWhenPresent(record::getLruIoCurrent)
                .set(uncompressTotal).equalToWhenPresent(record::getUncompressTotal)
                .set(uncompressCurrent).equalToWhenPresent(record::getUncompressCurrent);
    }
}