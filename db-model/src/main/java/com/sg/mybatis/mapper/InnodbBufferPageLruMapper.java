package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbBufferPageLruDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbBufferPageLru;
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
public interface InnodbBufferPageLruMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    BasicColumn[] selectList = BasicColumn.columnList(poolId, lruPosition, space, pageNumber, pageType, flushType, fixCount, isHashed, newestModification, oldestModification, accessTime, tableName, indexName, numberRecords, dataSize, compressedSize, compressed, ioFix, isOld, freePageClock);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbBufferPageLru> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbBufferPageLru> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbBufferPageLruResult")
    Optional<InnodbBufferPageLru> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbBufferPageLruResult", value = {
        @Result(column="POOL_ID", property="poolId", jdbcType=JdbcType.BIGINT),
        @Result(column="LRU_POSITION", property="lruPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.BIGINT),
        @Result(column="PAGE_NUMBER", property="pageNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="PAGE_TYPE", property="pageType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLUSH_TYPE", property="flushType", jdbcType=JdbcType.BIGINT),
        @Result(column="FIX_COUNT", property="fixCount", jdbcType=JdbcType.BIGINT),
        @Result(column="IS_HASHED", property="isHashed", jdbcType=JdbcType.VARCHAR),
        @Result(column="NEWEST_MODIFICATION", property="newestModification", jdbcType=JdbcType.BIGINT),
        @Result(column="OLDEST_MODIFICATION", property="oldestModification", jdbcType=JdbcType.BIGINT),
        @Result(column="ACCESS_TIME", property="accessTime", jdbcType=JdbcType.BIGINT),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEX_NAME", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMBER_RECORDS", property="numberRecords", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_SIZE", property="dataSize", jdbcType=JdbcType.BIGINT),
        @Result(column="COMPRESSED_SIZE", property="compressedSize", jdbcType=JdbcType.BIGINT),
        @Result(column="COMPRESSED", property="compressed", jdbcType=JdbcType.VARCHAR),
        @Result(column="IO_FIX", property="ioFix", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_OLD", property="isOld", jdbcType=JdbcType.VARCHAR),
        @Result(column="FREE_PAGE_CLOCK", property="freePageClock", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbBufferPageLru> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbBufferPageLru, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbBufferPageLru, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    default int insert(InnodbBufferPageLru record) {
        return MyBatis3Utils.insert(this::insert, record, innodbBufferPageLru, c ->
            c.map(poolId).toProperty("poolId")
            .map(lruPosition).toProperty("lruPosition")
            .map(space).toProperty("space")
            .map(pageNumber).toProperty("pageNumber")
            .map(pageType).toProperty("pageType")
            .map(flushType).toProperty("flushType")
            .map(fixCount).toProperty("fixCount")
            .map(isHashed).toProperty("isHashed")
            .map(newestModification).toProperty("newestModification")
            .map(oldestModification).toProperty("oldestModification")
            .map(accessTime).toProperty("accessTime")
            .map(tableName).toProperty("tableName")
            .map(indexName).toProperty("indexName")
            .map(numberRecords).toProperty("numberRecords")
            .map(dataSize).toProperty("dataSize")
            .map(compressedSize).toProperty("compressedSize")
            .map(compressed).toProperty("compressed")
            .map(ioFix).toProperty("ioFix")
            .map(isOld).toProperty("isOld")
            .map(freePageClock).toProperty("freePageClock")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    default int insertMultiple(Collection<InnodbBufferPageLru> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbBufferPageLru, c ->
            c.map(poolId).toProperty("poolId")
            .map(lruPosition).toProperty("lruPosition")
            .map(space).toProperty("space")
            .map(pageNumber).toProperty("pageNumber")
            .map(pageType).toProperty("pageType")
            .map(flushType).toProperty("flushType")
            .map(fixCount).toProperty("fixCount")
            .map(isHashed).toProperty("isHashed")
            .map(newestModification).toProperty("newestModification")
            .map(oldestModification).toProperty("oldestModification")
            .map(accessTime).toProperty("accessTime")
            .map(tableName).toProperty("tableName")
            .map(indexName).toProperty("indexName")
            .map(numberRecords).toProperty("numberRecords")
            .map(dataSize).toProperty("dataSize")
            .map(compressedSize).toProperty("compressedSize")
            .map(compressed).toProperty("compressed")
            .map(ioFix).toProperty("ioFix")
            .map(isOld).toProperty("isOld")
            .map(freePageClock).toProperty("freePageClock")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    default int insertSelective(InnodbBufferPageLru record) {
        return MyBatis3Utils.insert(this::insert, record, innodbBufferPageLru, c ->
            c.map(poolId).toPropertyWhenPresent("poolId", record::getPoolId)
            .map(lruPosition).toPropertyWhenPresent("lruPosition", record::getLruPosition)
            .map(space).toPropertyWhenPresent("space", record::getSpace)
            .map(pageNumber).toPropertyWhenPresent("pageNumber", record::getPageNumber)
            .map(pageType).toPropertyWhenPresent("pageType", record::getPageType)
            .map(flushType).toPropertyWhenPresent("flushType", record::getFlushType)
            .map(fixCount).toPropertyWhenPresent("fixCount", record::getFixCount)
            .map(isHashed).toPropertyWhenPresent("isHashed", record::getIsHashed)
            .map(newestModification).toPropertyWhenPresent("newestModification", record::getNewestModification)
            .map(oldestModification).toPropertyWhenPresent("oldestModification", record::getOldestModification)
            .map(accessTime).toPropertyWhenPresent("accessTime", record::getAccessTime)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
            .map(numberRecords).toPropertyWhenPresent("numberRecords", record::getNumberRecords)
            .map(dataSize).toPropertyWhenPresent("dataSize", record::getDataSize)
            .map(compressedSize).toPropertyWhenPresent("compressedSize", record::getCompressedSize)
            .map(compressed).toPropertyWhenPresent("compressed", record::getCompressed)
            .map(ioFix).toPropertyWhenPresent("ioFix", record::getIoFix)
            .map(isOld).toPropertyWhenPresent("isOld", record::getIsOld)
            .map(freePageClock).toPropertyWhenPresent("freePageClock", record::getFreePageClock)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    default Optional<InnodbBufferPageLru> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbBufferPageLru, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    default List<InnodbBufferPageLru> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbBufferPageLru, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.28+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    default List<InnodbBufferPageLru> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbBufferPageLru, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.282+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbBufferPageLru, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.282+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbBufferPageLru record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(poolId).equalTo(record::getPoolId)
                .set(lruPosition).equalTo(record::getLruPosition)
                .set(space).equalTo(record::getSpace)
                .set(pageNumber).equalTo(record::getPageNumber)
                .set(pageType).equalTo(record::getPageType)
                .set(flushType).equalTo(record::getFlushType)
                .set(fixCount).equalTo(record::getFixCount)
                .set(isHashed).equalTo(record::getIsHashed)
                .set(newestModification).equalTo(record::getNewestModification)
                .set(oldestModification).equalTo(record::getOldestModification)
                .set(accessTime).equalTo(record::getAccessTime)
                .set(tableName).equalTo(record::getTableName)
                .set(indexName).equalTo(record::getIndexName)
                .set(numberRecords).equalTo(record::getNumberRecords)
                .set(dataSize).equalTo(record::getDataSize)
                .set(compressedSize).equalTo(record::getCompressedSize)
                .set(compressed).equalTo(record::getCompressed)
                .set(ioFix).equalTo(record::getIoFix)
                .set(isOld).equalTo(record::getIsOld)
                .set(freePageClock).equalTo(record::getFreePageClock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.283+07:00", comments="Source Table: INNODB_BUFFER_PAGE_LRU")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbBufferPageLru record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(poolId).equalToWhenPresent(record::getPoolId)
                .set(lruPosition).equalToWhenPresent(record::getLruPosition)
                .set(space).equalToWhenPresent(record::getSpace)
                .set(pageNumber).equalToWhenPresent(record::getPageNumber)
                .set(pageType).equalToWhenPresent(record::getPageType)
                .set(flushType).equalToWhenPresent(record::getFlushType)
                .set(fixCount).equalToWhenPresent(record::getFixCount)
                .set(isHashed).equalToWhenPresent(record::getIsHashed)
                .set(newestModification).equalToWhenPresent(record::getNewestModification)
                .set(oldestModification).equalToWhenPresent(record::getOldestModification)
                .set(accessTime).equalToWhenPresent(record::getAccessTime)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(indexName).equalToWhenPresent(record::getIndexName)
                .set(numberRecords).equalToWhenPresent(record::getNumberRecords)
                .set(dataSize).equalToWhenPresent(record::getDataSize)
                .set(compressedSize).equalToWhenPresent(record::getCompressedSize)
                .set(compressed).equalToWhenPresent(record::getCompressed)
                .set(ioFix).equalToWhenPresent(record::getIoFix)
                .set(isOld).equalToWhenPresent(record::getIsOld)
                .set(freePageClock).equalToWhenPresent(record::getFreePageClock);
    }
}