package com.synotech.OnlineAppointmentScheduling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.synotech.OnlineAppointmentScheduling.dao.UserRepo;

@Controller
public class UserController {
	
	@Autowired
	UserRepo repo;
	@RequestMapping("home")
	public ModelAndViewContainer home() {
		
		ModelAndViewContainer mv = new ModelAndViewContainer();
		return mv;
		
	}
	
}
