package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.PartitionsDynamicSqlSupport.*;

import com.sg.mybatis.model.Partitions;
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
public interface PartitionsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    BasicColumn[] selectList = BasicColumn.columnList(tableCatalog, tableSchema, tableName, partitionName, subpartitionName, partitionOrdinalPosition, subpartitionOrdinalPosition, partitionMethod, subpartitionMethod, partitionExpression, subpartitionExpression, tableRows, avgRowLength, dataLength, maxDataLength, indexLength, dataFree, createTime, updateTime, checkTime, checksum, nodegroup, tablespaceName, partitionDescription, partitionComment);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Partitions> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Partitions> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PartitionsResult")
    Optional<Partitions> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PartitionsResult", value = {
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_NAME", property="partitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_NAME", property="subpartitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_ORDINAL_POSITION", property="partitionOrdinalPosition", jdbcType=JdbcType.INTEGER),
        @Result(column="SUBPARTITION_ORDINAL_POSITION", property="subpartitionOrdinalPosition", jdbcType=JdbcType.INTEGER),
        @Result(column="PARTITION_METHOD", property="partitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_METHOD", property="subpartitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_EXPRESSION", property="partitionExpression", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_EXPRESSION", property="subpartitionExpression", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ROWS", property="tableRows", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_ROW_LENGTH", property="avgRowLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_LENGTH", property="dataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_DATA_LENGTH", property="maxDataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="INDEX_LENGTH", property="indexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_FREE", property="dataFree", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECK_TIME", property="checkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECKSUM", property="checksum", jdbcType=JdbcType.BIGINT),
        @Result(column="NODEGROUP", property="nodegroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLESPACE_NAME", property="tablespaceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_DESCRIPTION", property="partitionDescription", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="PARTITION_COMMENT", property="partitionComment", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Partitions> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, partitions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, partitions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    default int insert(Partitions record) {
        return MyBatis3Utils.insert(this::insert, record, partitions, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(partitionName).toProperty("partitionName")
            .map(subpartitionName).toProperty("subpartitionName")
            .map(partitionOrdinalPosition).toProperty("partitionOrdinalPosition")
            .map(subpartitionOrdinalPosition).toProperty("subpartitionOrdinalPosition")
            .map(partitionMethod).toProperty("partitionMethod")
            .map(subpartitionMethod).toProperty("subpartitionMethod")
            .map(partitionExpression).toProperty("partitionExpression")
            .map(subpartitionExpression).toProperty("subpartitionExpression")
            .map(tableRows).toProperty("tableRows")
            .map(avgRowLength).toProperty("avgRowLength")
            .map(dataLength).toProperty("dataLength")
            .map(maxDataLength).toProperty("maxDataLength")
            .map(indexLength).toProperty("indexLength")
            .map(dataFree).toProperty("dataFree")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(checkTime).toProperty("checkTime")
            .map(checksum).toProperty("checksum")
            .map(nodegroup).toProperty("nodegroup")
            .map(tablespaceName).toProperty("tablespaceName")
            .map(partitionDescription).toProperty("partitionDescription")
            .map(partitionComment).toProperty("partitionComment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    default int insertMultiple(Collection<Partitions> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, partitions, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(partitionName).toProperty("partitionName")
            .map(subpartitionName).toProperty("subpartitionName")
            .map(partitionOrdinalPosition).toProperty("partitionOrdinalPosition")
            .map(subpartitionOrdinalPosition).toProperty("subpartitionOrdinalPosition")
            .map(partitionMethod).toProperty("partitionMethod")
            .map(subpartitionMethod).toProperty("subpartitionMethod")
            .map(partitionExpression).toProperty("partitionExpression")
            .map(subpartitionExpression).toProperty("subpartitionExpression")
            .map(tableRows).toProperty("tableRows")
            .map(avgRowLength).toProperty("avgRowLength")
            .map(dataLength).toProperty("dataLength")
            .map(maxDataLength).toProperty("maxDataLength")
            .map(indexLength).toProperty("indexLength")
            .map(dataFree).toProperty("dataFree")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(checkTime).toProperty("checkTime")
            .map(checksum).toProperty("checksum")
            .map(nodegroup).toProperty("nodegroup")
            .map(tablespaceName).toProperty("tablespaceName")
            .map(partitionDescription).toProperty("partitionDescription")
            .map(partitionComment).toProperty("partitionComment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    default int insertSelective(Partitions record) {
        return MyBatis3Utils.insert(this::insert, record, partitions, c ->
            c.map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(partitionName).toPropertyWhenPresent("partitionName", record::getPartitionName)
            .map(subpartitionName).toPropertyWhenPresent("subpartitionName", record::getSubpartitionName)
            .map(partitionOrdinalPosition).toPropertyWhenPresent("partitionOrdinalPosition", record::getPartitionOrdinalPosition)
            .map(subpartitionOrdinalPosition).toPropertyWhenPresent("subpartitionOrdinalPosition", record::getSubpartitionOrdinalPosition)
            .map(partitionMethod).toPropertyWhenPresent("partitionMethod", record::getPartitionMethod)
            .map(subpartitionMethod).toPropertyWhenPresent("subpartitionMethod", record::getSubpartitionMethod)
            .map(partitionExpression).toPropertyWhenPresent("partitionExpression", record::getPartitionExpression)
            .map(subpartitionExpression).toPropertyWhenPresent("subpartitionExpression", record::getSubpartitionExpression)
            .map(tableRows).toPropertyWhenPresent("tableRows", record::getTableRows)
            .map(avgRowLength).toPropertyWhenPresent("avgRowLength", record::getAvgRowLength)
            .map(dataLength).toPropertyWhenPresent("dataLength", record::getDataLength)
            .map(maxDataLength).toPropertyWhenPresent("maxDataLength", record::getMaxDataLength)
            .map(indexLength).toPropertyWhenPresent("indexLength", record::getIndexLength)
            .map(dataFree).toPropertyWhenPresent("dataFree", record::getDataFree)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(checkTime).toPropertyWhenPresent("checkTime", record::getCheckTime)
            .map(checksum).toPropertyWhenPresent("checksum", record::getChecksum)
            .map(nodegroup).toPropertyWhenPresent("nodegroup", record::getNodegroup)
            .map(tablespaceName).toPropertyWhenPresent("tablespaceName", record::getTablespaceName)
            .map(partitionDescription).toPropertyWhenPresent("partitionDescription", record::getPartitionDescription)
            .map(partitionComment).toPropertyWhenPresent("partitionComment", record::getPartitionComment)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source Table: PARTITIONS")
    default Optional<Partitions> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, partitions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source Table: PARTITIONS")
    default List<Partitions> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, partitions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source Table: PARTITIONS")
    default List<Partitions> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, partitions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source Table: PARTITIONS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, partitions, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source Table: PARTITIONS")
    static UpdateDSL<UpdateModel> updateAllColumns(Partitions record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(partitionName).equalTo(record::getPartitionName)
                .set(subpartitionName).equalTo(record::getSubpartitionName)
                .set(partitionOrdinalPosition).equalTo(record::getPartitionOrdinalPosition)
                .set(subpartitionOrdinalPosition).equalTo(record::getSubpartitionOrdinalPosition)
                .set(partitionMethod).equalTo(record::getPartitionMethod)
                .set(subpartitionMethod).equalTo(record::getSubpartitionMethod)
                .set(partitionExpression).equalTo(record::getPartitionExpression)
                .set(subpartitionExpression).equalTo(record::getSubpartitionExpression)
                .set(tableRows).equalTo(record::getTableRows)
                .set(avgRowLength).equalTo(record::getAvgRowLength)
                .set(dataLength).equalTo(record::getDataLength)
                .set(maxDataLength).equalTo(record::getMaxDataLength)
                .set(indexLength).equalTo(record::getIndexLength)
                .set(dataFree).equalTo(record::getDataFree)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(checkTime).equalTo(record::getCheckTime)
                .set(checksum).equalTo(record::getChecksum)
                .set(nodegroup).equalTo(record::getNodegroup)
                .set(tablespaceName).equalTo(record::getTablespaceName)
                .set(partitionDescription).equalTo(record::getPartitionDescription)
                .set(partitionComment).equalTo(record::getPartitionComment);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source Table: PARTITIONS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Partitions record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(partitionName).equalToWhenPresent(record::getPartitionName)
                .set(subpartitionName).equalToWhenPresent(record::getSubpartitionName)
                .set(partitionOrdinalPosition).equalToWhenPresent(record::getPartitionOrdinalPosition)
                .set(subpartitionOrdinalPosition).equalToWhenPresent(record::getSubpartitionOrdinalPosition)
                .set(partitionMethod).equalToWhenPresent(record::getPartitionMethod)
                .set(subpartitionMethod).equalToWhenPresent(record::getSubpartitionMethod)
                .set(partitionExpression).equalToWhenPresent(record::getPartitionExpression)
                .set(subpartitionExpression).equalToWhenPresent(record::getSubpartitionExpression)
                .set(tableRows).equalToWhenPresent(record::getTableRows)
                .set(avgRowLength).equalToWhenPresent(record::getAvgRowLength)
                .set(dataLength).equalToWhenPresent(record::getDataLength)
                .set(maxDataLength).equalToWhenPresent(record::getMaxDataLength)
                .set(indexLength).equalToWhenPresent(record::getIndexLength)
                .set(dataFree).equalToWhenPresent(record::getDataFree)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(checkTime).equalToWhenPresent(record::getCheckTime)
                .set(checksum).equalToWhenPresent(record::getChecksum)
                .set(nodegroup).equalToWhenPresent(record::getNodegroup)
                .set(tablespaceName).equalToWhenPresent(record::getTablespaceName)
                .set(partitionDescription).equalToWhenPresent(record::getPartitionDescription)
                .set(partitionComment).equalToWhenPresent(record::getPartitionComment);
    }
}