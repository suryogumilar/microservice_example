package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbFtDeletedDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbFtDeleted;
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
public interface InnodbFtDeletedMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.251+07:00", comments="Source Table: INNODB_FT_DELETED")
    BasicColumn[] selectList = BasicColumn.columnList(docId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.249+07:00", comments="Source Table: INNODB_FT_DELETED")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.249+07:00", comments="Source Table: INNODB_FT_DELETED")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.249+07:00", comments="Source Table: INNODB_FT_DELETED")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbFtDeleted> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.249+07:00", comments="Source Table: INNODB_FT_DELETED")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbFtDeleted> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.249+07:00", comments="Source Table: INNODB_FT_DELETED")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbFtDeletedResult")
    Optional<InnodbFtDeleted> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.249+07:00", comments="Source Table: INNODB_FT_DELETED")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbFtDeletedResult", value = {
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtDeleted> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.25+07:00", comments="Source Table: INNODB_FT_DELETED")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.25+07:00", comments="Source Table: INNODB_FT_DELETED")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbFtDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.25+07:00", comments="Source Table: INNODB_FT_DELETED")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbFtDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.25+07:00", comments="Source Table: INNODB_FT_DELETED")
    default int insert(InnodbFtDeleted record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtDeleted, c ->
            c.map(docId).toProperty("docId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.25+07:00", comments="Source Table: INNODB_FT_DELETED")
    default int insertMultiple(Collection<InnodbFtDeleted> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbFtDeleted, c ->
            c.map(docId).toProperty("docId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.25+07:00", comments="Source Table: INNODB_FT_DELETED")
    default int insertSelective(InnodbFtDeleted record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtDeleted, c ->
            c.map(docId).toPropertyWhenPresent("docId", record::getDocId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.251+07:00", comments="Source Table: INNODB_FT_DELETED")
    default Optional<InnodbFtDeleted> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbFtDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.251+07:00", comments="Source Table: INNODB_FT_DELETED")
    default List<InnodbFtDeleted> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbFtDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.251+07:00", comments="Source Table: INNODB_FT_DELETED")
    default List<InnodbFtDeleted> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbFtDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.251+07:00", comments="Source Table: INNODB_FT_DELETED")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbFtDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.251+07:00", comments="Source Table: INNODB_FT_DELETED")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbFtDeleted record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(docId).equalTo(record::getDocId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.252+07:00", comments="Source Table: INNODB_FT_DELETED")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbFtDeleted record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(docId).equalToWhenPresent(record::getDocId);
    }
}