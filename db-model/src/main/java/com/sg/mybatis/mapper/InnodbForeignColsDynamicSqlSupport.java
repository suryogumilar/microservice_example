package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbForeignColsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.16+07:00", comments="Source Table: INNODB_FOREIGN_COLS")
    public static final InnodbForeignCols innodbForeignCols = new InnodbForeignCols();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.16+07:00", comments="Source field: INNODB_FOREIGN_COLS.ID")
    public static final SqlColumn<String> id = innodbForeignCols.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.16+07:00", comments="Source field: INNODB_FOREIGN_COLS.FOR_COL_NAME")
    public static final SqlColumn<String> forColName = innodbForeignCols.forColName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.16+07:00", comments="Source field: INNODB_FOREIGN_COLS.REF_COL_NAME")
    public static final SqlColumn<String> refColName = innodbForeignCols.refColName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.16+07:00", comments="Source field: INNODB_FOREIGN_COLS.POS")
    public static final SqlColumn<Integer> pos = innodbForeignCols.pos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.16+07:00", comments="Source Table: INNODB_FOREIGN_COLS")
    public static final class InnodbForeignCols extends SqlTable {
        public final SqlColumn<String> id = column("ID", JDBCType.VARCHAR);

        public final SqlColumn<String> forColName = column("FOR_COL_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> refColName = column("REF_COL_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> pos = column("POS", JDBCType.INTEGER);

        public InnodbForeignCols() {
            super("INNODB_FOREIGN_COLS");
        }
    }
}