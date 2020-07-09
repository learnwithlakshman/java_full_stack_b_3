package com.lwl.cbook;

public interface ContactService {

		
		public Contact addContact(Contact contact)throws ContactAlreadyExistsException;
		public Contact[] getAllContacts();
		public boolean deleteContact(int cid)throws ContactNotFoundException;
		public Contact updateContact(Contact contact);
		public Contact getContactById(int cid)throws ContactNotFoundException;
		public Contact[] search(String str);
}
