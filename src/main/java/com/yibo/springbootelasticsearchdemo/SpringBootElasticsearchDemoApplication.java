package com.yibo.springbootelasticsearchdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.yibo.springbootelasticsearchdemo.repository")
public class SpringBootElasticsearchDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootElasticsearchDemoApplication.class, args);
	}

}

