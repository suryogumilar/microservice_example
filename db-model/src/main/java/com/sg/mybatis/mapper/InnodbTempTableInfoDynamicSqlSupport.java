package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbTempTableInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.202+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    public static final InnodbTempTableInfo innodbTempTableInfo = new InnodbTempTableInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.202+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.TABLE_ID")
    public static final SqlColumn<Long> tableId = innodbTempTableInfo.tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.202+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.NAME")
    public static final SqlColumn<String> name = innodbTempTableInfo.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.203+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.N_COLS")
    public static final SqlColumn<Integer> nCols = innodbTempTableInfo.nCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.203+07:00", comments="Source field: INNODB_TEMP_TABLE_INFO.SPACE")
    public static final SqlColumn<Integer> space = innodbTempTableInfo.space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.202+07:00", comments="Source Table: INNODB_TEMP_TABLE_INFO")
    public static final class InnodbTempTableInfo extends SqlTable {
        public final SqlColumn<Long> tableId = column("TABLE_ID", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> nCols = column("N_COLS", JDBCType.INTEGER);

        public final SqlColumn<Integer> space = column("SPACE", JDBCType.INTEGER);

        public InnodbTempTableInfo() {
            super("INNODB_TEMP_TABLE_INFO");
        }
    }
}