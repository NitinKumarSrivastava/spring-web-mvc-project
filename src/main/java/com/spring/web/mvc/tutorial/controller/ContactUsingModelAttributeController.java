package com.spring.web.mvc.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.web.mvc.tutorial.model.attribute.User;

@Controller
public class ContactUsingModelAttributeController {
	
	@RequestMapping("/registration")
	public String showForm() {
		
		return "registration";
	}
	
	/*
	@RequestMapping(path="/processRegistration", method=RequestMethod.POST)
	public String handleForm(@RequestParam("userName") String userName, 
							 @RequestParam(name="email", required=true) String userEmail, 
							 @RequestParam("userPassword") String userPassword, 
							 
							 Model model
							 ) {	
		User user = new User();
		user.setUserName(userName);
		user.setEmail(userEmail);
		user.setUserPassword(userPassword);
		
		System.out.println(user);
		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
		
		model.addAttribute("user", user);
		
		return "successModelAttribute";
	}
	*/
	
	
	@RequestMapping(path="/processRegistration", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, 
							 
							 Model model
							 ) {	
		
		System.out.println(user + " ..... ");
		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
		
		model.addAttribute("user", user);
		
		return "successModelAttribute";
	}
	
	

}
