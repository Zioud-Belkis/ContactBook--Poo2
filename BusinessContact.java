package poo2;

public class BusinessContact extends Contact {

	    private String companyName;
	    private String jobTitle;

	    public BusinessContact(String name, String phoneNumber, String email, String companyName, String jobTitle) {
	        super(name, phoneNumber, email);
	        this.companyName = companyName;
	        this.jobTitle = jobTitle;
	    }

	    public String getCompanyName() {
			return companyName;
		}


		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}


		public String getJobTitle() {
			return jobTitle;
		}


		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}


		public void displayDetails() {
	        System.out.println("*****Business Contact: \n" +"Name:" + name + "\nPhone number:" + phoneNumber +"\nEmail: "+ email + "\nCompany: " + companyName + "\nJob Title: " + jobTitle);
	    }

	    public Contact copy() {
	        return new BusinessContact(name, phoneNumber, email, companyName, jobTitle);
	    }
	}

