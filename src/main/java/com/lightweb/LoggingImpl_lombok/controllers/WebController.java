package com.lightweb.LoggingImpl_lombok.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
 public class WebController {

@GetMapping("/text")
    public String getData(){

    System.out.println("System log");
    log.warn("This is warning");
    log.info("This is just some information");
    log.debug("Debugging details");
    log.error("My Error");
    return "Hello World!";
    }
}