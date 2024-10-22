package com.example.ivk_sp_boot.controller;


import com.example.ivk_sp_boot.model.User;
import com.example.ivk_sp_boot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

	private UserService userService;

	public IndexController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/")
	public String showAllUsers(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("All Users");
		model.addAttribute("messages", messages);
		List<User> allUsers = userService.getAllUsers();
		System.out.println("All Users: " + allUsers);
		model.addAttribute("users", allUsers);
		return "index";
	}

//	@RequestMapping(value = "/addUser")
//	public String addUser(ModelMap model) {
//		User user = new User();
//		model.addAttribute("user", user);
//		model.addAttribute("message", "Add User");
//	return "addUser";
//	}

//	@RequestMapping(value = "/saveUser")
//	public String saveUser(@ModelAttribute("user") User user) {
//		userService.saveUser(user);
//		return "redirect:/";
//	}
//
//	@RequestMapping(value = "/updateUser")
//	public String updateUser(@RequestParam("userId") int id, Model model) {
//		User user = userService.getUser(id);
//		model.addAttribute("user", user);
//		model.addAttribute("message", "Update User");
//		return "addUser";
//	}
//
//	@RequestMapping(value = "/deleteUser")
//	public String deleteUser(@RequestParam("userId") int id, Model model) {
//		 userService.deleteUser(id);
//		return "redirect:/";
//	}
}