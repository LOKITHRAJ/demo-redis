package com.incubator.demoredis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRedisController {

    @GetMapping("/hi")
    public String getData() {
        return "hello";
    }
}
