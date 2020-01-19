package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbColumnsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source Table: INNODB_COLUMNS")
    public static final InnodbColumns innodbColumns = new InnodbColumns();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source field: INNODB_COLUMNS.TABLE_ID")
    public static final SqlColumn<Long> tableId = innodbColumns.tableId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source field: INNODB_COLUMNS.NAME")
    public static final SqlColumn<String> name = innodbColumns.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source field: INNODB_COLUMNS.POS")
    public static final SqlColumn<Long> pos = innodbColumns.pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source field: INNODB_COLUMNS.MTYPE")
    public static final SqlColumn<Integer> mtype = innodbColumns.mtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source field: INNODB_COLUMNS.PRTYPE")
    public static final SqlColumn<Integer> prtype = innodbColumns.prtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source field: INNODB_COLUMNS.LEN")
    public static final SqlColumn<Integer> len = innodbColumns.len;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source field: INNODB_COLUMNS.HAS_DEFAULT")
    public static final SqlColumn<Integer> hasDefault = innodbColumns.hasDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source field: INNODB_COLUMNS.DEFAULT_VALUE")
    public static final SqlColumn<String> defaultValue = innodbColumns.defaultValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.404+07:00", comments="Source Table: INNODB_COLUMNS")
    public static final class InnodbColumns extends SqlTable {
        public final SqlColumn<Long> tableId = column("TABLE_ID", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> pos = column("POS", JDBCType.BIGINT);

        public final SqlColumn<Integer> mtype = column("MTYPE", JDBCType.INTEGER);

        public final SqlColumn<Integer> prtype = column("PRTYPE", JDBCType.INTEGER);

        public final SqlColumn<Integer> len = column("LEN", JDBCType.INTEGER);

        public final SqlColumn<Integer> hasDefault = column("HAS_DEFAULT", JDBCType.INTEGER);

        public final SqlColumn<String> defaultValue = column("DEFAULT_VALUE", JDBCType.LONGVARCHAR);

        public InnodbColumns() {
            super("INNODB_COLUMNS");
        }
    }
}