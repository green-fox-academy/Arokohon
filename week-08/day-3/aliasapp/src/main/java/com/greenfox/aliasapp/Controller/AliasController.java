package com.greenfox.aliasapp.Controller;

import com.greenfox.aliasapp.Model.Alias;
import com.greenfox.aliasapp.Service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AliasController {

  @Autowired
  AliasService service;

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("newAlias", new Alias());
    return "index";
  }

  @PostMapping("/save-link")
  public String saveAlias(@ModelAttribute("newAlias") Alias alias) {
    service.saveAlias(alias);
    return "redirect:/";
  }
}
