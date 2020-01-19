package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbFtBeingDeletedDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.379+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    public static final InnodbFtBeingDeleted innodbFtBeingDeleted = new InnodbFtBeingDeleted();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source field: INNODB_FT_BEING_DELETED.DOC_ID")
    public static final SqlColumn<Long> docId = innodbFtBeingDeleted.docId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.38+07:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    public static final class InnodbFtBeingDeleted extends SqlTable {
        public final SqlColumn<Long> docId = column("DOC_ID", JDBCType.BIGINT);

        public InnodbFtBeingDeleted() {
            super("INNODB_FT_BEING_DELETED");
        }
    }
}