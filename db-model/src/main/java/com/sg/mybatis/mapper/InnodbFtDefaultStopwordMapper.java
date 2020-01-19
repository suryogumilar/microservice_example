package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbFtDefaultStopwordDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbFtDefaultStopword;
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
public interface InnodbFtDefaultStopwordMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    BasicColumn[] selectList = BasicColumn.columnList(value);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbFtDefaultStopword> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbFtDefaultStopword> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbFtDefaultStopwordResult")
    Optional<InnodbFtDefaultStopword> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbFtDefaultStopwordResult", value = {
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbFtDefaultStopword> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbFtDefaultStopword, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbFtDefaultStopword, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    default int insert(InnodbFtDefaultStopword record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtDefaultStopword, c ->
            c.map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    default int insertMultiple(Collection<InnodbFtDefaultStopword> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbFtDefaultStopword, c ->
            c.map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    default int insertSelective(InnodbFtDefaultStopword record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtDefaultStopword, c ->
            c.map(value).toPropertyWhenPresent("value", record::getValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    default Optional<InnodbFtDefaultStopword> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbFtDefaultStopword, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    default List<InnodbFtDefaultStopword> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbFtDefaultStopword, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    default List<InnodbFtDefaultStopword> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbFtDefaultStopword, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.501+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbFtDefaultStopword, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.501+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbFtDefaultStopword record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(value).equalTo(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.501+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbFtDefaultStopword record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(value).equalToWhenPresent(record::getValue);
    }
}