package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CollationCharacterSetApplicabilityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    public static final CollationCharacterSetApplicability collationCharacterSetApplicability = new CollationCharacterSetApplicability();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME")
    public static final SqlColumn<String> collationName = collationCharacterSetApplicability.collationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME")
    public static final SqlColumn<String> characterSetName = collationCharacterSetApplicability.characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    public static final class CollationCharacterSetApplicability extends SqlTable {
        public final SqlColumn<String> collationName = column("COLLATION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> characterSetName = column("CHARACTER_SET_NAME", JDBCType.VARCHAR);

        public CollationCharacterSetApplicability() {
            super("COLLATION_CHARACTER_SET_APPLICABILITY");
        }
    }
}