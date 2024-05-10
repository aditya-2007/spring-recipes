package com.aditya.spring6practice.court.web;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    
    @GetMapping
    public String welcome(Model model) {
	model.addAttribute("today", LocalDate.now());
	return "/WEB-INF/jsp/welcome.jsap";
    }
}
