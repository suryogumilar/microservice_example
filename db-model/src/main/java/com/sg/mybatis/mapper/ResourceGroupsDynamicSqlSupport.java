package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ResourceGroupsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.504+07:00", comments="Source Table: RESOURCE_GROUPS")
    public static final ResourceGroups resourceGroups = new ResourceGroups();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_NAME")
    public static final SqlColumn<String> resourceGroupName = resourceGroups.resourceGroupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_TYPE")
    public static final SqlColumn<String> resourceGroupType = resourceGroups.resourceGroupType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source field: RESOURCE_GROUPS.RESOURCE_GROUP_ENABLED")
    public static final SqlColumn<Boolean> resourceGroupEnabled = resourceGroups.resourceGroupEnabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source field: RESOURCE_GROUPS.THREAD_PRIORITY")
    public static final SqlColumn<Integer> threadPriority = resourceGroups.threadPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source field: RESOURCE_GROUPS.VCPU_IDS")
    public static final SqlColumn<byte[]> vcpuIds = resourceGroups.vcpuIds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.505+07:00", comments="Source Table: RESOURCE_GROUPS")
    public static final class ResourceGroups extends SqlTable {
        public final SqlColumn<String> resourceGroupName = column("RESOURCE_GROUP_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> resourceGroupType = column("RESOURCE_GROUP_TYPE", JDBCType.CHAR);

        public final SqlColumn<Boolean> resourceGroupEnabled = column("RESOURCE_GROUP_ENABLED", JDBCType.BIT);

        public final SqlColumn<Integer> threadPriority = column("THREAD_PRIORITY", JDBCType.INTEGER);

        public final SqlColumn<byte[]> vcpuIds = column("VCPU_IDS", JDBCType.LONGVARBINARY);

        public ResourceGroups() {
            super("RESOURCE_GROUPS");
        }
    }
}