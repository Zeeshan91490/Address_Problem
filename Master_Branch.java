package objectOriented;

public class Address {

	
	private String firstName;
	private String lastName;
	private String address; 
	private String state;
	private int zip;
	private long phoneNo;
	private String emailId;
	
	public Address(String firstName, String lastName, String address, String state, int zip, long phoneNo, String emailId) { 
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + " Address: " + address +"State:"+ state +"zip:"+ zip+",Phone no:"+ phoneNo +",Email id:"+ emailId;
	}
	
	public static void main(String[] args) {
	Address contact = new Address("Zeeshan", "Khan,", "EPIP, Bengaluru,", "Karnataka,", 123456, 123456789 , "zeeshankhan@gmail.com");
		System.out.println(contact);
	}
}


