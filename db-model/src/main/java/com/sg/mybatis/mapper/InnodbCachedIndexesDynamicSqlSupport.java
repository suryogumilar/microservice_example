package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbCachedIndexesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    public static final InnodbCachedIndexes innodbCachedIndexes = new InnodbCachedIndexes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source field: INNODB_CACHED_INDEXES.SPACE_ID")
    public static final SqlColumn<Integer> spaceId = innodbCachedIndexes.spaceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source field: INNODB_CACHED_INDEXES.INDEX_ID")
    public static final SqlColumn<Long> indexId = innodbCachedIndexes.indexId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source field: INNODB_CACHED_INDEXES.N_CACHED_PAGES")
    public static final SqlColumn<Long> nCachedPages = innodbCachedIndexes.nCachedPages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.387+07:00", comments="Source Table: INNODB_CACHED_INDEXES")
    public static final class InnodbCachedIndexes extends SqlTable {
        public final SqlColumn<Integer> spaceId = column("SPACE_ID", JDBCType.INTEGER);

        public final SqlColumn<Long> indexId = column("INDEX_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> nCachedPages = column("N_CACHED_PAGES", JDBCType.BIGINT);

        public InnodbCachedIndexes() {
            super("INNODB_CACHED_INDEXES");
        }
    }
}