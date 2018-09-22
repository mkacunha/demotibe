package com.demotibe.demotibe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/aa")
@RestController
public class NewClass {


    @GetMapping
    public String teste(){
        return "aaaaaa";
    }
}
