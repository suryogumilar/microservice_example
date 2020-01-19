package com.sg.mybatis.model;

import javax.annotation.Generated;

public class ResourceGroups {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_NAME")
    private String resourceGroupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_TYPE")
    private String resourceGroupType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED")
    private Boolean resourceGroupEnabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.THREAD_PRIORITY")
    private Integer threadPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.VCPU_IDS")
    private byte[] vcpuIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_NAME")
    public String getResourceGroupName() {
        return resourceGroupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_NAME")
    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_TYPE")
    public String getResourceGroupType() {
        return resourceGroupType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_TYPE")
    public void setResourceGroupType(String resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED")
    public Boolean getResourceGroupEnabled() {
        return resourceGroupEnabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED")
    public void setResourceGroupEnabled(Boolean resourceGroupEnabled) {
        this.resourceGroupEnabled = resourceGroupEnabled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.THREAD_PRIORITY")
    public Integer getThreadPriority() {
        return threadPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.THREAD_PRIORITY")
    public void setThreadPriority(Integer threadPriority) {
        this.threadPriority = threadPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.VCPU_IDS")
    public byte[] getVcpuIds() {
        return vcpuIds;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source field: RESOURCE_GROUPS.VCPU_IDS")
    public void setVcpuIds(byte[] vcpuIds) {
        this.vcpuIds = vcpuIds;
    }
}