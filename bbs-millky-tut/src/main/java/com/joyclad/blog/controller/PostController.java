package com.joyclad.blog.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionData;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joyclad.blog.model.Post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Controller
@RequestMapping("/post") 
//comment.... test

public class PostController {

		@Autowired
		private PostDao postDao;
		
		@Autowired
		private ConnectionRepository connectionRepository;
		
		@RequestMapping(value = "/write",method = RequestMethod.GET)
		public String form(Post post) {
			return "post/form";
		}
		@RequestMapping(value = "/write", method = RequestMethod.POST)
		public String write(@Valid Post post, BindingResult bindingResult) {
			User user = getConnect();
			if(bindingResult.hasErrors()) {
				return "post/form";
			}
			post.setRegDate(LocalDateTime.now());
			post.setUserId(user.getProviderUserId());
			post.setName (user.getDisplayName());
			
				return "redirect:/post/" + postDao.save(post).getId();
		}
		@RequestMapping("/list")
		public String list(Model model) {
			List<Post> postList = postDao.findAll();
			model.addAttribute("postList",postList);
			
			User user = getConnect();
			model.addAttribute("user",user);
			return "post/blog";//post/list???????
		}
		
		@RequestMapping("/{id}")
		public String view(Model model, @PathVariable int id) {
			Post post = postDao.findOne(id);
			model.addAttribute("post",post);
			
			User user = getConnect();
			model.addAttribute("user", user);
			return "post/post";
		}
		@RequestMapping("/{id}/delete")
		public String delete( @PathVariable int id) {
			postDao.delete(id);
			return "redirect:/post/list";
		}
		
		@RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
		public String editor(Model model, @PathVariable int id) {
			Post post = postDao.findOne(id);
			model.addAttribute("post",post);
		
			return "post/form";
		}
		
		@RequestMapping(value = "/{id}/edit", method = RequestMethod.POST)
		public String edit(@Valid Post post, BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				return "post/form";
			}
			return "redirect:/post/" + postDao.save(post).getId();
		}
		
		private User getConnect() {
			Connection<Facebook> connection = connectionRepository.findPrimaryConnection(Facebook.class);
			if (connection == null) {
				return null;
			}
			ConnectionData data = connection.createData();
			return new User(data.getProviderUserId(), data.getDisplayName());
		}
		
		@Getter
		@Setter
		@NoArgsConstructor
		@AllArgsConstructor
		public static class User {
			String providerUserId;
			String displayName;
		}
}
