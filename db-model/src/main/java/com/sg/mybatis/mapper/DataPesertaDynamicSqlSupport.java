package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DataPesertaDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: DATA_PESERTA")
    public static final DataPeserta dataPeserta = new DataPeserta();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.ID")
    public static final SqlColumn<Integer> id = dataPeserta.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NOMOR_PESERTA")
    public static final SqlColumn<Integer> nomorPeserta = dataPeserta.nomorPeserta;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NIK")
    public static final SqlColumn<Integer> nik = dataPeserta.nik;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.NAMA_PESERTA")
    public static final SqlColumn<String> namaPeserta = dataPeserta.namaPeserta;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: DATA_PESERTA.ALAMAT_PESERTA")
    public static final SqlColumn<String> alamatPeserta = dataPeserta.alamatPeserta;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: DATA_PESERTA")
    public static final class DataPeserta extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> nomorPeserta = column("NOMOR_PESERTA", JDBCType.INTEGER);

        public final SqlColumn<Integer> nik = column("NIK", JDBCType.INTEGER);

        public final SqlColumn<String> namaPeserta = column("NAMA_PESERTA", JDBCType.VARCHAR);

        public final SqlColumn<String> alamatPeserta = column("ALAMAT_PESERTA", JDBCType.VARCHAR);

        public DataPeserta() {
            super("DATA_PESERTA");
        }
    }
}