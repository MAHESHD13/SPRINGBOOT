package com.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@RequestMapping("/homeurl")
	public String homePage()
	{
		return "home";
	}
	@RequestMapping("/abouturl")
	public String aboutPage()
	{
		return "about";
	}
	@RequestMapping("/contacturl")
	public String contactPage()
	{
		return "contact";
	}
	@RequestMapping("/loginurl")
	public String loginPage()
	{
		return "login";
	}
	@RequestMapping("/registerurl")
	public String registerPage()
	{
		return "register";
	}
}
