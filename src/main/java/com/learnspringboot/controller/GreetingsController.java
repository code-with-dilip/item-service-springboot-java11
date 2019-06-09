package com.learnspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.learnspringboot.constants.ItemConstants.GREETING;

@RestController
@Slf4j
public class GreetingsController {


    @Value("${message}")
    private String message;

    @GetMapping(GREETING)
    public ResponseEntity<?> greeting(){

        log.info("Message is : " + message);
        return ResponseEntity.ok().body(message);
    }
}
