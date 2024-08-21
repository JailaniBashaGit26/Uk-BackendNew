package com.basha.uk.uk.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@CrossOrigin(origins = "*")
public class controller {
    @GetMapping("/message")
    public String test() throws IOException, InterruptedException {
        return "First Test Message";
    }
}
