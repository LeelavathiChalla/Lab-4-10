package myvar;

import java.util.Scanner;

public class Lab9_2 {
    public static String lab9_2(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) { 
                result.append('#');
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = lab9_2(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
