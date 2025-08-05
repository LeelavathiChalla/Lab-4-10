package var;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Lab_14 {
    public static void lab_14(String zoneIdStr) {
        try {
            ZoneId zoneId = ZoneId.of(zoneIdStr);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

            System.out.println("Current date and time in " + zoneId + ":");
            System.out.println(zonedDateTime.toLocalDate() + " " + zonedDateTime.toLocalTime());
        } catch (Exception e) {
            System.out.println("Invalid Zone ID. Please provide a valid zone like 'America/New_York', 'Asia/Tokyo', etc.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Zone ID (e.g., America/New_York, Asia/Tokyo, Europe/London):");
        String zoneId = scanner.nextLine();
        lab_14(zoneId);
        scanner.close();
    }
}

