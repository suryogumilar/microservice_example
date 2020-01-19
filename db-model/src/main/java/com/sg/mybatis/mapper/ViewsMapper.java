package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.ViewsDynamicSqlSupport.*;

import com.sg.mybatis.model.Views;
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
public interface ViewsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    BasicColumn[] selectList = BasicColumn.columnList(tableCatalog, tableSchema, tableName, checkOption, isUpdatable, definer, securityType, characterSetClient, collationConnection, viewDefinition);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Views> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Views> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ViewsResult")
    Optional<Views> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ViewsResult", value = {
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_OPTION", property="checkOption", jdbcType=JdbcType.CHAR),
        @Result(column="IS_UPDATABLE", property="isUpdatable", jdbcType=JdbcType.CHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="SECURITY_TYPE", property="securityType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="VIEW_DEFINITION", property="viewDefinition", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Views> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, views, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, views, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    default int insert(Views record) {
        return MyBatis3Utils.insert(this::insert, record, views, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(checkOption).toProperty("checkOption")
            .map(isUpdatable).toProperty("isUpdatable")
            .map(definer).toProperty("definer")
            .map(securityType).toProperty("securityType")
            .map(characterSetClient).toProperty("characterSetClient")
            .map(collationConnection).toProperty("collationConnection")
            .map(viewDefinition).toProperty("viewDefinition")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    default int insertMultiple(Collection<Views> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, views, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(checkOption).toProperty("checkOption")
            .map(isUpdatable).toProperty("isUpdatable")
            .map(definer).toProperty("definer")
            .map(securityType).toProperty("securityType")
            .map(characterSetClient).toProperty("characterSetClient")
            .map(collationConnection).toProperty("collationConnection")
            .map(viewDefinition).toProperty("viewDefinition")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    default int insertSelective(Views record) {
        return MyBatis3Utils.insert(this::insert, record, views, c ->
            c.map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(checkOption).toPropertyWhenPresent("checkOption", record::getCheckOption)
            .map(isUpdatable).toPropertyWhenPresent("isUpdatable", record::getIsUpdatable)
            .map(definer).toPropertyWhenPresent("definer", record::getDefiner)
            .map(securityType).toPropertyWhenPresent("securityType", record::getSecurityType)
            .map(characterSetClient).toPropertyWhenPresent("characterSetClient", record::getCharacterSetClient)
            .map(collationConnection).toPropertyWhenPresent("collationConnection", record::getCollationConnection)
            .map(viewDefinition).toPropertyWhenPresent("viewDefinition", record::getViewDefinition)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    default Optional<Views> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, views, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    default List<Views> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, views, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    default List<Views> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, views, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, views, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    static UpdateDSL<UpdateModel> updateAllColumns(Views record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(checkOption).equalTo(record::getCheckOption)
                .set(isUpdatable).equalTo(record::getIsUpdatable)
                .set(definer).equalTo(record::getDefiner)
                .set(securityType).equalTo(record::getSecurityType)
                .set(characterSetClient).equalTo(record::getCharacterSetClient)
                .set(collationConnection).equalTo(record::getCollationConnection)
                .set(viewDefinition).equalTo(record::getViewDefinition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source Table: VIEWS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Views record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(checkOption).equalToWhenPresent(record::getCheckOption)
                .set(isUpdatable).equalToWhenPresent(record::getIsUpdatable)
                .set(definer).equalToWhenPresent(record::getDefiner)
                .set(securityType).equalToWhenPresent(record::getSecurityType)
                .set(characterSetClient).equalToWhenPresent(record::getCharacterSetClient)
                .set(collationConnection).equalToWhenPresent(record::getCollationConnection)
                .set(viewDefinition).equalToWhenPresent(record::getViewDefinition);
    }
}