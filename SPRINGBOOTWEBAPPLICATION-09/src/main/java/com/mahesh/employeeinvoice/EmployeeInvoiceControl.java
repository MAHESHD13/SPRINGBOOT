package com.mahesh.employeeinvoice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class EmployeeInvoiceControl {
	@RequestMapping("/")
	public String ebillForm()
	{
		return "employeebill";
	}
	@RequestMapping("/request")
	public String getEmployeeDetails(@RequestParam int eno,@RequestParam String ename,@RequestParam double esalary,ModelMap model)
	{
		model.put("eno", eno);
		model.put("ename", ename);
		model.put("esalary", esalary);
		double TA = 0.0,DA=0.0 , HRA =0.0 ,PF= 0.0 , grossSalary =0.0,netSalary =0.0;
		if(esalary < 30000)
		{
			TA = esalary * 0.07;
			DA = esalary * 0.09;
			HRA = esalary * 0.11;
			PF = esalary * 0.15;
		}
		else if(esalary >= 30000 && esalary <50000)
		{
			TA = esalary * 0.12;
			DA = esalary * 0.13;
			HRA = esalary * 0.17;
			PF = esalary * 0.22;
		}
		else if(esalary >= 50000)
		{
			TA = esalary * 0.17;
			DA = esalary * 0.19;
			HRA = esalary * 0.21;
			PF = esalary * 0.25;
		}
		model.put("TA", TA);
		model.put("DA", DA);
		model.put("HRA", HRA);
		model.put("PF", PF);
		grossSalary = TA + DA + HRA + esalary;
		netSalary = grossSalary - PF;
		
		model.put("grossSalary",grossSalary);
		model.put("netSalary",netSalary);
		return "result";
	}
	
}
