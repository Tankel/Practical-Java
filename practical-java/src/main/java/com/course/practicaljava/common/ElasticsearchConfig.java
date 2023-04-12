package com.course.practicaljava.common;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfig {

	/*
	 * final CredentialsProvider credentialsProvider = new
	 * BasicCredentialsProvider();
	 * 
	 * RestClientBuilder builder = RestClient.builder(new HttpHost("localhost",
	 * 9200)) .setHttpClientConfigCallback(new
	 * RestClientBuilder.HttpClientConfigCallback() {
	 * 
	 * public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder
	 * httpClientBuilder) { return
	 * httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider); } });
	 */
}

/*
 * @Configuration public class ElasticsearchConfig extends
 * AbstractElasticsearchConfiguration {
 * 
 * @Override public RestHighLevelClient elasticsearchClient() { final var
 * clientConfiguration =
 * ClientConfiguration.builder().connectedTo("localhost:9200").build();
 * 
 * return RestClients.create(clientConfiguration).rest(); }
 * 
 * }
 */
