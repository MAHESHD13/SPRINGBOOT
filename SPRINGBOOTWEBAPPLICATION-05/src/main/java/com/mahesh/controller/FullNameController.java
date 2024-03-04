package com.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FullNameController 
{
	@RequestMapping("/homeurl")
	public String nameForm()
	{
		return "name";
	}
	@RequestMapping("/req1")
	public String fullName(@RequestParam String fname,@RequestParam String lname,ModelMap model)
	{
		model.put("key1", fname);
		model.put("key2", lname);
		String fullName = fname +" "+lname;
		model.put("fullName", fullName);
		return "result";
	}

}
