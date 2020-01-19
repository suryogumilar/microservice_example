package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.CharacterSetsDynamicSqlSupport.*;

import com.sg.mybatis.model.CharacterSets;
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
public interface CharacterSetsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    BasicColumn[] selectList = BasicColumn.columnList(characterSetName, defaultCollateName, description, maxlen);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source Table: CHARACTER_SETS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source Table: CHARACTER_SETS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source Table: CHARACTER_SETS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CharacterSets> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<CharacterSets> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CharacterSetsResult")
    Optional<CharacterSets> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CharacterSetsResult", value = {
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_COLLATE_NAME", property="defaultCollateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAXLEN", property="maxlen", jdbcType=JdbcType.INTEGER)
    })
    List<CharacterSets> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, characterSets, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, characterSets, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    default int insert(CharacterSets record) {
        return MyBatis3Utils.insert(this::insert, record, characterSets, c ->
            c.map(characterSetName).toProperty("characterSetName")
            .map(defaultCollateName).toProperty("defaultCollateName")
            .map(description).toProperty("description")
            .map(maxlen).toProperty("maxlen")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    default int insertMultiple(Collection<CharacterSets> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, characterSets, c ->
            c.map(characterSetName).toProperty("characterSetName")
            .map(defaultCollateName).toProperty("defaultCollateName")
            .map(description).toProperty("description")
            .map(maxlen).toProperty("maxlen")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    default int insertSelective(CharacterSets record) {
        return MyBatis3Utils.insert(this::insert, record, characterSets, c ->
            c.map(characterSetName).toPropertyWhenPresent("characterSetName", record::getCharacterSetName)
            .map(defaultCollateName).toPropertyWhenPresent("defaultCollateName", record::getDefaultCollateName)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(maxlen).toPropertyWhenPresent("maxlen", record::getMaxlen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    default Optional<CharacterSets> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, characterSets, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    default List<CharacterSets> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, characterSets, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    default List<CharacterSets> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, characterSets, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, characterSets, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    static UpdateDSL<UpdateModel> updateAllColumns(CharacterSets record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(characterSetName).equalTo(record::getCharacterSetName)
                .set(defaultCollateName).equalTo(record::getDefaultCollateName)
                .set(description).equalTo(record::getDescription)
                .set(maxlen).equalTo(record::getMaxlen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.402+07:00", comments="Source Table: CHARACTER_SETS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CharacterSets record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(characterSetName).equalToWhenPresent(record::getCharacterSetName)
                .set(defaultCollateName).equalToWhenPresent(record::getDefaultCollateName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(maxlen).equalToWhenPresent(record::getMaxlen);
    }
}