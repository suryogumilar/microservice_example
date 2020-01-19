package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbCachedIndexesDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbCachedIndexes;
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
public interface InnodbCachedIndexesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.395+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    BasicColumn[] selectList = BasicColumn.columnList(spaceId, indexId, nCachedPages);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbCachedIndexes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbCachedIndexes> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbCachedIndexesResult")
    Optional<InnodbCachedIndexes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.395+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbCachedIndexesResult", value = {
        @Result(column="SPACE_ID", property="spaceId", jdbcType=JdbcType.INTEGER),
        @Result(column="INDEX_ID", property="indexId", jdbcType=JdbcType.BIGINT),
        @Result(column="N_CACHED_PAGES", property="nCachedPages", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbCachedIndexes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.395+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.395+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbCachedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.395+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbCachedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.395+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    default int insert(InnodbCachedIndexes record) {
        return MyBatis3Utils.insert(this::insert, record, innodbCachedIndexes, c ->
            c.map(spaceId).toProperty("spaceId")
            .map(indexId).toProperty("indexId")
            .map(nCachedPages).toProperty("nCachedPages")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.395+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    default int insertMultiple(Collection<InnodbCachedIndexes> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbCachedIndexes, c ->
            c.map(spaceId).toProperty("spaceId")
            .map(indexId).toProperty("indexId")
            .map(nCachedPages).toProperty("nCachedPages")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.395+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    default int insertSelective(InnodbCachedIndexes record) {
        return MyBatis3Utils.insert(this::insert, record, innodbCachedIndexes, c ->
            c.map(spaceId).toPropertyWhenPresent("spaceId", record::getSpaceId)
            .map(indexId).toPropertyWhenPresent("indexId", record::getIndexId)
            .map(nCachedPages).toPropertyWhenPresent("nCachedPages", record::getnCachedPages)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.395+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    default Optional<InnodbCachedIndexes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbCachedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.396+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    default List<InnodbCachedIndexes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbCachedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.397+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    default List<InnodbCachedIndexes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbCachedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.397+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbCachedIndexes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.397+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbCachedIndexes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(spaceId).equalTo(record::getSpaceId)
                .set(indexId).equalTo(record::getIndexId)
                .set(nCachedPages).equalTo(record::getnCachedPages);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.397+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbCachedIndexes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(spaceId).equalToWhenPresent(record::getSpaceId)
                .set(indexId).equalToWhenPresent(record::getIndexId)
                .set(nCachedPages).equalToWhenPresent(record::getnCachedPages);
    }
}