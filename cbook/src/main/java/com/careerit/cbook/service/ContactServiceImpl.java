package com.careerit.cbook.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {

	private Logger log = LoggerFactory.getLogger(ContactServiceImpl.class);

	@Autowired
	private ContactRepo contactRepo;

	@Override
	public Contact addContact(Contact contact) {
		Assert.notNull(contact, "Contact object can't be null");
		Assert.notNull(contact.getName(), "Name can't be empty or null");
		Assert.notNull(contact.getMobile(), "Mobile number can't be empty or null");

		Contact savedContact = contactRepo.save(contact);
		log.info("Contact is saved with id:{}", contact.getId());
		
		return savedContact;
	}

	@Override
	public List<Contact> getContacts() {
		List<Contact> list = contactRepo.findAll();
		log.info("Total contact found :{}", list.size());
		return list;
	}

	@Override
	public Contact modifyContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeContact(String id) {
		Assert.notNull(id, "Contact id can't be null or empty");
		 Optional<Contact> c = contactRepo.findById(id);
		if(c.isPresent()) {
			contactRepo.deleteById(id);
			log.info("Contact with id : {} is deleted successfully",id );
			return true;
		}
		log.info("Contact with id : {} is not found",id);
		return false;
	}

}
