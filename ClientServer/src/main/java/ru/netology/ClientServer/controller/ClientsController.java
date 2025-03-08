package ru.netology.ClientServer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsController {
    @Value("${hello}")
    private String responseFromRepository;


    public ClientsController() {
        System.out.println("ClientsController created");
    }

    @GetMapping("/hello")
    public String getHello() {
        return responseFromRepository;
    }

}
