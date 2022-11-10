package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	void saveOneLead(Lead lead);
	Lead findLeadById(long id);
	void deleteById(long id);
	List<Lead> findAllLeads();

}
