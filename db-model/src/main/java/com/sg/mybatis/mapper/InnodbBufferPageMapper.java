package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbBufferPageDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbBufferPage;
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
public interface InnodbBufferPageMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.432+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    BasicColumn[] selectList = BasicColumn.columnList(poolId, blockId, space, pageNumber, pageType, flushType, fixCount, isHashed, newestModification, oldestModification, accessTime, tableName, indexName, numberRecords, dataSize, compressedSize, pageState, ioFix, isOld, freePageClock);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.431+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.431+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.431+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbBufferPage> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.431+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbBufferPage> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.431+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbBufferPageResult")
    Optional<InnodbBufferPage> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.432+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbBufferPageResult", value = {
        @Result(column="POOL_ID", property="poolId", jdbcType=JdbcType.BIGINT),
        @Result(column="BLOCK_ID", property="blockId", jdbcType=JdbcType.BIGINT),
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
        @Result(column="PAGE_STATE", property="pageState", jdbcType=JdbcType.VARCHAR),
        @Result(column="IO_FIX", property="ioFix", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_OLD", property="isOld", jdbcType=JdbcType.VARCHAR),
        @Result(column="FREE_PAGE_CLOCK", property="freePageClock", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbBufferPage> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.432+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.432+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbBufferPage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.432+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbBufferPage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.432+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    default int insert(InnodbBufferPage record) {
        return MyBatis3Utils.insert(this::insert, record, innodbBufferPage, c ->
            c.map(poolId).toProperty("poolId")
            .map(blockId).toProperty("blockId")
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
            .map(pageState).toProperty("pageState")
            .map(ioFix).toProperty("ioFix")
            .map(isOld).toProperty("isOld")
            .map(freePageClock).toProperty("freePageClock")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.432+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    default int insertMultiple(Collection<InnodbBufferPage> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbBufferPage, c ->
            c.map(poolId).toProperty("poolId")
            .map(blockId).toProperty("blockId")
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
            .map(pageState).toProperty("pageState")
            .map(ioFix).toProperty("ioFix")
            .map(isOld).toProperty("isOld")
            .map(freePageClock).toProperty("freePageClock")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.432+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    default int insertSelective(InnodbBufferPage record) {
        return MyBatis3Utils.insert(this::insert, record, innodbBufferPage, c ->
            c.map(poolId).toPropertyWhenPresent("poolId", record::getPoolId)
            .map(blockId).toPropertyWhenPresent("blockId", record::getBlockId)
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
            .map(pageState).toPropertyWhenPresent("pageState", record::getPageState)
            .map(ioFix).toPropertyWhenPresent("ioFix", record::getIoFix)
            .map(isOld).toPropertyWhenPresent("isOld", record::getIsOld)
            .map(freePageClock).toPropertyWhenPresent("freePageClock", record::getFreePageClock)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.432+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    default Optional<InnodbBufferPage> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbBufferPage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.433+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    default List<InnodbBufferPage> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbBufferPage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.433+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    default List<InnodbBufferPage> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbBufferPage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.433+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbBufferPage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.433+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbBufferPage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(poolId).equalTo(record::getPoolId)
                .set(blockId).equalTo(record::getBlockId)
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
                .set(pageState).equalTo(record::getPageState)
                .set(ioFix).equalTo(record::getIoFix)
                .set(isOld).equalTo(record::getIsOld)
                .set(freePageClock).equalTo(record::getFreePageClock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.433+07:00", comments="Source Table: INNODB_BUFFER_PAGE")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbBufferPage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(poolId).equalToWhenPresent(record::getPoolId)
                .set(blockId).equalToWhenPresent(record::getBlockId)
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
                .set(pageState).equalToWhenPresent(record::getPageState)
                .set(ioFix).equalToWhenPresent(record::getIoFix)
                .set(isOld).equalToWhenPresent(record::getIsOld)
                .set(freePageClock).equalToWhenPresent(record::getFreePageClock);
    }
}