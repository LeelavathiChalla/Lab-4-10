package myvar;

import java.util.Scanner;

public class Atm_Project {
	
	private double balance;
	private Scanner scanner;
	
	public Atm_Project() {
		balance = 1000.0;
		scanner = new Scanner(System.in);
		
		
	}
	public void displayMenu() {
		System.out.println("ATM menu");
		System.out.println("check Balance");
		System.out.println("Money Deposit");
		System.out.println("ATM withdraw");
		System.out.println("EXIT");
	}
	public void checkBalance() {
		System.out.println("Your Balance is :"+ balance);
		
	}
	public void deposit() {
		System.out.println("Enter the amount : $");
		double amount = scanner.nextDouble();
		if(amount<=0) {
			balance += amount;
			System.out.println("$"+ amount + "has been deposited" );
			
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	public void withdraw() {
		System.out.println("Eneter the amount to withdraw");
		double amount = scanner.nextDouble();
		if(amount>0 && amount<=balance) {
			balance -= amount;
			System.out.println("$" +  amount + "Has been withdrawal");
		}
		else if(amount > balance){
			System.out.println("insufficient funds"+ balance);
			
		}
		else {
			System.out.println("Invalid amount");
		}
			
		
	}	
	public static void main(String[] args) {
	
		Atm_Project atm = new Atm_Project();
		while(true) {
			atm.displayMenu();
			System.out.println("Enter your choice :");
			int choice = atm.scanner.nextInt();
			
			switch(choice) {
			case 1:
				atm.checkBalance();
			case 2: 
				atm.deposit();
			case 3:
				atm.withdraw();
			case 4: 
				System.out.println("Thank u for ucing ATm. byeee");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		// TODO Auto-generated method stub

	}

}
