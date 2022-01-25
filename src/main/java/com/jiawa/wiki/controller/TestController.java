package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:AAA}")
    private  String testHello;
    //localhost:8880//hello/
    @RequestMapping("/hello")
    public String hello(){
      return "hello world" +testHello;
    };
}
