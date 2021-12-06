package com.mirea.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world" +
                "<br></br><br></br><br></br><h2><a href=\"https://github.com/Zyablikitsme\">github</a></h2>";
    }

    @GetMapping("/github")
    public String sayGithub(){
        return "https://github.com/Zyablikitsme";
    }
}
