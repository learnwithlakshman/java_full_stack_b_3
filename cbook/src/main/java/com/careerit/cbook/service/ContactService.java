package com.careerit.cbook.service;

import java.util.List;

import com.careerit.cbook.domain.Contact;

public interface ContactService {

	public Contact addContact(Contact contact);

	public List<Contact> getContacts();

	public Contact modifyContact(Contact contact);

	public List<Contact> search(String str);

	public Contact getById(int id);

	public boolean removeContact(String id);
}
