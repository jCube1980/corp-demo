package com.shiloh.corp.config;

import java.sql.Connection;

import javax.inject.Provider;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.spring.SpringConnectionProvider;
import com.querydsl.sql.spring.SpringExceptionTranslator;
import com.querydsl.sql.types.DateTimeType;
import com.querydsl.sql.types.LocalDateType;

@Configuration
public class JdbcConfig {

	@Autowired
	private DataSource dataSource;
	
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	public com.querydsl.sql.Configuration querydslConfiguration() {
		SQLTemplates templates = MySQLTemplates.builder().printSchema().build();
		com.querydsl.sql.Configuration configuration = new com.querydsl.sql.Configuration(templates);
		configuration.setExceptionTranslator(new SpringExceptionTranslator());
		configuration.register(new DateTimeType());
		configuration.register(new LocalDateType());
		return configuration;
	}

	@Bean
	public SQLQueryFactory queryFactory() {
		Provider<Connection> provider = new SpringConnectionProvider(dataSource);
		return new SQLQueryFactory(querydslConfiguration(), provider);
	}
}
