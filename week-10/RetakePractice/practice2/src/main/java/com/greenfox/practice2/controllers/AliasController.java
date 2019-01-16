package com.greenfox.practice2.controllers;

import com.greenfox.practice2.models.Alias;
import com.greenfox.practice2.services.AliasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AliasController {

  AliasServiceImpl service;

  @Autowired
  public AliasController(AliasServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index(Model model,
                      @RequestParam(value = "id", required = false) Long id) {
    if (id != null) {
      model.addAttribute("aliasName", service.findById(id).getAliasName());
      model.addAttribute("secretCode", service.findById(id).getSecretCode());
    } else {
      model.addAttribute("aliasName", "empty");
      model.addAttribute("secretCode", "empty");
    }
    model.addAttribute("newAlias", new Alias());
    return "index";
  }

  @PostMapping("/save-link")
  public String saveAlias(@ModelAttribute("newAlias") Alias alias,
                          Model model,
                          RedirectAttributes redir) {
    if (service.aliasExistsByName(alias.getAliasName())) {
      model.addAttribute("error", "Your alias is already in use!");
      return "index";
    } else {
      service.addAlias(alias);
      redir.addAttribute("id", service.findAliasByName(alias.getAliasName()).getId());
      return "redirect:/?id={id}";
    }
  }

  @GetMapping("/a/{alias}")
  public Object getRequestedAlias(@PathVariable String alias) {
    if (service.findAliasByName(alias) != null) {
      service.incHitCount(alias);
      String url = service.findAliasByName(alias).getUrl();
      return "redirect:" + url;
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }
}
