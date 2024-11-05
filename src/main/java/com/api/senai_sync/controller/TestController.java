package com.api.senai_sync.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Olá, público!";
    }

    @GetMapping("/private/hello")
    public String privateHello() {
        return "Olá, usuário autenticado!";
    }
}

