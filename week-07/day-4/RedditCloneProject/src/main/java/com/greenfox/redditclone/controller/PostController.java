package com.greenfox.redditclone.controller;

import com.greenfox.redditclone.repository.Post;
import com.greenfox.redditclone.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

  PostServiceImpl service;

  @Autowired
  PostController(PostServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/")
  public String mainPage( Model model) {
    model.addAttribute("posts", service.getPosts());
    return "index";
  }

  @GetMapping("/submit")
  public String addPost(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String addPost(@ModelAttribute("post") Post post) {
    service.addPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String editPost(@PathVariable long id, Model model) {
    model.addAttribute("post", service.getPostById(id));
    return "edit-post";
  }

  @PutMapping("/{id}/edit")
  public String editPost(@ModelAttribute("post") Post post) {
    service.editPost(post);
    return "redirect:/";
  }
}
