package com.fhlkd.controller;

import com.fhlkd.feign.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yanghaiyang on 2020/1/2 19:55
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private OrderService orderService;


    @GetMapping("/getOrder")
    public String getOrder(@RequestParam  String name){
      log.debug("user-service------>get order");
      log.info("user-service------>get order");
      return orderService.getOrder(name)+"user-service";
    }

    @GetMapping("/getUser")
    public String getUser(@RequestParam String name){
        log.debug("user-service------>get user");
        log.info("user-service------>get user");
        return name+"user-service";
    }
}
