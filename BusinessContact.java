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
			System.out.println("Name: " + this.name);
			System.out.println("Phone Number: " + this.phoneNumber);
			System.out.println("Email: " + this.email);
			System.out.println("Company Name: " + this.companyName);
			System.err.println("Job Title: " + this.jobTitle);
			System.err.println("");
	    }

	    public Contact copy() {
	        return new BusinessContact(name, phoneNumber, email, companyName, jobTitle);
	    }
	}

