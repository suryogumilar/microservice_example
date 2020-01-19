package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbCmpPerIndexResetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.052+07:00", comments="Source Table: INNODB_CMP_PER_INDEX_RESET")
    public static final InnodbCmpPerIndexReset innodbCmpPerIndexReset = new InnodbCmpPerIndexReset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.053+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.database_name")
    public static final SqlColumn<String> databaseName = innodbCmpPerIndexReset.databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.053+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.table_name")
    public static final SqlColumn<String> tableName = innodbCmpPerIndexReset.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.053+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.index_name")
    public static final SqlColumn<String> indexName = innodbCmpPerIndexReset.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.053+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops")
    public static final SqlColumn<Integer> compressOps = innodbCmpPerIndexReset.compressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.053+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops_ok")
    public static final SqlColumn<Integer> compressOpsOk = innodbCmpPerIndexReset.compressOpsOk;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.053+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_time")
    public static final SqlColumn<Integer> compressTime = innodbCmpPerIndexReset.compressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.053+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_ops")
    public static final SqlColumn<Integer> uncompressOps = innodbCmpPerIndexReset.uncompressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.054+07:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_time")
    public static final SqlColumn<Integer> uncompressTime = innodbCmpPerIndexReset.uncompressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.052+07:00", comments="Source Table: INNODB_CMP_PER_INDEX_RESET")
    public static final class InnodbCmpPerIndexReset extends SqlTable {
        public final SqlColumn<String> databaseName = column("database_name", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("index_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> compressOps = column("compress_ops", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressOpsOk = column("compress_ops_ok", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressTime = column("compress_time", JDBCType.INTEGER);

        public final SqlColumn<Integer> uncompressOps = column("uncompress_ops", JDBCType.INTEGER);

        public final SqlColumn<Integer> uncompressTime = column("uncompress_time", JDBCType.INTEGER);

        public InnodbCmpPerIndexReset() {
            super("INNODB_CMP_PER_INDEX_RESET");
        }
    }
}