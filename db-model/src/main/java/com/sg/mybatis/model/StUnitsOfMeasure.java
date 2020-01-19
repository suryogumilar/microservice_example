package com.sg.mybatis.model;

import javax.annotation.Generated;

public class StUnitsOfMeasure {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_NAME")
    private String unitName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_TYPE")
    private String unitType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.CONVERSION_FACTOR")
    private Double conversionFactor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.DESCRIPTION")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_NAME")
    public String getUnitName() {
        return unitName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_NAME")
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_TYPE")
    public String getUnitType() {
        return unitType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_TYPE")
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.CONVERSION_FACTOR")
    public Double getConversionFactor() {
        return conversionFactor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.CONVERSION_FACTOR")
    public void setConversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.512+07:00", comments="Source field: ST_UNITS_OF_MEASURE.DESCRIPTION")
    public void setDescription(String description) {
        this.description = description;
    }
}