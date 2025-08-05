package var;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab_13 {
    public static LocalDate lab_13(LocalDate purchaseDate, int warrantyYears, int warrantyMonths) {
        return purchaseDate.plusYears(warrantyYears).plusMonths(warrantyMonths);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the purchase date (YYYY-MM-DD):");
        LocalDate purchaseDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter warranty period in years:");
        int years = scanner.nextInt();
        System.out.println("Enter warranty period in months:");
        int months = scanner.nextInt();
        LocalDate expiryDate = lab_13(purchaseDate, years, months);
        System.out.println("Warranty expires on: " + expiryDate);
        scanner.close();
    }
}

