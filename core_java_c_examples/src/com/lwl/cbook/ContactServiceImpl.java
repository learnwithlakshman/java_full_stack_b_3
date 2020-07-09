package com.lwl.cbook;

public class ContactServiceImpl implements ContactService {

	private Contact[] contacts;

	public ContactServiceImpl() {
		contacts = new Contact[10];
	}

	@Override
	public Contact addContact(Contact contact) throws ContactAlreadyExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact[] getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(int cid) throws ContactNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(int cid) throws ContactNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact[] search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
