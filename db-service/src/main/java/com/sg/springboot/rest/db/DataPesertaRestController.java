package com.sg.springboot.rest.db;

// perlu ! import all column definitions for your table
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.alamatPeserta;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.dataPeserta;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.id;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.namaPeserta;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.nik;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.nomorPeserta;
// perlu ! import the SQL builder
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isLike;
import static org.mybatis.dynamic.sql.SqlBuilder.isLikeCaseInsensitive;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sg.mybatis.mapper.DataPesertaMapper;
import com.sg.mybatis.model.DataPeserta;
import com.sg.springboot.rest.model.DataPesertaResponse;

@RestController
@RequestMapping("/data-peserta")
public class DataPesertaRestController {
	private static Logger logger = LogManager.getLogger(DataPesertaRestController.class);
	@Autowired
	private DataPesertaMapper dataPesertaMapper;
	@RequestMapping(name="getDataPeserta",path="/get",method=RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public DataPeserta getDataPeserta(@RequestParam("id") Integer id){
		logger.debug("get Data Peserta with id ="+id);
		Optional<DataPeserta> dp = dataPesertaMapper.selectByPrimaryKey(id);
		DataPeserta dataPeserta = dp.get();
		return dataPeserta;
	}
	
	@RequestMapping(name="listDataPeserta",path="/list",method=RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<DataPeserta> getDataPeserta(){
		logger.debug("list data peserta");
		SelectDSLCompleter allRows = SelectDSLCompleter.allRows();
		List<DataPeserta> dataPesertaList = dataPesertaMapper.select(allRows);
		return dataPesertaList;
	}
	@RequestMapping(name="queryDataPeserta",path="/query",method=RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<DataPeserta> queryDataPeserta_get(@RequestParam(name="nama",required=false) String nama, 
			@RequestParam(name="islike", required=false) Boolean isLike, 
			@RequestParam(name="caseInsensitive", required=false) Boolean caseInsensitive){
		logger.debug("query data peserta");
		
		
		// org.mybatis.dynamic.sql.SqlBuilder
		// com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport
		/*
		 * Statement dibawah, menggunakan static import..bisa diganti dengan statement seperti berikut : 
		 * 
		 * SqlBuilder.select(DataPesertaDynamicSqlSupport.id).from(DataPesertaDynamicSqlSupport.dataPeserta); dst..
		 * 
		 * */

		QueryExpressionDSL<SelectModel> qedl =  
		select(id, nomorPeserta, nik, namaPeserta, alamatPeserta)
				.from(dataPeserta);
		if(nama!=null ) {
			if(isLike!=null && isLike) {
				if(caseInsensitive!=null && caseInsensitive) {
					qedl.where(namaPeserta,isLikeCaseInsensitive(nama));				
				}else {
					qedl.where(namaPeserta,isLike(nama));									
				}
			}else {
				qedl.where(namaPeserta,isEqualTo(nama));
			}
		}
		SelectStatementProvider selectStatement = qedl.build().render(RenderingStrategies.MYBATIS3);
		
		List<DataPeserta> dataPesertaList = dataPesertaMapper.selectMany(selectStatement);
		return dataPesertaList;
	}
	
	
	@RequestMapping(name="addDataPeserta",path="/add",method=RequestMethod.POST, consumes = {
			MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	@Transactional(rollbackFor = Exception.class)
	public DataPesertaResponse insertDataPeserta(@RequestBody DataPeserta dataPeserta) throws Exception {
		DataPesertaResponse result = new DataPesertaResponse();
		
		dataPesertaMapper.insert(dataPeserta);
		
		result.setData(dataPeserta);
		
		/*
		if(dataPeserta.getId() == 3) {
			throw new Exception("This should force a rollback!");
		}*/
		result.setStatus("OK");
		return result;
	}
	
	@RequestMapping(name="deleteDataPeserta",path="/delete",method=RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@Transactional(rollbackFor = Exception.class)
	public DataPesertaResponse deleteDataPeserta(@RequestParam("id") Integer id){
		DataPesertaResponse result = new DataPesertaResponse();
		
		logger.debug("get Data Peserta with id ="+id);
		Optional<DataPeserta> dp = dataPesertaMapper.selectByPrimaryKey(id);
		DataPeserta dataPeserta = dp.get();
		
		int deleteByPrimaryKey = dataPesertaMapper.deleteByPrimaryKey(id);
		if(dataPeserta==null) {
			result.setStatus("NOT-OK");
			result.setMessage("Data not found");
			
		}else {
			result.setStatus("OK");
			result.setData(dataPeserta);
			result.setMessage("delete row = "+deleteByPrimaryKey);
		}
		
		
		return result;
	}
	
}
