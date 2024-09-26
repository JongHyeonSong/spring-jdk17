

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/ping")
    public String pong(){
        System.out.println("GOGOSING");
        return "23432432wefef";
    }



}
