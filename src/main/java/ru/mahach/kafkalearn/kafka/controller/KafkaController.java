package ru.mahach.kafkalearn.kafka.controller;

import org.springframework.web.bind.annotation.*;
import ru.mahach.kafkalearn.kafka.engine.Producer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping(value = "/send/{message}")
    public void sendMessage(@PathVariable("message") String message){
        this.producer.sendMessage(message);
    }
}
