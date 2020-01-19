package com.sg.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StUnitsOfMeasureDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.514+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    public static final StUnitsOfMeasure stUnitsOfMeasure = new StUnitsOfMeasure();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.514+07:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_NAME")
    public static final SqlColumn<String> unitName = stUnitsOfMeasure.unitName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_TYPE")
    public static final SqlColumn<String> unitType = stUnitsOfMeasure.unitType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source field: ST_UNITS_OF_MEASURE.CONVERSION_FACTOR")
    public static final SqlColumn<Double> conversionFactor = stUnitsOfMeasure.conversionFactor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.515+07:00", comments="Source field: ST_UNITS_OF_MEASURE.DESCRIPTION")
    public static final SqlColumn<String> description = stUnitsOfMeasure.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.514+07:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    public static final class StUnitsOfMeasure extends SqlTable {
        public final SqlColumn<String> unitName = column("UNIT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> unitType = column("UNIT_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<Double> conversionFactor = column("CONVERSION_FACTOR", JDBCType.DOUBLE);

        public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);

        public StUnitsOfMeasure() {
            super("ST_UNITS_OF_MEASURE");
        }
    }
}