package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatRestController {
    @GetMapping(value = "/cat")
    public Cat displayCatAsJson() {
        return new Cat(1, "Radwa");
    }
}
