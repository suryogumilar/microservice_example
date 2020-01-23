# Db Service


## db service


## link contoh service


untuk service Data Peserta :   
 - http://localhost:8089/tspn/servicedb/v1/data-peserta/list   
 - http://localhost:8089/tspn/servicedb/v1/data-peserta/get?id=1   
 - http://localhost:8089/tspn/servicedb/v1/data-peserta/query?nama=suryo   
 - http://localhost:8089/tspn/servicedb/v1/data-peserta/query?nama=Suryo%25&islike=true   
 - http://localhost:8089/tspn/servicedb/v1/data-peserta/query?nama=suryo%25&islike=true&caseInsensitive=true   
 - http://localhost:8089/tspn/servicedb/v1/data-peserta/delete?id=3    
 - http://localhost:8089/tspn/servicedb/v1/dp-kc-map/get?id=1

## Logging

untuk menampilkan loggin mybatis pada application.yaml set ke TRACE

```
logging:
  level:
    org.springframework: INFO
    org.mybatis: TRACE
    org.ehcache: DEBUG
    com.sg: TRACE
```


## Java code notes

Saat menggunakan dynamic sql, digunakan 'import static' (since java 1.5)

```
// perlu ! import all column definitions for your table
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.alamatPeserta;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.dataPeserta;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.id;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.namaPeserta;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.nik;
import static com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport.nomorPeserta;


// perlu ! import the SQL builder
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isLike;
import static org.mybatis.dynamic.sql.SqlBuilder.isLikeCaseInsensitive;
import static org.mybatis.dynamic.sql.SqlBuilder.select;
```

sehingga dalam code menggunakan seperti contoh berikut : 

```
   
       // org.mybatis.dynamic.sql.SqlBuilder
		// com.sg.mybatis.mapper.DataPesertaDynamicSqlSupport
		/*
		 * Statement dibawah, menggunakan static import..bisa diganti dengan statement seperti berikut : 
		 * 
		 * SqlBuilder.select(DataPesertaDynamicSqlSupport.id).from(DataPesertaDynamicSqlSupport.dataPeserta); dst..
		 * 
		 * */

		QueryExpressionDSL<SelectModel> qedl =  
		select(id, nomorPeserta, nik, namaPeserta, alamatPeserta)
				.from(dataPeserta);
		if(nama!=null ) {
			if(isLike!=null && isLike) {
				if(caseInsensitive!=null && caseInsensitive) {
					qedl.where(namaPeserta,isLikeCaseInsensitive(nama));				
				}else {
					qedl.where(namaPeserta,isLike(nama));									
				}
			}else {
				qedl.where(namaPeserta,isEqualTo(nama));
			}
		}
		SelectStatementProvider selectStatement = qedl.build().render(RenderingStrategies.MYBATIS3);
		
		List<DataPeserta> dataPesertaList = dataPesertaMapper.selectMany(selectStatement);
```

## Build

untuk compile dan package di eclipse (mvn) pake goal repacakge

'clean compile package spring-boot:repackage'


### link referensi

mybatis manual:   
https://mybatis.org/mybatis-dynamic-sql/docs/select.html

mybatis dynamic sql official github   
https://github.com/mybatis/mybatis-dynamic-sql

contoh pemakaian:   
https://www.bbsmax.com/A/nAJvRmrnJr/