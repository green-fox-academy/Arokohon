package com.greenfox.rest_backend_workshop.Controller;

import com.greenfox.rest_backend_workshop.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  private Services service;

  @Autowired
  public MainRestController(Services service) {
    this.service = service;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer number) {
    return service.doubling(number);
  }
}
