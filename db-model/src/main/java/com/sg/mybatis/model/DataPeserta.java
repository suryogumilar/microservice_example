package com.sg.mybatis.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class DataPeserta implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NOMOR_PESERTA")
    private Integer nomorPeserta;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NIK")
    private Integer nik;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NAMA_PESERTA")
    private String namaPeserta;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.ALAMAT_PESERTA")
    private String alamatPeserta;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: DATA_PESERTA")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NOMOR_PESERTA")
    public Integer getNomorPeserta() {
        return nomorPeserta;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NOMOR_PESERTA")
    public void setNomorPeserta(Integer nomorPeserta) {
        this.nomorPeserta = nomorPeserta;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NIK")
    public Integer getNik() {
        return nik;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NIK")
    public void setNik(Integer nik) {
        this.nik = nik;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NAMA_PESERTA")
    public String getNamaPeserta() {
        return namaPeserta;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NAMA_PESERTA")
    public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.ALAMAT_PESERTA")
    public String getAlamatPeserta() {
        return alamatPeserta;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.ALAMAT_PESERTA")
    public void setAlamatPeserta(String alamatPeserta) {
        this.alamatPeserta = alamatPeserta;
    }
}