package com.example.springbootmodelprogram.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootmodelprogram.model.Modelpage;

@RestController
public class Maincontroller {
	
	@RequestMapping("/Home")
	
	public ModelAndView ViewModelpagePage()
	{
		Modelpage mp1=new Modelpage("SpringBoot");
		Modelpage mp2=new Modelpage("Java");
		
		List<Modelpage> t=new ArrayList<>();
		t.add(mp1);
		t.add(mp2);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("Home",t);
		mv.setViewName("Home");
		
		return mv;
		
	}

}
