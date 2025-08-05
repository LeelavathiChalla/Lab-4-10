package var;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab_12 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first date (YYYY-MM-DD):");
        LocalDate firstDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter the second date (YYYY-MM-DD):");
        LocalDate secondDate = LocalDate.parse(scanner.nextLine());
        Period period = Period.between(firstDate, secondDate);
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println("\nDuration between the two dates:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        scanner.close();
    }
}

