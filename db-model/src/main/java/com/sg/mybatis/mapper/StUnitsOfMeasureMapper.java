package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.StUnitsOfMeasureDynamicSqlSupport.*;

import com.sg.mybatis.model.StUnitsOfMeasure;
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
public interface StUnitsOfMeasureMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.516+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    BasicColumn[] selectList = BasicColumn.columnList(unitName, unitType, conversionFactor, description);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StUnitsOfMeasure> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<StUnitsOfMeasure> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StUnitsOfMeasureResult")
    Optional<StUnitsOfMeasure> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StUnitsOfMeasureResult", value = {
        @Result(column="UNIT_NAME", property="unitName", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIT_TYPE", property="unitType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONVERSION_FACTOR", property="conversionFactor", jdbcType=JdbcType.DOUBLE),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<StUnitsOfMeasure> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, stUnitsOfMeasure, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, stUnitsOfMeasure, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    default int insert(StUnitsOfMeasure record) {
        return MyBatis3Utils.insert(this::insert, record, stUnitsOfMeasure, c ->
            c.map(unitName).toProperty("unitName")
            .map(unitType).toProperty("unitType")
            .map(conversionFactor).toProperty("conversionFactor")
            .map(description).toProperty("description")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    default int insertMultiple(Collection<StUnitsOfMeasure> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, stUnitsOfMeasure, c ->
            c.map(unitName).toProperty("unitName")
            .map(unitType).toProperty("unitType")
            .map(conversionFactor).toProperty("conversionFactor")
            .map(description).toProperty("description")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    default int insertSelective(StUnitsOfMeasure record) {
        return MyBatis3Utils.insert(this::insert, record, stUnitsOfMeasure, c ->
            c.map(unitName).toPropertyWhenPresent("unitName", record::getUnitName)
            .map(unitType).toPropertyWhenPresent("unitType", record::getUnitType)
            .map(conversionFactor).toPropertyWhenPresent("conversionFactor", record::getConversionFactor)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.517+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    default Optional<StUnitsOfMeasure> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, stUnitsOfMeasure, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.517+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    default List<StUnitsOfMeasure> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, stUnitsOfMeasure, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.517+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    default List<StUnitsOfMeasure> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, stUnitsOfMeasure, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.517+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, stUnitsOfMeasure, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.517+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    static UpdateDSL<UpdateModel> updateAllColumns(StUnitsOfMeasure record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(unitName).equalTo(record::getUnitName)
                .set(unitType).equalTo(record::getUnitType)
                .set(conversionFactor).equalTo(record::getConversionFactor)
                .set(description).equalTo(record::getDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.518+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StUnitsOfMeasure record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(unitName).equalToWhenPresent(record::getUnitName)
                .set(unitType).equalToWhenPresent(record::getUnitType)
                .set(conversionFactor).equalToWhenPresent(record::getConversionFactor)
                .set(description).equalToWhenPresent(record::getDescription);
    }
}