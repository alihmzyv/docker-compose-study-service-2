package com.alihmzyv.dockercomposestudyservice2.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/greet")
@RestController
public class GreetingResource {
    @GetMapping
    public String greet() {
        return "Hello";
    }
}
