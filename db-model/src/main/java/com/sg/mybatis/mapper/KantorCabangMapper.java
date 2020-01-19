package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.KantorCabangDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sg.mybatis.model.KantorCabang;
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
public interface KantorCabangMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    BasicColumn[] selectList = BasicColumn.columnList(id, namaKc, alamatKc);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<KantorCabang> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<KantorCabang> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("KantorCabangResult")
    Optional<KantorCabang> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="KantorCabangResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAMA_KC", property="namaKc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ALAMAT_KC", property="alamatKc", jdbcType=JdbcType.VARCHAR)
    })
    List<KantorCabang> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, kantorCabang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, kantorCabang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    default int insert(KantorCabang record) {
        return MyBatis3Utils.insert(this::insert, record, kantorCabang, c ->
            c.map(id).toProperty("id")
            .map(namaKc).toProperty("namaKc")
            .map(alamatKc).toProperty("alamatKc")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    default int insertMultiple(Collection<KantorCabang> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, kantorCabang, c ->
            c.map(id).toProperty("id")
            .map(namaKc).toProperty("namaKc")
            .map(alamatKc).toProperty("alamatKc")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    default int insertSelective(KantorCabang record) {
        return MyBatis3Utils.insert(this::insert, record, kantorCabang, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(namaKc).toPropertyWhenPresent("namaKc", record::getNamaKc)
            .map(alamatKc).toPropertyWhenPresent("alamatKc", record::getAlamatKc)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source Table: KANTOR_CABANG")
    default Optional<KantorCabang> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, kantorCabang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.324+07:00", comments="Source Table: KANTOR_CABANG")
    default List<KantorCabang> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, kantorCabang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.324+07:00", comments="Source Table: KANTOR_CABANG")
    default List<KantorCabang> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, kantorCabang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.324+07:00", comments="Source Table: KANTOR_CABANG")
    default Optional<KantorCabang> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.324+07:00", comments="Source Table: KANTOR_CABANG")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, kantorCabang, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.324+07:00", comments="Source Table: KANTOR_CABANG")
    static UpdateDSL<UpdateModel> updateAllColumns(KantorCabang record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(namaKc).equalTo(record::getNamaKc)
                .set(alamatKc).equalTo(record::getAlamatKc);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.324+07:00", comments="Source Table: KANTOR_CABANG")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(KantorCabang record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(namaKc).equalToWhenPresent(record::getNamaKc)
                .set(alamatKc).equalToWhenPresent(record::getAlamatKc);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.324+07:00", comments="Source Table: KANTOR_CABANG")
    default int updateByPrimaryKey(KantorCabang record) {
        return update(c ->
            c.set(namaKc).equalTo(record::getNamaKc)
            .set(alamatKc).equalTo(record::getAlamatKc)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.324+07:00", comments="Source Table: KANTOR_CABANG")
    default int updateByPrimaryKeySelective(KantorCabang record) {
        return update(c ->
            c.set(namaKc).equalToWhenPresent(record::getNamaKc)
            .set(alamatKc).equalToWhenPresent(record::getAlamatKc)
            .where(id, isEqualTo(record::getId))
        );
    }
}