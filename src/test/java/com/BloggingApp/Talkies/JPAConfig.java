package com.BloggingApp.Talkies;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JPAConfig {

    @Value("${{spring.datasource.driver-class-name}}")
    String driver;
    @Value("${{spring.datasource.url}}")
    String url;

    @Value("${{spring.datasource.username}}")
    String username;

    @Value("${{spring.datasource.password}}")
    String password;

//    @Bean
//    @Profile("test")
//    public DataSource dataSource(){
//      var datasource =  new DriverManagerDataSource();
//      datasource.setDriverClassName(driver);
//      datasource.setUrl(url);
//      datasource.setUsername(username);
//      datasource.setPassword(password);
//      return datasource;
//    }

}
