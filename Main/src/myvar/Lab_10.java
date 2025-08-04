package myvar;

import java.util.Scanner;

public class Lab_10 {
	public static boolean lab_10(String input) {
        input = input.toUpperCase(); 
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) >= input.charAt(i + 1)) {
            	return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        if (lab_10(userInput)) {
            System.out.println("The string is a positive string.");
        } else {
            System.out.println("The string is NOT a positive string.");
        }

        scanner.close();
    }
}
