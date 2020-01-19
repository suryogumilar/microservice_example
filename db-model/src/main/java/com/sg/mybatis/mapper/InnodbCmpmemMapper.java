package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbCmpmemDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbCmpmem;
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
public interface InnodbCmpmemMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.344+07:00", comments="Source Table: INNODB_CMPMEM")
    BasicColumn[] selectList = BasicColumn.columnList(pageSize, bufferPoolInstance, pagesUsed, pagesFree, relocationOps, relocationTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbCmpmem> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbCmpmem> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbCmpmemResult")
    Optional<InnodbCmpmem> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbCmpmemResult", value = {
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="buffer_pool_instance", property="bufferPoolInstance", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_used", property="pagesUsed", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_free", property="pagesFree", jdbcType=JdbcType.INTEGER),
        @Result(column="relocation_ops", property="relocationOps", jdbcType=JdbcType.BIGINT),
        @Result(column="relocation_time", property="relocationTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpmem> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbCmpmem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbCmpmem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    default int insert(InnodbCmpmem record) {
        return MyBatis3Utils.insert(this::insert, record, innodbCmpmem, c ->
            c.map(pageSize).toProperty("pageSize")
            .map(bufferPoolInstance).toProperty("bufferPoolInstance")
            .map(pagesUsed).toProperty("pagesUsed")
            .map(pagesFree).toProperty("pagesFree")
            .map(relocationOps).toProperty("relocationOps")
            .map(relocationTime).toProperty("relocationTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    default int insertMultiple(Collection<InnodbCmpmem> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbCmpmem, c ->
            c.map(pageSize).toProperty("pageSize")
            .map(bufferPoolInstance).toProperty("bufferPoolInstance")
            .map(pagesUsed).toProperty("pagesUsed")
            .map(pagesFree).toProperty("pagesFree")
            .map(relocationOps).toProperty("relocationOps")
            .map(relocationTime).toProperty("relocationTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.344+07:00", comments="Source Table: INNODB_CMPMEM")
    default int insertSelective(InnodbCmpmem record) {
        return MyBatis3Utils.insert(this::insert, record, innodbCmpmem, c ->
            c.map(pageSize).toPropertyWhenPresent("pageSize", record::getPageSize)
            .map(bufferPoolInstance).toPropertyWhenPresent("bufferPoolInstance", record::getBufferPoolInstance)
            .map(pagesUsed).toPropertyWhenPresent("pagesUsed", record::getPagesUsed)
            .map(pagesFree).toPropertyWhenPresent("pagesFree", record::getPagesFree)
            .map(relocationOps).toPropertyWhenPresent("relocationOps", record::getRelocationOps)
            .map(relocationTime).toPropertyWhenPresent("relocationTime", record::getRelocationTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.344+07:00", comments="Source Table: INNODB_CMPMEM")
    default Optional<InnodbCmpmem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbCmpmem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.344+07:00", comments="Source Table: INNODB_CMPMEM")
    default List<InnodbCmpmem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbCmpmem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.344+07:00", comments="Source Table: INNODB_CMPMEM")
    default List<InnodbCmpmem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbCmpmem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.344+07:00", comments="Source Table: INNODB_CMPMEM")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbCmpmem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.344+07:00", comments="Source Table: INNODB_CMPMEM")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbCmpmem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pageSize).equalTo(record::getPageSize)
                .set(bufferPoolInstance).equalTo(record::getBufferPoolInstance)
                .set(pagesUsed).equalTo(record::getPagesUsed)
                .set(pagesFree).equalTo(record::getPagesFree)
                .set(relocationOps).equalTo(record::getRelocationOps)
                .set(relocationTime).equalTo(record::getRelocationTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.344+07:00", comments="Source Table: INNODB_CMPMEM")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbCmpmem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pageSize).equalToWhenPresent(record::getPageSize)
                .set(bufferPoolInstance).equalToWhenPresent(record::getBufferPoolInstance)
                .set(pagesUsed).equalToWhenPresent(record::getPagesUsed)
                .set(pagesFree).equalToWhenPresent(record::getPagesFree)
                .set(relocationOps).equalToWhenPresent(record::getRelocationOps)
                .set(relocationTime).equalToWhenPresent(record::getRelocationTime);
    }
}