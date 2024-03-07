package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/")
	public String employeeForm(ModelMap model)
	{
		Employee employees = new Employee();
		model.put("employees", employees);
		return "empdetails";
	}
	@RequestMapping("/employeedetails")
	public String getEmployeeDetails(@ModelAttribute Employee employees,ModelMap model)
	{
		double esalary = Double.parseDouble(employees.getEmpSalary());
		model.put("eno", employees.getEmpNo());
		model.put("ename", employees.getEmpName());
		model.put("esalary", esalary);
		double TA = 0.0,DA=0.0 , HRA =0.0 ,PF= 0.0 , grossSalary =0.0,netSalary =0.0;
		if(esalary < 30000)
		{
			TA = 0.07;
			DA = 0.09;
			HRA = 0.11;
			PF = 0.15;
		}
		else if(esalary >= 30000 && esalary <50000)
		{
			TA = 0.12;
			DA = 0.13;
			HRA = 0.17;
			PF = 0.22;
		}
		else if(esalary >= 50000)
		{
			TA = 0.17;
			DA = 0.19;
			HRA = 0.21;
			PF = 0.25;
		}
		TA = esalary * TA;
		DA = esalary * DA;
		HRA = esalary * HRA;
		PF = esalary * PF;
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
