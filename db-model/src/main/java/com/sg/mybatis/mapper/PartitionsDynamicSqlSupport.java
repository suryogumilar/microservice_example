package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PartitionsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source Table: PARTITIONS")
    public static final Partitions partitions = new Partitions();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.TABLE_CATALOG")
    public static final SqlColumn<String> tableCatalog = partitions.tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.TABLE_SCHEMA")
    public static final SqlColumn<String> tableSchema = partitions.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.TABLE_NAME")
    public static final SqlColumn<String> tableName = partitions.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.PARTITION_NAME")
    public static final SqlColumn<String> partitionName = partitions.partitionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.SUBPARTITION_NAME")
    public static final SqlColumn<String> subpartitionName = partitions.subpartitionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.PARTITION_ORDINAL_POSITION")
    public static final SqlColumn<Integer> partitionOrdinalPosition = partitions.partitionOrdinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.SUBPARTITION_ORDINAL_POSITION")
    public static final SqlColumn<Integer> subpartitionOrdinalPosition = partitions.subpartitionOrdinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.PARTITION_METHOD")
    public static final SqlColumn<String> partitionMethod = partitions.partitionMethod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.SUBPARTITION_METHOD")
    public static final SqlColumn<String> subpartitionMethod = partitions.subpartitionMethod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.PARTITION_EXPRESSION")
    public static final SqlColumn<String> partitionExpression = partitions.partitionExpression;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.SUBPARTITION_EXPRESSION")
    public static final SqlColumn<String> subpartitionExpression = partitions.subpartitionExpression;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.TABLE_ROWS")
    public static final SqlColumn<Long> tableRows = partitions.tableRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.AVG_ROW_LENGTH")
    public static final SqlColumn<Long> avgRowLength = partitions.avgRowLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.DATA_LENGTH")
    public static final SqlColumn<Long> dataLength = partitions.dataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source field: PARTITIONS.MAX_DATA_LENGTH")
    public static final SqlColumn<Long> maxDataLength = partitions.maxDataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.INDEX_LENGTH")
    public static final SqlColumn<Long> indexLength = partitions.indexLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.DATA_FREE")
    public static final SqlColumn<Long> dataFree = partitions.dataFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.CREATE_TIME")
    public static final SqlColumn<Date> createTime = partitions.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.UPDATE_TIME")
    public static final SqlColumn<Date> updateTime = partitions.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.CHECK_TIME")
    public static final SqlColumn<Date> checkTime = partitions.checkTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.CHECKSUM")
    public static final SqlColumn<Long> checksum = partitions.checksum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.NODEGROUP")
    public static final SqlColumn<String> nodegroup = partitions.nodegroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.TABLESPACE_NAME")
    public static final SqlColumn<String> tablespaceName = partitions.tablespaceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.PARTITION_DESCRIPTION")
    public static final SqlColumn<String> partitionDescription = partitions.partitionDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.522+07:00", comments="Source field: PARTITIONS.PARTITION_COMMENT")
    public static final SqlColumn<String> partitionComment = partitions.partitionComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.521+07:00", comments="Source Table: PARTITIONS")
    public static final class Partitions extends SqlTable {
        public final SqlColumn<String> tableCatalog = column("TABLE_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> tableSchema = column("TABLE_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("TABLE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> partitionName = column("PARTITION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> subpartitionName = column("SUBPARTITION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> partitionOrdinalPosition = column("PARTITION_ORDINAL_POSITION", JDBCType.INTEGER);

        public final SqlColumn<Integer> subpartitionOrdinalPosition = column("SUBPARTITION_ORDINAL_POSITION", JDBCType.INTEGER);

        public final SqlColumn<String> partitionMethod = column("PARTITION_METHOD", JDBCType.VARCHAR);

        public final SqlColumn<String> subpartitionMethod = column("SUBPARTITION_METHOD", JDBCType.VARCHAR);

        public final SqlColumn<String> partitionExpression = column("PARTITION_EXPRESSION", JDBCType.VARCHAR);

        public final SqlColumn<String> subpartitionExpression = column("SUBPARTITION_EXPRESSION", JDBCType.VARCHAR);

        public final SqlColumn<Long> tableRows = column("TABLE_ROWS", JDBCType.BIGINT);

        public final SqlColumn<Long> avgRowLength = column("AVG_ROW_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> dataLength = column("DATA_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> maxDataLength = column("MAX_DATA_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> indexLength = column("INDEX_LENGTH", JDBCType.BIGINT);

        public final SqlColumn<Long> dataFree = column("DATA_FREE", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("CREATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("UPDATE_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> checkTime = column("CHECK_TIME", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> checksum = column("CHECKSUM", JDBCType.BIGINT);

        public final SqlColumn<String> nodegroup = column("NODEGROUP", JDBCType.VARCHAR);

        public final SqlColumn<String> tablespaceName = column("TABLESPACE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> partitionDescription = column("PARTITION_DESCRIPTION", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> partitionComment = column("PARTITION_COMMENT", JDBCType.LONGVARCHAR);

        public Partitions() {
            super("PARTITIONS");
        }
    }
}