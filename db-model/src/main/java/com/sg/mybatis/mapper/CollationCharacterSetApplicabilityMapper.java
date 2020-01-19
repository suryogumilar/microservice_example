package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.CollationCharacterSetApplicabilityDynamicSqlSupport.*;

import com.sg.mybatis.model.CollationCharacterSetApplicability;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface CollationCharacterSetApplicabilityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.422+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    BasicColumn[] selectList = BasicColumn.columnList(collationName, characterSetName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CollationCharacterSetApplicability> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<CollationCharacterSetApplicability> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CollationCharacterSetApplicabilityResult")
    Optional<CollationCharacterSetApplicability> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CollationCharacterSetApplicabilityResult", value = {
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR)
    })
    List<CollationCharacterSetApplicability> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, collationCharacterSetApplicability, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, collationCharacterSetApplicability, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    default int insert(CollationCharacterSetApplicability record) {
        return MyBatis3Utils.insert(this::insert, record, collationCharacterSetApplicability, c ->
            c.map(collationName).toProperty("collationName")
            .map(characterSetName).toProperty("characterSetName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.42+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    default int insertMultiple(Collection<CollationCharacterSetApplicability> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, collationCharacterSetApplicability, c ->
            c.map(collationName).toProperty("collationName")
            .map(characterSetName).toProperty("characterSetName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.422+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    default int insertSelective(CollationCharacterSetApplicability record) {
        return MyBatis3Utils.insert(this::insert, record, collationCharacterSetApplicability, c ->
            c.map(collationName).toPropertyWhenPresent("collationName", record::getCollationName)
            .map(characterSetName).toPropertyWhenPresent("characterSetName", record::getCharacterSetName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.422+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    default Optional<CollationCharacterSetApplicability> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, collationCharacterSetApplicability, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.422+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    default List<CollationCharacterSetApplicability> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, collationCharacterSetApplicability, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.422+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    default List<CollationCharacterSetApplicability> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, collationCharacterSetApplicability, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.422+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, collationCharacterSetApplicability, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.422+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    static UpdateDSL<UpdateModel> updateAllColumns(CollationCharacterSetApplicability record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(collationName).equalTo(record::getCollationName)
                .set(characterSetName).equalTo(record::getCharacterSetName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.423+07:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CollationCharacterSetApplicability record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(collationName).equalToWhenPresent(record::getCollationName)
                .set(characterSetName).equalToWhenPresent(record::getCharacterSetName);
    }
}