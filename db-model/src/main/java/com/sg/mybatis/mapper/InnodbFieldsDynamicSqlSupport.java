package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbFieldsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    public static final InnodbFields innodbFields = new InnodbFields();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source field: INNODB_FIELDS.NAME")
    public static final SqlColumn<String> name = innodbFields.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source field: INNODB_FIELDS.POS")
    public static final SqlColumn<Long> pos = innodbFields.pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source field: INNODB_FIELDS.INDEX_ID")
    public static final SqlColumn<byte[]> indexId = innodbFields.indexId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.509+07:00", comments="Source Table: INNODB_FIELDS")
    public static final class InnodbFields extends SqlTable {
        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> pos = column("POS", JDBCType.BIGINT);

        public final SqlColumn<byte[]> indexId = column("INDEX_ID", JDBCType.VARBINARY);

        public InnodbFields() {
            super("INNODB_FIELDS");
        }
    }
}