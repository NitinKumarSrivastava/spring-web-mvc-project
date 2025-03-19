package com.spring.web.mvc.tutorial.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactUsingRequestParamController {
	
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}
	
	/*
	// using Old Method using Servlet
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(HttpServletRequest request) {
		
		String email = request.getParameter("email");
		System.out.println("Email entered is ..... : " + email);
		
		return "";
	}
	*/
	
	/*
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@RequestParam("userName") String userName, 
							 @RequestParam("email") String userEmail, 
							 @RequestParam("userPassword") String userPassword, 
							 
							 Model model
							 ) {
	*/
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@RequestParam("userName") String userName, 
							 @RequestParam(name="email", required=true) String userEmail, 
							 @RequestParam("userPassword") String userPassword, 
							 
							 Model model
							 ) {	
		System.out.println("Name entered is ..... : " + userName);
		System.out.println("Email entered is ..... : " + userEmail);
		System.out.println("Password entered is ..... : " + userPassword);
		
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		
		return "success";
	}

}
