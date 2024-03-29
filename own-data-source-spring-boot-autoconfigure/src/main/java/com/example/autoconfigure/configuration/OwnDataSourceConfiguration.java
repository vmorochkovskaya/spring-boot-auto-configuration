package com.example.autoconfigure.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class OwnDataSourceConfiguration {
    private static final String DRIVER_CLASS_NAME = "org.h2.Driver";

    @Value("${autoconf.db.name}")
    private String autoconfDbName;

    private static final String DB_URL = "jdbc:h2:mem:";
    private static final String USERNAME = "SA111";
    private static final String PASSWORD = "";


    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(DRIVER_CLASS_NAME);
        dataSourceBuilder.url(DB_URL + autoconfDbName);
        dataSourceBuilder.username(USERNAME);
        dataSourceBuilder.password(PASSWORD);
        return dataSourceBuilder.build();
    }
}
