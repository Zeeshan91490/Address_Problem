package objectOriented;

public class ContactDetails{
	
		//data members
		private String firstName;
		private String lastName;
		private String address; //address components don't have to be used so declaring as string rather than string array
		private String state;
		private int zip;
		private long phoneNo;
		private String emailId;
		
		public ContactDetails (String firstName, String lastName, String address, String state, int zip, long phoneNo, String emailId) { 
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.address = address;
			this.state = state;
			this.zip = zip;
			this.phoneNo = phoneNo;
			this.emailId = emailId;
		}
		
		public ContactDetails() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Name: " + getFirstName() + " " + getLastName() + " Address: " + address;
		}
		
		public static void main(String[] args) {
			ContactDetails contact = new ContactDetails("Zeeshan", "Khan", "EPIP, Bengaluru", "Karnataka", 123456, 1234567891, "xyz@gmail.com");
			System.out.println(contact);
		}

		public void setContactDetails(String firstName2, String lastName2, String address2, String state2, int zip2,
				long phoneNo2, String emailId2) {
			// TODO Auto-generated method stub
			
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
	
}
