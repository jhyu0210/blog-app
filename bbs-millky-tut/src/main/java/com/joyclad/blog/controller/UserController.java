package com.joyclad.blog.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(value="/user/login", method=RequestMethod.GET)
	public String login() {
		return "connect/login";
	}
}
	
//	@RequestMapping(value = "/create", method = RequestMethod.GET)
//	public String userForm(User user) {
//		return "/user/userForm";
//	}
//	@RequestMapping(value = "/create", method = RequestMethod.POST)
//	public String create(User user) {
//		return "redirect:/user/" + userDao. save(user).getId() ;
//	}
//	
//	@RequestMapping(value = "/list")
//	public String usersList(Model model) {
//		List<User> userList = userDao.findAll();
//		model.addAttribute("userList",userList);
//		return "post/blog";
//	}
//	
//	@RequestMapping("/{id}")
//	public String view(Model model, @PathVariable String id) {
//		User user = userDao.findOne(id);
//		model.addAttribute("user",user);
//		return "user/user";
//	}
//	
	
	
//}
