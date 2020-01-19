package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbVirtualDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    public static final InnodbVirtual innodbVirtual = new InnodbVirtual();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.TABLE_ID")
    public static final SqlColumn<Long> tableId = innodbVirtual.tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.POS")
    public static final SqlColumn<Integer> pos = innodbVirtual.pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source field: INNODB_VIRTUAL.BASE_POS")
    public static final SqlColumn<Integer> basePos = innodbVirtual.basePos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.527+07:00", comments="Source Table: INNODB_VIRTUAL")
    public static final class InnodbVirtual extends SqlTable {
        public final SqlColumn<Long> tableId = column("TABLE_ID", JDBCType.BIGINT);

        public final SqlColumn<Integer> pos = column("POS", JDBCType.INTEGER);

        public final SqlColumn<Integer> basePos = column("BASE_POS", JDBCType.INTEGER);

        public InnodbVirtual() {
            super("INNODB_VIRTUAL");
        }
    }
}