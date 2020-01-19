package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbDatafilesDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbDatafiles;
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
public interface InnodbDatafilesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    BasicColumn[] selectList = BasicColumn.columnList(path, space);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_DATAFILES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_DATAFILES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_DATAFILES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbDatafiles> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_DATAFILES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbDatafiles> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_DATAFILES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbDatafilesResult")
    Optional<InnodbDatafiles> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbDatafilesResult", value = {
        @Result(column="PATH", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.VARBINARY)
    })
    List<InnodbDatafiles> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbDatafiles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbDatafiles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    default int insert(InnodbDatafiles record) {
        return MyBatis3Utils.insert(this::insert, record, innodbDatafiles, c ->
            c.map(path).toProperty("path")
            .map(space).toProperty("space")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    default int insertMultiple(Collection<InnodbDatafiles> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbDatafiles, c ->
            c.map(path).toProperty("path")
            .map(space).toProperty("space")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    default int insertSelective(InnodbDatafiles record) {
        return MyBatis3Utils.insert(this::insert, record, innodbDatafiles, c ->
            c.map(path).toPropertyWhenPresent("path", record::getPath)
            .map(space).toPropertyWhenPresent("space", record::getSpace)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    default Optional<InnodbDatafiles> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbDatafiles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    default List<InnodbDatafiles> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbDatafiles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    default List<InnodbDatafiles> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbDatafiles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbDatafiles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbDatafiles record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(path).equalTo(record::getPath)
                .set(space).equalTo(record::getSpace);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.529+07:00", comments="Source Table: INNODB_DATAFILES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbDatafiles record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(path).equalToWhenPresent(record::getPath)
                .set(space).equalToWhenPresent(record::getSpace);
    }
}