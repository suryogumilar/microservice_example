package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ResourceGroupsDynamicSqlSupport.*;

import com.sg.mybatis.model.ResourceGroups;
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
public interface ResourceGroupsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    BasicColumn[] selectList = BasicColumn.columnList(resourceGroupName, resourceGroupType, resourceGroupEnabled, threadPriority, vcpuIds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ResourceGroups> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ResourceGroups> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ResourceGroupsResult")
    Optional<ResourceGroups> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ResourceGroupsResult", value = {
        @Result(column="RESOURCE_GROUP_NAME", property="resourceGroupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESOURCE_GROUP_TYPE", property="resourceGroupType", jdbcType=JdbcType.CHAR),
        @Result(column="RESOURCE_GROUP_ENABLED", property="resourceGroupEnabled", jdbcType=JdbcType.BIT),
        @Result(column="THREAD_PRIORITY", property="threadPriority", jdbcType=JdbcType.INTEGER),
        @Result(column="VCPU_IDS", property="vcpuIds", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<ResourceGroups> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, resourceGroups, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, resourceGroups, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    default int insert(ResourceGroups record) {
        return MyBatis3Utils.insert(this::insert, record, resourceGroups, c ->
            c.map(resourceGroupName).toProperty("resourceGroupName")
            .map(resourceGroupType).toProperty("resourceGroupType")
            .map(resourceGroupEnabled).toProperty("resourceGroupEnabled")
            .map(threadPriority).toProperty("threadPriority")
            .map(vcpuIds).toProperty("vcpuIds")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    default int insertMultiple(Collection<ResourceGroups> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, resourceGroups, c ->
            c.map(resourceGroupName).toProperty("resourceGroupName")
            .map(resourceGroupType).toProperty("resourceGroupType")
            .map(resourceGroupEnabled).toProperty("resourceGroupEnabled")
            .map(threadPriority).toProperty("threadPriority")
            .map(vcpuIds).toProperty("vcpuIds")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    default int insertSelective(ResourceGroups record) {
        return MyBatis3Utils.insert(this::insert, record, resourceGroups, c ->
            c.map(resourceGroupName).toPropertyWhenPresent("resourceGroupName", record::getResourceGroupName)
            .map(resourceGroupType).toPropertyWhenPresent("resourceGroupType", record::getResourceGroupType)
            .map(resourceGroupEnabled).toPropertyWhenPresent("resourceGroupEnabled", record::getResourceGroupEnabled)
            .map(threadPriority).toPropertyWhenPresent("threadPriority", record::getThreadPriority)
            .map(vcpuIds).toPropertyWhenPresent("vcpuIds", record::getVcpuIds)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    default Optional<ResourceGroups> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, resourceGroups, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    default List<ResourceGroups> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, resourceGroups, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    default List<ResourceGroups> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, resourceGroups, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, resourceGroups, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    static UpdateDSL<UpdateModel> updateAllColumns(ResourceGroups record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(resourceGroupName).equalTo(record::getResourceGroupName)
                .set(resourceGroupType).equalTo(record::getResourceGroupType)
                .set(resourceGroupEnabled).equalTo(record::getResourceGroupEnabled)
                .set(threadPriority).equalTo(record::getThreadPriority)
                .set(vcpuIds).equalTo(record::getVcpuIds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ResourceGroups record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(resourceGroupName).equalToWhenPresent(record::getResourceGroupName)
                .set(resourceGroupType).equalToWhenPresent(record::getResourceGroupType)
                .set(resourceGroupEnabled).equalToWhenPresent(record::getResourceGroupEnabled)
                .set(threadPriority).equalToWhenPresent(record::getThreadPriority)
                .set(vcpuIds).equalToWhenPresent(record::getVcpuIds);
    }
}