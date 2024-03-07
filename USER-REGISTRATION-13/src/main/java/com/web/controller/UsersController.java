package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Users;

@Controller
public class UsersController {
	@RequestMapping("/")
	public String userForm(ModelMap model)
	{
		Users users=new Users();
		model.put("users", users);
		return "register";
	}
	@RequestMapping("/register")
	public String formDetails(@ModelAttribute Users users,ModelMap model)
	{
		model.put("users", users);
		return "result";
	}

}
