package com.sg.mybatis.model;

import javax.annotation.Generated;

public class OptimizerTrace {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.129+07:00", comments="Source field: OPTIMIZER_TRACE.QUERY")
    private String query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.131+07:00", comments="Source field: OPTIMIZER_TRACE.TRACE")
    private String trace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.143+07:00", comments="Source field: OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    private Integer missingBytesBeyondMaxMemSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.143+07:00", comments="Source field: OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES")
    private Boolean insufficientPrivileges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.129+07:00", comments="Source field: OPTIMIZER_TRACE.QUERY")
    public String getQuery() {
        return query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.13+07:00", comments="Source field: OPTIMIZER_TRACE.QUERY")
    public void setQuery(String query) {
        this.query = query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.131+07:00", comments="Source field: OPTIMIZER_TRACE.TRACE")
    public String getTrace() {
        return trace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.143+07:00", comments="Source field: OPTIMIZER_TRACE.TRACE")
    public void setTrace(String trace) {
        this.trace = trace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.143+07:00", comments="Source field: OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    public Integer getMissingBytesBeyondMaxMemSize() {
        return missingBytesBeyondMaxMemSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.143+07:00", comments="Source field: OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    public void setMissingBytesBeyondMaxMemSize(Integer missingBytesBeyondMaxMemSize) {
        this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.143+07:00", comments="Source field: OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES")
    public Boolean getInsufficientPrivileges() {
        return insufficientPrivileges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.143+07:00", comments="Source field: OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES")
    public void setInsufficientPrivileges(Boolean insufficientPrivileges) {
        this.insufficientPrivileges = insufficientPrivileges;
    }
}