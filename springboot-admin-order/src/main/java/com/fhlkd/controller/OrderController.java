package com.fhlkd.controller;

import com.fhlkd.feign.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yanghaiyang on 2020/1/2 19:48
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Resource
    private UserService userService;

    @GetMapping("/getOrder")
    public String getOrder(@RequestParam String name){
        log.info("order-service------>get order");
        log.debug("order-service------>get order");
        return name+"order service";
    }

    @GetMapping("/getUser")
    public String getUser(@RequestParam String name){
        log.info("order-service------>get user");
        log.debug("order-service------>get user");
        return userService.getUser(name)+"order-service";
    }
}
