package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbIndexesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source Table: INNODB_INDEXES")
    public static final InnodbIndexes innodbIndexes = new InnodbIndexes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.INDEX_ID")
    public static final SqlColumn<Long> indexId = innodbIndexes.indexId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.NAME")
    public static final SqlColumn<String> name = innodbIndexes.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.TABLE_ID")
    public static final SqlColumn<Long> tableId = innodbIndexes.tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.TYPE")
    public static final SqlColumn<Integer> type = innodbIndexes.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.N_FIELDS")
    public static final SqlColumn<Integer> nFields = innodbIndexes.nFields;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.PAGE_NO")
    public static final SqlColumn<Integer> pageNo = innodbIndexes.pageNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source field: INNODB_INDEXES.SPACE")
    public static final SqlColumn<Integer> space = innodbIndexes.space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.524+07:00", comments="Source field: INNODB_INDEXES.MERGE_THRESHOLD")
    public static final SqlColumn<Integer> mergeThreshold = innodbIndexes.mergeThreshold;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.523+07:00", comments="Source Table: INNODB_INDEXES")
    public static final class InnodbIndexes extends SqlTable {
        public final SqlColumn<Long> indexId = column("INDEX_ID", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> tableId = column("TABLE_ID", JDBCType.BIGINT);

        public final SqlColumn<Integer> type = column("TYPE", JDBCType.INTEGER);

        public final SqlColumn<Integer> nFields = column("N_FIELDS", JDBCType.INTEGER);

        public final SqlColumn<Integer> pageNo = column("PAGE_NO", JDBCType.INTEGER);

        public final SqlColumn<Integer> space = column("SPACE", JDBCType.INTEGER);

        public final SqlColumn<Integer> mergeThreshold = column("MERGE_THRESHOLD", JDBCType.INTEGER);

        public InnodbIndexes() {
            super("INNODB_INDEXES");
        }
    }
}