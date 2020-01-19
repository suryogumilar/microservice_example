# Mybatis generator

run via eclipse :

set goalnya ke  : clean properties:read-project-properties mybatis-generator:generate
dan profiles ke : devel

*clean* dan *properties:read-project-properties* diperlukan agar file .properties terbaca saat menjalankan generator plugin


### troubleshoot
 1. kadang ada error di pom.xml untuk plugins *properties-maven-plugin*, abaikan saja.
 2. temukan error saat generate *"Client does not support authentication protocol requested by server"* menggunakan database mysql   
    login mysql, run:    
    `ALTER USER 'admin'@'%' IDENTIFIED WITH mysql_native_password BY 'passwd';`   
    `FLUSH PRIVILEGES;`   
    