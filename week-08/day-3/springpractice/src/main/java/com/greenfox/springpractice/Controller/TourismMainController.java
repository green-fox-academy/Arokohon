package com.greenfox.springpractice.Controller;

import com.greenfox.springpractice.Model.Attraction;
import com.greenfox.springpractice.Service.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TourismMainController {

  private AttractionServiceImpl service;

  @Autowired
  public TourismMainController(AttractionServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("attraction", new Attraction());
    model.addAttribute("attractions", service.getAttractions());
    return "index";
  }

  @PostMapping("/add")
  public String saveAttraction(@ModelAttribute ("attraction") Attraction attraction) {
    service.addAttraction(attraction);
    return "redirect:/";
  }

}
