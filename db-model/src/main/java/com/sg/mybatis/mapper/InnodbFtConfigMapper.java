package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbFtConfigDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbFtConfig;
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
public interface InnodbFtConfigMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    BasicColumn[] selectList = BasicColumn.columnList(key, value);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source Table: INNODB_FT_CONFIG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source Table: INNODB_FT_CONFIG")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source Table: INNODB_FT_CONFIG")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbFtConfig> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source Table: INNODB_FT_CONFIG")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbFtConfig> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source Table: INNODB_FT_CONFIG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbFtConfigResult")
    Optional<InnodbFtConfig> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source Table: INNODB_FT_CONFIG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbFtConfigResult", value = {
        @Result(column="KEY", property="key", jdbcType=JdbcType.VARCHAR),
        @Result(column="VALUE", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbFtConfig> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbFtConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbFtConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    default int insert(InnodbFtConfig record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtConfig, c ->
            c.map(key).toProperty("key")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    default int insertMultiple(Collection<InnodbFtConfig> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbFtConfig, c ->
            c.map(key).toProperty("key")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    default int insertSelective(InnodbFtConfig record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtConfig, c ->
            c.map(key).toPropertyWhenPresent("key", record::getKey)
            .map(value).toPropertyWhenPresent("value", record::getValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    default Optional<InnodbFtConfig> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbFtConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    default List<InnodbFtConfig> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbFtConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    default List<InnodbFtConfig> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbFtConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbFtConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbFtConfig record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(key).equalTo(record::getKey)
                .set(value).equalTo(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.484+07:00", comments="Source Table: INNODB_FT_CONFIG")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbFtConfig record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(key).equalToWhenPresent(record::getKey)
                .set(value).equalToWhenPresent(record::getValue);
    }
}