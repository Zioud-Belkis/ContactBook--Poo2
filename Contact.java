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

		public abstract void displayDetails();

	    public abstract Contact copy();
       }