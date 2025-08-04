package myvar;
import java.util.Scanner;

public class Lab9_1 {
    public static String lab9_1(String input) {
        return input + input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = lab9_1(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
