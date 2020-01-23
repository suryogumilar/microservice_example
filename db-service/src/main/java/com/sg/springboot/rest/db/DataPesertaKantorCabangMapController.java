package com.sg.springboot.rest.db;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sg.mybatis.mapper.PesertaKacabMapMapper;
import com.sg.mybatis.model.DataPeserta;
import com.sg.mybatis.model.PesertaKacabMap;

//perlu ! import the SQL builder
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static com.sg.mybatis.mapper.PesertaKacabMapDynamicSqlSupport.*;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.*;
import static com.sg.mybatis.mapper.KantorCabangDynamicSqlSupport.*;



@RestController
@RequestMapping("/dp-kc-map")
public class DataPesertaKantorCabangMapController {
	private static Logger logger = LogManager.getLogger(DataPesertaKantorCabangMapController.class);
	@Autowired
	private PesertaKacabMapMapper pesertaKacabMapMapper;
	
	@RequestMapping(name="getMap",path="/get",method=RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public PesertaKacabMap getDataPeserta(@RequestParam("id") Integer id){
		logger.debug("get Data Peserta with id ="+id);
		Optional<PesertaKacabMap> res = pesertaKacabMapMapper.selectByPrimaryKey(id);
		PesertaKacabMap pesertaKacabMap = res.get();
		
		return pesertaKacabMap;
	}
	
	@RequestMapping(name="getMap",path="/get-with-join",method=RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public PesertaKacabMap getDataPesertaWithJoin(@RequestParam("id") Integer id){
		logger.debug("get Data Peserta with id ="+id);
		QueryExpressionDSL<SelectModel> qedl = select(pesertaKacabMap.idKacab,dataPeserta.namaPeserta,dataPeserta.nik,kantorCabang.namaKc)
				.from(pesertaKacabMap);
		QueryExpressionDSL<SelectModel>.JoinSpecificationFinisher joinSpec 
			= qedl.join(dataPeserta, "dp").on(dataPeserta.id, equalTo(pesertaKacabMap.idPeserta))
				.join(kantorCabang,"kc").on(kantorCabang.id, equalTo(pesertaKacabMap.idKacab));
		
		SelectStatementProvider statementProvider = joinSpec.where(pesertaKacabMap.id,isEqualTo(id)).build().render(RenderingStrategies.MYBATIS3);
		
		Optional<PesertaKacabMap> selectOne = pesertaKacabMapMapper.selectOne(statementProvider);
		PesertaKacabMap pesertaKacabMap = selectOne.get();
		return pesertaKacabMap;
	}
	
	
}
