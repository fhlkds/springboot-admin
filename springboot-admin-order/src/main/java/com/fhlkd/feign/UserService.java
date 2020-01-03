package com.fhlkd.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yanghaiyang on 2020/1/2 20:06
 */
@FeignClient("springboot-admin-user")
public interface UserService {

    @GetMapping("/user/getUser")
    String getUser(@RequestParam String name);
}
