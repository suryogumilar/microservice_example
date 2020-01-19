package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoutinesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source Table: ROUTINES")
    public static final Routines routines = new Routines();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.SPECIFIC_NAME")
    public static final SqlColumn<String> specificName = routines.specificName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.ROUTINE_CATALOG")
    public static final SqlColumn<String> routineCatalog = routines.routineCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.ROUTINE_SCHEMA")
    public static final SqlColumn<String> routineSchema = routines.routineSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.ROUTINE_NAME")
    public static final SqlColumn<String> routineName = routines.routineName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.ROUTINE_TYPE")
    public static final SqlColumn<String> routineType = routines.routineType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.CHARACTER_MAXIMUM_LENGTH")
    public static final SqlColumn<Long> characterMaximumLength = routines.characterMaximumLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.CHARACTER_OCTET_LENGTH")
    public static final SqlColumn<Long> characterOctetLength = routines.characterOctetLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.NUMERIC_PRECISION")
    public static final SqlColumn<Integer> numericPrecision = routines.numericPrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.NUMERIC_SCALE")
    public static final SqlColumn<Integer> numericScale = routines.numericScale;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.DATETIME_PRECISION")
    public static final SqlColumn<Integer> datetimePrecision = routines.datetimePrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source field: ROUTINES.CHARACTER_SET_NAME")
    public static final SqlColumn<String> characterSetName = routines.characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.COLLATION_NAME")
    public static final SqlColumn<String> collationName = routines.collationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.ROUTINE_BODY")
    public static final SqlColumn<String> routineBody = routines.routineBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.EXTERNAL_LANGUAGE")
    public static final SqlColumn<String> externalLanguage = routines.externalLanguage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.PARAMETER_STYLE")
    public static final SqlColumn<String> parameterStyle = routines.parameterStyle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.IS_DETERMINISTIC")
    public static final SqlColumn<String> isDeterministic = routines.isDeterministic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.SQL_DATA_ACCESS")
    public static final SqlColumn<String> sqlDataAccess = routines.sqlDataAccess;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.SECURITY_TYPE")
    public static final SqlColumn<String> securityType = routines.securityType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.CREATED")
    public static final SqlColumn<Date> created = routines.created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.LAST_ALTERED")
    public static final SqlColumn<Date> lastAltered = routines.lastAltered;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.SQL_MODE")
    public static final SqlColumn<String> sqlMode = routines.sqlMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.DEFINER")
    public static final SqlColumn<String> definer = routines.definer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.CHARACTER_SET_CLIENT")
    public static final SqlColumn<String> characterSetClient = routines.characterSetClient;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.COLLATION_CONNECTION")
    public static final SqlColumn<String> collationConnection = routines.collationConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.DATABASE_COLLATION")
    public static final SqlColumn<String> databaseCollation = routines.databaseCollation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.DATA_TYPE")
    public static final SqlColumn<String> dataType = routines.dataType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.DTD_IDENTIFIER")
    public static final SqlColumn<String> dtdIdentifier = routines.dtdIdentifier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.ROUTINE_DEFINITION")
    public static final SqlColumn<String> routineDefinition = routines.routineDefinition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.EXTERNAL_NAME")
    public static final SqlColumn<byte[]> externalName = routines.externalName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.SQL_PATH")
    public static final SqlColumn<byte[]> sqlPath = routines.sqlPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.373+07:00", comments="Source field: ROUTINES.ROUTINE_COMMENT")
    public static final SqlColumn<String> routineComment = routines.routineComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.372+07:00", comments="Source Table: ROUTINES")
    public static final class Routines extends SqlTable {
        public final SqlColumn<String> specificName = column("SPECIFIC_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> routineCatalog = column("ROUTINE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> routineSchema = column("ROUTINE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> routineName = column("ROUTINE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> routineType = column("ROUTINE_TYPE", JDBCType.CHAR);

        public final SqlColumn<Long> characterMaximumLength = column("CHARACTER_MAXIMUM_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> characterOctetLength = column("CHARACTER_OCTET_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Integer> numericPrecision = column("NUMERIC_PRECISION", JDBCType.INTEGER);

        public final SqlColumn<Integer> numericScale = column("NUMERIC_SCALE", JDBCType.INTEGER);

        public final SqlColumn<Integer> datetimePrecision = column("DATETIME_PRECISION", JDBCType.INTEGER);

        public final SqlColumn<String> characterSetName = column("CHARACTER_SET_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> collationName = column("COLLATION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> routineBody = column("ROUTINE_BODY", JDBCType.VARCHAR);

        public final SqlColumn<String> externalLanguage = column("EXTERNAL_LANGUAGE", JDBCType.VARCHAR);

        public final SqlColumn<String> parameterStyle = column("PARAMETER_STYLE", JDBCType.VARCHAR);

        public final SqlColumn<String> isDeterministic = column("IS_DETERMINISTIC", JDBCType.VARCHAR);

        public final SqlColumn<String> sqlDataAccess = column("SQL_DATA_ACCESS", JDBCType.CHAR);

        public final SqlColumn<String> securityType = column("SECURITY_TYPE", JDBCType.CHAR);

        public final SqlColumn<Date> created = column("CREATED", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastAltered = column("LAST_ALTERED", JDBCType.TIMESTAMP);

        public final SqlColumn<String> sqlMode = column("SQL_MODE", JDBCType.CHAR);

        public final SqlColumn<String> definer = column("DEFINER", JDBCType.VARCHAR);

        public final SqlColumn<String> characterSetClient = column("CHARACTER_SET_CLIENT", JDBCType.VARCHAR);

        public final SqlColumn<String> collationConnection = column("COLLATION_CONNECTION", JDBCType.VARCHAR);

        public final SqlColumn<String> databaseCollation = column("DATABASE_COLLATION", JDBCType.VARCHAR);

        public final SqlColumn<String> dataType = column("DATA_TYPE", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> dtdIdentifier = column("DTD_IDENTIFIER", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> routineDefinition = column("ROUTINE_DEFINITION", JDBCType.LONGVARCHAR);

        public final SqlColumn<byte[]> externalName = column("EXTERNAL_NAME", JDBCType.BINARY);

        public final SqlColumn<byte[]> sqlPath = column("SQL_PATH", JDBCType.BINARY);

        public final SqlColumn<String> routineComment = column("ROUTINE_COMMENT", JDBCType.LONGVARCHAR);

        public Routines() {
            super("ROUTINES");
        }
    }
}