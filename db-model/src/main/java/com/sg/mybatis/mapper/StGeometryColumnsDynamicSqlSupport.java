package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StGeometryColumnsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    public static final StGeometryColumns stGeometryColumns = new StGeometryColumns();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = stGeometryColumns.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = stGeometryColumns.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_NAME")
    public static final SqlColumn<String> tableName = stGeometryColumns.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source field: ST_GEOMETRY_COLUMNS.COLUMN_NAME")
    public static final SqlColumn<String> columnName = stGeometryColumns.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source field: ST_GEOMETRY_COLUMNS.SRS_NAME")
    public static final SqlColumn<String> srsName = stGeometryColumns.srsName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source field: ST_GEOMETRY_COLUMNS.SRS_ID")
    public static final SqlColumn<Integer> srsId = stGeometryColumns.srsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source field: ST_GEOMETRY_COLUMNS.GEOMETRY_TYPE_NAME")
    public static final SqlColumn<String> geometryTypeName = stGeometryColumns.geometryTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.377+07:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    public static final class StGeometryColumns extends SqlTable {
        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> columnName = column("COLUMN_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> srsName = column("SRS_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> srsId = column("SRS_ID", JDBCType.INTEGER);

        public final SqlColumn<String> geometryTypeName = column("GEOMETRY_TYPE_NAME", JDBCType.LONGVARCHAR);

        public StGeometryColumns() {
            super("ST_GEOMETRY_COLUMNS");
        }
    }
}