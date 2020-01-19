package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbVirtualDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbVirtual;
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
public interface InnodbVirtualMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    BasicColumn[] selectList = BasicColumn.columnList(tableId, pos, basePos);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbVirtual> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbVirtual> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbVirtualResult")
    Optional<InnodbVirtual> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbVirtualResult", value = {
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="POS", property="pos", jdbcType=JdbcType.INTEGER),
        @Result(column="BASE_POS", property="basePos", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbVirtual> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbVirtual, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbVirtual, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    default int insert(InnodbVirtual record) {
        return MyBatis3Utils.insert(this::insert, record, innodbVirtual, c ->
            c.map(tableId).toProperty("tableId")
            .map(pos).toProperty("pos")
            .map(basePos).toProperty("basePos")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    default int insertMultiple(Collection<InnodbVirtual> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbVirtual, c ->
            c.map(tableId).toProperty("tableId")
            .map(pos).toProperty("pos")
            .map(basePos).toProperty("basePos")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    default int insertSelective(InnodbVirtual record) {
        return MyBatis3Utils.insert(this::insert, record, innodbVirtual, c ->
            c.map(tableId).toPropertyWhenPresent("tableId", record::getTableId)
            .map(pos).toPropertyWhenPresent("pos", record::getPos)
            .map(basePos).toPropertyWhenPresent("basePos", record::getBasePos)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    default Optional<InnodbVirtual> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbVirtual, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    default List<InnodbVirtual> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbVirtual, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    default List<InnodbVirtual> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbVirtual, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbVirtual, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbVirtual record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalTo(record::getTableId)
                .set(pos).equalTo(record::getPos)
                .set(basePos).equalTo(record::getBasePos);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_VIRTUAL")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbVirtual record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalToWhenPresent(record::getTableId)
                .set(pos).equalToWhenPresent(record::getPos)
                .set(basePos).equalToWhenPresent(record::getBasePos);
    }
}