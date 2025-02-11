package poo2;

public abstract class Contact {

	    protected  String name;
	    protected  String phoneNumber;
	    protected  String email;

	    public Contact(String name, String phoneNumber, String email) {
	        this.name = name;
	        this.phoneNumber = phoneNumber;
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