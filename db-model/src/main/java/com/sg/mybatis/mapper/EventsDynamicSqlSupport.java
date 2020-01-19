package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EventsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source Table: EVENTS")
    public static final Events events = new Events();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.EVENT_CATALOG")
    public static final SqlColumn<String> eventCatalog = events.eventCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.EVENT_SCHEMA")
    public static final SqlColumn<String> eventSchema = events.eventSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.EVENT_NAME")
    public static final SqlColumn<String> eventName = events.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.DEFINER")
    public static final SqlColumn<String> definer = events.definer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.TIME_ZONE")
    public static final SqlColumn<String> timeZone = events.timeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.EVENT_BODY")
    public static final SqlColumn<String> eventBody = events.eventBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.EVENT_TYPE")
    public static final SqlColumn<String> eventType = events.eventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.EXECUTE_AT")
    public static final SqlColumn<Date> executeAt = events.executeAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.INTERVAL_VALUE")
    public static final SqlColumn<Integer> intervalValue = events.intervalValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.INTERVAL_FIELD")
    public static final SqlColumn<String> intervalField = events.intervalField;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source field: EVENTS.SQL_MODE")
    public static final SqlColumn<String> sqlMode = events.sqlMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.STARTS")
    public static final SqlColumn<Date> starts = events.starts;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.ENDS")
    public static final SqlColumn<Date> ends = events.ends;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.STATUS")
    public static final SqlColumn<String> status = events.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.ON_COMPLETION")
    public static final SqlColumn<String> onCompletion = events.onCompletion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.CREATED")
    public static final SqlColumn<Date> created = events.created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.LAST_ALTERED")
    public static final SqlColumn<Date> lastAltered = events.lastAltered;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.LAST_EXECUTED")
    public static final SqlColumn<Date> lastExecuted = events.lastExecuted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.EVENT_COMMENT")
    public static final SqlColumn<String> eventComment = events.eventComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.ORIGINATOR")
    public static final SqlColumn<Integer> originator = events.originator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.CHARACTER_SET_CLIENT")
    public static final SqlColumn<String> characterSetClient = events.characterSetClient;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.COLLATION_CONNECTION")
    public static final SqlColumn<String> collationConnection = events.collationConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.DATABASE_COLLATION")
    public static final SqlColumn<String> databaseCollation = events.databaseCollation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.349+07:00", comments="Source field: EVENTS.EVENT_DEFINITION")
    public static final SqlColumn<String> eventDefinition = events.eventDefinition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.348+07:00", comments="Source Table: EVENTS")
    public static final class Events extends SqlTable {
        public final SqlColumn<String> eventCatalog = column("EVENT_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> eventSchema = column("EVENT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> definer = column("DEFINER", JDBCType.VARCHAR);

        public final SqlColumn<String> timeZone = column("TIME_ZONE", JDBCType.VARCHAR);

        public final SqlColumn<String> eventBody = column("EVENT_BODY", JDBCType.VARCHAR);

        public final SqlColumn<String> eventType = column("EVENT_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<Date> executeAt = column("EXECUTE_AT", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> intervalValue = column("INTERVAL_VALUE", JDBCType.INTEGER);

        public final SqlColumn<String> intervalField = column("INTERVAL_FIELD", JDBCType.CHAR);

        public final SqlColumn<String> sqlMode = column("SQL_MODE", JDBCType.CHAR);

        public final SqlColumn<Date> starts = column("STARTS", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> ends = column("ENDS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> status = column("STATUS", JDBCType.CHAR);

        public final SqlColumn<String> onCompletion = column("ON_COMPLETION", JDBCType.VARCHAR);

        public final SqlColumn<Date> created = column("CREATED", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastAltered = column("LAST_ALTERED", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastExecuted = column("LAST_EXECUTED", JDBCType.TIMESTAMP);

        public final SqlColumn<String> eventComment = column("EVENT_COMMENT", JDBCType.VARCHAR);

        public final SqlColumn<Integer> originator = column("ORIGINATOR", JDBCType.INTEGER);

        public final SqlColumn<String> characterSetClient = column("CHARACTER_SET_CLIENT", JDBCType.VARCHAR);

        public final SqlColumn<String> collationConnection = column("COLLATION_CONNECTION", JDBCType.VARCHAR);

        public final SqlColumn<String> databaseCollation = column("DATABASE_COLLATION", JDBCType.VARCHAR);

        public final SqlColumn<String> eventDefinition = column("EVENT_DEFINITION", JDBCType.LONGVARCHAR);

        public Events() {
            super("EVENTS");
        }
    }
}