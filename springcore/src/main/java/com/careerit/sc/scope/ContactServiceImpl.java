package com.careerit.sc.scope;

import java.util.List;


public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao;


	public ContactServiceImpl(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public List<String> getContactNames() {
		return contactDao.getContactNames();
	}

}
