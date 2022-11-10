package com.zohocrm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.service.ContactService;
import com.zohocrm.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/viewCreateLeadPage")
	public String viewCreateLeadPage() {
		return "create_new_lead";
	}
	
	@PostMapping("/save")
	public String saveLead(@Valid @ModelAttribute("lead") Lead lead, ModelMap model, BindingResult result) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@PostMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		
		
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveContact(contact);
		
		
		leadService.deleteById(id);
		List<Contact> contacts = contactService.findAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	
	@RequestMapping("/listAllLeads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	
	@RequestMapping("/toGetNewPage")
	public String toGetNewPage(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
}
