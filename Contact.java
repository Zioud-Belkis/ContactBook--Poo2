package poo2;

public abstract class Contact {

	    public String name;
	    public String phoneNumber;
	    public String email;

	    public Contact(String name, String phoneNumber, String email) {
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	    }

	    public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public void displayDetails() {
           System.out.println(this.toString());
	    }
	    
	    public String toString() {
	    	   return "Name :" + name + "\n Number phone :" + phoneNumber + "\nEmail :" + email;
	       }
	    public abstract Contact copy();
	    
       }