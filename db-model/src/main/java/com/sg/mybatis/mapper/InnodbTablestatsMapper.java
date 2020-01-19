package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbTablestatsDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbTablestats;
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
public interface InnodbTablestatsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.289+07:00", comments="Source Table: INNODB_TABLESTATS")
    BasicColumn[] selectList = BasicColumn.columnList(tableId, name, statsInitialized, numRows, clustIndexSize, otherIndexSize, modifiedCounter, autoinc, refCount);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source Table: INNODB_TABLESTATS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source Table: INNODB_TABLESTATS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source Table: INNODB_TABLESTATS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbTablestats> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source Table: INNODB_TABLESTATS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbTablestats> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source Table: INNODB_TABLESTATS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbTablestatsResult")
    Optional<InnodbTablestats> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source Table: INNODB_TABLESTATS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbTablestatsResult", value = {
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATS_INITIALIZED", property="statsInitialized", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUM_ROWS", property="numRows", jdbcType=JdbcType.BIGINT),
        @Result(column="CLUST_INDEX_SIZE", property="clustIndexSize", jdbcType=JdbcType.BIGINT),
        @Result(column="OTHER_INDEX_SIZE", property="otherIndexSize", jdbcType=JdbcType.BIGINT),
        @Result(column="MODIFIED_COUNTER", property="modifiedCounter", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTOINC", property="autoinc", jdbcType=JdbcType.BIGINT),
        @Result(column="REF_COUNT", property="refCount", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbTablestats> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source Table: INNODB_TABLESTATS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.288+07:00", comments="Source Table: INNODB_TABLESTATS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbTablestats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.289+07:00", comments="Source Table: INNODB_TABLESTATS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbTablestats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.289+07:00", comments="Source Table: INNODB_TABLESTATS")
    default int insert(InnodbTablestats record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTablestats, c ->
            c.map(tableId).toProperty("tableId")
            .map(name).toProperty("name")
            .map(statsInitialized).toProperty("statsInitialized")
            .map(numRows).toProperty("numRows")
            .map(clustIndexSize).toProperty("clustIndexSize")
            .map(otherIndexSize).toProperty("otherIndexSize")
            .map(modifiedCounter).toProperty("modifiedCounter")
            .map(autoinc).toProperty("autoinc")
            .map(refCount).toProperty("refCount")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.289+07:00", comments="Source Table: INNODB_TABLESTATS")
    default int insertMultiple(Collection<InnodbTablestats> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbTablestats, c ->
            c.map(tableId).toProperty("tableId")
            .map(name).toProperty("name")
            .map(statsInitialized).toProperty("statsInitialized")
            .map(numRows).toProperty("numRows")
            .map(clustIndexSize).toProperty("clustIndexSize")
            .map(otherIndexSize).toProperty("otherIndexSize")
            .map(modifiedCounter).toProperty("modifiedCounter")
            .map(autoinc).toProperty("autoinc")
            .map(refCount).toProperty("refCount")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.289+07:00", comments="Source Table: INNODB_TABLESTATS")
    default int insertSelective(InnodbTablestats record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTablestats, c ->
            c.map(tableId).toPropertyWhenPresent("tableId", record::getTableId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(statsInitialized).toPropertyWhenPresent("statsInitialized", record::getStatsInitialized)
            .map(numRows).toPropertyWhenPresent("numRows", record::getNumRows)
            .map(clustIndexSize).toPropertyWhenPresent("clustIndexSize", record::getClustIndexSize)
            .map(otherIndexSize).toPropertyWhenPresent("otherIndexSize", record::getOtherIndexSize)
            .map(modifiedCounter).toPropertyWhenPresent("modifiedCounter", record::getModifiedCounter)
            .map(autoinc).toPropertyWhenPresent("autoinc", record::getAutoinc)
            .map(refCount).toPropertyWhenPresent("refCount", record::getRefCount)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.289+07:00", comments="Source Table: INNODB_TABLESTATS")
    default Optional<InnodbTablestats> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbTablestats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.289+07:00", comments="Source Table: INNODB_TABLESTATS")
    default List<InnodbTablestats> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbTablestats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.289+07:00", comments="Source Table: INNODB_TABLESTATS")
    default List<InnodbTablestats> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbTablestats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.289+07:00", comments="Source Table: INNODB_TABLESTATS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbTablestats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.29+07:00", comments="Source Table: INNODB_TABLESTATS")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbTablestats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalTo(record::getTableId)
                .set(name).equalTo(record::getName)
                .set(statsInitialized).equalTo(record::getStatsInitialized)
                .set(numRows).equalTo(record::getNumRows)
                .set(clustIndexSize).equalTo(record::getClustIndexSize)
                .set(otherIndexSize).equalTo(record::getOtherIndexSize)
                .set(modifiedCounter).equalTo(record::getModifiedCounter)
                .set(autoinc).equalTo(record::getAutoinc)
                .set(refCount).equalTo(record::getRefCount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.29+07:00", comments="Source Table: INNODB_TABLESTATS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbTablestats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalToWhenPresent(record::getTableId)
                .set(name).equalToWhenPresent(record::getName)
                .set(statsInitialized).equalToWhenPresent(record::getStatsInitialized)
                .set(numRows).equalToWhenPresent(record::getNumRows)
                .set(clustIndexSize).equalToWhenPresent(record::getClustIndexSize)
                .set(otherIndexSize).equalToWhenPresent(record::getOtherIndexSize)
                .set(modifiedCounter).equalToWhenPresent(record::getModifiedCounter)
                .set(autoinc).equalToWhenPresent(record::getAutoinc)
                .set(refCount).equalToWhenPresent(record::getRefCount);
    }
}