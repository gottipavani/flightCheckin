package com.flightChenkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {
	
	@RequestMapping("/showCheckIn")
	public String showCheckIn()
	{
		return "showCheckIn";
	}
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("id")Long id)
	{
		System.out.println(id);
		return "";
	}

}
