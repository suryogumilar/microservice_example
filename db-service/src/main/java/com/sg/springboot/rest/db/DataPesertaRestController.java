package com.sg.springboot.rest.db;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sg.mybatis.mapper.DataPesertaMapper;
import com.sg.mybatis.model.DataPeserta;
import com.sg.springboot.rest.model.DataPesertaResponse;
import org.springframework.http.MediaType;

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
	@RequestMapping(name="addDataPeserta",path="/add",method=RequestMethod.POST, consumes = {
			MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public DataPesertaResponse insertDataPeserta(@RequestBody DataPeserta dataPeserta) {
		DataPesertaResponse result = new DataPesertaResponse();
		
		dataPesertaMapper.insert(dataPeserta);
		
		result.setData(dataPeserta);
		
		
		result.setStatus("OK");
		return result;
	}
	
	@RequestMapping(name="deleteDataPeserta",path="/delete",method=RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
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
