package com.sg.mybatis.mapper;

import static com.sg.mybatis.mapper.InnodbTablespacesDynamicSqlSupport.*;

import com.sg.mybatis.model.InnodbTablespaces;
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
public interface InnodbTablespacesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    BasicColumn[] selectList = BasicColumn.columnList(space, name, flag, rowFormat, pageSize, zipPageSize, spaceType, fsBlockSize, fileSize, allocatedSize, serverVersion, spaceVersion, encryption, state);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source Table: INNODB_TABLESPACES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source Table: INNODB_TABLESPACES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source Table: INNODB_TABLESPACES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbTablespaces> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.525+07:00", comments="Source Table: INNODB_TABLESPACES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<InnodbTablespaces> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbTablespacesResult")
    Optional<InnodbTablespaces> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbTablespacesResult", value = {
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAGE_SIZE", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="ZIP_PAGE_SIZE", property="zipPageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE_TYPE", property="spaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FS_BLOCK_SIZE", property="fsBlockSize", jdbcType=JdbcType.INTEGER),
        @Result(column="FILE_SIZE", property="fileSize", jdbcType=JdbcType.BIGINT),
        @Result(column="ALLOCATED_SIZE", property="allocatedSize", jdbcType=JdbcType.BIGINT),
        @Result(column="SERVER_VERSION", property="serverVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPACE_VERSION", property="spaceVersion", jdbcType=JdbcType.INTEGER),
        @Result(column="ENCRYPTION", property="encryption", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbTablespaces> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    default int insert(InnodbTablespaces record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTablespaces, c ->
            c.map(space).toProperty("space")
            .map(name).toProperty("name")
            .map(flag).toProperty("flag")
            .map(rowFormat).toProperty("rowFormat")
            .map(pageSize).toProperty("pageSize")
            .map(zipPageSize).toProperty("zipPageSize")
            .map(spaceType).toProperty("spaceType")
            .map(fsBlockSize).toProperty("fsBlockSize")
            .map(fileSize).toProperty("fileSize")
            .map(allocatedSize).toProperty("allocatedSize")
            .map(serverVersion).toProperty("serverVersion")
            .map(spaceVersion).toProperty("spaceVersion")
            .map(encryption).toProperty("encryption")
            .map(state).toProperty("state")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    default int insertMultiple(Collection<InnodbTablespaces> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, innodbTablespaces, c ->
            c.map(space).toProperty("space")
            .map(name).toProperty("name")
            .map(flag).toProperty("flag")
            .map(rowFormat).toProperty("rowFormat")
            .map(pageSize).toProperty("pageSize")
            .map(zipPageSize).toProperty("zipPageSize")
            .map(spaceType).toProperty("spaceType")
            .map(fsBlockSize).toProperty("fsBlockSize")
            .map(fileSize).toProperty("fileSize")
            .map(allocatedSize).toProperty("allocatedSize")
            .map(serverVersion).toProperty("serverVersion")
            .map(spaceVersion).toProperty("spaceVersion")
            .map(encryption).toProperty("encryption")
            .map(state).toProperty("state")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    default int insertSelective(InnodbTablespaces record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTablespaces, c ->
            c.map(space).toPropertyWhenPresent("space", record::getSpace)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(flag).toPropertyWhenPresent("flag", record::getFlag)
            .map(rowFormat).toPropertyWhenPresent("rowFormat", record::getRowFormat)
            .map(pageSize).toPropertyWhenPresent("pageSize", record::getPageSize)
            .map(zipPageSize).toPropertyWhenPresent("zipPageSize", record::getZipPageSize)
            .map(spaceType).toPropertyWhenPresent("spaceType", record::getSpaceType)
            .map(fsBlockSize).toPropertyWhenPresent("fsBlockSize", record::getFsBlockSize)
            .map(fileSize).toPropertyWhenPresent("fileSize", record::getFileSize)
            .map(allocatedSize).toPropertyWhenPresent("allocatedSize", record::getAllocatedSize)
            .map(serverVersion).toPropertyWhenPresent("serverVersion", record::getServerVersion)
            .map(spaceVersion).toPropertyWhenPresent("spaceVersion", record::getSpaceVersion)
            .map(encryption).toPropertyWhenPresent("encryption", record::getEncryption)
            .map(state).toPropertyWhenPresent("state", record::getState)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    default Optional<InnodbTablespaces> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    default List<InnodbTablespaces> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    default List<InnodbTablespaces> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbTablespaces record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(space).equalTo(record::getSpace)
                .set(name).equalTo(record::getName)
                .set(flag).equalTo(record::getFlag)
                .set(rowFormat).equalTo(record::getRowFormat)
                .set(pageSize).equalTo(record::getPageSize)
                .set(zipPageSize).equalTo(record::getZipPageSize)
                .set(spaceType).equalTo(record::getSpaceType)
                .set(fsBlockSize).equalTo(record::getFsBlockSize)
                .set(fileSize).equalTo(record::getFileSize)
                .set(allocatedSize).equalTo(record::getAllocatedSize)
                .set(serverVersion).equalTo(record::getServerVersion)
                .set(spaceVersion).equalTo(record::getSpaceVersion)
                .set(encryption).equalTo(record::getEncryption)
                .set(state).equalTo(record::getState);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-19T22:57:06.526+07:00", comments="Source Table: INNODB_TABLESPACES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbTablespaces record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(space).equalToWhenPresent(record::getSpace)
                .set(name).equalToWhenPresent(record::getName)
                .set(flag).equalToWhenPresent(record::getFlag)
                .set(rowFormat).equalToWhenPresent(record::getRowFormat)
                .set(pageSize).equalToWhenPresent(record::getPageSize)
                .set(zipPageSize).equalToWhenPresent(record::getZipPageSize)
                .set(spaceType).equalToWhenPresent(record::getSpaceType)
                .set(fsBlockSize).equalToWhenPresent(record::getFsBlockSize)
                .set(fileSize).equalToWhenPresent(record::getFileSize)
                .set(allocatedSize).equalToWhenPresent(record::getAllocatedSize)
                .set(serverVersion).equalToWhenPresent(record::getServerVersion)
                .set(spaceVersion).equalToWhenPresent(record::getSpaceVersion)
                .set(encryption).equalToWhenPresent(record::getEncryption)
                .set(state).equalToWhenPresent(record::getState);
    }
}