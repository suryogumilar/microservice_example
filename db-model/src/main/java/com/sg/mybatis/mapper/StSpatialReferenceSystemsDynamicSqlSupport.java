package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StSpatialReferenceSystemsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.182+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    public static final StSpatialReferenceSystems stSpatialReferenceSystems = new StSpatialReferenceSystems();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.182+07:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME")
    public static final SqlColumn<String> srsName = stSpatialReferenceSystems.srsName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.182+07:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID")
    public static final SqlColumn<Integer> srsId = stSpatialReferenceSystems.srsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.182+07:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION")
    public static final SqlColumn<String> organization = stSpatialReferenceSystems.organization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.184+07:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID")
    public static final SqlColumn<Integer> organizationCoordsysId = stSpatialReferenceSystems.organizationCoordsysId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.184+07:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION")
    public static final SqlColumn<String> definition = stSpatialReferenceSystems.definition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.184+07:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION")
    public static final SqlColumn<String> description = stSpatialReferenceSystems.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.182+07:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    public static final class StSpatialReferenceSystems extends SqlTable {
        public final SqlColumn<String> srsName = column("SRS_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> srsId = column("SRS_ID", JDBCType.INTEGER);

        public final SqlColumn<String> organization = column("ORGANIZATION", JDBCType.VARCHAR);

        public final SqlColumn<Integer> organizationCoordsysId = column("ORGANIZATION_COORDSYS_ID", JDBCType.INTEGER);

        public final SqlColumn<String> definition = column("DEFINITION", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);

        public StSpatialReferenceSystems() {
            super("ST_SPATIAL_REFERENCE_SYSTEMS");
        }
    }
}