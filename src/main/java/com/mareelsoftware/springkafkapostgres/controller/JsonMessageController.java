package com.mareelsoftware.springkafkapostgres.controller;

import com.mareelsoftware.springkafkapostgres.kafka.JsonKafkaProducer;
import com.mareelsoftware.springkafkapostgres.kafka.KafkaProducer;
import com.mareelsoftware.springkafkapostgres.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    // http:localhost:8080/api/v1/kafka/publish
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to Kafka Topic");
    }
}
