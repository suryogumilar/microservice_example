package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbCmpResetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.485+07:00", comments="Source Table: INNODB_CMP_RESET")
    public static final InnodbCmpReset innodbCmpReset = new InnodbCmpReset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.485+07:00", comments="Source field: INNODB_CMP_RESET.page_size")
    public static final SqlColumn<Integer> pageSize = innodbCmpReset.pageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.485+07:00", comments="Source field: INNODB_CMP_RESET.compress_ops")
    public static final SqlColumn<Integer> compressOps = innodbCmpReset.compressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.485+07:00", comments="Source field: INNODB_CMP_RESET.compress_ops_ok")
    public static final SqlColumn<Integer> compressOpsOk = innodbCmpReset.compressOpsOk;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.485+07:00", comments="Source field: INNODB_CMP_RESET.compress_time")
    public static final SqlColumn<Integer> compressTime = innodbCmpReset.compressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.485+07:00", comments="Source field: INNODB_CMP_RESET.uncompress_ops")
    public static final SqlColumn<Integer> uncompressOps = innodbCmpReset.uncompressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.485+07:00", comments="Source field: INNODB_CMP_RESET.uncompress_time")
    public static final SqlColumn<Integer> uncompressTime = innodbCmpReset.uncompressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.485+07:00", comments="Source Table: INNODB_CMP_RESET")
    public static final class InnodbCmpReset extends SqlTable {
        public final SqlColumn<Integer> pageSize = column("page_size", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressOps = column("compress_ops", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressOpsOk = column("compress_ops_ok", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressTime = column("compress_time", JDBCType.INTEGER);

        public final SqlColumn<Integer> uncompressOps = column("uncompress_ops", JDBCType.INTEGER);

        public final SqlColumn<Integer> uncompressTime = column("uncompress_time", JDBCType.INTEGER);

        public InnodbCmpReset() {
            super("INNODB_CMP_RESET");
        }
    }
}