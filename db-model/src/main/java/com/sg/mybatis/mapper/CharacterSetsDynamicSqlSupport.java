package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CharacterSetsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source Table: CHARACTER_SETS")
    public static final CharacterSets characterSets = new CharacterSets();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.CHARACTER_SET_NAME")
    public static final SqlColumn<String> characterSetName = characterSets.characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.DEFAULT_COLLATE_NAME")
    public static final SqlColumn<String> defaultCollateName = characterSets.defaultCollateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.DESCRIPTION")
    public static final SqlColumn<String> description = characterSets.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.MAXLEN")
    public static final SqlColumn<Integer> maxlen = characterSets.maxlen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source Table: CHARACTER_SETS")
    public static final class CharacterSets extends SqlTable {
        public final SqlColumn<String> characterSetName = column("CHARACTER_SET_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> defaultCollateName = column("DEFAULT_COLLATE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);

        public final SqlColumn<Integer> maxlen = column("MAXLEN", JDBCType.INTEGER);

        public CharacterSets() {
            super("CHARACTER_SETS");
        }
    }
}