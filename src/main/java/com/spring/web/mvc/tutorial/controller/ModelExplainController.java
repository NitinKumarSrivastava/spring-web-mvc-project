package com.spring.web.mvc.tutorial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelExplainController {

	
	@RequestMapping("/home")
	public String home(Model model) {
		
		System.out.println("This is ModelExplainController.");
		model.addAttribute("name", "Sunny");
		model.addAttribute("id", 1789);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandana");
		friends.add("Roshni");
		friends.add("Ravi");
		friends.add("Tejas");
		friends.add("Bhishm");
		
		model.addAttribute("friendsList", friends);
		
		return "home";
	}
	

}
