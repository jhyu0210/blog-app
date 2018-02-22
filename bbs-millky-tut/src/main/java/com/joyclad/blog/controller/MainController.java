package com.joyclad.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name","SpringBlog from Joyclad");
		return "index";
		}
	@GetMapping("/blog")
	public String blog(Model model) {
		return "blog/list";
		}
//	@GetMapping("/post")
//	public String post(Model model) {
//		return "post/list";
//		}
}
