package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbCmpPerIndexDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    public static final InnodbCmpPerIndex innodbCmpPerIndex = new InnodbCmpPerIndex();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source field: INNODB_CMP_PER_INDEX.database_name")
    public static final SqlColumn<String> databaseName = innodbCmpPerIndex.databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source field: INNODB_CMP_PER_INDEX.table_name")
    public static final SqlColumn<String> tableName = innodbCmpPerIndex.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source field: INNODB_CMP_PER_INDEX.index_name")
    public static final SqlColumn<String> indexName = innodbCmpPerIndex.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source field: INNODB_CMP_PER_INDEX.compress_ops")
    public static final SqlColumn<Integer> compressOps = innodbCmpPerIndex.compressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source field: INNODB_CMP_PER_INDEX.compress_ops_ok")
    public static final SqlColumn<Integer> compressOpsOk = innodbCmpPerIndex.compressOpsOk;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source field: INNODB_CMP_PER_INDEX.compress_time")
    public static final SqlColumn<Integer> compressTime = innodbCmpPerIndex.compressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source field: INNODB_CMP_PER_INDEX.uncompress_ops")
    public static final SqlColumn<Integer> uncompressOps = innodbCmpPerIndex.uncompressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source field: INNODB_CMP_PER_INDEX.uncompress_time")
    public static final SqlColumn<Integer> uncompressTime = innodbCmpPerIndex.uncompressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.337+07:00", comments="Source Table: INNODB_CMP_PER_INDEX")
    public static final class InnodbCmpPerIndex extends SqlTable {
        public final SqlColumn<String> databaseName = column("database_name", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("index_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> compressOps = column("compress_ops", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressOpsOk = column("compress_ops_ok", JDBCType.INTEGER);

        public final SqlColumn<Integer> compressTime = column("compress_time", JDBCType.INTEGER);

        public final SqlColumn<Integer> uncompressOps = column("uncompress_ops", JDBCType.INTEGER);

        public final SqlColumn<Integer> uncompressTime = column("uncompress_time", JDBCType.INTEGER);

        public InnodbCmpPerIndex() {
            super("INNODB_CMP_PER_INDEX");
        }
    }
}