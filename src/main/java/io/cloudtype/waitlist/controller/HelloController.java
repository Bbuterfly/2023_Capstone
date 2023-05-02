package io.cloudtype.waitlist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import io.cloudtype.waitlist.model.Hello;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
public class HelloController {
    @GetMapping("/hello")
    public Hello get() {
        return new Hello(0, "Hello, spring!!");
    }

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
}
