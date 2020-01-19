package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.KeywordsDynamicSqlSupport.*;

import com.sg.mybatis.model.Keywords;
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
public interface KeywordsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.4+07:00", comments="Source Table: KEYWORDS")
    BasicColumn[] selectList = BasicColumn.columnList(word, reserved);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Keywords> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Keywords> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("KeywordsResult")
    Optional<Keywords> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="KeywordsResult", value = {
        @Result(column="WORD", property="word", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED", property="reserved", jdbcType=JdbcType.INTEGER)
    })
    List<Keywords> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, keywords, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, keywords, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    default int insert(Keywords record) {
        return MyBatis3Utils.insert(this::insert, record, keywords, c ->
            c.map(word).toProperty("word")
            .map(reserved).toProperty("reserved")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    default int insertMultiple(Collection<Keywords> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, keywords, c ->
            c.map(word).toProperty("word")
            .map(reserved).toProperty("reserved")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.399+07:00", comments="Source Table: KEYWORDS")
    default int insertSelective(Keywords record) {
        return MyBatis3Utils.insert(this::insert, record, keywords, c ->
            c.map(word).toPropertyWhenPresent("word", record::getWord)
            .map(reserved).toPropertyWhenPresent("reserved", record::getReserved)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.4+07:00", comments="Source Table: KEYWORDS")
    default Optional<Keywords> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, keywords, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.4+07:00", comments="Source Table: KEYWORDS")
    default List<Keywords> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, keywords, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.4+07:00", comments="Source Table: KEYWORDS")
    default List<Keywords> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, keywords, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.4+07:00", comments="Source Table: KEYWORDS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, keywords, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.4+07:00", comments="Source Table: KEYWORDS")
    static UpdateDSL<UpdateModel> updateAllColumns(Keywords record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(word).equalTo(record::getWord)
                .set(reserved).equalTo(record::getReserved);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.4+07:00", comments="Source Table: KEYWORDS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Keywords record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(word).equalToWhenPresent(record::getWord)
                .set(reserved).equalToWhenPresent(record::getReserved);
    }
}