package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbCmpmemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    public static final InnodbCmpmem innodbCmpmem = new InnodbCmpmem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source field: INNODB_CMPMEM.page_size")
    public static final SqlColumn<Integer> pageSize = innodbCmpmem.pageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source field: INNODB_CMPMEM.buffer_pool_instance")
    public static final SqlColumn<Integer> bufferPoolInstance = innodbCmpmem.bufferPoolInstance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source field: INNODB_CMPMEM.pages_used")
    public static final SqlColumn<Integer> pagesUsed = innodbCmpmem.pagesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source field: INNODB_CMPMEM.pages_free")
    public static final SqlColumn<Integer> pagesFree = innodbCmpmem.pagesFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source field: INNODB_CMPMEM.relocation_ops")
    public static final SqlColumn<Long> relocationOps = innodbCmpmem.relocationOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source field: INNODB_CMPMEM.relocation_time")
    public static final SqlColumn<Integer> relocationTime = innodbCmpmem.relocationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.343+07:00", comments="Source Table: INNODB_CMPMEM")
    public static final class InnodbCmpmem extends SqlTable {
        public final SqlColumn<Integer> pageSize = column("page_size", JDBCType.INTEGER);

        public final SqlColumn<Integer> bufferPoolInstance = column("buffer_pool_instance", JDBCType.INTEGER);

        public final SqlColumn<Integer> pagesUsed = column("pages_used", JDBCType.INTEGER);

        public final SqlColumn<Integer> pagesFree = column("pages_free", JDBCType.INTEGER);

        public final SqlColumn<Long> relocationOps = column("relocation_ops", JDBCType.BIGINT);

        public final SqlColumn<Integer> relocationTime = column("relocation_time", JDBCType.INTEGER);

        public InnodbCmpmem() {
            super("INNODB_CMPMEM");
        }
    }
}