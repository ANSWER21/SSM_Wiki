package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //localhost:8880//hello/
    @RequestMapping("/hello")
    public String hello(){
      return "hello world";
    };
}
