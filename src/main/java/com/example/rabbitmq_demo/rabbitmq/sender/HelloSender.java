package com.example.rabbitmq_demo.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author libiao
 * @create 2019/9/28 19:36
 * @description
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello" + new Date();
        System.out.println("Sender: " + context);
        amqpTemplate.convertAndSend("hello",context);
    }
}
