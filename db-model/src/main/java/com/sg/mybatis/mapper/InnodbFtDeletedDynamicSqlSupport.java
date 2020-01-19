package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbFtDeletedDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.248+07:00", comments="Source Table: INNODB_FT_DELETED")
    public static final InnodbFtDeleted innodbFtDeleted = new InnodbFtDeleted();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.248+07:00", comments="Source field: INNODB_FT_DELETED.DOC_ID")
    public static final SqlColumn<Long> docId = innodbFtDeleted.docId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.248+07:00", comments="Source Table: INNODB_FT_DELETED")
    public static final class InnodbFtDeleted extends SqlTable {
        public final SqlColumn<Long> docId = column("DOC_ID", JDBCType.BIGINT);

        public InnodbFtDeleted() {
            super("INNODB_FT_DELETED");
        }
    }
}