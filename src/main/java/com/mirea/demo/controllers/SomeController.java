package com.mirea.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world" +
                "\ngithub: https://github.com/Zyablikitsme";
    }

    @GetMapping("/github")
    public String sayGithub(){
        return "https://github.com/Zyablikitsme";
    }
}
