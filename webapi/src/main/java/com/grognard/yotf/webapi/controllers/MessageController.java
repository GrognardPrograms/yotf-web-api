package com.grognard.yotf.webapi.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @CrossOrigin
    @PostMapping("/message")
    public int PostMessage() {
        return 1;
    }

    @CrossOrigin
    @GetMapping("/message")
    public int GetMessage() {
        return 2;
    }
}
