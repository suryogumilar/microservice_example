package com.sg.mybatis.model;

import javax.annotation.Generated;

public class CollationCharacterSetApplicability {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.419+07:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME")
    private String collationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.419+07:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME")
    private String characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.419+07:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME")
    public String getCollationName() {
        return collationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.419+07:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME")
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.419+07:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME")
    public String getCharacterSetName() {
        return characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.419+07:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME")
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }
}