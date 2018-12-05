package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value="/greeting")
  @ResponseBody
  public Greeting greeting() {
    return new Greeting("Hello Tiptop! :)", 1);
  }
}
