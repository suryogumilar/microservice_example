package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class KeyColumnUsageDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    public static final KeyColumnUsage keyColumnUsage = new KeyColumnUsage();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.CONSTRAINT_CATALOG")
    public static final SqlColumn<String> constraintCatalog = keyColumnUsage.constraintCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA")
    public static final SqlColumn<String> constraintSchema = keyColumnUsage.constraintSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.CONSTRAINT_NAME")
    public static final SqlColumn<String> constraintName = keyColumnUsage.constraintName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = keyColumnUsage.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = keyColumnUsage.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.TABLE_NAME")
    public static final SqlColumn<String> tableName = keyColumnUsage.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.COLUMN_NAME")
    public static final SqlColumn<String> columnName = keyColumnUsage.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.ORDINAL_POSITION")
    public static final SqlColumn<Integer> ordinalPosition = keyColumnUsage.ordinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT")
    public static final SqlColumn<byte[]> positionInUniqueConstraint = keyColumnUsage.positionInUniqueConstraint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA")
    public static final SqlColumn<byte[]> referencedTableSchema = keyColumnUsage.referencedTableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME")
    public static final SqlColumn<byte[]> referencedTableName = keyColumnUsage.referencedTableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source field: KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME")
    public static final SqlColumn<byte[]> referencedColumnName = keyColumnUsage.referencedColumnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.417+07:00", comments="Source Table: KEY_COLUMN_USAGE")
    public static final class KeyColumnUsage extends SqlTable {
        public final SqlColumn<String> constraintCatalog = column("CONSTRAINT_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> constraintSchema = column("CONSTRAINT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> constraintName = column("CONSTRAINT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> columnName = column("COLUMN_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> ordinalPosition = column("ORDINAL_POSITION", JDBCType.INTEGER);

        public final SqlColumn<byte[]> positionInUniqueConstraint = column("POSITION_IN_UNIQUE_CONSTRAINT", JDBCType.BINARY);

        public final SqlColumn<byte[]> referencedTableSchema = column("REFERENCED_TABLE_SCHEMA", JDBCType.BINARY);

        public final SqlColumn<byte[]> referencedTableName = column("REFERENCED_TABLE_NAME", JDBCType.BINARY);

        public final SqlColumn<byte[]> referencedColumnName = column("REFERENCED_COLUMN_NAME", JDBCType.BINARY);

        public KeyColumnUsage() {
            super("KEY_COLUMN_USAGE");
        }
    }
}