package com.haiyue.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world controller
 *
 * @author liuhaiming on 2017/12/21.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${demo.param}")
    private String param;

    @RequestMapping("/world")
    public String helloWorld() {
        return "demo.param: " + param;
    }
}
