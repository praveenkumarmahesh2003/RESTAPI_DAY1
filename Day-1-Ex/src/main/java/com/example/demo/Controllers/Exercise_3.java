package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_3 {
	@Value("${vari}")
	
	private String color;
	@GetMapping("/disp3")
	
	public String getMyFav()
	{
		return "My Favoourite Colour is "+color;
	}
}
