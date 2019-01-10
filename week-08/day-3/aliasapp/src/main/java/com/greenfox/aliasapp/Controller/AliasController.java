package com.greenfox.aliasapp.Controller;

import com.greenfox.aliasapp.Service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AliasController {

  @Autowired
  AliasService service;

  @GetMapping("/")
  public String mainPage() {
    return "index";
  }


}
