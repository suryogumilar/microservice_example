package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class KantorCabangDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.322+07:00", comments="Source Table: KANTOR_CABANG")
    public static final KantorCabang kantorCabang = new KantorCabang();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.322+07:00", comments="Source field: KANTOR_CABANG.ID")
    public static final SqlColumn<Integer> id = kantorCabang.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.322+07:00", comments="Source field: KANTOR_CABANG.NAMA_KC")
    public static final SqlColumn<String> namaKc = kantorCabang.namaKc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.323+07:00", comments="Source field: KANTOR_CABANG.ALAMAT_KC")
    public static final SqlColumn<String> alamatKc = kantorCabang.alamatKc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.322+07:00", comments="Source Table: KANTOR_CABANG")
    public static final class KantorCabang extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> namaKc = column("NAMA_KC", JDBCType.VARCHAR);

        public final SqlColumn<String> alamatKc = column("ALAMAT_KC", JDBCType.VARCHAR);

        public KantorCabang() {
            super("KANTOR_CABANG");
        }
    }
}