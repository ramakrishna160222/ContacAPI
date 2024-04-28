package com.krishna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.model.Contact;
import com.krishna.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts(){
		return contactService.getAllContacts();
	}
	
	@GetMapping("/contacts/{name}")
	public Contact getContactByName(@PathVariable("name") String name) {
		return contactService.getContactByName(name);
	}
	
	@GetMapping("/contacts/mobile/{mobile}")
	public Contact getContactByMobile(@PathVariable("mobile") Long mobile) {
		return contactService.getContactByMobile(mobile);
	}
	
	@PostMapping("/contacts")
	public void addContact(@RequestBody Contact contact) {
		Contact c=contactService.getContactByMobile(contact.getMobile());
		
		if(c != null) {
			System.out.println("failed");
		 
		}else {
			contactService.addContact(contact);
		}
	}
	
	@PutMapping("/contacts")
	public void updateContact(@RequestBody Contact contact) {
		 contactService.updateContact(contact);
	}

}
