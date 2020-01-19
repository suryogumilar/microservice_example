package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TableConstraintsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.318+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    public static final TableConstraints tableConstraints = new TableConstraints();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.318+07:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_CATALOG")
    public static final SqlColumn<String> constraintCatalog = tableConstraints.constraintCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.319+07:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA")
    public static final SqlColumn<String> constraintSchema = tableConstraints.constraintSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.319+07:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_NAME")
    public static final SqlColumn<String> constraintName = tableConstraints.constraintName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.319+07:00", comments="Source field: TABLE_CONSTRAINTS.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = tableConstraints.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.319+07:00", comments="Source field: TABLE_CONSTRAINTS.TABLE_NAME")
    public static final SqlColumn<String> tableName = tableConstraints.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.319+07:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_TYPE")
    public static final SqlColumn<String> constraintType = tableConstraints.constraintType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.318+07:00", comments="Source Table: TABLE_CONSTRAINTS")
    public static final class TableConstraints extends SqlTable {
        public final SqlColumn<String> constraintCatalog = column("CONSTRAINT_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> constraintSchema = column("CONSTRAINT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> constraintName = column("CONSTRAINT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> constraintType = column("CONSTRAINT_TYPE", JDBCType.VARCHAR);

        public TableConstraints() {
            super("TABLE_CONSTRAINTS");
        }
    }
}