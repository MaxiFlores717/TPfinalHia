package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "test";
	}
	
	 @Override
	    @Bean
	    public MongoClient mongoClient() {
	        ConnectionString connectionString = new ConnectionString("mongodb://mongo1:27017,mongo2:27018,mongo3:27019/test?replicaSet=myReplicaSet");
	        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
	            .applyConnectionString(connectionString)
	            .build();

	        return MongoClients.create(mongoClientSettings);
	    }

	 @Bean
	    public MongoTemplate mongoTemplate() {
	        return new MongoTemplate(mongoClient(), getDatabaseName());
	    }


}
