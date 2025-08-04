package var;
import java.util.Scanner;
public class Lab7 {
    private String firstName;
    private String lastName;
    private char gender;
    private String phoneNumber;
    public Lab7(String firstName, String lastName, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
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
        System.out.print("Enter phone number: ");
        phoneNumber = scanner.nextLine();
        }
public void display() {
        System.out.println("---- Person Details ----");
        System.out.println("First Name   : " + getFirstName());
        System.out.println("Last Name    : " + getLastName());
        System.out.println("Gender       : " + getGender());
        System.out.println("Phone Number : " + getPhoneNumber());
}
public static void main(String[] args) {
        Lab7 p = new Lab7("challa", "Leela", 'f');
        p.acceptDetails();
        p.display();
    }
}

