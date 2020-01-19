package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbTablesDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbTables;
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
public interface InnodbTablesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.049+07:00", comments="Source Table: INNODB_TABLES")
    BasicColumn[] selectList = BasicColumn.columnList(tableId, name, flag, nCols, space, rowFormat, zipPageSize, spaceType, instantCols);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbTables> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbTables> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbTablesResult")
    Optional<InnodbTables> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbTablesResult", value = {
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="N_COLS", property="nCols", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.BIGINT),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZIP_PAGE_SIZE", property="zipPageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE_TYPE", property="spaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="INSTANT_COLS", property="instantCols", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbTables> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    default int insert(InnodbTables record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTables, c ->
            c.map(tableId).toProperty("tableId")
            .map(name).toProperty("name")
            .map(flag).toProperty("flag")
            .map(nCols).toProperty("nCols")
            .map(space).toProperty("space")
            .map(rowFormat).toProperty("rowFormat")
            .map(zipPageSize).toProperty("zipPageSize")
            .map(spaceType).toProperty("spaceType")
            .map(instantCols).toProperty("instantCols")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.047+07:00", comments="Source Table: INNODB_TABLES")
    default int insertMultiple(Collection<InnodbTables> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbTables, c ->
            c.map(tableId).toProperty("tableId")
            .map(name).toProperty("name")
            .map(flag).toProperty("flag")
            .map(nCols).toProperty("nCols")
            .map(space).toProperty("space")
            .map(rowFormat).toProperty("rowFormat")
            .map(zipPageSize).toProperty("zipPageSize")
            .map(spaceType).toProperty("spaceType")
            .map(instantCols).toProperty("instantCols")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.049+07:00", comments="Source Table: INNODB_TABLES")
    default int insertSelective(InnodbTables record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTables, c ->
            c.map(tableId).toPropertyWhenPresent("tableId", record::getTableId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(flag).toPropertyWhenPresent("flag", record::getFlag)
            .map(nCols).toPropertyWhenPresent("nCols", record::getnCols)
            .map(space).toPropertyWhenPresent("space", record::getSpace)
            .map(rowFormat).toPropertyWhenPresent("rowFormat", record::getRowFormat)
            .map(zipPageSize).toPropertyWhenPresent("zipPageSize", record::getZipPageSize)
            .map(spaceType).toPropertyWhenPresent("spaceType", record::getSpaceType)
            .map(instantCols).toPropertyWhenPresent("instantCols", record::getInstantCols)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.049+07:00", comments="Source Table: INNODB_TABLES")
    default Optional<InnodbTables> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.049+07:00", comments="Source Table: INNODB_TABLES")
    default List<InnodbTables> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.049+07:00", comments="Source Table: INNODB_TABLES")
    default List<InnodbTables> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.049+07:00", comments="Source Table: INNODB_TABLES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.05+07:00", comments="Source Table: INNODB_TABLES")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbTables record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalTo(record::getTableId)
                .set(name).equalTo(record::getName)
                .set(flag).equalTo(record::getFlag)
                .set(nCols).equalTo(record::getnCols)
                .set(space).equalTo(record::getSpace)
                .set(rowFormat).equalTo(record::getRowFormat)
                .set(zipPageSize).equalTo(record::getZipPageSize)
                .set(spaceType).equalTo(record::getSpaceType)
                .set(instantCols).equalTo(record::getInstantCols);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.05+07:00", comments="Source Table: INNODB_TABLES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbTables record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalToWhenPresent(record::getTableId)
                .set(name).equalToWhenPresent(record::getName)
                .set(flag).equalToWhenPresent(record::getFlag)
                .set(nCols).equalToWhenPresent(record::getnCols)
                .set(space).equalToWhenPresent(record::getSpace)
                .set(rowFormat).equalToWhenPresent(record::getRowFormat)
                .set(zipPageSize).equalToWhenPresent(record::getZipPageSize)
                .set(spaceType).equalToWhenPresent(record::getSpaceType)
                .set(instantCols).equalToWhenPresent(record::getInstantCols);
    }
}