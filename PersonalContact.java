package poo2;

public class PersonalContact extends Contact {

	    private String relationship;

	    public PersonalContact(String name, String phoneNumber, String email, String relationship) {
	        super(name, phoneNumber, email);
	        this.relationship = relationship;
	    }

	    public String getRelationship() {
			return relationship;
		}


		public void setRelationship(String relationship) {
			this.relationship = relationship;
		}


		public void displayDetails() {
	        System.out.println("*****Personal Contact: \n" +"Name:" + name + "\nPhone number:" + phoneNumber +"\nEmail: "+ email +  "\nRelationship: " + relationship);
	    }

	    public Contact copy() {
	        return new PersonalContact(name, phoneNumber, email, relationship);
	    }
	
	}

