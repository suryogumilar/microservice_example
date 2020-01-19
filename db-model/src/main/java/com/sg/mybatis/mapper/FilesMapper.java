package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.FilesDynamicSqlSupport.*;

import com.sg.mybatis.model.Files;
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
public interface FilesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.229+07:00", comments="Source Table: FILES")
    BasicColumn[] selectList = BasicColumn.columnList(fileId, fileType, tablespaceName, tableCatalog, logfileGroupName, logfileGroupNumber, engine, freeExtents, totalExtents, extentSize, initialSize, maximumSize, autoextendSize, version, rowFormat, dataFree, status, fileName, tableSchema, tableName, fulltextKeys, deletedRows, updateCount, creationTime, lastUpdateTime, lastAccessTime, recoverTime, transactionCounter, tableRows, avgRowLength, dataLength, maxDataLength, indexLength, createTime, updateTime, checkTime, checksum, extra);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Files> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Files> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("FilesResult")
    Optional<Files> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FilesResult", value = {
        @Result(column="FILE_ID", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="FILE_TYPE", property="fileType", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLESPACE_NAME", property="tablespaceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.CHAR),
        @Result(column="LOGFILE_GROUP_NAME", property="logfileGroupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGFILE_GROUP_NUMBER", property="logfileGroupNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="FREE_EXTENTS", property="freeExtents", jdbcType=JdbcType.BIGINT),
        @Result(column="TOTAL_EXTENTS", property="totalExtents", jdbcType=JdbcType.BIGINT),
        @Result(column="EXTENT_SIZE", property="extentSize", jdbcType=JdbcType.BIGINT),
        @Result(column="INITIAL_SIZE", property="initialSize", jdbcType=JdbcType.BIGINT),
        @Result(column="MAXIMUM_SIZE", property="maximumSize", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTOEXTEND_SIZE", property="autoextendSize", jdbcType=JdbcType.BIGINT),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_FREE", property="dataFree", jdbcType=JdbcType.BIGINT),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_NAME", property="fileName", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.BINARY),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.BINARY),
        @Result(column="FULLTEXT_KEYS", property="fulltextKeys", jdbcType=JdbcType.BINARY),
        @Result(column="DELETED_ROWS", property="deletedRows", jdbcType=JdbcType.BINARY),
        @Result(column="UPDATE_COUNT", property="updateCount", jdbcType=JdbcType.BINARY),
        @Result(column="CREATION_TIME", property="creationTime", jdbcType=JdbcType.BINARY),
        @Result(column="LAST_UPDATE_TIME", property="lastUpdateTime", jdbcType=JdbcType.BINARY),
        @Result(column="LAST_ACCESS_TIME", property="lastAccessTime", jdbcType=JdbcType.BINARY),
        @Result(column="RECOVER_TIME", property="recoverTime", jdbcType=JdbcType.BINARY),
        @Result(column="TRANSACTION_COUNTER", property="transactionCounter", jdbcType=JdbcType.BINARY),
        @Result(column="TABLE_ROWS", property="tableRows", jdbcType=JdbcType.BINARY),
        @Result(column="AVG_ROW_LENGTH", property="avgRowLength", jdbcType=JdbcType.BINARY),
        @Result(column="DATA_LENGTH", property="dataLength", jdbcType=JdbcType.BINARY),
        @Result(column="MAX_DATA_LENGTH", property="maxDataLength", jdbcType=JdbcType.BINARY),
        @Result(column="INDEX_LENGTH", property="indexLength", jdbcType=JdbcType.BINARY),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.BINARY),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.BINARY),
        @Result(column="CHECK_TIME", property="checkTime", jdbcType=JdbcType.BINARY),
        @Result(column="CHECKSUM", property="checksum", jdbcType=JdbcType.BINARY),
        @Result(column="EXTRA", property="extra", jdbcType=JdbcType.BINARY)
    })
    List<Files> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, files, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, files, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    default int insert(Files record) {
        return MyBatis3Utils.insert(this::insert, record, files, c ->
            c.map(fileId).toProperty("fileId")
            .map(fileType).toProperty("fileType")
            .map(tablespaceName).toProperty("tablespaceName")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(logfileGroupName).toProperty("logfileGroupName")
            .map(logfileGroupNumber).toProperty("logfileGroupNumber")
            .map(engine).toProperty("engine")
            .map(freeExtents).toProperty("freeExtents")
            .map(totalExtents).toProperty("totalExtents")
            .map(extentSize).toProperty("extentSize")
            .map(initialSize).toProperty("initialSize")
            .map(maximumSize).toProperty("maximumSize")
            .map(autoextendSize).toProperty("autoextendSize")
            .map(version).toProperty("version")
            .map(rowFormat).toProperty("rowFormat")
            .map(dataFree).toProperty("dataFree")
            .map(status).toProperty("status")
            .map(fileName).toProperty("fileName")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(fulltextKeys).toProperty("fulltextKeys")
            .map(deletedRows).toProperty("deletedRows")
            .map(updateCount).toProperty("updateCount")
            .map(creationTime).toProperty("creationTime")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(lastAccessTime).toProperty("lastAccessTime")
            .map(recoverTime).toProperty("recoverTime")
            .map(transactionCounter).toProperty("transactionCounter")
            .map(tableRows).toProperty("tableRows")
            .map(avgRowLength).toProperty("avgRowLength")
            .map(dataLength).toProperty("dataLength")
            .map(maxDataLength).toProperty("maxDataLength")
            .map(indexLength).toProperty("indexLength")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(checkTime).toProperty("checkTime")
            .map(checksum).toProperty("checksum")
            .map(extra).toProperty("extra")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    default int insertMultiple(Collection<Files> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, files, c ->
            c.map(fileId).toProperty("fileId")
            .map(fileType).toProperty("fileType")
            .map(tablespaceName).toProperty("tablespaceName")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(logfileGroupName).toProperty("logfileGroupName")
            .map(logfileGroupNumber).toProperty("logfileGroupNumber")
            .map(engine).toProperty("engine")
            .map(freeExtents).toProperty("freeExtents")
            .map(totalExtents).toProperty("totalExtents")
            .map(extentSize).toProperty("extentSize")
            .map(initialSize).toProperty("initialSize")
            .map(maximumSize).toProperty("maximumSize")
            .map(autoextendSize).toProperty("autoextendSize")
            .map(version).toProperty("version")
            .map(rowFormat).toProperty("rowFormat")
            .map(dataFree).toProperty("dataFree")
            .map(status).toProperty("status")
            .map(fileName).toProperty("fileName")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(fulltextKeys).toProperty("fulltextKeys")
            .map(deletedRows).toProperty("deletedRows")
            .map(updateCount).toProperty("updateCount")
            .map(creationTime).toProperty("creationTime")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(lastAccessTime).toProperty("lastAccessTime")
            .map(recoverTime).toProperty("recoverTime")
            .map(transactionCounter).toProperty("transactionCounter")
            .map(tableRows).toProperty("tableRows")
            .map(avgRowLength).toProperty("avgRowLength")
            .map(dataLength).toProperty("dataLength")
            .map(maxDataLength).toProperty("maxDataLength")
            .map(indexLength).toProperty("indexLength")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(checkTime).toProperty("checkTime")
            .map(checksum).toProperty("checksum")
            .map(extra).toProperty("extra")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.228+07:00", comments="Source Table: FILES")
    default int insertSelective(Files record) {
        return MyBatis3Utils.insert(this::insert, record, files, c ->
            c.map(fileId).toPropertyWhenPresent("fileId", record::getFileId)
            .map(fileType).toPropertyWhenPresent("fileType", record::getFileType)
            .map(tablespaceName).toPropertyWhenPresent("tablespaceName", record::getTablespaceName)
            .map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(logfileGroupName).toPropertyWhenPresent("logfileGroupName", record::getLogfileGroupName)
            .map(logfileGroupNumber).toPropertyWhenPresent("logfileGroupNumber", record::getLogfileGroupNumber)
            .map(engine).toPropertyWhenPresent("engine", record::getEngine)
            .map(freeExtents).toPropertyWhenPresent("freeExtents", record::getFreeExtents)
            .map(totalExtents).toPropertyWhenPresent("totalExtents", record::getTotalExtents)
            .map(extentSize).toPropertyWhenPresent("extentSize", record::getExtentSize)
            .map(initialSize).toPropertyWhenPresent("initialSize", record::getInitialSize)
            .map(maximumSize).toPropertyWhenPresent("maximumSize", record::getMaximumSize)
            .map(autoextendSize).toPropertyWhenPresent("autoextendSize", record::getAutoextendSize)
            .map(version).toPropertyWhenPresent("version", record::getVersion)
            .map(rowFormat).toPropertyWhenPresent("rowFormat", record::getRowFormat)
            .map(dataFree).toPropertyWhenPresent("dataFree", record::getDataFree)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(fileName).toPropertyWhenPresent("fileName", record::getFileName)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(fulltextKeys).toPropertyWhenPresent("fulltextKeys", record::getFulltextKeys)
            .map(deletedRows).toPropertyWhenPresent("deletedRows", record::getDeletedRows)
            .map(updateCount).toPropertyWhenPresent("updateCount", record::getUpdateCount)
            .map(creationTime).toPropertyWhenPresent("creationTime", record::getCreationTime)
            .map(lastUpdateTime).toPropertyWhenPresent("lastUpdateTime", record::getLastUpdateTime)
            .map(lastAccessTime).toPropertyWhenPresent("lastAccessTime", record::getLastAccessTime)
            .map(recoverTime).toPropertyWhenPresent("recoverTime", record::getRecoverTime)
            .map(transactionCounter).toPropertyWhenPresent("transactionCounter", record::getTransactionCounter)
            .map(tableRows).toPropertyWhenPresent("tableRows", record::getTableRows)
            .map(avgRowLength).toPropertyWhenPresent("avgRowLength", record::getAvgRowLength)
            .map(dataLength).toPropertyWhenPresent("dataLength", record::getDataLength)
            .map(maxDataLength).toPropertyWhenPresent("maxDataLength", record::getMaxDataLength)
            .map(indexLength).toPropertyWhenPresent("indexLength", record::getIndexLength)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(checkTime).toPropertyWhenPresent("checkTime", record::getCheckTime)
            .map(checksum).toPropertyWhenPresent("checksum", record::getChecksum)
            .map(extra).toPropertyWhenPresent("extra", record::getExtra)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.229+07:00", comments="Source Table: FILES")
    default Optional<Files> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, files, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.229+07:00", comments="Source Table: FILES")
    default List<Files> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, files, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.229+07:00", comments="Source Table: FILES")
    default List<Files> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, files, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.229+07:00", comments="Source Table: FILES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, files, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.229+07:00", comments="Source Table: FILES")
    static UpdateDSL<UpdateModel> updateAllColumns(Files record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fileId).equalTo(record::getFileId)
                .set(fileType).equalTo(record::getFileType)
                .set(tablespaceName).equalTo(record::getTablespaceName)
                .set(tableCatalog).equalTo(record::getTableCatalog)
                .set(logfileGroupName).equalTo(record::getLogfileGroupName)
                .set(logfileGroupNumber).equalTo(record::getLogfileGroupNumber)
                .set(engine).equalTo(record::getEngine)
                .set(freeExtents).equalTo(record::getFreeExtents)
                .set(totalExtents).equalTo(record::getTotalExtents)
                .set(extentSize).equalTo(record::getExtentSize)
                .set(initialSize).equalTo(record::getInitialSize)
                .set(maximumSize).equalTo(record::getMaximumSize)
                .set(autoextendSize).equalTo(record::getAutoextendSize)
                .set(version).equalTo(record::getVersion)
                .set(rowFormat).equalTo(record::getRowFormat)
                .set(dataFree).equalTo(record::getDataFree)
                .set(status).equalTo(record::getStatus)
                .set(fileName).equalTo(record::getFileName)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(fulltextKeys).equalTo(record::getFulltextKeys)
                .set(deletedRows).equalTo(record::getDeletedRows)
                .set(updateCount).equalTo(record::getUpdateCount)
                .set(creationTime).equalTo(record::getCreationTime)
                .set(lastUpdateTime).equalTo(record::getLastUpdateTime)
                .set(lastAccessTime).equalTo(record::getLastAccessTime)
                .set(recoverTime).equalTo(record::getRecoverTime)
                .set(transactionCounter).equalTo(record::getTransactionCounter)
                .set(tableRows).equalTo(record::getTableRows)
                .set(avgRowLength).equalTo(record::getAvgRowLength)
                .set(dataLength).equalTo(record::getDataLength)
                .set(maxDataLength).equalTo(record::getMaxDataLength)
                .set(indexLength).equalTo(record::getIndexLength)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(checkTime).equalTo(record::getCheckTime)
                .set(checksum).equalTo(record::getChecksum)
                .set(extra).equalTo(record::getExtra);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.229+07:00", comments="Source Table: FILES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Files record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fileId).equalToWhenPresent(record::getFileId)
                .set(fileType).equalToWhenPresent(record::getFileType)
                .set(tablespaceName).equalToWhenPresent(record::getTablespaceName)
                .set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(logfileGroupName).equalToWhenPresent(record::getLogfileGroupName)
                .set(logfileGroupNumber).equalToWhenPresent(record::getLogfileGroupNumber)
                .set(engine).equalToWhenPresent(record::getEngine)
                .set(freeExtents).equalToWhenPresent(record::getFreeExtents)
                .set(totalExtents).equalToWhenPresent(record::getTotalExtents)
                .set(extentSize).equalToWhenPresent(record::getExtentSize)
                .set(initialSize).equalToWhenPresent(record::getInitialSize)
                .set(maximumSize).equalToWhenPresent(record::getMaximumSize)
                .set(autoextendSize).equalToWhenPresent(record::getAutoextendSize)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(rowFormat).equalToWhenPresent(record::getRowFormat)
                .set(dataFree).equalToWhenPresent(record::getDataFree)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(fileName).equalToWhenPresent(record::getFileName)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(fulltextKeys).equalToWhenPresent(record::getFulltextKeys)
                .set(deletedRows).equalToWhenPresent(record::getDeletedRows)
                .set(updateCount).equalToWhenPresent(record::getUpdateCount)
                .set(creationTime).equalToWhenPresent(record::getCreationTime)
                .set(lastUpdateTime).equalToWhenPresent(record::getLastUpdateTime)
                .set(lastAccessTime).equalToWhenPresent(record::getLastAccessTime)
                .set(recoverTime).equalToWhenPresent(record::getRecoverTime)
                .set(transactionCounter).equalToWhenPresent(record::getTransactionCounter)
                .set(tableRows).equalToWhenPresent(record::getTableRows)
                .set(avgRowLength).equalToWhenPresent(record::getAvgRowLength)
                .set(dataLength).equalToWhenPresent(record::getDataLength)
                .set(maxDataLength).equalToWhenPresent(record::getMaxDataLength)
                .set(indexLength).equalToWhenPresent(record::getIndexLength)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(checkTime).equalToWhenPresent(record::getCheckTime)
                .set(checksum).equalToWhenPresent(record::getChecksum)
                .set(extra).equalToWhenPresent(record::getExtra);
    }
}