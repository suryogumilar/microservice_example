package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.PluginsDynamicSqlSupport.*;

import com.sg.mybatis.model.Plugins;
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
public interface PluginsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.036+07:00", comments="Source Table: PLUGINS")
    BasicColumn[] selectList = BasicColumn.columnList(pluginName, pluginVersion, pluginStatus, pluginType, pluginTypeVersion, pluginLibrary, pluginLibraryVersion, pluginAuthor, pluginDescription, pluginLicense, loadOption);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source Table: PLUGINS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source Table: PLUGINS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source Table: PLUGINS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Plugins> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source Table: PLUGINS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Plugins> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source Table: PLUGINS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PluginsResult")
    Optional<Plugins> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source Table: PLUGINS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PluginsResult", value = {
        @Result(column="PLUGIN_NAME", property="pluginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_VERSION", property="pluginVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_STATUS", property="pluginStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE", property="pluginType", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE_VERSION", property="pluginTypeVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY", property="pluginLibrary", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY_VERSION", property="pluginLibraryVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_AUTHOR", property="pluginAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_DESCRIPTION", property="pluginDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LICENSE", property="pluginLicense", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOAD_OPTION", property="loadOption", jdbcType=JdbcType.VARCHAR)
    })
    List<Plugins> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.036+07:00", comments="Source Table: PLUGINS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.036+07:00", comments="Source Table: PLUGINS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, plugins, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.036+07:00", comments="Source Table: PLUGINS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, plugins, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.036+07:00", comments="Source Table: PLUGINS")
    default int insert(Plugins record) {
        return MyBatis3Utils.insert(this::insert, record, plugins, c ->
            c.map(pluginName).toProperty("pluginName")
            .map(pluginVersion).toProperty("pluginVersion")
            .map(pluginStatus).toProperty("pluginStatus")
            .map(pluginType).toProperty("pluginType")
            .map(pluginTypeVersion).toProperty("pluginTypeVersion")
            .map(pluginLibrary).toProperty("pluginLibrary")
            .map(pluginLibraryVersion).toProperty("pluginLibraryVersion")
            .map(pluginAuthor).toProperty("pluginAuthor")
            .map(pluginDescription).toProperty("pluginDescription")
            .map(pluginLicense).toProperty("pluginLicense")
            .map(loadOption).toProperty("loadOption")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.036+07:00", comments="Source Table: PLUGINS")
    default int insertMultiple(Collection<Plugins> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, plugins, c ->
            c.map(pluginName).toProperty("pluginName")
            .map(pluginVersion).toProperty("pluginVersion")
            .map(pluginStatus).toProperty("pluginStatus")
            .map(pluginType).toProperty("pluginType")
            .map(pluginTypeVersion).toProperty("pluginTypeVersion")
            .map(pluginLibrary).toProperty("pluginLibrary")
            .map(pluginLibraryVersion).toProperty("pluginLibraryVersion")
            .map(pluginAuthor).toProperty("pluginAuthor")
            .map(pluginDescription).toProperty("pluginDescription")
            .map(pluginLicense).toProperty("pluginLicense")
            .map(loadOption).toProperty("loadOption")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.036+07:00", comments="Source Table: PLUGINS")
    default int insertSelective(Plugins record) {
        return MyBatis3Utils.insert(this::insert, record, plugins, c ->
            c.map(pluginName).toPropertyWhenPresent("pluginName", record::getPluginName)
            .map(pluginVersion).toPropertyWhenPresent("pluginVersion", record::getPluginVersion)
            .map(pluginStatus).toPropertyWhenPresent("pluginStatus", record::getPluginStatus)
            .map(pluginType).toPropertyWhenPresent("pluginType", record::getPluginType)
            .map(pluginTypeVersion).toPropertyWhenPresent("pluginTypeVersion", record::getPluginTypeVersion)
            .map(pluginLibrary).toPropertyWhenPresent("pluginLibrary", record::getPluginLibrary)
            .map(pluginLibraryVersion).toPropertyWhenPresent("pluginLibraryVersion", record::getPluginLibraryVersion)
            .map(pluginAuthor).toPropertyWhenPresent("pluginAuthor", record::getPluginAuthor)
            .map(pluginDescription).toPropertyWhenPresent("pluginDescription", record::getPluginDescription)
            .map(pluginLicense).toPropertyWhenPresent("pluginLicense", record::getPluginLicense)
            .map(loadOption).toPropertyWhenPresent("loadOption", record::getLoadOption)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.037+07:00", comments="Source Table: PLUGINS")
    default Optional<Plugins> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, plugins, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.037+07:00", comments="Source Table: PLUGINS")
    default List<Plugins> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, plugins, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.037+07:00", comments="Source Table: PLUGINS")
    default List<Plugins> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, plugins, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.037+07:00", comments="Source Table: PLUGINS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, plugins, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.037+07:00", comments="Source Table: PLUGINS")
    static UpdateDSL<UpdateModel> updateAllColumns(Plugins record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pluginName).equalTo(record::getPluginName)
                .set(pluginVersion).equalTo(record::getPluginVersion)
                .set(pluginStatus).equalTo(record::getPluginStatus)
                .set(pluginType).equalTo(record::getPluginType)
                .set(pluginTypeVersion).equalTo(record::getPluginTypeVersion)
                .set(pluginLibrary).equalTo(record::getPluginLibrary)
                .set(pluginLibraryVersion).equalTo(record::getPluginLibraryVersion)
                .set(pluginAuthor).equalTo(record::getPluginAuthor)
                .set(pluginDescription).equalTo(record::getPluginDescription)
                .set(pluginLicense).equalTo(record::getPluginLicense)
                .set(loadOption).equalTo(record::getLoadOption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.037+07:00", comments="Source Table: PLUGINS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Plugins record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pluginName).equalToWhenPresent(record::getPluginName)
                .set(pluginVersion).equalToWhenPresent(record::getPluginVersion)
                .set(pluginStatus).equalToWhenPresent(record::getPluginStatus)
                .set(pluginType).equalToWhenPresent(record::getPluginType)
                .set(pluginTypeVersion).equalToWhenPresent(record::getPluginTypeVersion)
                .set(pluginLibrary).equalToWhenPresent(record::getPluginLibrary)
                .set(pluginLibraryVersion).equalToWhenPresent(record::getPluginLibraryVersion)
                .set(pluginAuthor).equalToWhenPresent(record::getPluginAuthor)
                .set(pluginDescription).equalToWhenPresent(record::getPluginDescription)
                .set(pluginLicense).equalToWhenPresent(record::getPluginLicense)
                .set(loadOption).equalToWhenPresent(record::getLoadOption);
    }
}