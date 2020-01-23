package com.sg.mybatis.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import com.sg.mybatis.model.DataPeserta;
import com.sg.mybatis.model.PesertaKacabJoinMap;

@Mapper
@CacheNamespace(implementation = org.mybatis.caches.ehcache.EhcacheCache.class, flushInterval = 120000, readWrite = false)
public interface PesertaKacabJoinMapMapper {

	@SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PesertaKacabJoinMapResult")   
    Optional<PesertaKacabJoinMap> selectOneJoin(SelectStatementProvider selectStatement);
	
	
	// menggunakan ini hrs pake prefix pada query join
	@SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PesertaKacabJoinMapResult_J")   // di mapper.xml, resultMap.id
    Optional<PesertaKacabJoinMap> selectOneJoinPrfx(SelectStatementProvider selectStatement);

    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    
    @Results(id="PesertaKacabJoinMapResult", value = {
	        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
	        @Result(column="ID_PESERTA", property="idPeserta", jdbcType=JdbcType.INTEGER),
	        @Result(column="ID_KACAB", property="idKacab", jdbcType=JdbcType.INTEGER),
	        @Result(column="KETERANGAN", property="keterangan", jdbcType=JdbcType.VARCHAR),
	        
	        // DataPeserta
	        /*
	        // @result hanya dipakai untuk property yg non collection/ single object
	         
	        @Result(column="ID_PESERTA", property="dataPeserta.id", jdbcType=JdbcType.INTEGER, id=true),
	        @Result(column="NOMOR_PESERTA", property="dataPeserta.nomorPeserta", jdbcType=JdbcType.INTEGER),
	        @Result(column="NIK", property="dataPeserta.nik", jdbcType=JdbcType.INTEGER),
	        @Result(column="NAMA_PESERTA", property="dataPeserta.namaPeserta", jdbcType=JdbcType.VARCHAR),
	        @Result(column="ALAMAT_PESERTA", property="dataPeserta.alamatPeserta", jdbcType=JdbcType.VARCHAR),
	        */
	        
	        // Jika menggunakan ini maka dobel hit ke database untuk mengisi dataPeserta - calling method yg direfer di 'select'
	        // dan harus berada di satu namespace, misal sama2 dalam satu file atau namanya sama baik .xml atau .java nya
	        @Result(column="ID_PESERTA", property="dataPeserta", one=@One(select="com.sg.mybatis.mapper.PesertaKacabJoinMapMapper.getDataPeserta")),
	        
	        // KantorCabang
	        @Result(column="ID_KACAB", property="kantorCabang.id", jdbcType=JdbcType.INTEGER, id=true),
	        @Result(column="NAMA_KC", property="kantorCabang.namaKc", jdbcType=JdbcType.VARCHAR),
	        @Result(column="ALAMAT_KC", property="kantorCabang.alamatKc", jdbcType=JdbcType.VARCHAR)
	        
	    })
    List<PesertaKacabJoinMap> selectManyJoin(SelectStatementProvider selectStatement);

    @Select("select * from DATA_PESERTA where ID = #{id}")
    @Results(id="DataPesertaJResult", value = {
            @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="NOMOR_PESERTA", property="nomorPeserta", jdbcType=JdbcType.INTEGER),
            @Result(column="NIK", property="nik", jdbcType=JdbcType.INTEGER),
            @Result(column="NAMA_PESERTA", property="namaPeserta", jdbcType=JdbcType.VARCHAR),
            @Result(column="ALAMAT_PESERTA", property="alamatPeserta", jdbcType=JdbcType.VARCHAR)
        })
    DataPeserta getDataPeserta(Integer id);
    
    
}
