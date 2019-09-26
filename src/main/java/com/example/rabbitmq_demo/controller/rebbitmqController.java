package com.example.rabbitmq_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libiao
 * @create 2019/9/26 20:03
 * @description
 */

@RestController
public class rebbitmqController {

    @GetMapping("/helloWorld")
    public String helloWorld(String name){

        return "hello world" + name;
    }
}
