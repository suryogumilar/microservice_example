package com.sg.mybatis.model;

import javax.annotation.Generated;

public class Keywords {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.398+07:00", comments="Source field: KEYWORDS.WORD")
    private String word;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.398+07:00", comments="Source field: KEYWORDS.RESERVED")
    private Integer reserved;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.398+07:00", comments="Source field: KEYWORDS.WORD")
    public String getWord() {
        return word;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.398+07:00", comments="Source field: KEYWORDS.WORD")
    public void setWord(String word) {
        this.word = word;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.398+07:00", comments="Source field: KEYWORDS.RESERVED")
    public Integer getReserved() {
        return reserved;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.398+07:00", comments="Source field: KEYWORDS.RESERVED")
    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }
}