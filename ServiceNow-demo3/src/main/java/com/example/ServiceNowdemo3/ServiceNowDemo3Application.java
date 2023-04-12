package com.example.ServiceNowdemo3;

import static com.example.demo.DriverManagerDataSources.ServiceNowDataSource;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ServiceNowDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceNowDemo3Application.class, args);
		Connection conn = ServiceNowDataSource().getConnection();
		System.out.println("Catalog: " + conn.getCatalog());
	}

}
