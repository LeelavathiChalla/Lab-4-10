package myvar;

import java.util.Scanner;

public class Lab9_4{
    public static String lab9_4(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (i % 2 == 0) { // Odd position (1-based)
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = lab9_4(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
