package com.example.rabbitmq_demo.controller;

import com.example.rabbitmq_demo.rabbitmq.sender.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libiao
 * @create 2019/9/26 20:03
 * @description
 */

@RestController
public class rebbitmqController {


    @Autowired
    private HelloSender helloSender;

    @GetMapping("/helloWorld")
    public String helloWorld(String name){

        helloSender.send();
        return "hello world" + name;
    }
}
