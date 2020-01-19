package com.sg.mybatis.model;

import javax.annotation.Generated;

public class CharacterSets {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.4+07:00", comments="Source field: CHARACTER_SETS.CHARACTER_SET_NAME")
    private String characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.DEFAULT_COLLATE_NAME")
    private String defaultCollateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.DESCRIPTION")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.MAXLEN")
    private Integer maxlen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.CHARACTER_SET_NAME")
    public String getCharacterSetName() {
        return characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.CHARACTER_SET_NAME")
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.DEFAULT_COLLATE_NAME")
    public String getDefaultCollateName() {
        return defaultCollateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.DEFAULT_COLLATE_NAME")
    public void setDefaultCollateName(String defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.DESCRIPTION")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.MAXLEN")
    public Integer getMaxlen() {
        return maxlen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.401+07:00", comments="Source field: CHARACTER_SETS.MAXLEN")
    public void setMaxlen(Integer maxlen) {
        this.maxlen = maxlen;
    }
}