package ru.mahach.kafkalearn.kafka.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.mahach.kafkalearn.dto.Ship;

@Component
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "${kafka.ship.topic.name}", containerFactory = "shipKafkaListenerContainerFactory")
    public void shipListener(Ship ship){
        logger.info("Consume ship message: " + ship);
    }

}
