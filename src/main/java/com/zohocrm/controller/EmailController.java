package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Email;
import com.zohocrm.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendEmail")
	public String getEmail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	
	@PostMapping("/triggerEmail")
	public String triggerEmail(Email email, ModelMap model) {
		emailService.sendSimpleMail(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("msg", "Email Sent!!");
		return "compose_email";
	}
}
