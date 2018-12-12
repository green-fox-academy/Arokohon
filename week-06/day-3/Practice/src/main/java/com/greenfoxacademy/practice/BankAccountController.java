package com.greenfoxacademy.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

  private List<BankAccount> bankAccounts = new ArrayList<>();

  public BankAccountController() {
    bankAccounts.add(new BankAccount("Simba", 2000, "SAFARI", "lion"));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showBankAccounts(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "index";
  }
}
