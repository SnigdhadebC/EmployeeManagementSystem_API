package com.application.EmployeeManagementSystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.application")
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class AppConfig {

}
