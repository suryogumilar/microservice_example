package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TriggersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.154+07:00", comments="Source Table: TRIGGERS")
    public static final Triggers triggers = new Triggers();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.TRIGGER_CATALOG")
    public static final SqlColumn<String> triggerCatalog = triggers.triggerCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.TRIGGER_SCHEMA")
    public static final SqlColumn<String> triggerSchema = triggers.triggerSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.TRIGGER_NAME")
    public static final SqlColumn<String> triggerName = triggers.triggerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.EVENT_MANIPULATION")
    public static final SqlColumn<String> eventManipulation = triggers.eventManipulation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_CATALOG")
    public static final SqlColumn<String> eventObjectCatalog = triggers.eventObjectCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_SCHEMA")
    public static final SqlColumn<String> eventObjectSchema = triggers.eventObjectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_TABLE")
    public static final SqlColumn<String> eventObjectTable = triggers.eventObjectTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.ACTION_ORDER")
    public static final SqlColumn<Integer> actionOrder = triggers.actionOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.ACTION_ORIENTATION")
    public static final SqlColumn<String> actionOrientation = triggers.actionOrientation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source field: TRIGGERS.ACTION_TIMING")
    public static final SqlColumn<String> actionTiming = triggers.actionTiming;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_ROW")
    public static final SqlColumn<String> actionReferenceOldRow = triggers.actionReferenceOldRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_ROW")
    public static final SqlColumn<String> actionReferenceNewRow = triggers.actionReferenceNewRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.CREATED")
    public static final SqlColumn<Date> created = triggers.created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.SQL_MODE")
    public static final SqlColumn<String> sqlMode = triggers.sqlMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.DEFINER")
    public static final SqlColumn<String> definer = triggers.definer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.CHARACTER_SET_CLIENT")
    public static final SqlColumn<String> characterSetClient = triggers.characterSetClient;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.COLLATION_CONNECTION")
    public static final SqlColumn<String> collationConnection = triggers.collationConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.DATABASE_COLLATION")
    public static final SqlColumn<String> databaseCollation = triggers.databaseCollation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.ACTION_CONDITION")
    public static final SqlColumn<byte[]> actionCondition = triggers.actionCondition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.ACTION_STATEMENT")
    public static final SqlColumn<String> actionStatement = triggers.actionStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_TABLE")
    public static final SqlColumn<byte[]> actionReferenceOldTable = triggers.actionReferenceOldTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.156+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_TABLE")
    public static final SqlColumn<byte[]> actionReferenceNewTable = triggers.actionReferenceNewTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.155+07:00", comments="Source Table: TRIGGERS")
    public static final class Triggers extends SqlTable {
        public final SqlColumn<String> triggerCatalog = column("TRIGGER_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> triggerSchema = column("TRIGGER_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> triggerName = column("TRIGGER_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> eventManipulation = column("EVENT_MANIPULATION", JDBCType.CHAR);

        public final SqlColumn<String> eventObjectCatalog = column("EVENT_OBJECT_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> eventObjectSchema = column("EVENT_OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> eventObjectTable = column("EVENT_OBJECT_TABLE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> actionOrder = column("ACTION_ORDER", JDBCType.INTEGER);

        public final SqlColumn<String> actionOrientation = column("ACTION_ORIENTATION", JDBCType.VARCHAR);

        public final SqlColumn<String> actionTiming = column("ACTION_TIMING", JDBCType.CHAR);

        public final SqlColumn<String> actionReferenceOldRow = column("ACTION_REFERENCE_OLD_ROW", JDBCType.VARCHAR);

        public final SqlColumn<String> actionReferenceNewRow = column("ACTION_REFERENCE_NEW_ROW", JDBCType.VARCHAR);

        public final SqlColumn<Date> created = column("CREATED", JDBCType.TIMESTAMP);

        public final SqlColumn<String> sqlMode = column("SQL_MODE", JDBCType.CHAR);

        public final SqlColumn<String> definer = column("DEFINER", JDBCType.VARCHAR);

        public final SqlColumn<String> characterSetClient = column("CHARACTER_SET_CLIENT", JDBCType.VARCHAR);

        public final SqlColumn<String> collationConnection = column("COLLATION_CONNECTION", JDBCType.VARCHAR);

        public final SqlColumn<String> databaseCollation = column("DATABASE_COLLATION", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> actionCondition = column("ACTION_CONDITION", JDBCType.BINARY);

        public final SqlColumn<String> actionStatement = column("ACTION_STATEMENT", JDBCType.LONGVARCHAR);

        public final SqlColumn<byte[]> actionReferenceOldTable = column("ACTION_REFERENCE_OLD_TABLE", JDBCType.BINARY);

        public final SqlColumn<byte[]> actionReferenceNewTable = column("ACTION_REFERENCE_NEW_TABLE", JDBCType.BINARY);

        public Triggers() {
            super("TRIGGERS");
        }
    }
}