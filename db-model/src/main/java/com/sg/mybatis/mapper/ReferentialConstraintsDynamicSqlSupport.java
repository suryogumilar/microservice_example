package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReferentialConstraintsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.07+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    public static final ReferentialConstraints referentialConstraints = new ReferentialConstraints();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.07+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG")
    public static final SqlColumn<String> constraintCatalog = referentialConstraints.constraintCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.071+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA")
    public static final SqlColumn<String> constraintSchema = referentialConstraints.constraintSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.071+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME")
    public static final SqlColumn<String> constraintName = referentialConstraints.constraintName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.071+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG")
    public static final SqlColumn<String> uniqueConstraintCatalog = referentialConstraints.uniqueConstraintCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.071+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA")
    public static final SqlColumn<String> uniqueConstraintSchema = referentialConstraints.uniqueConstraintSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.071+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME")
    public static final SqlColumn<String> uniqueConstraintName = referentialConstraints.uniqueConstraintName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.071+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.MATCH_OPTION")
    public static final SqlColumn<String> matchOption = referentialConstraints.matchOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.071+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UPDATE_RULE")
    public static final SqlColumn<String> updateRule = referentialConstraints.updateRule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.071+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.DELETE_RULE")
    public static final SqlColumn<String> deleteRule = referentialConstraints.deleteRule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.071+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.TABLE_NAME")
    public static final SqlColumn<String> tableName = referentialConstraints.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.072+07:00", comments="Source field: REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME")
    public static final SqlColumn<String> referencedTableName = referentialConstraints.referencedTableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.07+07:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    public static final class ReferentialConstraints extends SqlTable {
        public final SqlColumn<String> constraintCatalog = column("CONSTRAINT_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> constraintSchema = column("CONSTRAINT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> constraintName = column("CONSTRAINT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> uniqueConstraintCatalog = column("UNIQUE_CONSTRAINT_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> uniqueConstraintSchema = column("UNIQUE_CONSTRAINT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> uniqueConstraintName = column("UNIQUE_CONSTRAINT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> matchOption = column("MATCH_OPTION", JDBCType.CHAR);

        public final SqlColumn<String> updateRule = column("UPDATE_RULE", JDBCType.CHAR);

        public final SqlColumn<String> deleteRule = column("DELETE_RULE", JDBCType.CHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> referencedTableName = column("REFERENCED_TABLE_NAME", JDBCType.VARCHAR);

        public ReferentialConstraints() {
            super("REFERENTIAL_CONSTRAINTS");
        }
    }
}