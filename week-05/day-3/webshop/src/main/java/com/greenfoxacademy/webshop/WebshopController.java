package com.greenfoxacademy.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebshopController {

//  @GetMapping("/")
//  public String index(Model model) {
//    List<WebshopItem> allItem =this.storage
//    return "index";
//  }

  @GetMapping("/add-product")
  public String addProduct() {
    return "add-product";
  }
}
