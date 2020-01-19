package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatisticsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.271+07:00", comments="Source Table: STATISTICS")
    public static final Statistics statistics = new Statistics();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = statistics.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = statistics.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.TABLE_NAME")
    public static final SqlColumn<String> tableName = statistics.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.NON_UNIQUE")
    public static final SqlColumn<Integer> nonUnique = statistics.nonUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.INDEX_SCHEMA")
    public static final SqlColumn<String> indexSchema = statistics.indexSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.INDEX_NAME")
    public static final SqlColumn<String> indexName = statistics.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.SEQ_IN_INDEX")
    public static final SqlColumn<Integer> seqInIndex = statistics.seqInIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.COLUMN_NAME")
    public static final SqlColumn<String> columnName = statistics.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.COLLATION")
    public static final SqlColumn<String> collation = statistics.collation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.CARDINALITY")
    public static final SqlColumn<Long> cardinality = statistics.cardinality;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.SUB_PART")
    public static final SqlColumn<Long> subPart = statistics.subPart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.NULLABLE")
    public static final SqlColumn<String> nullable = statistics.nullable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.INDEX_TYPE")
    public static final SqlColumn<String> indexType = statistics.indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.COMMENT")
    public static final SqlColumn<String> comment = statistics.comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.INDEX_COMMENT")
    public static final SqlColumn<String> indexComment = statistics.indexComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source field: STATISTICS.IS_VISIBLE")
    public static final SqlColumn<String> isVisible = statistics.isVisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source field: STATISTICS.PACKED")
    public static final SqlColumn<byte[]> packed = statistics.packed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.274+07:00", comments="Source field: STATISTICS.EXPRESSION")
    public static final SqlColumn<String> expression = statistics.expression;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.272+07:00", comments="Source Table: STATISTICS")
    public static final class Statistics extends SqlTable {
        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> nonUnique = column("NON_UNIQUE", JDBCType.INTEGER);

        public final SqlColumn<String> indexSchema = column("INDEX_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("INDEX_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> seqInIndex = column("SEQ_IN_INDEX", JDBCType.INTEGER);

        public final SqlColumn<String> columnName = column("COLUMN_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> collation = column("COLLATION", JDBCType.VARCHAR);

        public final SqlColumn<Long> cardinality = column("CARDINALITY", JDBCType.BIGINT);

        public final SqlColumn<Long> subPart = column("SUB_PART", JDBCType.BIGINT);

        public final SqlColumn<String> nullable = column("NULLABLE", JDBCType.VARCHAR);

        public final SqlColumn<String> indexType = column("INDEX_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> comment = column("COMMENT", JDBCType.VARCHAR);

        public final SqlColumn<String> indexComment = column("INDEX_COMMENT", JDBCType.VARCHAR);

        public final SqlColumn<String> isVisible = column("IS_VISIBLE", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> packed = column("PACKED", JDBCType.BINARY);

        public final SqlColumn<String> expression = column("EXPRESSION", JDBCType.LONGVARCHAR);

        public Statistics() {
            super("STATISTICS");
        }
    }
}