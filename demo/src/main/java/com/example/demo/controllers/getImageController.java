package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class getImageController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/api/random-dog")
    public String getRandomDogImage() {
        String apiUrl = "https://dog.ceo/api/breeds/image/random";
        String response = restTemplate.getForObject(apiUrl, String.class);
        return response;
    }
}
