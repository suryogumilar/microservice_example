package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ViewsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.506+07:00", comments="Source Table: VIEWS")
    public static final Views views = new Views();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.506+07:00", comments="Source field: VIEWS.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = views.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.506+07:00", comments="Source field: VIEWS.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = views.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.506+07:00", comments="Source field: VIEWS.TABLE_NAME")
    public static final SqlColumn<String> tableName = views.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source field: VIEWS.CHECK_OPTION")
    public static final SqlColumn<String> checkOption = views.checkOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source field: VIEWS.IS_UPDATABLE")
    public static final SqlColumn<String> isUpdatable = views.isUpdatable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source field: VIEWS.DEFINER")
    public static final SqlColumn<String> definer = views.definer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source field: VIEWS.SECURITY_TYPE")
    public static final SqlColumn<String> securityType = views.securityType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source field: VIEWS.CHARACTER_SET_CLIENT")
    public static final SqlColumn<String> characterSetClient = views.characterSetClient;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source field: VIEWS.COLLATION_CONNECTION")
    public static final SqlColumn<String> collationConnection = views.collationConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.507+07:00", comments="Source field: VIEWS.VIEW_DEFINITION")
    public static final SqlColumn<String> viewDefinition = views.viewDefinition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.506+07:00", comments="Source Table: VIEWS")
    public static final class Views extends SqlTable {
        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> checkOption = column("CHECK_OPTION", JDBCType.CHAR);

        public final SqlColumn<String> isUpdatable = column("IS_UPDATABLE", JDBCType.CHAR);

        public final SqlColumn<String> definer = column("DEFINER", JDBCType.VARCHAR);

        public final SqlColumn<String> securityType = column("SECURITY_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> characterSetClient = column("CHARACTER_SET_CLIENT", JDBCType.VARCHAR);

        public final SqlColumn<String> collationConnection = column("COLLATION_CONNECTION", JDBCType.VARCHAR);

        public final SqlColumn<String> viewDefinition = column("VIEW_DEFINITION", JDBCType.LONGVARCHAR);

        public Views() {
            super("VIEWS");
        }
    }
}