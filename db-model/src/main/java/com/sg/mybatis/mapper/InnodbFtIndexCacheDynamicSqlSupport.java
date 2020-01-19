package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbFtIndexCacheDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.331+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    public static final InnodbFtIndexCache innodbFtIndexCache = new InnodbFtIndexCache();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.331+07:00", comments="Source field: INNODB_FT_INDEX_CACHE.WORD")
    public static final SqlColumn<String> word = innodbFtIndexCache.word;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.331+07:00", comments="Source field: INNODB_FT_INDEX_CACHE.FIRST_DOC_ID")
    public static final SqlColumn<Long> firstDocId = innodbFtIndexCache.firstDocId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.331+07:00", comments="Source field: INNODB_FT_INDEX_CACHE.LAST_DOC_ID")
    public static final SqlColumn<Long> lastDocId = innodbFtIndexCache.lastDocId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.331+07:00", comments="Source field: INNODB_FT_INDEX_CACHE.DOC_COUNT")
    public static final SqlColumn<Long> docCount = innodbFtIndexCache.docCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source field: INNODB_FT_INDEX_CACHE.DOC_ID")
    public static final SqlColumn<Long> docId = innodbFtIndexCache.docId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.332+07:00", comments="Source field: INNODB_FT_INDEX_CACHE.POSITION")
    public static final SqlColumn<Long> position = innodbFtIndexCache.position;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.331+07:00", comments="Source Table: INNODB_FT_INDEX_CACHE")
    public static final class InnodbFtIndexCache extends SqlTable {
        public final SqlColumn<String> word = column("WORD", JDBCType.VARCHAR);

        public final SqlColumn<Long> firstDocId = column("FIRST_DOC_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> lastDocId = column("LAST_DOC_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> docCount = column("DOC_COUNT", JDBCType.BIGINT);

        public final SqlColumn<Long> docId = column("DOC_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> position = column("POSITION", JDBCType.BIGINT);

        public InnodbFtIndexCache() {
            super("INNODB_FT_INDEX_CACHE");
        }
    }
}