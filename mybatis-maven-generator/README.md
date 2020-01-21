# Mybatis generator

run via eclipse :

set goalnya ke  : properties:read-project-properties clean mybatis-generator:generate
dan profiles ke : devel

*clean* dan *properties:read-project-properties* diperlukan agar file .properties terbaca saat menjalankan generator plugin

## Plugin

menggunakan plugin untuk generate cache annotation using [bigpuritz](https://github.com/bigpuritz/mybatis-generator-plugins) plugin

`mvn install:install-file -Dfile=mybatis-generator-plugins-1.0.0.jar -DgroupId=net.javaforge.mybatis.generator -DartifactId=mybatis-generator-plugins -Dversion=1.0.0 -Dpackaging=jar -DlocalRepositoryPath=C:\Warehouse\maven_repo\.m2\repository`

lalu add:

```
<dependency>
    <groupId>net.javaforge.mybatis.generator</groupId>
    <artifactId>mybatis-generator-plugins</artifactId>
    <version>1.0.0</version>
</dependency>
```
further reading: https://blog.javaforge.net/post/30577502737/mybatis-generator-plugins

### troubleshoot
 1. kadang ada error di pom.xml untuk plugins *properties-maven-plugin*, abaikan saja.
 2. temukan error saat generate *"Client does not support authentication protocol requested by server"* menggunakan database mysql   
    login mysql, run:    
    `ALTER USER 'admin'@'%' IDENTIFIED WITH mysql_native_password BY 'passwd';`   
    `FLUSH PRIVILEGES;`   
    