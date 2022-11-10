package com.zohocrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.service.ContactService;

@Controller
public class BillingController {
	
	private ContactService contactService;
	
	public BillingController(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@RequestMapping("/billingContact")
	public String getBillingPage(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.findContactsById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
}
