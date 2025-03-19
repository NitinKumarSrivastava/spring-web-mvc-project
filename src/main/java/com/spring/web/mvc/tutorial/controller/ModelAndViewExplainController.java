package com.spring.web.mvc.tutorial.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewExplainController {

	
	@RequestMapping("/help")
	public ModelAndView home(Model model) {
		
		System.out.println("This is Help Controller called by ModelAndViewExplainController class.");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "Uttam");
		mav.addObject("rollnumber", 123414);
		
		LocalDateTime nowTime = LocalDateTime.now();
		mav.addObject("time", nowTime);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(2134);
		list.add(2345);
		
		mav.addObject("marks", list);
		
		mav.setViewName("help");
		
		return mav;
	}
	

}
