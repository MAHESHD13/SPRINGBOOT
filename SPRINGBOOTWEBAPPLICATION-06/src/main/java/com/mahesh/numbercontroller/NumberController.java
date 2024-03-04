package com.mahesh.numbercontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class NumberController 
{
	@RequestMapping("/")
	public String numberForm()
	{
		return "number";
	}
	@RequestMapping("/req1")
	public String getBiggestNumber(@RequestParam int firstNumber,@RequestParam int secondNumber,@RequestParam int thirdNumber,ModelMap model)
	{
		model.put("key1", firstNumber);
		model.put("key2", secondNumber);
		model.put("key3", thirdNumber);
		int maxNum=0;
		if(firstNumber>secondNumber && firstNumber>thirdNumber)
		{
			maxNum = firstNumber;
		}
		else if(secondNumber>firstNumber && secondNumber>thirdNumber)
		{
			maxNum = secondNumber;
		}
		else
		{
			maxNum = thirdNumber;
		}
		model.put("firstNumber", firstNumber);
		model.put("secondNumber", secondNumber);
		model.put("thirdNumber", thirdNumber);
		model.put("maxNum", maxNum);
		return "result";
		
	}

}
