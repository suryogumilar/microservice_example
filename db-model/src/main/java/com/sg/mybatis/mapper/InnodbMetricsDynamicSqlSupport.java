package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbMetricsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    public static final InnodbMetrics innodbMetrics = new InnodbMetrics();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.NAME")
    public static final SqlColumn<String> name = innodbMetrics.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.SUBSYSTEM")
    public static final SqlColumn<String> subsystem = innodbMetrics.subsystem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.COUNT")
    public static final SqlColumn<Long> count = innodbMetrics.count;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.MAX_COUNT")
    public static final SqlColumn<Long> maxCount = innodbMetrics.maxCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.MIN_COUNT")
    public static final SqlColumn<Long> minCount = innodbMetrics.minCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.AVG_COUNT")
    public static final SqlColumn<Float> avgCount = innodbMetrics.avgCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.COUNT_RESET")
    public static final SqlColumn<Long> countReset = innodbMetrics.countReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.MAX_COUNT_RESET")
    public static final SqlColumn<Long> maxCountReset = innodbMetrics.maxCountReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.MIN_COUNT_RESET")
    public static final SqlColumn<Long> minCountReset = innodbMetrics.minCountReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.AVG_COUNT_RESET")
    public static final SqlColumn<Float> avgCountReset = innodbMetrics.avgCountReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.TIME_ENABLED")
    public static final SqlColumn<Date> timeEnabled = innodbMetrics.timeEnabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.TIME_DISABLED")
    public static final SqlColumn<Date> timeDisabled = innodbMetrics.timeDisabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.TIME_ELAPSED")
    public static final SqlColumn<Long> timeElapsed = innodbMetrics.timeElapsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.TIME_RESET")
    public static final SqlColumn<Date> timeReset = innodbMetrics.timeReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.STATUS")
    public static final SqlColumn<String> status = innodbMetrics.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.TYPE")
    public static final SqlColumn<String> type = innodbMetrics.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source field: INNODB_METRICS.COMMENT")
    public static final SqlColumn<String> comment = innodbMetrics.comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.382+07:00", comments="Source Table: INNODB_METRICS")
    public static final class InnodbMetrics extends SqlTable {
        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> subsystem = column("SUBSYSTEM", JDBCType.VARCHAR);

        public final SqlColumn<Long> count = column("COUNT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxCount = column("MAX_COUNT", JDBCType.BIGINT);

        public final SqlColumn<Long> minCount = column("MIN_COUNT", JDBCType.BIGINT);

        public final SqlColumn<Float> avgCount = column("AVG_COUNT", JDBCType.REAL);

        public final SqlColumn<Long> countReset = column("COUNT_RESET", JDBCType.BIGINT);

        public final SqlColumn<Long> maxCountReset = column("MAX_COUNT_RESET", JDBCType.BIGINT);

        public final SqlColumn<Long> minCountReset = column("MIN_COUNT_RESET", JDBCType.BIGINT);

        public final SqlColumn<Float> avgCountReset = column("AVG_COUNT_RESET", JDBCType.REAL);

        public final SqlColumn<Date> timeEnabled = column("TIME_ENABLED", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> timeDisabled = column("TIME_DISABLED", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> timeElapsed = column("TIME_ELAPSED", JDBCType.BIGINT);

        public final SqlColumn<Date> timeReset = column("TIME_RESET", JDBCType.TIMESTAMP);

        public final SqlColumn<String> status = column("STATUS", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> comment = column("COMMENT", JDBCType.VARCHAR);

        public InnodbMetrics() {
            super("INNODB_METRICS");
        }
    }
}