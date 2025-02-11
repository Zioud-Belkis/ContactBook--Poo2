package poo2;

public class PersonalContact extends Contact {

	    private String relationship;

	    public PersonalContact(String name, String phoneNumber, String email, String relationship) {
	        super(name, phoneNumber, email);
	        this.relationship = relationship;
	    }

		public void displayDetails() {
			System.out.println("Category: Business Contact");
			System.out.println("Name: " + this.name);
			System.out.println("Phone Number: " + this.phoneNumber);
			System.err.println("Relationship: " + this.relationship);
			System.err.println("");
	    }

	    public Contact copy() {
	        return new PersonalContact(name, phoneNumber, email, relationship);
	    }
	
	}

