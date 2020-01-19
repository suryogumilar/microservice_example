package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbIndexesDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbIndexes;
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
public interface InnodbIndexesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    BasicColumn[] selectList = BasicColumn.columnList(indexId, name, tableId, type, nFields, pageNo, space, mergeThreshold);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbIndexes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbIndexes> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbIndexesResult")
    Optional<InnodbIndexes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbIndexesResult", value = {
        @Result(column="INDEX_ID", property="indexId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="N_FIELDS", property="nFields", jdbcType=JdbcType.INTEGER),
        @Result(column="PAGE_NO", property="pageNo", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="MERGE_THRESHOLD", property="mergeThreshold", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbIndexes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    default int insert(InnodbIndexes record) {
        return MyBatis3Utils.insert(this::insert, record, innodbIndexes, c ->
            c.map(indexId).toProperty("indexId")
            .map(name).toProperty("name")
            .map(tableId).toProperty("tableId")
            .map(type).toProperty("type")
            .map(nFields).toProperty("nFields")
            .map(pageNo).toProperty("pageNo")
            .map(space).toProperty("space")
            .map(mergeThreshold).toProperty("mergeThreshold")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    default int insertMultiple(Collection<InnodbIndexes> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbIndexes, c ->
            c.map(indexId).toProperty("indexId")
            .map(name).toProperty("name")
            .map(tableId).toProperty("tableId")
            .map(type).toProperty("type")
            .map(nFields).toProperty("nFields")
            .map(pageNo).toProperty("pageNo")
            .map(space).toProperty("space")
            .map(mergeThreshold).toProperty("mergeThreshold")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    default int insertSelective(InnodbIndexes record) {
        return MyBatis3Utils.insert(this::insert, record, innodbIndexes, c ->
            c.map(indexId).toPropertyWhenPresent("indexId", record::getIndexId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(tableId).toPropertyWhenPresent("tableId", record::getTableId)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(nFields).toPropertyWhenPresent("nFields", record::getnFields)
            .map(pageNo).toPropertyWhenPresent("pageNo", record::getPageNo)
            .map(space).toPropertyWhenPresent("space", record::getSpace)
            .map(mergeThreshold).toPropertyWhenPresent("mergeThreshold", record::getMergeThreshold)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    default Optional<InnodbIndexes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    default List<InnodbIndexes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    default List<InnodbIndexes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbIndexes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(indexId).equalTo(record::getIndexId)
                .set(name).equalTo(record::getName)
                .set(tableId).equalTo(record::getTableId)
                .set(type).equalTo(record::getType)
                .set(nFields).equalTo(record::getnFields)
                .set(pageNo).equalTo(record::getPageNo)
                .set(space).equalTo(record::getSpace)
                .set(mergeThreshold).equalTo(record::getMergeThreshold);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source Table: INNODB_INDEXES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbIndexes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(indexId).equalToWhenPresent(record::getIndexId)
                .set(name).equalToWhenPresent(record::getName)
                .set(tableId).equalToWhenPresent(record::getTableId)
                .set(type).equalToWhenPresent(record::getType)
                .set(nFields).equalToWhenPresent(record::getnFields)
                .set(pageNo).equalToWhenPresent(record::getPageNo)
                .set(space).equalToWhenPresent(record::getSpace)
                .set(mergeThreshold).equalToWhenPresent(record::getMergeThreshold);
    }
}