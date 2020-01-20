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


@RestController
@RequestMapping("/data-peserta")
public class DataPesertaRestController {
	private static Logger logger = LogManager.getLogger(DataPesertaRestController.class);
	@Autowired
	private DataPesertaMapper dataPesertaMapper;
	@RequestMapping(name="getDataPeserta",path="/get",method=RequestMethod.GET)
	public DataPeserta getDataPeserta(@RequestParam("id") Integer id){
		logger.debug("get Data Peserta with id ="+id);
		Optional<DataPeserta> dp = dataPesertaMapper.selectByPrimaryKey(id);
		DataPeserta dataPeserta = dp.get();
		return dataPeserta;
	}
	
	@RequestMapping(name="listDataPeserta",path="/list",method=RequestMethod.GET)
	public List<DataPeserta> getDataPeserta(){
		logger.debug("list data peserta");
		SelectDSLCompleter allRows = SelectDSLCompleter.allRows();
		List<DataPeserta> dataPesertaList = dataPesertaMapper.select(allRows);
		return dataPesertaList;
	}
	@RequestMapping(name="addDataPeserta",path="/add",method=RequestMethod.POST)
	public DataPesertaResponse insertDataPeserta(@RequestBody DataPeserta dataPeserta) {
		DataPesertaResponse result = new DataPesertaResponse();
		
		dataPesertaMapper.insert(dataPeserta);
		
		result.setData(dataPeserta);
		
		
		result.setStatus("OK");
		return result;
	}
	
}
