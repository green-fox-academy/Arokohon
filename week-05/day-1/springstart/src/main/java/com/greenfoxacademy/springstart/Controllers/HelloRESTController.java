package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value="/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam String name) {
    return new Greeting(name, "Hey, ", 1);
  }
}
