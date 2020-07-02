package com.sg.mybatis.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class KantorCabang implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: KANTOR_CABANG.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: KANTOR_CABANG.NAMA_KC")
    private String namaKc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: KANTOR_CABANG.ALAMAT_KC")
    private String alamatKc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: KANTOR_CABANG")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: KANTOR_CABANG.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: KANTOR_CABANG.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: KANTOR_CABANG.NAMA_KC")
    public String getNamaKc() {
        return namaKc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: KANTOR_CABANG.NAMA_KC")
    public void setNamaKc(String namaKc) {
        this.namaKc = namaKc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: KANTOR_CABANG.ALAMAT_KC")
    public String getAlamatKc() {
        return alamatKc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: KANTOR_CABANG.ALAMAT_KC")
    public void setAlamatKc(String alamatKc) {
        this.alamatKc = alamatKc;
    }
}