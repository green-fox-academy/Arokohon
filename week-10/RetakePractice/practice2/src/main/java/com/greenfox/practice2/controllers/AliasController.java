package com.greenfox.practice2.controllers;

import com.greenfox.practice2.models.Alias;
import com.greenfox.practice2.services.AliasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AliasController {

  private AliasServiceImpl service;

  @Autowired
  public AliasController(AliasServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("newAlias", new Alias());
    return "index";
  }

  @PostMapping("/save-link")
  public String saveAlias(@ModelAttribute("newAlias") Alias alias) {
    service.addAlias(alias);
    return "redirect:/";
  }
}
