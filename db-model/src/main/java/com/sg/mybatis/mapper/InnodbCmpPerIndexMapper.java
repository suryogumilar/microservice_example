package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbCmpPerIndexDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbCmpPerIndex;
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
public interface InnodbCmpPerIndexMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    BasicColumn[] selectList = BasicColumn.columnList(databaseName, tableName, indexName, compressOps, compressOpsOk, compressTime, uncompressOps, uncompressTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbCmpPerIndex> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbCmpPerIndex> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbCmpPerIndexResult")
    Optional<InnodbCmpPerIndex> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbCmpPerIndexResult", value = {
        @Result(column="database_name", property="databaseName", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="index_name", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="compress_ops", property="compressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops_ok", property="compressOpsOk", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_time", property="compressTime", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_ops", property="uncompressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_time", property="uncompressTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpPerIndex> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbCmpPerIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbCmpPerIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    default int insert(InnodbCmpPerIndex record) {
        return MyBatis3Utils.insert(this::insert, record, innodbCmpPerIndex, c ->
            c.map(databaseName).toProperty("databaseName")
            .map(tableName).toProperty("tableName")
            .map(indexName).toProperty("indexName")
            .map(compressOps).toProperty("compressOps")
            .map(compressOpsOk).toProperty("compressOpsOk")
            .map(compressTime).toProperty("compressTime")
            .map(uncompressOps).toProperty("uncompressOps")
            .map(uncompressTime).toProperty("uncompressTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    default int insertMultiple(Collection<InnodbCmpPerIndex> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbCmpPerIndex, c ->
            c.map(databaseName).toProperty("databaseName")
            .map(tableName).toProperty("tableName")
            .map(indexName).toProperty("indexName")
            .map(compressOps).toProperty("compressOps")
            .map(compressOpsOk).toProperty("compressOpsOk")
            .map(compressTime).toProperty("compressTime")
            .map(uncompressOps).toProperty("uncompressOps")
            .map(uncompressTime).toProperty("uncompressTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    default int insertSelective(InnodbCmpPerIndex record) {
        return MyBatis3Utils.insert(this::insert, record, innodbCmpPerIndex, c ->
            c.map(databaseName).toPropertyWhenPresent("databaseName", record::getDatabaseName)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
            .map(compressOps).toPropertyWhenPresent("compressOps", record::getCompressOps)
            .map(compressOpsOk).toPropertyWhenPresent("compressOpsOk", record::getCompressOpsOk)
            .map(compressTime).toPropertyWhenPresent("compressTime", record::getCompressTime)
            .map(uncompressOps).toPropertyWhenPresent("uncompressOps", record::getUncompressOps)
            .map(uncompressTime).toPropertyWhenPresent("uncompressTime", record::getUncompressTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    default Optional<InnodbCmpPerIndex> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbCmpPerIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    default List<InnodbCmpPerIndex> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbCmpPerIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    default List<InnodbCmpPerIndex> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbCmpPerIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbCmpPerIndex, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbCmpPerIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(databaseName).equalTo(record::getDatabaseName)
                .set(tableName).equalTo(record::getTableName)
                .set(indexName).equalTo(record::getIndexName)
                .set(compressOps).equalTo(record::getCompressOps)
                .set(compressOpsOk).equalTo(record::getCompressOpsOk)
                .set(compressTime).equalTo(record::getCompressTime)
                .set(uncompressOps).equalTo(record::getUncompressOps)
                .set(uncompressTime).equalTo(record::getUncompressTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.338+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbCmpPerIndex record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(databaseName).equalToWhenPresent(record::getDatabaseName)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(indexName).equalToWhenPresent(record::getIndexName)
                .set(compressOps).equalToWhenPresent(record::getCompressOps)
                .set(compressOpsOk).equalToWhenPresent(record::getCompressOpsOk)
                .set(compressTime).equalToWhenPresent(record::getCompressTime)
                .set(uncompressOps).equalToWhenPresent(record::getUncompressOps)
                .set(uncompressTime).equalToWhenPresent(record::getUncompressTime);
    }
}