package com.example.HelloWorld.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@GetMapping(value="/A")
	
	public String get()
	{
		return("Hello World");
	}

}
