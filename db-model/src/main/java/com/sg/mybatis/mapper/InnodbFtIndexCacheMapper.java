package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbFtIndexCacheDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbFtIndexCache;
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
public interface InnodbFtIndexCacheMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.333+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    BasicColumn[] selectList = BasicColumn.columnList(word, firstDocId, lastDocId, docCount, docId, position);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbFtIndexCache> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbFtIndexCache> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbFtIndexCacheResult")
    Optional<InnodbFtIndexCache> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbFtIndexCacheResult", value = {
        @Result(column="WORD", property="word", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_DOC_ID", property="firstDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_DOC_ID", property="lastDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_COUNT", property="docCount", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT),
        @Result(column="POSITION", property="position", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtIndexCache> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbFtIndexCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbFtIndexCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    default int insert(InnodbFtIndexCache record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtIndexCache, c ->
            c.map(word).toProperty("word")
            .map(firstDocId).toProperty("firstDocId")
            .map(lastDocId).toProperty("lastDocId")
            .map(docCount).toProperty("docCount")
            .map(docId).toProperty("docId")
            .map(position).toProperty("position")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    default int insertMultiple(Collection<InnodbFtIndexCache> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbFtIndexCache, c ->
            c.map(word).toProperty("word")
            .map(firstDocId).toProperty("firstDocId")
            .map(lastDocId).toProperty("lastDocId")
            .map(docCount).toProperty("docCount")
            .map(docId).toProperty("docId")
            .map(position).toProperty("position")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    default int insertSelective(InnodbFtIndexCache record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtIndexCache, c ->
            c.map(word).toPropertyWhenPresent("word", record::getWord)
            .map(firstDocId).toPropertyWhenPresent("firstDocId", record::getFirstDocId)
            .map(lastDocId).toPropertyWhenPresent("lastDocId", record::getLastDocId)
            .map(docCount).toPropertyWhenPresent("docCount", record::getDocCount)
            .map(docId).toPropertyWhenPresent("docId", record::getDocId)
            .map(position).toPropertyWhenPresent("position", record::getPosition)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.333+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    default Optional<InnodbFtIndexCache> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbFtIndexCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.333+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    default List<InnodbFtIndexCache> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbFtIndexCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.333+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    default List<InnodbFtIndexCache> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbFtIndexCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.333+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbFtIndexCache, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.333+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbFtIndexCache record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(word).equalTo(record::getWord)
                .set(firstDocId).equalTo(record::getFirstDocId)
                .set(lastDocId).equalTo(record::getLastDocId)
                .set(docCount).equalTo(record::getDocCount)
                .set(docId).equalTo(record::getDocId)
                .set(position).equalTo(record::getPosition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.333+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbFtIndexCache record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(word).equalToWhenPresent(record::getWord)
                .set(firstDocId).equalToWhenPresent(record::getFirstDocId)
                .set(lastDocId).equalToWhenPresent(record::getLastDocId)
                .set(docCount).equalToWhenPresent(record::getDocCount)
                .set(docId).equalToWhenPresent(record::getDocId)
                .set(position).equalToWhenPresent(record::getPosition);
    }
}