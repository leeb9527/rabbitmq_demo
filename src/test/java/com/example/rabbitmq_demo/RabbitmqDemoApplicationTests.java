package com.example.rabbitmq_demo;

import com.example.rabbitmq_demo.rabbitmq.sender.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqDemoApplicationTests {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void contextLoads() {
    }


    @Test
    public  void hello() throws Exception {
        helloSender.send();
    }
}
