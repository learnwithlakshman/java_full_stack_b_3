package com.careerit.cbook.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.service.ContactService;

@RestController
@RequestMapping("/api/v1/cbook/")
public class CbookController {

	@Autowired
	private ContactService contactService;

	@GetMapping("index")
	public String index() {
		return "Welcome to Contact Book App";
	}
	
	@GetMapping("all")
	public List<Contact> getContacts() {
			return contactService.getContacts();
	}
	
	@PostMapping("new")
	public Contact addContact(@RequestBody Contact contact) {
		return contactService.addContact(contact);
	}
	
	@PutMapping("modify")
	public Contact modifyContact(@RequestBody Contact contact) {
		return contactService.addContact(contact);
	}
	
	
	@DeleteMapping("remove/{cid}")
	public String removContact(@PathVariable("cid")String id) {
		boolean isDeleted = contactService.removeContact(id);
		return isDeleted ? "Contact deleted successfully":"Contact is not found with id :"+id;
	}
	
}
