package com.lwl.cbook;

public class ContactServiceImpl implements ContactService {

	private Contact[] arr;

	private int count = 0;

	public ContactServiceImpl() {
		arr = new Contact[3];
	}

	@Override
	public Contact addContact(Contact contact) throws ContactAlreadyExistsException {
		
		if(contact==null || contact.getMobile() == null || contact.getName() == null) {
			throw new IllegalArgumentException("Contact can't be added with empty fields mobile,name");
		}
		
		if(indexOf(contact.getMobile())!=-1) {
			throw new ContactAlreadyExistsException("Contact with mobile number: "+contact.getMobile()+" already exists");
		}
		
		if (count == arr.length) {
			Contact[] temp = new Contact[arr.length + 3];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}

		contact.setCid(IdGenerator.getNewId());
		arr[count++] = contact;

		return contact;
	}

	@Override
	public Contact[] getAllContacts() {
		Contact[] carr = new Contact[count];
		System.arraycopy(arr, 0, carr, 0, count);
		return carr;
	}

	@Override
	public boolean deleteContact(int cid) throws ContactNotFoundException {
		int index = indexOf(cid);
		if(index != -1) {
			if(index == 0) {
				Contact[] t=new Contact[arr.length-1];
				System.arraycopy(arr, index+1, t, 0, arr.length-1);
				arr = t;
			}else {
				
			}
		}
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
	
	private int indexOf(int cid) {
		if (count != 0) {
			for (int i = 0; i < count; i++) {
				if (arr[i].getCid()==cid) {
					return i;
				}
			}
		}
		return -1;
	}

	private int indexOf(String mobile) {
		if (count != 0) {
			for (int i = 0; i < count; i++) {
				if (arr[i].getMobile().equals(mobile)) {
					return i;
				}
			}
		}
		return -1;
	}

}
