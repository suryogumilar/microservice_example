package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbCmpDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:05.996+07:00", comments="Source Table: INNODB_CMP")
    public static final InnodbCmp innodbCmp = new InnodbCmp();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:05.997+07:00", comments="Source field: INNODB_CMP.page_size")
    public static final SqlColumn<Integer> pageSize = innodbCmp.pageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:05.998+07:00", comments="Source field: INNODB_CMP.compress_ops")
    public static final SqlColumn<Integer> compressOps = innodbCmp.compressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:05.998+07:00", comments="Source field: INNODB_CMP.compress_ops_ok")
    public static final SqlColumn<Integer> compressOpsOk = innodbCmp.compressOpsOk;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:05.999+07:00", comments="Source field: INNODB_CMP.compress_time")
    public static final SqlColumn<Integer> compressTime = innodbCmp.compressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:05.999+07:00", comments="Source field: INNODB_CMP.uncompress_ops")
    public static final SqlColumn<Integer> uncompressOps = innodbCmp.uncompressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:05.999+07:00", comments="Source field: INNODB_CMP.uncompress_time")
    public static final SqlColumn<Integer> uncompressTime = innodbCmp.uncompressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:05.997+07:00", comments="Source Table: INNODB_CMP")
    public static final class InnodbCmp extends SqlTable {
        public final SqlColumn<Integer> pageSize = column("page_size", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressOps = column("compress_ops", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressOpsOk = column("compress_ops_ok", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressTime = column("compress_time", JDBCType.INTEGER);

        public final SqlColumn<Integer> uncompressOps = column("uncompress_ops", JDBCType.INTEGER);

        public final SqlColumn<Integer> uncompressTime = column("uncompress_time", JDBCType.INTEGER);

        public InnodbCmp() {
            super("INNODB_CMP");
        }
    }
}