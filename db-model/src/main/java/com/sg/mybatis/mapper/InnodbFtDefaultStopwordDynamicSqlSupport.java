package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbFtDefaultStopwordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    public static final InnodbFtDefaultStopword innodbFtDefaultStopword = new InnodbFtDefaultStopword();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source field: INNODB_FT_DEFAULT_STOPWORD.value")
    public static final SqlColumn<String> value = innodbFtDefaultStopword.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.499+07:00", comments="Source Table: INNODB_FT_DEFAULT_STOPWORD")
    public static final class InnodbFtDefaultStopword extends SqlTable {
        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public InnodbFtDefaultStopword() {
            super("INNODB_FT_DEFAULT_STOPWORD");
        }
    }
}