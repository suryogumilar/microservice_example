package com.sg.mybatis.model;

import java.util.List;

import com.sg.mybatis.model.DataPeserta;
import com.sg.mybatis.model.KantorCabang;
import com.sg.mybatis.model.PesertaKacabMap;

public class PesertaKacabJoinMap extends PesertaKacabMap{
	private List<DataPeserta> dataPeserta;
	private KantorCabang kantorCabang;
	public List<DataPeserta> getDataPeserta() {
		return dataPeserta;
	}
	public void setDataPeserta(List<DataPeserta> dataPeserta) {
		this.dataPeserta = dataPeserta;
	}
	public KantorCabang getKantorCabang() {
		return kantorCabang;
	}
	public void setKantorCabang(KantorCabang kantorCabang) {
		this.kantorCabang = kantorCabang;
	}
	
}
