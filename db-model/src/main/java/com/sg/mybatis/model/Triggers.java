package com.sg.mybatis.model;

import java.util.Date;
import javax.annotation.Generated;

public class Triggers {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.TRIGGER_CATALOG")
    private String triggerCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.TRIGGER_SCHEMA")
    private String triggerSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.TRIGGER_NAME")
    private String triggerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.EVENT_MANIPULATION")
    private String eventManipulation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_CATALOG")
    private String eventObjectCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_SCHEMA")
    private String eventObjectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_TABLE")
    private String eventObjectTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_ORDER")
    private Integer actionOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_ORIENTATION")
    private String actionOrientation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_TIMING")
    private String actionTiming;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_ROW")
    private String actionReferenceOldRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_ROW")
    private String actionReferenceNewRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.CREATED")
    private Date created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.SQL_MODE")
    private String sqlMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.DEFINER")
    private String definer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.COLLATION_CONNECTION")
    private String collationConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.153+07:00", comments="Source field: TRIGGERS.DATABASE_COLLATION")
    private String databaseCollation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.153+07:00", comments="Source field: TRIGGERS.ACTION_CONDITION")
    private byte[] actionCondition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.153+07:00", comments="Source field: TRIGGERS.ACTION_STATEMENT")
    private String actionStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.154+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_TABLE")
    private byte[] actionReferenceOldTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.154+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_TABLE")
    private byte[] actionReferenceNewTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.TRIGGER_CATALOG")
    public String getTriggerCatalog() {
        return triggerCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.TRIGGER_CATALOG")
    public void setTriggerCatalog(String triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.TRIGGER_SCHEMA")
    public String getTriggerSchema() {
        return triggerSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.TRIGGER_SCHEMA")
    public void setTriggerSchema(String triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.TRIGGER_NAME")
    public String getTriggerName() {
        return triggerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.TRIGGER_NAME")
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.EVENT_MANIPULATION")
    public String getEventManipulation() {
        return eventManipulation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.EVENT_MANIPULATION")
    public void setEventManipulation(String eventManipulation) {
        this.eventManipulation = eventManipulation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_CATALOG")
    public String getEventObjectCatalog() {
        return eventObjectCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_CATALOG")
    public void setEventObjectCatalog(String eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_SCHEMA")
    public String getEventObjectSchema() {
        return eventObjectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.151+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_SCHEMA")
    public void setEventObjectSchema(String eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_TABLE")
    public String getEventObjectTable() {
        return eventObjectTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.EVENT_OBJECT_TABLE")
    public void setEventObjectTable(String eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_ORDER")
    public Integer getActionOrder() {
        return actionOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_ORDER")
    public void setActionOrder(Integer actionOrder) {
        this.actionOrder = actionOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_ORIENTATION")
    public String getActionOrientation() {
        return actionOrientation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_ORIENTATION")
    public void setActionOrientation(String actionOrientation) {
        this.actionOrientation = actionOrientation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_TIMING")
    public String getActionTiming() {
        return actionTiming;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_TIMING")
    public void setActionTiming(String actionTiming) {
        this.actionTiming = actionTiming;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_ROW")
    public String getActionReferenceOldRow() {
        return actionReferenceOldRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_ROW")
    public void setActionReferenceOldRow(String actionReferenceOldRow) {
        this.actionReferenceOldRow = actionReferenceOldRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_ROW")
    public String getActionReferenceNewRow() {
        return actionReferenceNewRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_ROW")
    public void setActionReferenceNewRow(String actionReferenceNewRow) {
        this.actionReferenceNewRow = actionReferenceNewRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.CREATED")
    public Date getCreated() {
        return created;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.CREATED")
    public void setCreated(Date created) {
        this.created = created;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.SQL_MODE")
    public String getSqlMode() {
        return sqlMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.SQL_MODE")
    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.DEFINER")
    public String getDefiner() {
        return definer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.DEFINER")
    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.CHARACTER_SET_CLIENT")
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.CHARACTER_SET_CLIENT")
    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.152+07:00", comments="Source field: TRIGGERS.COLLATION_CONNECTION")
    public String getCollationConnection() {
        return collationConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.153+07:00", comments="Source field: TRIGGERS.COLLATION_CONNECTION")
    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.153+07:00", comments="Source field: TRIGGERS.DATABASE_COLLATION")
    public String getDatabaseCollation() {
        return databaseCollation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.153+07:00", comments="Source field: TRIGGERS.DATABASE_COLLATION")
    public void setDatabaseCollation(String databaseCollation) {
        this.databaseCollation = databaseCollation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.153+07:00", comments="Source field: TRIGGERS.ACTION_CONDITION")
    public byte[] getActionCondition() {
        return actionCondition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.153+07:00", comments="Source field: TRIGGERS.ACTION_CONDITION")
    public void setActionCondition(byte[] actionCondition) {
        this.actionCondition = actionCondition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.153+07:00", comments="Source field: TRIGGERS.ACTION_STATEMENT")
    public String getActionStatement() {
        return actionStatement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.154+07:00", comments="Source field: TRIGGERS.ACTION_STATEMENT")
    public void setActionStatement(String actionStatement) {
        this.actionStatement = actionStatement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.154+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_TABLE")
    public byte[] getActionReferenceOldTable() {
        return actionReferenceOldTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.154+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_TABLE")
    public void setActionReferenceOldTable(byte[] actionReferenceOldTable) {
        this.actionReferenceOldTable = actionReferenceOldTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.154+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_TABLE")
    public byte[] getActionReferenceNewTable() {
        return actionReferenceNewTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.154+07:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_TABLE")
    public void setActionReferenceNewTable(byte[] actionReferenceNewTable) {
        this.actionReferenceNewTable = actionReferenceNewTable;
    }
}