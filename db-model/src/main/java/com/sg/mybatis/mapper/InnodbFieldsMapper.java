package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbFieldsDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbFields;
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
public interface InnodbFieldsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    BasicColumn[] selectList = BasicColumn.columnList(name, pos, indexId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbFields> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbFields> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbFieldsResult")
    Optional<InnodbFields> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbFieldsResult", value = {
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="POS", property="pos", jdbcType=JdbcType.BIGINT),
        @Result(column="INDEX_ID", property="indexId", jdbcType=JdbcType.VARBINARY)
    })
    List<InnodbFields> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    default int insert(InnodbFields record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFields, c ->
            c.map(name).toProperty("name")
            .map(pos).toProperty("pos")
            .map(indexId).toProperty("indexId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    default int insertMultiple(Collection<InnodbFields> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbFields, c ->
            c.map(name).toProperty("name")
            .map(pos).toProperty("pos")
            .map(indexId).toProperty("indexId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    default int insertSelective(InnodbFields record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFields, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(pos).toPropertyWhenPresent("pos", record::getPos)
            .map(indexId).toPropertyWhenPresent("indexId", record::getIndexId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    default Optional<InnodbFields> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    default List<InnodbFields> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    default List<InnodbFields> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbFields, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbFields record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(pos).equalTo(record::getPos)
                .set(indexId).equalTo(record::getIndexId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbFields record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(pos).equalToWhenPresent(record::getPos)
                .set(indexId).equalToWhenPresent(record::getIndexId);
    }
}