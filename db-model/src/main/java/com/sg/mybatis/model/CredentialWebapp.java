package com.sg.mybatis.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class CredentialWebapp implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.USERNAME")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.PASSWORD")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: CREDENTIAL_WEBAPP")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.USERNAME")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.USERNAME")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.PASSWORD")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: CREDENTIAL_WEBAPP.PASSWORD")
    public void setPassword(String password) {
        this.password = password;
    }
}