package com.springcloud.playground.orderservice.presentation.adapter;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${playground.msa.name}")
    private String name;

    @GetMapping
    public String getName() {
        return name;
    }



}
