package com.crunchify.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class bnhpblmxHelloWorld {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Bank Hapoalim Bluemix lab 1 Tutorial</h3>This message is coming from bnhpblmxHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
