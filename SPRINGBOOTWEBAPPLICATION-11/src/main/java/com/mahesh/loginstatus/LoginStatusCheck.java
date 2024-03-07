package com.mahesh.loginstatus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginStatusCheck {
	@RequestMapping("/")
	public String statusForm()
	{
		return "login";
	}
	@RequestMapping("/request")
	public String LoginStatus(@RequestParam String userName,@RequestParam String password,ModelMap model)
	{
		model.put("userName", userName);
		model.put("password", password);
		String status = null;
		if(userName.equalsIgnoreCase("Maheshd13") && password.equals("mahesh@12"))
		{
			status = "Login Success";
		}
		else
		{
			status = "Login Fail Try With Valid Credentials.....";
		}
		model.put("status", status);
		return "result";
	}
}
