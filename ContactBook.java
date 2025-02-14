package poo2;

import java.util.ArrayList;
import java.util.List;

public class ContactBook implements Manageable {

	    private String ownerName;
	    private List<Contact> contacts;

	    public ContactBook(String ownerName) {
	        this.ownerName = ownerName;
	        this.contacts = new ArrayList<>();
	    }

	    public void add(Contact contact) {
	        contacts.add(contact);
	    }
	    
	    public boolean remove(String name) {
	        Contact contact = search(name);
	        if (contact != null) {
	            contacts.remove(contact);
	            return true;
	        }
	        return false;
	    }
	    
	    public Contact search(String name) {
	        for (Contact contact : contacts) {
	            if (contact.name.equals(name)) {
	                return contact;
	            }
	        }
	        return null;
	    }

	    public boolean shareContact(String name, ContactBook targetContactBook) {
	        Contact contact = search(name);
	        if (contact != null) {
	            targetContactBook.add(contact.copy());
	            return true;
	        }
	        return false;
	    }

	    public void displayAllContacts() {
		    int nb=1;
	          System.out.println("Contact Book:");
	     for (Contact contact : contacts) {
	          System.out.println(nb + "-");
	              contact.displayDetails();
			    nb++;
	        }
          }

		public static boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
	    }
	
