package com.sg.mybatis.model;

import com.sg.mybatis.model.DataPeserta;
import com.sg.mybatis.model.KantorCabang;
import com.sg.mybatis.model.PesertaKacabMap;

public class PesertaKacabJoinMap extends PesertaKacabMap{
	private DataPeserta dp;
	private KantorCabang kc;
	public DataPeserta getDp() {
		return dp;
	}
	public void setDp(DataPeserta dataPeserta) {
		this.dp = dataPeserta;
	}
	public KantorCabang getKc() {
		return kc;
	}
	public void setKc(KantorCabang kantorCabang) {
		this.kc = kantorCabang;
	}
	
}
