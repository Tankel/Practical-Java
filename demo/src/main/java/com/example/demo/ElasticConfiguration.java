package com.example.demo;

import org.elasticsearch.client.RestHighLevelClient;

public class ElasticConfiguration {
	ClientConfiguration clientConfiguration = ClientConfiguration.builder().connectedTo("localhost:9200").build();
	RestHighLevelClient client = RestClients.create(clientConfiguration).rest();
}
