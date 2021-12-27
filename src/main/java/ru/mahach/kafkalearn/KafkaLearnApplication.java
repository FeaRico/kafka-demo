package ru.mahach.kafkalearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.mahach.kafkalearn.dto.Ship;
import ru.mahach.kafkalearn.kafka.engine.Consumer;
import ru.mahach.kafkalearn.kafka.engine.Producer;

@SpringBootApplication
public class KafkaLearnApplication {
    public static void main(String[] args){
        SpringApplication.run(KafkaLearnApplication.class, args);
    }
}
