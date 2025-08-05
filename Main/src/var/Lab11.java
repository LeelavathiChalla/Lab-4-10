package var;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Lab11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = scanner.nextLine();
        LocalDate enteredDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();
        Period period;
        if (enteredDate.isBefore(currentDate)) {
            period = Period.between(enteredDate, currentDate);
        } else {
            period = Period.between(currentDate, enteredDate);
        }
        System.out.println("Duration:");
        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());

        scanner.close();
    }
}

