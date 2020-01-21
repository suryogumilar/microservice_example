# Mybatis generator

run via eclipse :

set goalnya ke  : properties:read-project-properties clean mybatis-generator:generate
dan profiles ke : devel

*clean* dan *properties:read-project-properties* diperlukan agar file .properties terbaca saat menjalankan generator plugin

## Plugin

menggunakan plugin untuk generate cache annotation, lihat di folder mybatis-maven-generator-plugins
lalu add:

```
<dependency>
    <groupId>com.sg.lab</groupId>
    <artifactId>mybatis-maven-generator-plugins</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```
further reading: https://blog.javaforge.net/post/30577502737/mybatis-generator-plugins

### troubleshoot
 1. kadang ada error di pom.xml untuk plugins *properties-maven-plugin*, abaikan saja.
 2. temukan error saat generate *"Client does not support authentication protocol requested by server"* menggunakan database mysql   
    login mysql, run:    
    `ALTER USER 'admin'@'%' IDENTIFIED WITH mysql_native_password BY 'passwd';`   
    `FLUSH PRIVILEGES;`   
    