package com.greenfox.project_phase_practice.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoRestController {

  @GetMapping("/")
  public String hello() {
    return "Hello!";
  }

  @PreAuthorize("hasAnyRole('ADMIN')")
  @GetMapping("/secured/all")
  public String secureHello() {
    return "Secured hello!";
  }
}
