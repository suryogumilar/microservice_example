package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbTempTableInfoDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbTempTableInfo;
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
public interface InnodbTempTableInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    BasicColumn[] selectList = BasicColumn.columnList(tableId, name, nCols, space);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.203+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.203+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.203+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbTempTableInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.203+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbTempTableInfo> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.203+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbTempTableInfoResult")
    Optional<InnodbTempTableInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.203+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbTempTableInfoResult", value = {
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="N_COLS", property="nCols", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbTempTableInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbTempTableInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbTempTableInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    default int insert(InnodbTempTableInfo record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTempTableInfo, c ->
            c.map(tableId).toProperty("tableId")
            .map(name).toProperty("name")
            .map(nCols).toProperty("nCols")
            .map(space).toProperty("space")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    default int insertMultiple(Collection<InnodbTempTableInfo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbTempTableInfo, c ->
            c.map(tableId).toProperty("tableId")
            .map(name).toProperty("name")
            .map(nCols).toProperty("nCols")
            .map(space).toProperty("space")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    default int insertSelective(InnodbTempTableInfo record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTempTableInfo, c ->
            c.map(tableId).toPropertyWhenPresent("tableId", record::getTableId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(nCols).toPropertyWhenPresent("nCols", record::getnCols)
            .map(space).toPropertyWhenPresent("space", record::getSpace)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    default Optional<InnodbTempTableInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbTempTableInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    default List<InnodbTempTableInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbTempTableInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.204+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    default List<InnodbTempTableInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbTempTableInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.205+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbTempTableInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.205+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbTempTableInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalTo(record::getTableId)
                .set(name).equalTo(record::getName)
                .set(nCols).equalTo(record::getnCols)
                .set(space).equalTo(record::getSpace);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.205+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbTempTableInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableId).equalToWhenPresent(record::getTableId)
                .set(name).equalToWhenPresent(record::getName)
                .set(nCols).equalToWhenPresent(record::getnCols)
                .set(space).equalToWhenPresent(record::getSpace);
    }
}