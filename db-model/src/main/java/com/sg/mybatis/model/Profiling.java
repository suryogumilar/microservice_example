package com.sg.mybatis.model;

import javax.annotation.Generated;

public class Profiling {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.QUERY_ID")
    private Integer queryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SEQ")
    private Integer seq;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.STATE")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.DURATION")
    private Short duration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CPU_USER")
    private Short cpuUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CPU_SYSTEM")
    private Short cpuSystem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CONTEXT_VOLUNTARY")
    private Integer contextVoluntary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CONTEXT_INVOLUNTARY")
    private Integer contextInvoluntary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.BLOCK_OPS_IN")
    private Integer blockOpsIn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.BLOCK_OPS_OUT")
    private Integer blockOpsOut;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.MESSAGES_SENT")
    private Integer messagesSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.MESSAGES_RECEIVED")
    private Integer messagesReceived;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.PAGE_FAULTS_MAJOR")
    private Integer pageFaultsMajor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.PAGE_FAULTS_MINOR")
    private Integer pageFaultsMinor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SWAPS")
    private Integer swaps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SOURCE_FUNCTION")
    private String sourceFunction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SOURCE_FILE")
    private String sourceFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SOURCE_LINE")
    private Integer sourceLine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.QUERY_ID")
    public Integer getQueryId() {
        return queryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.QUERY_ID")
    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SEQ")
    public Integer getSeq() {
        return seq;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SEQ")
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.STATE")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.STATE")
    public void setState(String state) {
        this.state = state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.DURATION")
    public Short getDuration() {
        return duration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.DURATION")
    public void setDuration(Short duration) {
        this.duration = duration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CPU_USER")
    public Short getCpuUser() {
        return cpuUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CPU_USER")
    public void setCpuUser(Short cpuUser) {
        this.cpuUser = cpuUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CPU_SYSTEM")
    public Short getCpuSystem() {
        return cpuSystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CPU_SYSTEM")
    public void setCpuSystem(Short cpuSystem) {
        this.cpuSystem = cpuSystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CONTEXT_VOLUNTARY")
    public Integer getContextVoluntary() {
        return contextVoluntary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CONTEXT_VOLUNTARY")
    public void setContextVoluntary(Integer contextVoluntary) {
        this.contextVoluntary = contextVoluntary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CONTEXT_INVOLUNTARY")
    public Integer getContextInvoluntary() {
        return contextInvoluntary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.CONTEXT_INVOLUNTARY")
    public void setContextInvoluntary(Integer contextInvoluntary) {
        this.contextInvoluntary = contextInvoluntary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.BLOCK_OPS_IN")
    public Integer getBlockOpsIn() {
        return blockOpsIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.BLOCK_OPS_IN")
    public void setBlockOpsIn(Integer blockOpsIn) {
        this.blockOpsIn = blockOpsIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.BLOCK_OPS_OUT")
    public Integer getBlockOpsOut() {
        return blockOpsOut;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.BLOCK_OPS_OUT")
    public void setBlockOpsOut(Integer blockOpsOut) {
        this.blockOpsOut = blockOpsOut;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.MESSAGES_SENT")
    public Integer getMessagesSent() {
        return messagesSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.MESSAGES_SENT")
    public void setMessagesSent(Integer messagesSent) {
        this.messagesSent = messagesSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.MESSAGES_RECEIVED")
    public Integer getMessagesReceived() {
        return messagesReceived;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.MESSAGES_RECEIVED")
    public void setMessagesReceived(Integer messagesReceived) {
        this.messagesReceived = messagesReceived;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.PAGE_FAULTS_MAJOR")
    public Integer getPageFaultsMajor() {
        return pageFaultsMajor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.PAGE_FAULTS_MAJOR")
    public void setPageFaultsMajor(Integer pageFaultsMajor) {
        this.pageFaultsMajor = pageFaultsMajor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.PAGE_FAULTS_MINOR")
    public Integer getPageFaultsMinor() {
        return pageFaultsMinor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.PAGE_FAULTS_MINOR")
    public void setPageFaultsMinor(Integer pageFaultsMinor) {
        this.pageFaultsMinor = pageFaultsMinor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SWAPS")
    public Integer getSwaps() {
        return swaps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SWAPS")
    public void setSwaps(Integer swaps) {
        this.swaps = swaps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SOURCE_FUNCTION")
    public String getSourceFunction() {
        return sourceFunction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SOURCE_FUNCTION")
    public void setSourceFunction(String sourceFunction) {
        this.sourceFunction = sourceFunction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SOURCE_FILE")
    public String getSourceFile() {
        return sourceFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SOURCE_FILE")
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SOURCE_LINE")
    public Integer getSourceLine() {
        return sourceLine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.441+07:00", comments="Source field: PROFILING.SOURCE_LINE")
    public void setSourceLine(Integer sourceLine) {
        this.sourceLine = sourceLine;
    }
}