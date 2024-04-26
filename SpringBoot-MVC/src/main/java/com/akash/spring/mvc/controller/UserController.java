package com.akash.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akash.spring.mvc.entity.User;
import com.akash.spring.mvc.service.UserManagementService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {

	@Autowired
	UserManagementService userManagementService;
	
	@GetMapping("/home")
	public ModelAndView openHomePage() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		
		return modelAndView;
	}
	
	@GetMapping(value = "/action")
	public ModelAndView openRegisterForm() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		
		return modelAndView;
	}
	
	@PostMapping("db/register")
	public ModelAndView registerUser(HttpServletRequest request) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		long contact = Long.parseLong(request.getParameter("contact"));
		
		String response = userManagementService.createUser(name, email, pass, contact);
		modelAndView.setViewName("result");
		
		modelAndView.addObject("result", response+" : "+email);
		
		return modelAndView;
	}
	
	@GetMapping(value = "/login")
	public ModelAndView openLoginForm() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		
		return modelAndView;
	}
	
	@PostMapping(value = "/dblogin")
	public ModelAndView userLogin(HttpServletRequest request) {
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		User user = userManagementService.userLogin(email, pass);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("result");
		if(user==null)
			modelAndView.addObject("result", "Invalid login credential...");
		else
			modelAndView.addObject("result", "Welcome user: "+user.getName());
		
		return modelAndView;
	}
}
