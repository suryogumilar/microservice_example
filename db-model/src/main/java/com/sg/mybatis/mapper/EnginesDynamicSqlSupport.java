package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EnginesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.088+07:00", comments="Source Table: ENGINES")
    public static final Engines engines = new Engines();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.088+07:00", comments="Source field: ENGINES.ENGINE")
    public static final SqlColumn<String> engine = engines.engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.088+07:00", comments="Source field: ENGINES.SUPPORT")
    public static final SqlColumn<String> support = engines.support;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source field: ENGINES.COMMENT")
    public static final SqlColumn<String> comment = engines.comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source field: ENGINES.TRANSACTIONS")
    public static final SqlColumn<String> transactions = engines.transactions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source field: ENGINES.XA")
    public static final SqlColumn<String> xa = engines.xa;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.089+07:00", comments="Source field: ENGINES.SAVEPOINTS")
    public static final SqlColumn<String> savepoints = engines.savepoints;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.088+07:00", comments="Source Table: ENGINES")
    public static final class Engines extends SqlTable {
        public final SqlColumn<String> engine = column("ENGINE", JDBCType.VARCHAR);

        public final SqlColumn<String> support = column("SUPPORT", JDBCType.VARCHAR);

        public final SqlColumn<String> comment = column("COMMENT", JDBCType.VARCHAR);

        public final SqlColumn<String> transactions = column("TRANSACTIONS", JDBCType.VARCHAR);

        public final SqlColumn<String> xa = column("XA", JDBCType.VARCHAR);

        public final SqlColumn<String> savepoints = column("SAVEPOINTS", JDBCType.VARCHAR);

        public Engines() {
            super("ENGINES");
        }
    }
}