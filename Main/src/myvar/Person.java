package myvar;
import java.util.Scanner;
public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	private String phoneNumber;
	enum Gender{
		f,m;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void acceptDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		phoneNumber = scanner.nextLine();
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setFirstName("Leela");
		p.setLastName("Challa");
		p.setGender('F');
		p.acceptDetails();
		Gender g = Gender.f;
		
		
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getGender());
		System.out.println(p.getPhoneNumber());
		System.out.println(g);
		
		

	}

}
