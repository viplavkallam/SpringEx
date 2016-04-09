package com.mkyong.web.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.viplav.form.Login;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(Map<String, Object> model) {
		Login loginForm = new Login();
		model.put("loginForm", loginForm);
//		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "login";

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Valid @ModelAttribute("loginForm") Login login,BindingResult result,ModelMap model) {
		if(result.hasErrors()){
			return "login";
		}
		model.addAttribute("message", "Welcome To Board");
		return "loginsuccess";

	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.POST)
	public ModelAndView hello(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;

	}

}