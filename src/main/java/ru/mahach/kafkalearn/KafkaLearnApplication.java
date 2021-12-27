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
        /*ConfigurableApplicationContext context = SpringApplication.run(KafkaLearnApplication.class, args);

        Producer producer = context.getBean(Producer.class);
        Consumer listener = context.getBean(Consumer.class);

        Ship ship = new Ship();
        ship.setId(1L);
        ship.setName("ZEUS");
        ship.setStatus("ACTIVE");
        ship.setType("SHIP");
        ship.setYearBuilt(2021);
        ship.setHomePort("Saint-Petersburg");
        ship.setLon(56.2);
        ship.setLat(60.4);

        producer.sendShipMessage(ship);
        producer.sendShipMessage(ship);

        context.close();
*/

        SpringApplication.run(KafkaLearnApplication.class, args);

    }

//    @Bean
//    public Producer producer(){
//        return new Producer();
//    }
//
//    @Bean
//    public Consumer consumer(){
//        return new Consumer();
//    }

}
