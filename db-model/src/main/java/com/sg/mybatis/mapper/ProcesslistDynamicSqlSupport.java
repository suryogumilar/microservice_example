package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProcesslistDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.408+07:00", comments="Source Table: PROCESSLIST")
    public static final Processlist processlist = new Processlist();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.409+07:00", comments="Source field: PROCESSLIST.ID")
    public static final SqlColumn<Long> id = processlist.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.409+07:00", comments="Source field: PROCESSLIST.USER")
    public static final SqlColumn<String> user = processlist.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.409+07:00", comments="Source field: PROCESSLIST.HOST")
    public static final SqlColumn<String> host = processlist.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.409+07:00", comments="Source field: PROCESSLIST.DB")
    public static final SqlColumn<String> db = processlist.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.409+07:00", comments="Source field: PROCESSLIST.COMMAND")
    public static final SqlColumn<String> command = processlist.command;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.409+07:00", comments="Source field: PROCESSLIST.TIME")
    public static final SqlColumn<Integer> time = processlist.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.409+07:00", comments="Source field: PROCESSLIST.STATE")
    public static final SqlColumn<String> state = processlist.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.409+07:00", comments="Source field: PROCESSLIST.INFO")
    public static final SqlColumn<String> info = processlist.info;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.408+07:00", comments="Source Table: PROCESSLIST")
    public static final class Processlist extends SqlTable {
        public final SqlColumn<Long> id = column("ID", JDBCType.BIGINT);

        public final SqlColumn<String> user = column("USER", JDBCType.VARCHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.VARCHAR);

        public final SqlColumn<String> db = column("DB", JDBCType.VARCHAR);

        public final SqlColumn<String> command = column("COMMAND", JDBCType.VARCHAR);

        public final SqlColumn<Integer> time = column("TIME", JDBCType.INTEGER);

        public final SqlColumn<String> state = column("STATE", JDBCType.VARCHAR);

        public final SqlColumn<String> info = column("INFO", JDBCType.VARCHAR);

        public Processlist() {
            super("PROCESSLIST");
        }
    }
}