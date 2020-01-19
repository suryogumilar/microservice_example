package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbFtBeingDeletedDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbFtBeingDeleted;
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
public interface InnodbFtBeingDeletedMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    BasicColumn[] selectList = BasicColumn.columnList(docId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbFtBeingDeleted> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbFtBeingDeleted> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbFtBeingDeletedResult")
    Optional<InnodbFtBeingDeleted> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbFtBeingDeletedResult", value = {
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtBeingDeleted> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbFtBeingDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbFtBeingDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    default int insert(InnodbFtBeingDeleted record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtBeingDeleted, c ->
            c.map(docId).toProperty("docId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    default int insertMultiple(Collection<InnodbFtBeingDeleted> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbFtBeingDeleted, c ->
            c.map(docId).toProperty("docId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    default int insertSelective(InnodbFtBeingDeleted record) {
        return MyBatis3Utils.insert(this::insert, record, innodbFtBeingDeleted, c ->
            c.map(docId).toPropertyWhenPresent("docId", record::getDocId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    default Optional<InnodbFtBeingDeleted> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbFtBeingDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    default List<InnodbFtBeingDeleted> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbFtBeingDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    default List<InnodbFtBeingDeleted> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbFtBeingDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbFtBeingDeleted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbFtBeingDeleted record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(docId).equalTo(record::getDocId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbFtBeingDeleted record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(docId).equalToWhenPresent(record::getDocId);
    }
}