package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CollationsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.093+07:00", comments="Source Table: COLLATIONS")
    public static final Collations collations = new Collations();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.093+07:00", comments="Source field: COLLATIONS.COLLATION_NAME")
    public static final SqlColumn<String> collationName = collations.collationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.093+07:00", comments="Source field: COLLATIONS.CHARACTER_SET_NAME")
    public static final SqlColumn<String> characterSetName = collations.characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.093+07:00", comments="Source field: COLLATIONS.ID")
    public static final SqlColumn<Long> id = collations.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.093+07:00", comments="Source field: COLLATIONS.IS_DEFAULT")
    public static final SqlColumn<String> isDefault = collations.isDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source field: COLLATIONS.IS_COMPILED")
    public static final SqlColumn<String> isCompiled = collations.isCompiled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source field: COLLATIONS.SORTLEN")
    public static final SqlColumn<Integer> sortlen = collations.sortlen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.094+07:00", comments="Source field: COLLATIONS.PAD_ATTRIBUTE")
    public static final SqlColumn<String> padAttribute = collations.padAttribute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.093+07:00", comments="Source Table: COLLATIONS")
    public static final class Collations extends SqlTable {
        public final SqlColumn<String> collationName = column("COLLATION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> characterSetName = column("CHARACTER_SET_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> id = column("ID", JDBCType.BIGINT);

        public final SqlColumn<String> isDefault = column("IS_DEFAULT", JDBCType.VARCHAR);

        public final SqlColumn<String> isCompiled = column("IS_COMPILED", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sortlen = column("SORTLEN", JDBCType.INTEGER);

        public final SqlColumn<String> padAttribute = column("PAD_ATTRIBUTE", JDBCType.CHAR);

        public Collations() {
            super("COLLATIONS");
        }
    }
}