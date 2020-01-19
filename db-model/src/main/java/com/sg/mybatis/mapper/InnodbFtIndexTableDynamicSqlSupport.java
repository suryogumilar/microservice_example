package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbFtIndexTableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.503+07:00", comments="Source Table: INNODB_FT_INDEX_TABLE")
    public static final InnodbFtIndexTable innodbFtIndexTable = new InnodbFtIndexTable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.503+07:00", comments="Source field: INNODB_FT_INDEX_TABLE.WORD")
    public static final SqlColumn<String> word = innodbFtIndexTable.word;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.503+07:00", comments="Source field: INNODB_FT_INDEX_TABLE.FIRST_DOC_ID")
    public static final SqlColumn<Long> firstDocId = innodbFtIndexTable.firstDocId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.503+07:00", comments="Source field: INNODB_FT_INDEX_TABLE.LAST_DOC_ID")
    public static final SqlColumn<Long> lastDocId = innodbFtIndexTable.lastDocId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.503+07:00", comments="Source field: INNODB_FT_INDEX_TABLE.DOC_COUNT")
    public static final SqlColumn<Long> docCount = innodbFtIndexTable.docCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.503+07:00", comments="Source field: INNODB_FT_INDEX_TABLE.DOC_ID")
    public static final SqlColumn<Long> docId = innodbFtIndexTable.docId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.503+07:00", comments="Source field: INNODB_FT_INDEX_TABLE.POSITION")
    public static final SqlColumn<Long> position = innodbFtIndexTable.position;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.503+07:00", comments="Source Table: INNODB_FT_INDEX_TABLE")
    public static final class InnodbFtIndexTable extends SqlTable {
        public final SqlColumn<String> word = column("WORD", JDBCType.VARCHAR);

        public final SqlColumn<Long> firstDocId = column("FIRST_DOC_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> lastDocId = column("LAST_DOC_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> docCount = column("DOC_COUNT", JDBCType.BIGINT);

        public final SqlColumn<Long> docId = column("DOC_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> position = column("POSITION", JDBCType.BIGINT);

        public InnodbFtIndexTable() {
            super("INNODB_FT_INDEX_TABLE");
        }
    }
}