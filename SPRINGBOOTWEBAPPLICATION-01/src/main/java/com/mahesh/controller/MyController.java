package com.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController 
{
	@RequestMapping("/req1")
	@ResponseBody
	public String getMessage()
	{
		return"<h1 style='color:violet'>WELCOME TO SPRING BOOT WEB APPLICATION</h1>";
	}
}
