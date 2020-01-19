package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbDatafilesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_DATAFILES")
    public static final InnodbDatafiles innodbDatafiles = new InnodbDatafiles();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source field: INNODB_DATAFILES.PATH")
    public static final SqlColumn<String> path = innodbDatafiles.path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source field: INNODB_DATAFILES.SPACE")
    public static final SqlColumn<byte[]> space = innodbDatafiles.space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.528+07:00", comments="Source Table: INNODB_DATAFILES")
    public static final class InnodbDatafiles extends SqlTable {
        public final SqlColumn<String> path = column("PATH", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> space = column("SPACE", JDBCType.VARBINARY);

        public InnodbDatafiles() {
            super("INNODB_DATAFILES");
        }
    }
}