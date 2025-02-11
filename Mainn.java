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
		 System.out.println("******************************************");
		 
		 System.out.println("");
		 System.out.print("Your choice: ");
	     int x=ch.nextInt();
		 System.out.println("");
	     
	      
		switch(x) {
	     
	     case 1:
	    	  System.out.println("choose the type of the contact that you want to add");
	    	  System.out.println("1.Business");
	    	  System.out.println("2.Personal");
			  System.err.print("Your choice: ");
	    	  int y =ch.nextInt();
	    	  ch.nextLine();
			  System.err.println("");
	    	  
	    	  if(y==1) {
				System.out.println("enter your name"); 
				name = ch.nextLine();
				System.err.println("");
				System.out.println("enter your number phone"); 
				phoneNumber = ch.nextLine();
				System.err.println("");
				System.out.println("enter your email"); 
				email = ch.nextLine();
				System.err.println("");
				System.out.println("enter your Company name");
				String CompanyName = ch.nextLine();
				System.err.println("");
				System.out.println("enter your job title"); 
				String JobTitle = ch.nextLine();
				System.err.println("");				
				contactBook.add(new BusinessContact(name, phoneNumber, email, CompanyName, JobTitle));
				
	    	 }else if(y == 2){
				System.err.println("");
	   		  System.out.println("enter your name"); 
	          name = ch.nextLine();
			  System.err.println("");
	          System.out.println("enter your number phone"); 
	          phoneNumber = ch.nextLine();
			  System.err.println("");
	          System.out.println("enter your email"); 
	          email = ch.nextLine();
			  System.err.println("");
	          System.out.println("enter your relationship"); 
	          String Relationship = ch.nextLine();
			  System.err.println("");
				contactBook.add(new PersonalContact(name,phoneNumber,email,Relationship));
	    	 }else{
				System.out.println("The option that you choosed isn't available");
			 }
	    	break;
	   
	     case 2:
              if(ContactBook.isEmpty()) {
            	  System.out.println("The contact book is empty");
              }else {
				System.err.println("");
            	  System.out.println("Enter the name of the contact that you want to remove");
            	  ch.nextLine();
            	  name = ch.nextLine();
				  System.err.println("");
            	  if(contactBook.remove(name)) {
            		  System.out.println("contact removed");
					  System.err.println("");
            	  }else {
            		  System.out.println("not found");
					  System.err.println("");
            	  }
              }
	    	 break;
	    	 
	     case 3:
	         if(ContactBook.isEmpty()) {
           	  System.out.println("Empty");
				 System.err.println("");
             }else {
              System.out.println("Enter the name to search :");
              ch.nextLine();
			  System.err.println("");
              name = ch.nextLine();
              Contact found = contactBook.search(name);
              if(found != null) {
            	  found.displayDetails();
              }else {
            	  System.out.println("The contact that you search on exist");
              }
             }
	    	 break;
	    	 
	     case 4:
	    	 if(ContactBook.isEmpty()) {
	           	  System.out.println("The contact book is empty");
					 System.err.println("");
	             }else {
					System.err.println("Contacts list: ");
	            	 contactBook.displayAllContacts();
	             }
	    	 break;
	    	 
	     case 5:
	         System.out.println("The program is terminated");
	         run=0;
	     break;
	     
	   }
    }
  }
}
