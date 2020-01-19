package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbColumnsDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbColumns;
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
public interface InnodbColumnsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    BasicColumn[] selectList = BasicColumn.columnList(tableId, name, pos, mtype, prtype, len, hasDefault, defaultValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source Table: INNODB_COLUMNS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbColumns> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbColumns> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbColumnsResult")
    Optional<InnodbColumns> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbColumnsResult", value = {
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="POS", property="pos", jdbcType=JdbcType.BIGINT),
        @Result(column="MTYPE", property="mtype", jdbcType=JdbcType.INTEGER),
        @Result(column="PRTYPE", property="prtype", jdbcType=JdbcType.INTEGER),
        @Result(column="LEN", property="len", jdbcType=JdbcType.INTEGER),
        @Result(column="HAS_DEFAULT", property="hasDefault", jdbcType=JdbcType.INTEGER),
        @Result(column="DEFAULT_VALUE", property="defaultValue", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<InnodbColumns> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    default int insert(InnodbColumns record) {
        return MyBatis3Utils.insert(this::insert, record, innodbColumns, c ->
            c.map(tableId).toProperty("tableId")
            .map(name).toProperty("name")
            .map(pos).toProperty("pos")
            .map(mtype).toProperty("mtype")
            .map(prtype).toProperty("prtype")
            .map(len).toProperty("len")
            .map(hasDefault).toProperty("hasDefault")
            .map(defaultValue).toProperty("defaultValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    default int insertMultiple(Collection<InnodbColumns> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbColumns, c ->
            c.map(tableId).toProperty("tableId")
            .map(name).toProperty("name")
            .map(pos).toProperty("pos")
            .map(mtype).toProperty("mtype")
            .map(prtype).toProperty("prtype")
            .map(len).toProperty("len")
            .map(hasDefault).toProperty("hasDefault")
            .map(defaultValue).toProperty("defaultValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    default int insertSelective(InnodbColumns record) {
        return MyBatis3Utils.insert(this::insert, record, innodbColumns, c ->
            c.map(tableId).toPropertyWhenPresent("tableId", record::getTableId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(pos).toPropertyWhenPresent("pos", record::getPos)
            .map(mtype).toPropertyWhenPresent("mtype", record::getMtype)
            .map(prtype).toPropertyWhenPresent("prtype", record::getPrtype)
            .map(len).toPropertyWhenPresent("len", record::getLen)
            .map(hasDefault).toPropertyWhenPresent("hasDefault", record::getHasDefault)
            .map(defaultValue).toPropertyWhenPresent("defaultValue", record::getDefaultValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    default Optional<InnodbColumns> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    default List<InnodbColumns> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.405+07:00", comments="Source Table: INNODB_COLUMNS")
    default List<InnodbColumns> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.406+07:00", comments="Source Table: INNODB_COLUMNS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbColumns, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.406+07:00", comments="Source Table: INNODB_COLUMNS")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbColumns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalTo(record::getTableId)
                .set(name).equalTo(record::getName)
                .set(pos).equalTo(record::getPos)
                .set(mtype).equalTo(record::getMtype)
                .set(prtype).equalTo(record::getPrtype)
                .set(len).equalTo(record::getLen)
                .set(hasDefault).equalTo(record::getHasDefault)
                .set(defaultValue).equalTo(record::getDefaultValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.406+07:00", comments="Source Table: INNODB_COLUMNS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbColumns record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalToWhenPresent(record::getTableId)
                .set(name).equalToWhenPresent(record::getName)
                .set(pos).equalToWhenPresent(record::getPos)
                .set(mtype).equalToWhenPresent(record::getMtype)
                .set(prtype).equalToWhenPresent(record::getPrtype)
                .set(len).equalToWhenPresent(record::getLen)
                .set(hasDefault).equalToWhenPresent(record::getHasDefault)
                .set(defaultValue).equalToWhenPresent(record::getDefaultValue);
    }
}