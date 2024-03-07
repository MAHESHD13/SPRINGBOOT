package com.mahesh.studentmarks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentProgressRecord {
	@RequestMapping("/")
	public String marksForm()
	{
		return "marks";
	}
	@RequestMapping("/request")
	public String getMarksResult(@RequestParam int studRollNo,
								 @RequestParam String studName,
								 @RequestParam String course,
								 @RequestParam int hibernateMarks,
								 @RequestParam int springMarks,
								 @RequestParam int springBootMarks,
								 ModelMap model)
	{
		model.put("studRollNo", studRollNo);
		model.put("studName", studName);
		model.put("course", course);
		model.put("hibernateMarks", hibernateMarks);
		model.put("springMarks", springMarks);
		model.put("springBootMarks", springBootMarks);
		int totalMarks = 0;
		double percentage = 0.00;
		String grade = null,status = null;
		totalMarks = hibernateMarks + springMarks + springBootMarks;
		percentage = totalMarks / 3;
		if(hibernateMarks > 35 && springMarks > 35 && springBootMarks > 35)
		{
			status = "Pass";
			if(percentage >= 70)
			{
				grade = "A grade";
			}
			else if(percentage >= 60)
			{
				grade ="B grade";
			}
			else if(percentage >= 50)
			{
				grade ="C grade";
			}
		}
		model.put("totalMarks", totalMarks);
		model.put("percentage", percentage);
		model.put("grade", grade);
		model.put("status", status);
		return "result";
	}
	
}
