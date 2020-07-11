package core_java_c_examples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.lwl.cbook.Contact;
import com.lwl.cbook.ContactAlreadyExistsException;
import com.lwl.cbook.ContactService;
import com.lwl.cbook.ContactServiceImpl;


class ContactServiceImplTest {

	private ContactService contactService;

	@Test
	public void addContactTest() throws ContactAlreadyExistsException {
		contactService = new ContactServiceImpl();
		Contact c1 = new Contact("Shiva", "shiva@gmail.com", "7654567890");
		Contact c2 = new Contact("Raj", "raj@gmail.com", "7654567891");
		Contact c3 = new Contact("Mani", "mani@gmail.com", "7654567892");
		Contact c4 = new Contact("John", "john@gmail.com", "7654567893");

		contactService.addContact(c1);
		contactService.addContact(c2);
		contactService.addContact(c3);
		contactService.addContact(c4);
		int size = contactService.getAllContacts().length;
		assertEquals(4, size);

	}
	
	@Test
	public void addContactWithDuplicateNumberTest() throws ContactAlreadyExistsException {
		contactService = new ContactServiceImpl();
		Contact c1 = new Contact("Shiva", "shiva@gmail.com", "7654567890");
		Contact c2 = new Contact("Shiva", "shiva@gmail.com", "7654567890");
		contactService.addContact(c1);
		assertThrows(ContactAlreadyExistsException.class,()-> contactService.addContact(c2));
		
	}
	
	@Test
	public void addContactWithNullObject() {
		contactService = new ContactServiceImpl();
		assertThrows(IllegalArgumentException.class,()-> contactService.addContact(null));

	}
	@Test
	public void addContactWithEmptyFieldsObject() {
		contactService = new ContactServiceImpl();
		Contact contact = new Contact();
		assertThrows(IllegalArgumentException.class,()-> contactService.addContact(contact));

	}
	
	@Test
	public void addContactWithValidDetails() throws ContactAlreadyExistsException {
		contactService = new ContactServiceImpl();
		Contact contact = new Contact("Shiva", "shiva@gmail.com", "7654567890");
		contact = contactService.addContact(contact);
		assertNotEquals(0, contact.getCid());
	}
	
	@Test
	public void getAllContacts() throws ContactAlreadyExistsException {
		contactService = new ContactServiceImpl();
		Contact c1 = new Contact("Shiva", "shiva@gmail.com", "7654567890");
		Contact c2 = new Contact("Raj", "raj@gmail.com", "7654567891");
		c1 = contactService.addContact(c1);
		c2 = contactService.addContact(c2);
		
		System.out.println("Contact-1 Id:"+c1.getCid());
		System.out.println("Contact-2 Id:"+c2.getCid());
		
		Contact[] arr = contactService.getAllContacts();
		for(Contact c:arr) {
			System.out.println(c);
		}
		
		assertEquals(2, arr.length);
	}
	@Test
	public void getContactCountTest()throws ContactAlreadyExistsException {
		contactService = new ContactServiceImpl();
		Contact c1 = new Contact("Shiva", "shiva@gmail.com", "7654567890");
		Contact c2 = new Contact("Raj", "raj@gmail.com", "7654567891");
		c1 = contactService.addContact(c1);
		c2 = contactService.addContact(c2);
		assertEquals(2, contactService.size());
	}

}
