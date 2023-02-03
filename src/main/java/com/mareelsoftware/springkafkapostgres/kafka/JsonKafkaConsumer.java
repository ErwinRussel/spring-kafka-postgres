package com.mareelsoftware.springkafkapostgres.kafka;

import com.mareelsoftware.springkafkapostgres.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "JSONTopic", groupId="myGroup")
    public void consume(User user){
        LOG.info(String.format("JSON Message received -> %s", user.toString()));
    }
}
