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
    bankAccounts.add(new BankAccount("Timon", 600, "SAFARI", "meerkats"));
    bankAccounts.add(new BankAccount("Pumba", 400, "SAFARI", "boar"));
    bankAccounts.add(new BankAccount("Mufasa", 6000, "SAFARI", "lion"));
    bankAccounts.add(new BankAccount("Scar", 9500, "SAFARI", "lion"));
    bankAccounts.add(new BankAccount("Rafiki", 8000, "SAFARI", "baboon"));
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
