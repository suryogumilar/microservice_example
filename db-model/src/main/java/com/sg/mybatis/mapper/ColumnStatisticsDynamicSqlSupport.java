package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ColumnStatisticsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.195+07:00", comments="Source Table: COLUMN_STATISTICS")
    public static final ColumnStatistics columnStatistics = new ColumnStatistics();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.196+07:00", comments="Source field: COLUMN_STATISTICS.SCHEMA_NAME")
    public static final SqlColumn<String> schemaName = columnStatistics.schemaName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.196+07:00", comments="Source field: COLUMN_STATISTICS.TABLE_NAME")
    public static final SqlColumn<String> tableName = columnStatistics.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.196+07:00", comments="Source field: COLUMN_STATISTICS.COLUMN_NAME")
    public static final SqlColumn<String> columnName = columnStatistics.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.197+07:00", comments="Source field: COLUMN_STATISTICS.HISTOGRAM")
    public static final SqlColumn<String> histogram = columnStatistics.histogram;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.195+07:00", comments="Source Table: COLUMN_STATISTICS")
    public static final class ColumnStatistics extends SqlTable {
        public final SqlColumn<String> schemaName = column("SCHEMA_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> columnName = column("COLUMN_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> histogram = column("HISTOGRAM", JDBCType.LONGVARCHAR);

        public ColumnStatistics() {
            super("COLUMN_STATISTICS");
        }
    }
}