package com.greenfox.springpractice.Controller;

import com.greenfox.springpractice.Model.Attraction;
import com.greenfox.springpractice.Service.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TourismMainController {

  private AttractionServiceImpl service;

  @Autowired
  public TourismMainController(AttractionServiceImpl service) {
    this.service = service;
  }

  @ModelAttribute
  public void addAttributes(Model model) {
    model.addAttribute("attractions", service.getAttractions());
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("newAttraction", new Attraction());
    return "index";
  }

  @PostMapping("/add")
  public String saveAttraction(Attraction attraction) {
    service.addAttraction(attraction);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String findAttraction(@PathVariable("id") Long id, Model model) {
    model.addAttribute("editAttraction", service.findById(id));
    return "edit";
  }

  @PostMapping("/edit")
  public String editAttraction(Attraction attraction) {

    return "redirect:/";
  }

}
