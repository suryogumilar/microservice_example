package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProfilingDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.446+07:00", comments="Source Table: PROFILING")
    public static final Profiling profiling = new Profiling();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.446+07:00", comments="Source field: PROFILING.QUERY_ID")
    public static final SqlColumn<Integer> queryId = profiling.queryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.446+07:00", comments="Source field: PROFILING.SEQ")
    public static final SqlColumn<Integer> seq = profiling.seq;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.446+07:00", comments="Source field: PROFILING.STATE")
    public static final SqlColumn<String> state = profiling.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.DURATION")
    public static final SqlColumn<Short> duration = profiling.duration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.CPU_USER")
    public static final SqlColumn<Short> cpuUser = profiling.cpuUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.CPU_SYSTEM")
    public static final SqlColumn<Short> cpuSystem = profiling.cpuSystem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.CONTEXT_VOLUNTARY")
    public static final SqlColumn<Integer> contextVoluntary = profiling.contextVoluntary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.CONTEXT_INVOLUNTARY")
    public static final SqlColumn<Integer> contextInvoluntary = profiling.contextInvoluntary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.BLOCK_OPS_IN")
    public static final SqlColumn<Integer> blockOpsIn = profiling.blockOpsIn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.BLOCK_OPS_OUT")
    public static final SqlColumn<Integer> blockOpsOut = profiling.blockOpsOut;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.MESSAGES_SENT")
    public static final SqlColumn<Integer> messagesSent = profiling.messagesSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.MESSAGES_RECEIVED")
    public static final SqlColumn<Integer> messagesReceived = profiling.messagesReceived;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.PAGE_FAULTS_MAJOR")
    public static final SqlColumn<Integer> pageFaultsMajor = profiling.pageFaultsMajor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.PAGE_FAULTS_MINOR")
    public static final SqlColumn<Integer> pageFaultsMinor = profiling.pageFaultsMinor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.SWAPS")
    public static final SqlColumn<Integer> swaps = profiling.swaps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.SOURCE_FUNCTION")
    public static final SqlColumn<String> sourceFunction = profiling.sourceFunction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.SOURCE_FILE")
    public static final SqlColumn<String> sourceFile = profiling.sourceFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.447+07:00", comments="Source field: PROFILING.SOURCE_LINE")
    public static final SqlColumn<Integer> sourceLine = profiling.sourceLine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.446+07:00", comments="Source Table: PROFILING")
    public static final class Profiling extends SqlTable {
        public final SqlColumn<Integer> queryId = column("QUERY_ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> seq = column("SEQ", JDBCType.INTEGER);

        public final SqlColumn<String> state = column("STATE", JDBCType.VARCHAR);

        public final SqlColumn<Short> duration = column("DURATION", JDBCType.DECIMAL);

        public final SqlColumn<Short> cpuUser = column("CPU_USER", JDBCType.DECIMAL);

        public final SqlColumn<Short> cpuSystem = column("CPU_SYSTEM", JDBCType.DECIMAL);

        public final SqlColumn<Integer> contextVoluntary = column("CONTEXT_VOLUNTARY", JDBCType.INTEGER);

        public final SqlColumn<Integer> contextInvoluntary = column("CONTEXT_INVOLUNTARY", JDBCType.INTEGER);

        public final SqlColumn<Integer> blockOpsIn = column("BLOCK_OPS_IN", JDBCType.INTEGER);

        public final SqlColumn<Integer> blockOpsOut = column("BLOCK_OPS_OUT", JDBCType.INTEGER);

        public final SqlColumn<Integer> messagesSent = column("MESSAGES_SENT", JDBCType.INTEGER);

        public final SqlColumn<Integer> messagesReceived = column("MESSAGES_RECEIVED", JDBCType.INTEGER);

        public final SqlColumn<Integer> pageFaultsMajor = column("PAGE_FAULTS_MAJOR", JDBCType.INTEGER);

        public final SqlColumn<Integer> pageFaultsMinor = column("PAGE_FAULTS_MINOR", JDBCType.INTEGER);

        public final SqlColumn<Integer> swaps = column("SWAPS", JDBCType.INTEGER);

        public final SqlColumn<String> sourceFunction = column("SOURCE_FUNCTION", JDBCType.VARCHAR);

        public final SqlColumn<String> sourceFile = column("SOURCE_FILE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sourceLine = column("SOURCE_LINE", JDBCType.INTEGER);

        public Profiling() {
            super("PROFILING");
        }
    }
}