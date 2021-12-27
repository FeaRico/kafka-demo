package ru.mahach.kafkalearn.kafka.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import ru.mahach.kafkalearn.dto.Ship;

@Component
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, Ship> shipKafkaTemplate;

    Logger logger = LoggerFactory.getLogger(Producer.class);

    @Value(value = "${kafka.message.topic.name}")
    private String topicName;

    @Value(value = "${kafka.ship.topic.name}")
    private String shipTopic;

    public void sendMessage(String message){

        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName, message);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                logger.info("Sent message successful");
            }

            @Override
            public void onFailure(Throwable ex) {
                logger.info("Failed to send message=[" + message + "]. Error: " + ex.getMessage());
            }
        });
    }

    public void sendShip(Ship ship){
        ListenableFuture<SendResult<String, Ship>> future = shipKafkaTemplate.send(shipTopic, ship);

        future.addCallback(new ListenableFutureCallback<SendResult<String, Ship>>() {
            @Override
            public void onSuccess(SendResult<String, Ship> result) {
                logger.info("Sent ship successful");
            }

            @Override
            public void onFailure(Throwable ex) {
                logger.info("Failed to send ship=[" + ship.toString() + "]. Error: " + ex.getMessage());
            }
        });
    }

}
