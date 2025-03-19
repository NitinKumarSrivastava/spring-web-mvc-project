package com.spring.web.mvc.tutorial.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HomeControllerTest {
	
	@Test
	public void testHome() {
		
		HomeController homeController = new HomeController();
		
		String returnedPage = homeController.home();
		
		assertEquals("index", returnedPage);
		
	}

}
