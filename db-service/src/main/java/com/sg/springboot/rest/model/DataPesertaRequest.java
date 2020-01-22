package com.sg.springboot.rest.model;

import com.sg.mybatis.model.DataPeserta;

public class DataPesertaRequest {

	private DataPeserta dataPeserta;
	private Boolean useLike;

	public DataPeserta getDataPeserta() {
		return dataPeserta;
	}

	public void setDataPeserta(DataPeserta dataPeserta) {
		this.dataPeserta = dataPeserta;
	}

	public Boolean getUseLike() {
		return useLike;
	}

	public void setUseLike(Boolean useLike) {
		this.useLike = useLike;
	}
}
