package com.mahesh.electricitybill;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ElectricityBill 
{
	@RequestMapping("/")
	public String billForm()
	{
		return "bill";
	}
	@RequestMapping("/request")
	public String getElectricityBill(@RequestParam int consumerId,@RequestParam String consumerName,@RequestParam int currentReading,@RequestParam int previousReading,ModelMap model)
	{
		model.put("consumerId", consumerId);
		model.put("consumerName", consumerName);
		model.put("currentReading", currentReading);
		model.put("previousReading", previousReading);
		int units=0;
		double rate=0.0,totalBill=0.0;
		units=currentReading - previousReading;
		if(units < 300)
		{
			rate=1.75;
		}
		else if(units >= 300 && units <500)
		{
			rate = 3.25;
		}
		else if(units >= 500)
		{
			rate = 7.25;
		}
		totalBill = units * rate;
		model.put("units", units);
		model.put("totalBill", totalBill);
		return "result";
	}
}
