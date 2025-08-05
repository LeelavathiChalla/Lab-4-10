package var;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab_15 {
    public static int calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        if (dob != null && !dob.isAfter(currentDate)) {
            return Period.between(dob, currentDate).getYears();
        } else {
            return -1; 
        }
    }
    public static String getFullName(String firstName, String lastName) {
        return firstName.trim() + " " + lastName.trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter Date of Birth (YYYY-MM-DD):");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);
        String fullName = getFullName(firstName, lastName);
        int age = calculateAge(dob);
        System.out.println("\n--- Person Details ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age + " years");

        scanner.close();
    }
}

