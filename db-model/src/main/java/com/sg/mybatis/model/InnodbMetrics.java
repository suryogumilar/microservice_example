package com.sg.mybatis.model;

import java.util.Date;
import javax.annotation.Generated;

public class InnodbMetrics {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.SUBSYSTEM")
    private String subsystem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.COUNT")
    private Long count;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MAX_COUNT")
    private Long maxCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MIN_COUNT")
    private Long minCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.AVG_COUNT")
    private Float avgCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.COUNT_RESET")
    private Long countReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MAX_COUNT_RESET")
    private Long maxCountReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MIN_COUNT_RESET")
    private Long minCountReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.AVG_COUNT_RESET")
    private Float avgCountReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_ENABLED")
    private Date timeEnabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_DISABLED")
    private Date timeDisabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_ELAPSED")
    private Long timeElapsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_RESET")
    private Date timeReset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.STATUS")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TYPE")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.COMMENT")
    private String comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.SUBSYSTEM")
    public String getSubsystem() {
        return subsystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.SUBSYSTEM")
    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.COUNT")
    public Long getCount() {
        return count;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.COUNT")
    public void setCount(Long count) {
        this.count = count;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MAX_COUNT")
    public Long getMaxCount() {
        return maxCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MAX_COUNT")
    public void setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MIN_COUNT")
    public Long getMinCount() {
        return minCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MIN_COUNT")
    public void setMinCount(Long minCount) {
        this.minCount = minCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.AVG_COUNT")
    public Float getAvgCount() {
        return avgCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.AVG_COUNT")
    public void setAvgCount(Float avgCount) {
        this.avgCount = avgCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.COUNT_RESET")
    public Long getCountReset() {
        return countReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.COUNT_RESET")
    public void setCountReset(Long countReset) {
        this.countReset = countReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MAX_COUNT_RESET")
    public Long getMaxCountReset() {
        return maxCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MAX_COUNT_RESET")
    public void setMaxCountReset(Long maxCountReset) {
        this.maxCountReset = maxCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MIN_COUNT_RESET")
    public Long getMinCountReset() {
        return minCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.MIN_COUNT_RESET")
    public void setMinCountReset(Long minCountReset) {
        this.minCountReset = minCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.AVG_COUNT_RESET")
    public Float getAvgCountReset() {
        return avgCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.AVG_COUNT_RESET")
    public void setAvgCountReset(Float avgCountReset) {
        this.avgCountReset = avgCountReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_ENABLED")
    public Date getTimeEnabled() {
        return timeEnabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_ENABLED")
    public void setTimeEnabled(Date timeEnabled) {
        this.timeEnabled = timeEnabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_DISABLED")
    public Date getTimeDisabled() {
        return timeDisabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_DISABLED")
    public void setTimeDisabled(Date timeDisabled) {
        this.timeDisabled = timeDisabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_ELAPSED")
    public Long getTimeElapsed() {
        return timeElapsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_ELAPSED")
    public void setTimeElapsed(Long timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_RESET")
    public Date getTimeReset() {
        return timeReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TIME_RESET")
    public void setTimeReset(Date timeReset) {
        this.timeReset = timeReset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.STATUS")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.STATUS")
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TYPE")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.TYPE")
    public void setType(String type) {
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.COMMENT")
    public String getComment() {
        return comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.381+07:00", comments="Source field: INNODB_METRICS.COMMENT")
    public void setComment(String comment) {
        this.comment = comment;
    }
}