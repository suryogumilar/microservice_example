package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbForeignDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbForeign;
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
public interface InnodbForeignMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    BasicColumn[] selectList = BasicColumn.columnList(id, forName, refName, nCols, type);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.326+07:00", comments="Source Table: INNODB_FOREIGN")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.326+07:00", comments="Source Table: INNODB_FOREIGN")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.326+07:00", comments="Source Table: INNODB_FOREIGN")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbForeign> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.326+07:00", comments="Source Table: INNODB_FOREIGN")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbForeign> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.326+07:00", comments="Source Table: INNODB_FOREIGN")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbForeignResult")
    Optional<InnodbForeign> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.326+07:00", comments="Source Table: INNODB_FOREIGN")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbForeignResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOR_NAME", property="forName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REF_NAME", property="refName", jdbcType=JdbcType.VARCHAR),
        @Result(column="N_COLS", property="nCols", jdbcType=JdbcType.BIGINT),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbForeign> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.326+07:00", comments="Source Table: INNODB_FOREIGN")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.326+07:00", comments="Source Table: INNODB_FOREIGN")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbForeign, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbForeign, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    default int insert(InnodbForeign record) {
        return MyBatis3Utils.insert(this::insert, record, innodbForeign, c ->
            c.map(id).toProperty("id")
            .map(forName).toProperty("forName")
            .map(refName).toProperty("refName")
            .map(nCols).toProperty("nCols")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    default int insertMultiple(Collection<InnodbForeign> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbForeign, c ->
            c.map(id).toProperty("id")
            .map(forName).toProperty("forName")
            .map(refName).toProperty("refName")
            .map(nCols).toProperty("nCols")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    default int insertSelective(InnodbForeign record) {
        return MyBatis3Utils.insert(this::insert, record, innodbForeign, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(forName).toPropertyWhenPresent("forName", record::getForName)
            .map(refName).toPropertyWhenPresent("refName", record::getRefName)
            .map(nCols).toPropertyWhenPresent("nCols", record::getnCols)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    default Optional<InnodbForeign> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbForeign, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    default List<InnodbForeign> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbForeign, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    default List<InnodbForeign> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbForeign, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbForeign, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbForeign record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(forName).equalTo(record::getForName)
                .set(refName).equalTo(record::getRefName)
                .set(nCols).equalTo(record::getnCols)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.327+07:00", comments="Source Table: INNODB_FOREIGN")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbForeign record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(forName).equalToWhenPresent(record::getForName)
                .set(refName).equalToWhenPresent(record::getRefName)
                .set(nCols).equalToWhenPresent(record::getnCols)
                .set(type).equalToWhenPresent(record::getType);
    }
}