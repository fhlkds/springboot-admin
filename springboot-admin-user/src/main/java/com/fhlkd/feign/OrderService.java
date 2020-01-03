package com.fhlkd.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yanghaiyang on 2020/1/2 19:58
 */
@FeignClient(name = "springboot-admin-order")
public interface OrderService {

    @GetMapping("/order/getOrder")
    String getOrder(@RequestParam String name);
}
