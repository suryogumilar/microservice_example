package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbCmpmemResetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.166+07:00", comments="Source Table: INNODB_CMPMEM_RESET")
    public static final InnodbCmpmemReset innodbCmpmemReset = new InnodbCmpmemReset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.166+07:00", comments="Source field: INNODB_CMPMEM_RESET.page_size")
    public static final SqlColumn<Integer> pageSize = innodbCmpmemReset.pageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.166+07:00", comments="Source field: INNODB_CMPMEM_RESET.buffer_pool_instance")
    public static final SqlColumn<Integer> bufferPoolInstance = innodbCmpmemReset.bufferPoolInstance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.166+07:00", comments="Source field: INNODB_CMPMEM_RESET.pages_used")
    public static final SqlColumn<Integer> pagesUsed = innodbCmpmemReset.pagesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.166+07:00", comments="Source field: INNODB_CMPMEM_RESET.pages_free")
    public static final SqlColumn<Integer> pagesFree = innodbCmpmemReset.pagesFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.166+07:00", comments="Source field: INNODB_CMPMEM_RESET.relocation_ops")
    public static final SqlColumn<Long> relocationOps = innodbCmpmemReset.relocationOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.166+07:00", comments="Source field: INNODB_CMPMEM_RESET.relocation_time")
    public static final SqlColumn<Integer> relocationTime = innodbCmpmemReset.relocationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.166+07:00", comments="Source Table: INNODB_CMPMEM_RESET")
    public static final class InnodbCmpmemReset extends SqlTable {
        public final SqlColumn<Integer> pageSize = column("page_size", JDBCType.INTEGER);

        public final SqlColumn<Integer> bufferPoolInstance = column("buffer_pool_instance", JDBCType.INTEGER);

        public final SqlColumn<Integer> pagesUsed = column("pages_used", JDBCType.INTEGER);

        public final SqlColumn<Integer> pagesFree = column("pages_free", JDBCType.INTEGER);

        public final SqlColumn<Long> relocationOps = column("relocation_ops", JDBCType.BIGINT);

        public final SqlColumn<Integer> relocationTime = column("relocation_time", JDBCType.INTEGER);

        public InnodbCmpmemReset() {
            super("INNODB_CMPMEM_RESET");
        }
    }
}