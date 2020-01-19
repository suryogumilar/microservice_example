package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.StSpatialReferenceSystemsDynamicSqlSupport.*;

import com.sg.mybatis.model.StSpatialReferenceSystems;
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
public interface StSpatialReferenceSystemsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.191+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    BasicColumn[] selectList = BasicColumn.columnList(srsName, srsId, organization, organizationCoordsysId, definition, description);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.184+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.184+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.184+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StSpatialReferenceSystems> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.185+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<StSpatialReferenceSystems> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.185+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StSpatialReferenceSystemsResult")
    Optional<StSpatialReferenceSystems> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.185+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StSpatialReferenceSystemsResult", value = {
        @Result(column="SRS_NAME", property="srsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SRS_ID", property="srsId", jdbcType=JdbcType.INTEGER),
        @Result(column="ORGANIZATION", property="organization", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORGANIZATION_COORDSYS_ID", property="organizationCoordsysId", jdbcType=JdbcType.INTEGER),
        @Result(column="DEFINITION", property="definition", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<StSpatialReferenceSystems> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.185+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.185+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, stSpatialReferenceSystems, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.185+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, stSpatialReferenceSystems, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.187+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    default int insert(StSpatialReferenceSystems record) {
        return MyBatis3Utils.insert(this::insert, record, stSpatialReferenceSystems, c ->
            c.map(srsName).toProperty("srsName")
            .map(srsId).toProperty("srsId")
            .map(organization).toProperty("organization")
            .map(organizationCoordsysId).toProperty("organizationCoordsysId")
            .map(definition).toProperty("definition")
            .map(description).toProperty("description")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.187+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    default int insertMultiple(Collection<StSpatialReferenceSystems> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, stSpatialReferenceSystems, c ->
            c.map(srsName).toProperty("srsName")
            .map(srsId).toProperty("srsId")
            .map(organization).toProperty("organization")
            .map(organizationCoordsysId).toProperty("organizationCoordsysId")
            .map(definition).toProperty("definition")
            .map(description).toProperty("description")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.191+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    default int insertSelective(StSpatialReferenceSystems record) {
        return MyBatis3Utils.insert(this::insert, record, stSpatialReferenceSystems, c ->
            c.map(srsName).toPropertyWhenPresent("srsName", record::getSrsName)
            .map(srsId).toPropertyWhenPresent("srsId", record::getSrsId)
            .map(organization).toPropertyWhenPresent("organization", record::getOrganization)
            .map(organizationCoordsysId).toPropertyWhenPresent("organizationCoordsysId", record::getOrganizationCoordsysId)
            .map(definition).toPropertyWhenPresent("definition", record::getDefinition)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.191+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    default Optional<StSpatialReferenceSystems> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, stSpatialReferenceSystems, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.191+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    default List<StSpatialReferenceSystems> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, stSpatialReferenceSystems, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.191+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    default List<StSpatialReferenceSystems> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, stSpatialReferenceSystems, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.191+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, stSpatialReferenceSystems, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.191+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    static UpdateDSL<UpdateModel> updateAllColumns(StSpatialReferenceSystems record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(srsName).equalTo(record::getSrsName)
                .set(srsId).equalTo(record::getSrsId)
                .set(organization).equalTo(record::getOrganization)
                .set(organizationCoordsysId).equalTo(record::getOrganizationCoordsysId)
                .set(definition).equalTo(record::getDefinition)
                .set(description).equalTo(record::getDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.192+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StSpatialReferenceSystems record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(srsName).equalToWhenPresent(record::getSrsName)
                .set(srsId).equalToWhenPresent(record::getSrsId)
                .set(organization).equalToWhenPresent(record::getOrganization)
                .set(organizationCoordsysId).equalToWhenPresent(record::getOrganizationCoordsysId)
                .set(definition).equalToWhenPresent(record::getDefinition)
                .set(description).equalToWhenPresent(record::getDescription);
    }
}