package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.StatisticsDynamicSqlSupport.*;

import com.sg.mybatis.model.Statistics;
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
public interface StatisticsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.275+07:00", comments="Source Table: STATISTICS")
    BasicColumn[] selectList = BasicColumn.columnList(tableCatalog, tableSchema, tableName, nonUnique, indexSchema, indexName, seqInIndex, columnName, collation, cardinality, subPart, nullable, indexType, comment, indexComment, isVisible, packed, expression);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Statistics> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Statistics> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StatisticsResult")
    Optional<Statistics> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StatisticsResult", value = {
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="NON_UNIQUE", property="nonUnique", jdbcType=JdbcType.INTEGER),
        @Result(column="INDEX_SCHEMA", property="indexSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEX_NAME", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEQ_IN_INDEX", property="seqInIndex", jdbcType=JdbcType.INTEGER),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION", property="collation", jdbcType=JdbcType.VARCHAR),
        @Result(column="CARDINALITY", property="cardinality", jdbcType=JdbcType.BIGINT),
        @Result(column="SUB_PART", property="subPart", jdbcType=JdbcType.BIGINT),
        @Result(column="NULLABLE", property="nullable", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEX_TYPE", property="indexType", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEX_COMMENT", property="indexComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_VISIBLE", property="isVisible", jdbcType=JdbcType.VARCHAR),
        @Result(column="PACKED", property="packed", jdbcType=JdbcType.BINARY),
        @Result(column="EXPRESSION", property="expression", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Statistics> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source Table: STATISTICS")
    default int insert(Statistics record) {
        return MyBatis3Utils.insert(this::insert, record, statistics, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(nonUnique).toProperty("nonUnique")
            .map(indexSchema).toProperty("indexSchema")
            .map(indexName).toProperty("indexName")
            .map(seqInIndex).toProperty("seqInIndex")
            .map(columnName).toProperty("columnName")
            .map(collation).toProperty("collation")
            .map(cardinality).toProperty("cardinality")
            .map(subPart).toProperty("subPart")
            .map(nullable).toProperty("nullable")
            .map(indexType).toProperty("indexType")
            .map(comment).toProperty("comment")
            .map(indexComment).toProperty("indexComment")
            .map(isVisible).toProperty("isVisible")
            .map(packed).toProperty("packed")
            .map(expression).toProperty("expression")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.275+07:00", comments="Source Table: STATISTICS")
    default int insertMultiple(Collection<Statistics> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, statistics, c ->
            c.map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(nonUnique).toProperty("nonUnique")
            .map(indexSchema).toProperty("indexSchema")
            .map(indexName).toProperty("indexName")
            .map(seqInIndex).toProperty("seqInIndex")
            .map(columnName).toProperty("columnName")
            .map(collation).toProperty("collation")
            .map(cardinality).toProperty("cardinality")
            .map(subPart).toProperty("subPart")
            .map(nullable).toProperty("nullable")
            .map(indexType).toProperty("indexType")
            .map(comment).toProperty("comment")
            .map(indexComment).toProperty("indexComment")
            .map(isVisible).toProperty("isVisible")
            .map(packed).toProperty("packed")
            .map(expression).toProperty("expression")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.275+07:00", comments="Source Table: STATISTICS")
    default int insertSelective(Statistics record) {
        return MyBatis3Utils.insert(this::insert, record, statistics, c ->
            c.map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(nonUnique).toPropertyWhenPresent("nonUnique", record::getNonUnique)
            .map(indexSchema).toPropertyWhenPresent("indexSchema", record::getIndexSchema)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
            .map(seqInIndex).toPropertyWhenPresent("seqInIndex", record::getSeqInIndex)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(collation).toPropertyWhenPresent("collation", record::getCollation)
            .map(cardinality).toPropertyWhenPresent("cardinality", record::getCardinality)
            .map(subPart).toPropertyWhenPresent("subPart", record::getSubPart)
            .map(nullable).toPropertyWhenPresent("nullable", record::getNullable)
            .map(indexType).toPropertyWhenPresent("indexType", record::getIndexType)
            .map(comment).toPropertyWhenPresent("comment", record::getComment)
            .map(indexComment).toPropertyWhenPresent("indexComment", record::getIndexComment)
            .map(isVisible).toPropertyWhenPresent("isVisible", record::getIsVisible)
            .map(packed).toPropertyWhenPresent("packed", record::getPacked)
            .map(expression).toPropertyWhenPresent("expression", record::getExpression)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.275+07:00", comments="Source Table: STATISTICS")
    default Optional<Statistics> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.275+07:00", comments="Source Table: STATISTICS")
    default List<Statistics> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.275+07:00", comments="Source Table: STATISTICS")
    default List<Statistics> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.275+07:00", comments="Source Table: STATISTICS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.275+07:00", comments="Source Table: STATISTICS")
    static UpdateDSL<UpdateModel> updateAllColumns(Statistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(nonUnique).equalTo(record::getNonUnique)
                .set(indexSchema).equalTo(record::getIndexSchema)
                .set(indexName).equalTo(record::getIndexName)
                .set(seqInIndex).equalTo(record::getSeqInIndex)
                .set(columnName).equalTo(record::getColumnName)
                .set(collation).equalTo(record::getCollation)
                .set(cardinality).equalTo(record::getCardinality)
                .set(subPart).equalTo(record::getSubPart)
                .set(nullable).equalTo(record::getNullable)
                .set(indexType).equalTo(record::getIndexType)
                .set(comment).equalTo(record::getComment)
                .set(indexComment).equalTo(record::getIndexComment)
                .set(isVisible).equalTo(record::getIsVisible)
                .set(packed).equalTo(record::getPacked)
                .set(expression).equalTo(record::getExpression);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.276+07:00", comments="Source Table: STATISTICS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Statistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(nonUnique).equalToWhenPresent(record::getNonUnique)
                .set(indexSchema).equalToWhenPresent(record::getIndexSchema)
                .set(indexName).equalToWhenPresent(record::getIndexName)
                .set(seqInIndex).equalToWhenPresent(record::getSeqInIndex)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(collation).equalToWhenPresent(record::getCollation)
                .set(cardinality).equalToWhenPresent(record::getCardinality)
                .set(subPart).equalToWhenPresent(record::getSubPart)
                .set(nullable).equalToWhenPresent(record::getNullable)
                .set(indexType).equalToWhenPresent(record::getIndexType)
                .set(comment).equalToWhenPresent(record::getComment)
                .set(indexComment).equalToWhenPresent(record::getIndexComment)
                .set(isVisible).equalToWhenPresent(record::getIsVisible)
                .set(packed).equalToWhenPresent(record::getPacked)
                .set(expression).equalToWhenPresent(record::getExpression);
    }
}