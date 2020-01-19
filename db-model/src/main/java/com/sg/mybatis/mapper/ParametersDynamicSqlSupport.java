package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ParametersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source Table: PARAMETERS")
    public static final Parameters parameters = new Parameters();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.SPECIFIC_CATALOG")
    public static final SqlColumn<String> specificCatalog = parameters.specificCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.SPECIFIC_SCHEMA")
    public static final SqlColumn<String> specificSchema = parameters.specificSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.SPECIFIC_NAME")
    public static final SqlColumn<String> specificName = parameters.specificName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.ORDINAL_POSITION")
    public static final SqlColumn<Long> ordinalPosition = parameters.ordinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.PARAMETER_MODE")
    public static final SqlColumn<String> parameterMode = parameters.parameterMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.PARAMETER_NAME")
    public static final SqlColumn<String> parameterName = parameters.parameterName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.CHARACTER_MAXIMUM_LENGTH")
    public static final SqlColumn<Long> characterMaximumLength = parameters.characterMaximumLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.CHARACTER_OCTET_LENGTH")
    public static final SqlColumn<Long> characterOctetLength = parameters.characterOctetLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.NUMERIC_PRECISION")
    public static final SqlColumn<Integer> numericPrecision = parameters.numericPrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.NUMERIC_SCALE")
    public static final SqlColumn<Long> numericScale = parameters.numericScale;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.DATETIME_PRECISION")
    public static final SqlColumn<Integer> datetimePrecision = parameters.datetimePrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.CHARACTER_SET_NAME")
    public static final SqlColumn<String> characterSetName = parameters.characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.COLLATION_NAME")
    public static final SqlColumn<String> collationName = parameters.collationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.ROUTINE_TYPE")
    public static final SqlColumn<String> routineType = parameters.routineType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.DATA_TYPE")
    public static final SqlColumn<String> dataType = parameters.dataType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source field: PARAMETERS.DTD_IDENTIFIER")
    public static final SqlColumn<String> dtdIdentifier = parameters.dtdIdentifier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.435+07:00", comments="Source Table: PARAMETERS")
    public static final class Parameters extends SqlTable {
        public final SqlColumn<String> specificCatalog = column("SPECIFIC_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> specificSchema = column("SPECIFIC_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> specificName = column("SPECIFIC_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> ordinalPosition = column("ORDINAL_POSITION", JDBCType.BIGINT);

        public final SqlColumn<String> parameterMode = column("PARAMETER_MODE", JDBCType.VARCHAR);

        public final SqlColumn<String> parameterName = column("PARAMETER_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> characterMaximumLength = column("CHARACTER_MAXIMUM_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> characterOctetLength = column("CHARACTER_OCTET_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Integer> numericPrecision = column("NUMERIC_PRECISION", JDBCType.INTEGER);

        public final SqlColumn<Long> numericScale = column("NUMERIC_SCALE", JDBCType.BIGINT);

        public final SqlColumn<Integer> datetimePrecision = column("DATETIME_PRECISION", JDBCType.INTEGER);

        public final SqlColumn<String> characterSetName = column("CHARACTER_SET_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> collationName = column("COLLATION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> routineType = column("ROUTINE_TYPE", JDBCType.CHAR);

        public final SqlColumn<String> dataType = column("DATA_TYPE", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> dtdIdentifier = column("DTD_IDENTIFIER", JDBCType.LONGVARCHAR);

        public Parameters() {
            super("PARAMETERS");
        }
    }
}