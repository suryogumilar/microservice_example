package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.TablesDynamicSqlSupport.*;

import com.sg.mybatis.model.Tables;
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
public interface TablesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.264+07:00", comments="Source Table: TABLES")
    BasicColumn[] selectList = BasicColumn.columnList(tableCatalog, tableSchema, tableName, tableType, engine, version, rowFormat, tableRows, avgRowLength, dataLength, maxDataLength, indexLength, dataFree, autoIncrement, createTime, updateTime, checkTime, tableCollation, checksum, createOptions, tableComment);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source Table: TABLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source Table: TABLES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source Table: TABLES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Tables> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source Table: TABLES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Tables> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source Table: TABLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TablesResult")
    Optional<Tables> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.259+07:00", comments="Source Table: TABLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TablesResult", value = {
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_TYPE", property="tableType", jdbcType=JdbcType.CHAR),
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.CHAR),
        @Result(column="TABLE_ROWS", property="tableRows", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_ROW_LENGTH", property="avgRowLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_LENGTH", property="dataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_DATA_LENGTH", property="maxDataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="INDEX_LENGTH", property="indexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_FREE", property="dataFree", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTO_INCREMENT", property="autoIncrement", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECK_TIME", property="checkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TABLE_COLLATION", property="tableCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECKSUM", property="checksum", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_OPTIONS", property="createOptions", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_COMMENT", property="tableComment", jdbcType=JdbcType.VARCHAR)
    })
    List<Tables> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.26+07:00", comments="Source Table: TABLES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.26+07:00", comments="Source Table: TABLES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.26+07:00", comments="Source Table: TABLES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.26+07:00", comments="Source Table: TABLES")
    default int insert(Tables record) {
        return MyBatis3Utils.insert(this::insert, record, tables, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(tableType).toProperty("tableType")
            .map(engine).toProperty("engine")
            .map(version).toProperty("version")
            .map(rowFormat).toProperty("rowFormat")
            .map(tableRows).toProperty("tableRows")
            .map(avgRowLength).toProperty("avgRowLength")
            .map(dataLength).toProperty("dataLength")
            .map(maxDataLength).toProperty("maxDataLength")
            .map(indexLength).toProperty("indexLength")
            .map(dataFree).toProperty("dataFree")
            .map(autoIncrement).toProperty("autoIncrement")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(checkTime).toProperty("checkTime")
            .map(tableCollation).toProperty("tableCollation")
            .map(checksum).toProperty("checksum")
            .map(createOptions).toProperty("createOptions")
            .map(tableComment).toProperty("tableComment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.262+07:00", comments="Source Table: TABLES")
    default int insertMultiple(Collection<Tables> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tables, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(tableType).toProperty("tableType")
            .map(engine).toProperty("engine")
            .map(version).toProperty("version")
            .map(rowFormat).toProperty("rowFormat")
            .map(tableRows).toProperty("tableRows")
            .map(avgRowLength).toProperty("avgRowLength")
            .map(dataLength).toProperty("dataLength")
            .map(maxDataLength).toProperty("maxDataLength")
            .map(indexLength).toProperty("indexLength")
            .map(dataFree).toProperty("dataFree")
            .map(autoIncrement).toProperty("autoIncrement")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(checkTime).toProperty("checkTime")
            .map(tableCollation).toProperty("tableCollation")
            .map(checksum).toProperty("checksum")
            .map(createOptions).toProperty("createOptions")
            .map(tableComment).toProperty("tableComment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.262+07:00", comments="Source Table: TABLES")
    default int insertSelective(Tables record) {
        return MyBatis3Utils.insert(this::insert, record, tables, c ->
            c.map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(tableType).toPropertyWhenPresent("tableType", record::getTableType)
            .map(engine).toPropertyWhenPresent("engine", record::getEngine)
            .map(version).toPropertyWhenPresent("version", record::getVersion)
            .map(rowFormat).toPropertyWhenPresent("rowFormat", record::getRowFormat)
            .map(tableRows).toPropertyWhenPresent("tableRows", record::getTableRows)
            .map(avgRowLength).toPropertyWhenPresent("avgRowLength", record::getAvgRowLength)
            .map(dataLength).toPropertyWhenPresent("dataLength", record::getDataLength)
            .map(maxDataLength).toPropertyWhenPresent("maxDataLength", record::getMaxDataLength)
            .map(indexLength).toPropertyWhenPresent("indexLength", record::getIndexLength)
            .map(dataFree).toPropertyWhenPresent("dataFree", record::getDataFree)
            .map(autoIncrement).toPropertyWhenPresent("autoIncrement", record::getAutoIncrement)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(checkTime).toPropertyWhenPresent("checkTime", record::getCheckTime)
            .map(tableCollation).toPropertyWhenPresent("tableCollation", record::getTableCollation)
            .map(checksum).toPropertyWhenPresent("checksum", record::getChecksum)
            .map(createOptions).toPropertyWhenPresent("createOptions", record::getCreateOptions)
            .map(tableComment).toPropertyWhenPresent("tableComment", record::getTableComment)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.265+07:00", comments="Source Table: TABLES")
    default Optional<Tables> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.265+07:00", comments="Source Table: TABLES")
    default List<Tables> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.265+07:00", comments="Source Table: TABLES")
    default List<Tables> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.265+07:00", comments="Source Table: TABLES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.265+07:00", comments="Source Table: TABLES")
    static UpdateDSL<UpdateModel> updateAllColumns(Tables record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(tableType).equalTo(record::getTableType)
                .set(engine).equalTo(record::getEngine)
                .set(version).equalTo(record::getVersion)
                .set(rowFormat).equalTo(record::getRowFormat)
                .set(tableRows).equalTo(record::getTableRows)
                .set(avgRowLength).equalTo(record::getAvgRowLength)
                .set(dataLength).equalTo(record::getDataLength)
                .set(maxDataLength).equalTo(record::getMaxDataLength)
                .set(indexLength).equalTo(record::getIndexLength)
                .set(dataFree).equalTo(record::getDataFree)
                .set(autoIncrement).equalTo(record::getAutoIncrement)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(checkTime).equalTo(record::getCheckTime)
                .set(tableCollation).equalTo(record::getTableCollation)
                .set(checksum).equalTo(record::getChecksum)
                .set(createOptions).equalTo(record::getCreateOptions)
                .set(tableComment).equalTo(record::getTableComment);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.265+07:00", comments="Source Table: TABLES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Tables record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(tableType).equalToWhenPresent(record::getTableType)
                .set(engine).equalToWhenPresent(record::getEngine)
                .set(version).equalToWhenPresent(record::getVersion)
                .set(rowFormat).equalToWhenPresent(record::getRowFormat)
                .set(tableRows).equalToWhenPresent(record::getTableRows)
                .set(avgRowLength).equalToWhenPresent(record::getAvgRowLength)
                .set(dataLength).equalToWhenPresent(record::getDataLength)
                .set(maxDataLength).equalToWhenPresent(record::getMaxDataLength)
                .set(indexLength).equalToWhenPresent(record::getIndexLength)
                .set(dataFree).equalToWhenPresent(record::getDataFree)
                .set(autoIncrement).equalToWhenPresent(record::getAutoIncrement)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(checkTime).equalToWhenPresent(record::getCheckTime)
                .set(tableCollation).equalToWhenPresent(record::getTableCollation)
                .set(checksum).equalToWhenPresent(record::getChecksum)
                .set(createOptions).equalToWhenPresent(record::getCreateOptions)
                .set(tableComment).equalToWhenPresent(record::getTableComment);
    }
}