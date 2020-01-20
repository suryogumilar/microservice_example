package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sg.mybatis.model.DataPeserta;
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
public interface DataPesertaMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.259+07:00", comments="Source Table: DATA_PESERTA")
    BasicColumn[] selectList = BasicColumn.columnList(id, nomorPeserta, nik, namaPeserta, alamatPeserta);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.221+07:00", comments="Source Table: DATA_PESERTA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.232+07:00", comments="Source Table: DATA_PESERTA")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.232+07:00", comments="Source Table: DATA_PESERTA")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DataPeserta> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.234+07:00", comments="Source Table: DATA_PESERTA")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DataPeserta> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.234+07:00", comments="Source Table: DATA_PESERTA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DataPesertaResult")
    Optional<DataPeserta> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.235+07:00", comments="Source Table: DATA_PESERTA")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DataPesertaResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NOMOR_PESERTA", property="nomorPeserta", jdbcType=JdbcType.INTEGER),
        @Result(column="NIK", property="nik", jdbcType=JdbcType.INTEGER),
        @Result(column="NAMA_PESERTA", property="namaPeserta", jdbcType=JdbcType.VARCHAR),
        @Result(column="ALAMAT_PESERTA", property="alamatPeserta", jdbcType=JdbcType.VARCHAR)
    })
    List<DataPeserta> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.251+07:00", comments="Source Table: DATA_PESERTA")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.252+07:00", comments="Source Table: DATA_PESERTA")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dataPeserta, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.253+07:00", comments="Source Table: DATA_PESERTA")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dataPeserta, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.253+07:00", comments="Source Table: DATA_PESERTA")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.254+07:00", comments="Source Table: DATA_PESERTA")
    default int insert(DataPeserta record) {
        return MyBatis3Utils.insert(this::insert, record, dataPeserta, c ->
            c.map(id).toProperty("id")
            .map(nomorPeserta).toProperty("nomorPeserta")
            .map(nik).toProperty("nik")
            .map(namaPeserta).toProperty("namaPeserta")
            .map(alamatPeserta).toProperty("alamatPeserta")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.257+07:00", comments="Source Table: DATA_PESERTA")
    default int insertMultiple(Collection<DataPeserta> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, dataPeserta, c ->
            c.map(id).toProperty("id")
            .map(nomorPeserta).toProperty("nomorPeserta")
            .map(nik).toProperty("nik")
            .map(namaPeserta).toProperty("namaPeserta")
            .map(alamatPeserta).toProperty("alamatPeserta")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.257+07:00", comments="Source Table: DATA_PESERTA")
    default int insertSelective(DataPeserta record) {
        return MyBatis3Utils.insert(this::insert, record, dataPeserta, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(nomorPeserta).toPropertyWhenPresent("nomorPeserta", record::getNomorPeserta)
            .map(nik).toPropertyWhenPresent("nik", record::getNik)
            .map(namaPeserta).toPropertyWhenPresent("namaPeserta", record::getNamaPeserta)
            .map(alamatPeserta).toPropertyWhenPresent("alamatPeserta", record::getAlamatPeserta)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.26+07:00", comments="Source Table: DATA_PESERTA")
    default Optional<DataPeserta> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, dataPeserta, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.26+07:00", comments="Source Table: DATA_PESERTA")
    default List<DataPeserta> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, dataPeserta, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.261+07:00", comments="Source Table: DATA_PESERTA")
    default List<DataPeserta> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, dataPeserta, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.262+07:00", comments="Source Table: DATA_PESERTA")
    default Optional<DataPeserta> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.262+07:00", comments="Source Table: DATA_PESERTA")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dataPeserta, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.263+07:00", comments="Source Table: DATA_PESERTA")
    static UpdateDSL<UpdateModel> updateAllColumns(DataPeserta record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(nomorPeserta).equalTo(record::getNomorPeserta)
                .set(nik).equalTo(record::getNik)
                .set(namaPeserta).equalTo(record::getNamaPeserta)
                .set(alamatPeserta).equalTo(record::getAlamatPeserta);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.263+07:00", comments="Source Table: DATA_PESERTA")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DataPeserta record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(nomorPeserta).equalToWhenPresent(record::getNomorPeserta)
                .set(nik).equalToWhenPresent(record::getNik)
                .set(namaPeserta).equalToWhenPresent(record::getNamaPeserta)
                .set(alamatPeserta).equalToWhenPresent(record::getAlamatPeserta);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.264+07:00", comments="Source Table: DATA_PESERTA")
    default int updateByPrimaryKey(DataPeserta record) {
        return update(c ->
            c.set(nomorPeserta).equalTo(record::getNomorPeserta)
            .set(nik).equalTo(record::getNik)
            .set(namaPeserta).equalTo(record::getNamaPeserta)
            .set(alamatPeserta).equalTo(record::getAlamatPeserta)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-20T16:44:01.265+07:00", comments="Source Table: DATA_PESERTA")
    default int updateByPrimaryKeySelective(DataPeserta record) {
        return update(c ->
            c.set(nomorPeserta).equalToWhenPresent(record::getNomorPeserta)
            .set(nik).equalToWhenPresent(record::getNik)
            .set(namaPeserta).equalToWhenPresent(record::getNamaPeserta)
            .set(alamatPeserta).equalToWhenPresent(record::getAlamatPeserta)
            .where(id, isEqualTo(record::getId))
        );
    }
}