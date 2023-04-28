package com.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("hello")
    public Hello get() {
        return new Hello(0, "Hello, spring!!");
    }

    @GetMapping("hi")
    public String hi() {
        return "hi";
    }
}