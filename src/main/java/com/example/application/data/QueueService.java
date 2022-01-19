package com.example.application.data;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.function.Consumer;

@Component
public class QueueService {

    private Consumer<String> messageConsumer;


    @RabbitListener(queues = "queueTest")
    public void processMessage(String content) {
        System.out.println(String.format("Message receivied -> %s", content));
        if (Objects.nonNull(messageConsumer)) {
            messageConsumer.accept(content);
        }
    }

    public void setMessageListener(Consumer<String> consumer) {
        this.messageConsumer = consumer;
    }



}
