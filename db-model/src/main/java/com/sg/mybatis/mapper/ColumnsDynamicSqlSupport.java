package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ColumnsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source Table: COLUMNS")
    public static final Columns columns = new Columns();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = columns.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = columns.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.TABLE_NAME")
    public static final SqlColumn<String> tableName = columns.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.COLUMN_NAME")
    public static final SqlColumn<String> columnName = columns.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.ORDINAL_POSITION")
    public static final SqlColumn<Integer> ordinalPosition = columns.ordinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.IS_NULLABLE")
    public static final SqlColumn<String> isNullable = columns.isNullable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.CHARACTER_MAXIMUM_LENGTH")
    public static final SqlColumn<Long> characterMaximumLength = columns.characterMaximumLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.CHARACTER_OCTET_LENGTH")
    public static final SqlColumn<Long> characterOctetLength = columns.characterOctetLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.NUMERIC_PRECISION")
    public static final SqlColumn<Long> numericPrecision = columns.numericPrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.NUMERIC_SCALE")
    public static final SqlColumn<Long> numericScale = columns.numericScale;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source field: COLUMNS.DATETIME_PRECISION")
    public static final SqlColumn<Integer> datetimePrecision = columns.datetimePrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.CHARACTER_SET_NAME")
    public static final SqlColumn<String> characterSetName = columns.characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.COLLATION_NAME")
    public static final SqlColumn<String> collationName = columns.collationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.COLUMN_KEY")
    public static final SqlColumn<String> columnKey = columns.columnKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.EXTRA")
    public static final SqlColumn<String> extra = columns.extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.PRIVILEGES")
    public static final SqlColumn<String> privileges = columns.privileges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.SRS_ID")
    public static final SqlColumn<Integer> srsId = columns.srsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.COLUMN_DEFAULT")
    public static final SqlColumn<String> columnDefault = columns.columnDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.DATA_TYPE")
    public static final SqlColumn<String> dataType = columns.dataType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.COLUMN_TYPE")
    public static final SqlColumn<String> columnType = columns.columnType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.COLUMN_COMMENT")
    public static final SqlColumn<String> columnComment = columns.columnComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.359+07:00", comments="Source field: COLUMNS.GENERATION_EXPRESSION")
    public static final SqlColumn<String> generationExpression = columns.generationExpression;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.358+07:00", comments="Source Table: COLUMNS")
    public static final class Columns extends SqlTable {
        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> columnName = column("COLUMN_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> ordinalPosition = column("ORDINAL_POSITION", JDBCType.INTEGER);

        public final SqlColumn<String> isNullable = column("IS_NULLABLE", JDBCType.VARCHAR);

        public final SqlColumn<Long> characterMaximumLength = column("CHARACTER_MAXIMUM_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> characterOctetLength = column("CHARACTER_OCTET_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> numericPrecision = column("NUMERIC_PRECISION", JDBCType.BIGINT);

        public final SqlColumn<Long> numericScale = column("NUMERIC_SCALE", JDBCType.BIGINT);

        public final SqlColumn<Integer> datetimePrecision = column("DATETIME_PRECISION", JDBCType.INTEGER);

        public final SqlColumn<String> characterSetName = column("CHARACTER_SET_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> collationName = column("COLLATION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> columnKey = column("COLUMN_KEY", JDBCType.CHAR);

        public final SqlColumn<String> extra = column("EXTRA", JDBCType.VARCHAR);

        public final SqlColumn<String> privileges = column("PRIVILEGES", JDBCType.VARCHAR);

        public final SqlColumn<Integer> srsId = column("SRS_ID", JDBCType.INTEGER);

        public final SqlColumn<String> columnDefault = column("COLUMN_DEFAULT", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> dataType = column("DATA_TYPE", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> columnType = column("COLUMN_TYPE", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> columnComment = column("COLUMN_COMMENT", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> generationExpression = column("GENERATION_EXPRESSION", JDBCType.LONGVARCHAR);

        public Columns() {
            super("COLUMNS");
        }
    }
}