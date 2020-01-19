package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.TablespacesDynamicSqlSupport.*;

import com.sg.mybatis.model.Tablespaces;
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
public interface TablespacesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.286+07:00", comments="Source Table: TABLESPACES")
    BasicColumn[] selectList = BasicColumn.columnList(tablespaceName, engine, tablespaceType, logfileGroupName, extentSize, autoextendSize, maximumSize, nodegroupId, tablespaceComment);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Tablespaces> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Tablespaces> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TablespacesResult")
    Optional<Tablespaces> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TablespacesResult", value = {
        @Result(column="TABLESPACE_NAME", property="tablespaceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLESPACE_TYPE", property="tablespaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGFILE_GROUP_NAME", property="logfileGroupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTENT_SIZE", property="extentSize", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTOEXTEND_SIZE", property="autoextendSize", jdbcType=JdbcType.BIGINT),
        @Result(column="MAXIMUM_SIZE", property="maximumSize", jdbcType=JdbcType.BIGINT),
        @Result(column="NODEGROUP_ID", property="nodegroupId", jdbcType=JdbcType.BIGINT),
        @Result(column="TABLESPACE_COMMENT", property="tablespaceComment", jdbcType=JdbcType.VARCHAR)
    })
    List<Tablespaces> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    default int insert(Tablespaces record) {
        return MyBatis3Utils.insert(this::insert, record, tablespaces, c ->
            c.map(tablespaceName).toProperty("tablespaceName")
            .map(engine).toProperty("engine")
            .map(tablespaceType).toProperty("tablespaceType")
            .map(logfileGroupName).toProperty("logfileGroupName")
            .map(extentSize).toProperty("extentSize")
            .map(autoextendSize).toProperty("autoextendSize")
            .map(maximumSize).toProperty("maximumSize")
            .map(nodegroupId).toProperty("nodegroupId")
            .map(tablespaceComment).toProperty("tablespaceComment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.285+07:00", comments="Source Table: TABLESPACES")
    default int insertMultiple(Collection<Tablespaces> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tablespaces, c ->
            c.map(tablespaceName).toProperty("tablespaceName")
            .map(engine).toProperty("engine")
            .map(tablespaceType).toProperty("tablespaceType")
            .map(logfileGroupName).toProperty("logfileGroupName")
            .map(extentSize).toProperty("extentSize")
            .map(autoextendSize).toProperty("autoextendSize")
            .map(maximumSize).toProperty("maximumSize")
            .map(nodegroupId).toProperty("nodegroupId")
            .map(tablespaceComment).toProperty("tablespaceComment")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.286+07:00", comments="Source Table: TABLESPACES")
    default int insertSelective(Tablespaces record) {
        return MyBatis3Utils.insert(this::insert, record, tablespaces, c ->
            c.map(tablespaceName).toPropertyWhenPresent("tablespaceName", record::getTablespaceName)
            .map(engine).toPropertyWhenPresent("engine", record::getEngine)
            .map(tablespaceType).toPropertyWhenPresent("tablespaceType", record::getTablespaceType)
            .map(logfileGroupName).toPropertyWhenPresent("logfileGroupName", record::getLogfileGroupName)
            .map(extentSize).toPropertyWhenPresent("extentSize", record::getExtentSize)
            .map(autoextendSize).toPropertyWhenPresent("autoextendSize", record::getAutoextendSize)
            .map(maximumSize).toPropertyWhenPresent("maximumSize", record::getMaximumSize)
            .map(nodegroupId).toPropertyWhenPresent("nodegroupId", record::getNodegroupId)
            .map(tablespaceComment).toPropertyWhenPresent("tablespaceComment", record::getTablespaceComment)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.286+07:00", comments="Source Table: TABLESPACES")
    default Optional<Tablespaces> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.286+07:00", comments="Source Table: TABLESPACES")
    default List<Tablespaces> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.286+07:00", comments="Source Table: TABLESPACES")
    default List<Tablespaces> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.286+07:00", comments="Source Table: TABLESPACES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.286+07:00", comments="Source Table: TABLESPACES")
    static UpdateDSL<UpdateModel> updateAllColumns(Tablespaces record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tablespaceName).equalTo(record::getTablespaceName)
                .set(engine).equalTo(record::getEngine)
                .set(tablespaceType).equalTo(record::getTablespaceType)
                .set(logfileGroupName).equalTo(record::getLogfileGroupName)
                .set(extentSize).equalTo(record::getExtentSize)
                .set(autoextendSize).equalTo(record::getAutoextendSize)
                .set(maximumSize).equalTo(record::getMaximumSize)
                .set(nodegroupId).equalTo(record::getNodegroupId)
                .set(tablespaceComment).equalTo(record::getTablespaceComment);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.286+07:00", comments="Source Table: TABLESPACES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Tablespaces record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tablespaceName).equalToWhenPresent(record::getTablespaceName)
                .set(engine).equalToWhenPresent(record::getEngine)
                .set(tablespaceType).equalToWhenPresent(record::getTablespaceType)
                .set(logfileGroupName).equalToWhenPresent(record::getLogfileGroupName)
                .set(extentSize).equalToWhenPresent(record::getExtentSize)
                .set(autoextendSize).equalToWhenPresent(record::getAutoextendSize)
                .set(maximumSize).equalToWhenPresent(record::getMaximumSize)
                .set(nodegroupId).equalToWhenPresent(record::getNodegroupId)
                .set(tablespaceComment).equalToWhenPresent(record::getTablespaceComment);
    }
}