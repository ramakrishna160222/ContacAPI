package com.krishna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.model.Contact;
import com.krishna.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}

	public Contact getContactByName(String name) {
		return contactRepository.findByName(name);
		
	}

	public Contact getContactByMobile(Long mobile) {
		 return contactRepository.findByMobile(mobile);
	}

	public void addContact(Contact contact) {
			contactRepository.save(contact);
	}

	public void updateContact(Contact contact) {
		Contact c=contactRepository.findByMobile(contact.getMobile());
		//c.setId(contact.getId());
		c.setImageUrl(contact.getImageUrl());
		c.setMobile(contact.getMobile());
		c.setName(contact.getName());
		contactRepository.save(c);
		
	}

}
