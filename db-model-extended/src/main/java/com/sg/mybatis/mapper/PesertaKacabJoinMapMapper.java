package com.sg.mybatis.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import com.sg.mybatis.model.PesertaKacabJoinMap;

@Mapper
@CacheNamespace(implementation = org.mybatis.caches.ehcache.EhcacheCache.class, flushInterval = 120000, readWrite = false)
public interface PesertaKacabJoinMapMapper {

	@SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PesertaKacabJoinMapResult")
    Optional<PesertaKacabJoinMap> selectOne(SelectStatementProvider selectStatement);

    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PesertaKacabJoinMapResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID_PESERTA", property="idPeserta", jdbcType=JdbcType.INTEGER),
        @Result(column="ID_KACAB", property="idKacab", jdbcType=JdbcType.INTEGER),
        @Result(column="KETERANGAN", property="keterangan", jdbcType=JdbcType.VARCHAR),
        @Result(property="dp", one=@One(select="com.sg.mybatis.mapper.DataPesertaMapper.selectOne")),
        @Result(property="kc", one=@One(select="com.sg.mybatis.mapper.KantorCabangMapper.selectOne"))        
    })
    List<PesertaKacabJoinMap> selectMany(SelectStatementProvider selectStatement);
}
