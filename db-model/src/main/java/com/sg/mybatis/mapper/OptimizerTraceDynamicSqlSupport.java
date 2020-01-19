package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptimizerTraceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.144+07:00", comments="Source Table: OPTIMIZER_TRACE")
    public static final OptimizerTrace optimizerTrace = new OptimizerTrace();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.144+07:00", comments="Source field: OPTIMIZER_TRACE.QUERY")
    public static final SqlColumn<String> query = optimizerTrace.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.144+07:00", comments="Source field: OPTIMIZER_TRACE.TRACE")
    public static final SqlColumn<String> trace = optimizerTrace.trace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source field: OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    public static final SqlColumn<Integer> missingBytesBeyondMaxMemSize = optimizerTrace.missingBytesBeyondMaxMemSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.145+07:00", comments="Source field: OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES")
    public static final SqlColumn<Boolean> insufficientPrivileges = optimizerTrace.insufficientPrivileges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.144+07:00", comments="Source Table: OPTIMIZER_TRACE")
    public static final class OptimizerTrace extends SqlTable {
        public final SqlColumn<String> query = column("QUERY", JDBCType.VARCHAR);

        public final SqlColumn<String> trace = column("TRACE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> missingBytesBeyondMaxMemSize = column("MISSING_BYTES_BEYOND_MAX_MEM_SIZE", JDBCType.INTEGER);

        public final SqlColumn<Boolean> insufficientPrivileges = column("INSUFFICIENT_PRIVILEGES", JDBCType.BIT);

        public OptimizerTrace() {
            super("OPTIMIZER_TRACE");
        }
    }
}