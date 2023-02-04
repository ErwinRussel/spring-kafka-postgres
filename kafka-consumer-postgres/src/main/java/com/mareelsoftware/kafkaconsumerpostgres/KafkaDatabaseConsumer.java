package com.mareelsoftware.kafkaconsumerpostgres;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOG = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @KafkaListener(
            topics="wikimedia-recent-change",
            groupId="myGroup")
    public void consume(String eventMessage){
        LOG.info(String.format("Event message received -> %s", eventMessage));
    }
}
