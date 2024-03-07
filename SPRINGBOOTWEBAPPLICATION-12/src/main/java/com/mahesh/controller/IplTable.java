package com.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IplTable 
{
	
	@RequestMapping("/")
	public String iplForm()
	{
		return "iplscores";
	}
	@RequestMapping("/request")
	public String getIplScores(@RequestParam int position,
							   @RequestParam String teamName,
							   @RequestParam int playedMatches,
							   @RequestParam int winMatches,
							   @RequestParam int lossMatches,
							@RequestParam String winningMatchesRuns,
							@RequestParam String lossMatchesRuns,
							ModelMap model)
	{
		model.put("position", position);
		model.put("teamName", teamName);
		model.put("playedMatches", playedMatches);
		model.put("winMatches", winMatches);
		model.put("lossMatches", lossMatches);
		model.put("winningMatchesRuns", winningMatchesRuns);
		model.put("lossMatchesRuns", lossMatchesRuns);
		
		//To extract the data and find the value of for matches runrate string
		
		String[] numbers = winningMatchesRuns.split("/");
		double numerator = Double.parseDouble(numbers[0]);
		double denominator = Double.parseDouble(numbers[1]);
		double forRunRate = numerator / denominator;
		
		//To extract the data and find the value of against matches runrate string
		String[] numbers1 = lossMatchesRuns.split("/");
		double numerator1 = Double.parseDouble(numbers1[0]);
		double denominator1 = Double.parseDouble(numbers1[1]);
		double againstRunRate = numerator1 / denominator1;
		int tieMatchs = playedMatches-(winMatches+lossMatches);
		double netRunRate = forRunRate-againstRunRate;
		int points = winMatches*2 + tieMatchs; 
		model.put("PTS", points);
		model.put("NRR", netRunRate);
		model.put("NR", tieMatchs);
		return "result";
	}
	
}
