package poo2;

import java.util.Scanner;

public class Mainn {

	public static void main(String[] args) {

		Scanner ch = new Scanner(System.in);
        ContactBook contactBook = new ContactBook("belkis");

        String name; String phoneNumber; String email;
        
        int run=1;
		while(run==1) {
		System.err.println("");
		 System.out.println("***************** MENU *****************");
		 System.err.println("Please choose one of the available operations");
		 System.out.println("1.Add Contact");
		 System.out.println("2.Remove Contact");
		 System.out.println("3.Search a contact");
		 System.out.println("4.Display all the contact in the contact book");
		 System.out.println("5.Exit the program");
		 
	     int x=ch.nextInt();
	     
	      
		switch(x) {
	     
	     case 1:
	    	  System.out.println("choose");
	    	  System.out.println("1.Business");
	    	  System.out.println("2.Personal");
	    	 
	    	  int y =ch.nextInt();
	    	  ch.nextLine();
	    	  
	    	  if(y==1) {
				System.out.println("enter your name"); 
				name = ch.nextLine();
				System.out.println("enter your number phone"); 
				phoneNumber = ch.nextLine();
				System.out.println("enter your email"); 
				email = ch.nextLine();
				System.out.println("enter your Company name");
				String CompanyName = ch.nextLine();
				System.out.println("enter your job title"); 
				String JobTitle = ch.nextLine();
				
				contactBook.add(new BusinessContact(name, phoneNumber, email, CompanyName, JobTitle));
				
	    	 }else if(y == 2){
	   		  System.out.println("enter your name"); 
	          name = ch.nextLine();
	          System.out.println("enter your number phone"); 
	          phoneNumber = ch.nextLine();
	          System.out.println("enter your email"); 
	          email = ch.nextLine();
	          System.out.println("enter your relationship"); 
	          String Relationship = ch.nextLine();
	          
				contactBook.add(new PersonalContact(name,phoneNumber,email,Relationship));
	    	 }else{
				System.out.println("The option that you choosed isn't available");
			 }
	    	break;
	   
	     case 2:
              if(ContactBook.isEmpty()) {
            	  System.out.println("Empty");
              }else {
            	  System.out.println("Enter the name to remove :");
            	  ch.nextLine();
            	  name = ch.nextLine();
            	  if(contactBook.remove(name)) {
            		  System.out.println("contact removed");
            	  }else {
            		  System.out.println("not found");
            	  }
              }
	    	 break;
	    	 
	     case 3:
	         if(ContactBook.isEmpty()) {
           	  System.out.println("Empty");
             }else {
              System.out.println("Enter the name to search :");
              ch.nextLine();
              name = ch.nextLine();
              Contact found = contactBook.search(name);
              if(found != null) {
            	  found.displayDetails();
              }else {
            	  System.out.println("not found");
              }
             }
	    	 break;
	    	 
	     case 4:
	    	 if(ContactBook.isEmpty()) {
	           	  System.out.println("Empty");
	             }else {
	            	 contactBook.displayAllContacts();
	             }
	    	 break;
	    	 
	     case 5:
	         System.out.println("Exiiit.");
	         run=0;
	     break;
	     
	   }
    }
  }
}
