package ru.mahach.kafkalearn.kafka.controller;

import org.springframework.web.bind.annotation.*;
import ru.mahach.kafkalearn.dto.Ship;
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
        producer.sendMessage(message);
    }

    @GetMapping(value = "/ship")
    public void sendShip(){

        Ship ship = new Ship();
        ship.setId(1L);
        ship.setName("ZEUS");
        ship.setStatus("ACTIVE");
        ship.setType("SHIP");
        ship.setYearBuilt(2021);
        ship.setHomePort("Saint-Petersburg");
        ship.setLon(56.2);
        ship.setLat(60.4);

        producer.sendShip(ship);
    }
}
