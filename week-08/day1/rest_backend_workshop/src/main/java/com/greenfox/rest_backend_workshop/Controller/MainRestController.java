package com.greenfox.rest_backend_workshop.Controller;

import com.greenfox.rest_backend_workshop.Repository.DoUntil;
import com.greenfox.rest_backend_workshop.Repository.JsonObject;
import com.greenfox.rest_backend_workshop.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    return service.greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable String appendable) {
    return service.addingA(appendable);
  }

  @PostMapping("/dountil/{action}")
  public DoUntil doUntil(@PathVariable String action,
                         @RequestBody JsonObject jsonObject) {
    return service.DoUntilNum(action, jsonObject.getUntil());
  }
}
