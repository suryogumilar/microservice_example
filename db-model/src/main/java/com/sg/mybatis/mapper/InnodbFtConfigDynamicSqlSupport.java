package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbFtConfigDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source Table: INNODB_FT_CONFIG")
    public static final InnodbFtConfig innodbFtConfig = new InnodbFtConfig();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source field: INNODB_FT_CONFIG.KEY")
    public static final SqlColumn<String> key = innodbFtConfig.key;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source field: INNODB_FT_CONFIG.VALUE")
    public static final SqlColumn<String> value = innodbFtConfig.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.483+07:00", comments="Source Table: INNODB_FT_CONFIG")
    public static final class InnodbFtConfig extends SqlTable {
        public final SqlColumn<String> key = column("KEY", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("VALUE", JDBCType.VARCHAR);

        public InnodbFtConfig() {
            super("INNODB_FT_CONFIG");
        }
    }
}