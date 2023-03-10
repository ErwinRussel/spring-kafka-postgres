package com.mareelsoftware.springkafkapostgres;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class SpringKafkaPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaPostgresApplication.class, args);
	}

//	@KafkaListener(id = "myId", topics = "topic1")
//	public void listen(String in) {
//		System.out.println(in);
//	}
}
