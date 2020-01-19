package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.CollationsDynamicSqlSupport.*;

import com.sg.mybatis.model.Collations;
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
public interface CollationsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.095+07:00", comments="Source Table: COLLATIONS")
    BasicColumn[] selectList = BasicColumn.columnList(collationName, characterSetName, id, isDefault, isCompiled, sortlen, padAttribute);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Collations> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Collations> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CollationsResult")
    Optional<Collations> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CollationsResult", value = {
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="IS_DEFAULT", property="isDefault", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_COMPILED", property="isCompiled", jdbcType=JdbcType.VARCHAR),
        @Result(column="SORTLEN", property="sortlen", jdbcType=JdbcType.INTEGER),
        @Result(column="PAD_ATTRIBUTE", property="padAttribute", jdbcType=JdbcType.CHAR)
    })
    List<Collations> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, collations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, collations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    default int insert(Collations record) {
        return MyBatis3Utils.insert(this::insert, record, collations, c ->
            c.map(collationName).toProperty("collationName")
            .map(characterSetName).toProperty("characterSetName")
            .map(id).toProperty("id")
            .map(isDefault).toProperty("isDefault")
            .map(isCompiled).toProperty("isCompiled")
            .map(sortlen).toProperty("sortlen")
            .map(padAttribute).toProperty("padAttribute")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source Table: COLLATIONS")
    default int insertMultiple(Collection<Collations> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, collations, c ->
            c.map(collationName).toProperty("collationName")
            .map(characterSetName).toProperty("characterSetName")
            .map(id).toProperty("id")
            .map(isDefault).toProperty("isDefault")
            .map(isCompiled).toProperty("isCompiled")
            .map(sortlen).toProperty("sortlen")
            .map(padAttribute).toProperty("padAttribute")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.095+07:00", comments="Source Table: COLLATIONS")
    default int insertSelective(Collations record) {
        return MyBatis3Utils.insert(this::insert, record, collations, c ->
            c.map(collationName).toPropertyWhenPresent("collationName", record::getCollationName)
            .map(characterSetName).toPropertyWhenPresent("characterSetName", record::getCharacterSetName)
            .map(id).toPropertyWhenPresent("id", record::getId)
            .map(isDefault).toPropertyWhenPresent("isDefault", record::getIsDefault)
            .map(isCompiled).toPropertyWhenPresent("isCompiled", record::getIsCompiled)
            .map(sortlen).toPropertyWhenPresent("sortlen", record::getSortlen)
            .map(padAttribute).toPropertyWhenPresent("padAttribute", record::getPadAttribute)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.095+07:00", comments="Source Table: COLLATIONS")
    default Optional<Collations> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, collations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.095+07:00", comments="Source Table: COLLATIONS")
    default List<Collations> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, collations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.095+07:00", comments="Source Table: COLLATIONS")
    default List<Collations> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, collations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.095+07:00", comments="Source Table: COLLATIONS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, collations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.095+07:00", comments="Source Table: COLLATIONS")
    static UpdateDSL<UpdateModel> updateAllColumns(Collations record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(collationName).equalTo(record::getCollationName)
                .set(characterSetName).equalTo(record::getCharacterSetName)
                .set(id).equalTo(record::getId)
                .set(isDefault).equalTo(record::getIsDefault)
                .set(isCompiled).equalTo(record::getIsCompiled)
                .set(sortlen).equalTo(record::getSortlen)
                .set(padAttribute).equalTo(record::getPadAttribute);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.096+07:00", comments="Source Table: COLLATIONS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Collations record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(collationName).equalToWhenPresent(record::getCollationName)
                .set(characterSetName).equalToWhenPresent(record::getCharacterSetName)
                .set(id).equalToWhenPresent(record::getId)
                .set(isDefault).equalToWhenPresent(record::getIsDefault)
                .set(isCompiled).equalToWhenPresent(record::getIsCompiled)
                .set(sortlen).equalToWhenPresent(record::getSortlen)
                .set(padAttribute).equalToWhenPresent(record::getPadAttribute);
    }
}