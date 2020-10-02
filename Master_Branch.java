package objectOriented;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook6 {
	private ArrayList<ContactDetails> contactArrayList;
	private Map<String, ContactDetails> nameToContactDetailsMap;
	private AddressBook6() {
		contactArrayList = new ArrayList<>(); //using ArrayList in place of array
		nameToContactDetailsMap = new HashMap<>();
	}
	
	private void addContactDetails(String firstName, String lastName, String address, String state, int zip, long phoneNo, String emailId) {
		ContactDetails contactDetail = new ContactDetails();
		contactDetail.setContactDetails(firstName, lastName, address, state, zip, phoneNo, emailId);
		contactArrayList.add(contactDetail);
		nameToContactDetailsMap.put(firstName.concat(" " + lastName), contactDetail);
	}
	
	private void editContactDetails(String firstName, String lastName, String address, String state, int zip, long phoneNo, String emailId) {
		for(int i = 0; i < contactArrayList.size(); i++) {
			ContactDetails contactDetail = contactArrayList.get(i);
			if(contactDetail.getFirstName().equals(firstName) && contactDetail.getLastName().equals(lastName)) {
				contactDetail.setContactDetails(firstName, lastName, address, state, zip, phoneNo, emailId);
				contactArrayList.set(i, contactDetail);
				System.out.println("Address changed");
				System.out.println(contactArrayList.get(i));
				break;
			}
		}
	}
	
	private void deleteContactDetails(String firstName, String lastName) {
		for(int i = 0; i < contactArrayList.size(); i++) {
			ContactDetails contactDetail = contactArrayList.get(i);
			if(contactDetail.getFirstName().equals(firstName) && contactDetail.getLastName().equals(lastName)) {
				contactArrayList.remove(i);
				System.out.println("Contact deleted");
				break;
			}
		} 
	}
	
	private void viewContactDetails(String name) {
		ContactDetails contactObj =  nameToContactDetailsMap.get(name);
		System.out.println(contactObj);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook6 addressBook = new AddressBook6();
		System.out.println("No. of contact details to enter: ");
		int numOfContact = sc.nextInt();
		sc.nextLine();
		//adding
		for(int i = 0; i < numOfContact; i++) {
			System.out.println("First Name: ");
			String firstName = sc.nextLine();
			System.out.println("Last Name: ");
			String lastName = sc.nextLine();
			System.out.println("Address: ");
			String address = sc.nextLine();
			System.out.println("State: ");
			String state = sc.nextLine();
			System.out.println("ZIP: " );
			int zip = sc.nextInt();
			System.out.println("Phone No: ");
			long phoneNo = sc.nextLong();
			sc.nextLine();
			System.out.println("Email ID: ");
			String emailId = sc.nextLine();
			addressBook.addContactDetails(firstName, lastName, address, state, zip, phoneNo, emailId);
		}
		
		//editing
		System.out.println("Enter details for contact record you want to edit");
		System.out.println("First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Address: ");
		String address = sc.nextLine();
		System.out.println("State: ");
		String state = sc.nextLine();
		System.out.println("ZIP: " );
		int zip = sc.nextInt();
		System.out.println("Phone No: ");
		long phoneNo = sc.nextLong();
		sc.nextLine();
		System.out.println("Email ID: ");
		String emailId = sc.nextLine();
		addressBook.editContactDetails(firstName, lastName, address, state, zip, phoneNo, emailId);
		
		//deleting
		System.out.println("Enter first name of contact to be deleted: ");
		firstName = sc.nextLine();
		System.out.println("Enter last name of contact to be deleted: ");
		lastName = sc.nextLine();
		addressBook.deleteContactDetails(firstName, lastName);		
		
		//printing by calling key of HashMap
		System.out.println("Enter name of person you want to print contant details of: ");
		String name = sc.nextLine();
		addressBook.viewContactDetails(name);
	}
}



