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
    bankAccounts.add(new BankAccount
        ("Simba", "Prince", 2000, "SAFARI", "lion", true));
    bankAccounts.add(new BankAccount
        ("Timon", "Unemployed", 600, "SAFARI", "meerkats", true));
    bankAccounts.add(new BankAccount
        ("Pumba", "Jester",400, "SAFARI", "boar", true));
    bankAccounts.add(new BankAccount
        ("Mufasa", "King",6000, "SAFARI", "lion", true));
    bankAccounts.add(new BankAccount
        ("Scar", "Usurper",9500, "SAFARI", "lion", false));
    bankAccounts.add(new BankAccount
        ("Rafiki", "Smart ass",8000, "SAFARI", "baboon", true));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showBankAccounts(Model model) {
    model.addAttribute("bankAccount", bankAccounts);
    return "index";
  }

  @RequestMapping(path = "/htmlception", method = RequestMethod.GET)
  public String showHtmlCeption(Model model) {
    model.addAttribute("htmlception", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlception";
  }

  @RequestMapping(path = "/list", method = RequestMethod.GET)
  public String showAccounts(Model model) {
    model.addAttribute("allaccounts", bankAccounts);
    return "accountlist";
  }
}
