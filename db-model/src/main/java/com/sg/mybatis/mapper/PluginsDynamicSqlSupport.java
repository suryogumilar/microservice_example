package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PluginsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.034+07:00", comments="Source Table: PLUGINS")
    public static final Plugins plugins = new Plugins();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.034+07:00", comments="Source field: PLUGINS.PLUGIN_NAME")
    public static final SqlColumn<String> pluginName = plugins.pluginName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.034+07:00", comments="Source field: PLUGINS.PLUGIN_VERSION")
    public static final SqlColumn<String> pluginVersion = plugins.pluginVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.034+07:00", comments="Source field: PLUGINS.PLUGIN_STATUS")
    public static final SqlColumn<String> pluginStatus = plugins.pluginStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.034+07:00", comments="Source field: PLUGINS.PLUGIN_TYPE")
    public static final SqlColumn<String> pluginType = plugins.pluginType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.034+07:00", comments="Source field: PLUGINS.PLUGIN_TYPE_VERSION")
    public static final SqlColumn<String> pluginTypeVersion = plugins.pluginTypeVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.034+07:00", comments="Source field: PLUGINS.PLUGIN_LIBRARY")
    public static final SqlColumn<String> pluginLibrary = plugins.pluginLibrary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source field: PLUGINS.PLUGIN_LIBRARY_VERSION")
    public static final SqlColumn<String> pluginLibraryVersion = plugins.pluginLibraryVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source field: PLUGINS.PLUGIN_AUTHOR")
    public static final SqlColumn<String> pluginAuthor = plugins.pluginAuthor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source field: PLUGINS.PLUGIN_DESCRIPTION")
    public static final SqlColumn<String> pluginDescription = plugins.pluginDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source field: PLUGINS.PLUGIN_LICENSE")
    public static final SqlColumn<String> pluginLicense = plugins.pluginLicense;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.035+07:00", comments="Source field: PLUGINS.LOAD_OPTION")
    public static final SqlColumn<String> loadOption = plugins.loadOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.034+07:00", comments="Source Table: PLUGINS")
    public static final class Plugins extends SqlTable {
        public final SqlColumn<String> pluginName = column("PLUGIN_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> pluginVersion = column("PLUGIN_VERSION", JDBCType.VARCHAR);

        public final SqlColumn<String> pluginStatus = column("PLUGIN_STATUS", JDBCType.VARCHAR);

        public final SqlColumn<String> pluginType = column("PLUGIN_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> pluginTypeVersion = column("PLUGIN_TYPE_VERSION", JDBCType.VARCHAR);

        public final SqlColumn<String> pluginLibrary = column("PLUGIN_LIBRARY", JDBCType.VARCHAR);

        public final SqlColumn<String> pluginLibraryVersion = column("PLUGIN_LIBRARY_VERSION", JDBCType.VARCHAR);

        public final SqlColumn<String> pluginAuthor = column("PLUGIN_AUTHOR", JDBCType.VARCHAR);

        public final SqlColumn<String> pluginDescription = column("PLUGIN_DESCRIPTION", JDBCType.VARCHAR);

        public final SqlColumn<String> pluginLicense = column("PLUGIN_LICENSE", JDBCType.VARCHAR);

        public final SqlColumn<String> loadOption = column("LOAD_OPTION", JDBCType.VARCHAR);

        public Plugins() {
            super("PLUGINS");
        }
    }
}