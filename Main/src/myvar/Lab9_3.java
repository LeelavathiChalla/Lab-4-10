package myvar;

import java.util.Scanner;

public class Lab9_3 {
    public static String lab9_3(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = lab9_3(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
