package com.bunny.spring.framework;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfig {

    @Bean @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource getDs() {
        return new DruidDataSource();
    }
}
