package com.mareelsoftware.kafkaconsumerpostgres;


import com.mareelsoftware.kafkaconsumerpostgres.mapper.WikiEventDataMapper;
import com.mareelsoftware.kafkaconsumerpostgres.models.WikiEventData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOG = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    private WikiEventDataMapper wikiEventDataMapper;

    public KafkaDatabaseConsumer(WikiEventDataMapper wikiEventDataMapper) {
        this.wikiEventDataMapper = wikiEventDataMapper;
    }

    @KafkaListener(
            topics="wikimedia-recent-change",
            groupId="myGroup")
    public void consume(String eventMessage){
        LOG.info(String.format("Event message received -> %s", eventMessage));
        WikiEventData wikiEventData = new WikiEventData();
        wikiEventData.setWikiEventData(eventMessage);
        wikiEventDataMapper.insert(wikiEventData);
    }
}
