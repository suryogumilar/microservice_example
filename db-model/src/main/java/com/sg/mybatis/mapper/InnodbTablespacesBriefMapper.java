package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbTablespacesBriefDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbTablespacesBrief;
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
public interface InnodbTablespacesBriefMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.221+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    BasicColumn[] selectList = BasicColumn.columnList(name, path, spaceType, space, flag);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbTablespacesBrief> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbTablespacesBrief> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbTablespacesBriefResult")
    Optional<InnodbTablespacesBrief> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbTablespacesBriefResult", value = {
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="PATH", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPACE_TYPE", property="spaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.VARBINARY),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.VARBINARY)
    })
    List<InnodbTablespacesBrief> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbTablespacesBrief, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbTablespacesBrief, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.21+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    default int insert(InnodbTablespacesBrief record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTablespacesBrief, c ->
            c.map(name).toProperty("name")
            .map(path).toProperty("path")
            .map(spaceType).toProperty("spaceType")
            .map(space).toProperty("space")
            .map(flag).toProperty("flag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.221+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    default int insertMultiple(Collection<InnodbTablespacesBrief> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbTablespacesBrief, c ->
            c.map(name).toProperty("name")
            .map(path).toProperty("path")
            .map(spaceType).toProperty("spaceType")
            .map(space).toProperty("space")
            .map(flag).toProperty("flag")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.221+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    default int insertSelective(InnodbTablespacesBrief record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTablespacesBrief, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(path).toPropertyWhenPresent("path", record::getPath)
            .map(spaceType).toPropertyWhenPresent("spaceType", record::getSpaceType)
            .map(space).toPropertyWhenPresent("space", record::getSpace)
            .map(flag).toPropertyWhenPresent("flag", record::getFlag)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.221+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    default Optional<InnodbTablespacesBrief> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbTablespacesBrief, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.221+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    default List<InnodbTablespacesBrief> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbTablespacesBrief, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.221+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    default List<InnodbTablespacesBrief> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbTablespacesBrief, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.221+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbTablespacesBrief, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.222+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbTablespacesBrief record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(path).equalTo(record::getPath)
                .set(spaceType).equalTo(record::getSpaceType)
                .set(space).equalTo(record::getSpace)
                .set(flag).equalTo(record::getFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.222+07:00", comments="Source Table: INNODB_TABLESPACES_BRIEF")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbTablespacesBrief record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(path).equalToWhenPresent(record::getPath)
                .set(spaceType).equalToWhenPresent(record::getSpaceType)
                .set(space).equalToWhenPresent(record::getSpace)
                .set(flag).equalToWhenPresent(record::getFlag);
    }
}