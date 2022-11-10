package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {

	void saveContact(Contact contact);
	List<Contact> findAllContacts();
	Contact findContactsById(long id);

}
