package com.example.SpringbootJSPconnection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/A")
	
	public ModelAndView ViewFirstPage()
	
	 {
		return new ModelAndView ("Home");
	 }

	
	}

