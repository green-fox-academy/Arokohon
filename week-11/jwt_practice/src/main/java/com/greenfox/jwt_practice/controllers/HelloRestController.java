package com.greenfox.jwt_practice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloRestController {

  @GetMapping("/")
  public String hello() {
    return "Hello world!";
  }
}
