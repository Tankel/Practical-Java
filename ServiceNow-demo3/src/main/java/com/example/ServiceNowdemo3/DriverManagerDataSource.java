package com.example.ServiceNowdemo3;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

public class DriverManagerDataSource {
	@Autowired
	private static Environment env;

	@Bean(name = "ServiceNow")
	@Primary
	public static DataSource ServiceNowDataSource() {

		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("cdata.jdbc.servicenow.ServiceNowDriver");
		dataSourceBuilder.url(
				"jdbc:servicenow:OAuthClientId=MyOAuthClientId;OAuthClientSecret=MyOAuthClientSecret;Username=MyUsername;Password=MyPassword;Instance=MyInstance;InitiateOAuth=GETANDREFRESH");
		return dataSourceBuilder.build();
	}

//@Override
	public void setEnvironment(final Environment environment) {
		env = environment;
	}
}