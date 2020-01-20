package com.sg.springboot.rest.app;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.CommandLineRunner;
import javax.sql.DataSource;

@SpringBootApplication(scanBasePackages = {"com.sg.springboot.rest.db"})
@MapperScan("com.sg.mybatis.mapper")
@EnableTransactionManagement
public class SpringBootMybatisApplication implements CommandLineRunner {
	private static org.slf4j.Logger LOG = LoggerFactory
		      .getLogger(SpringBootMybatisApplication.class);
	private static Logger logger = LogManager.getLogger(SpringBootMybatisApplication.class);
	@Autowired
	DataSource dataSource;
	
	public static void main(String[] args) {
		logger.debug("test");
		LOG.debug("Start");
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("DATASOURCE = " + dataSource);
		LOG.debug("test ruun");
	}
}
