package var;

public class Account {
	private static long accCounter = 1001;
	private long accNum;
	private double balance;
	private static final double MIN_BALANCE = 500.0;
	public Account(double initialBalance) {
		this.accNum = accCounter++;
		if (initialBalance >= MIN_BALANCE) {
			this.balance = initialBalance;
			
		}else {
			this.balance = MIN_BALANCE;
		}
	}
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited "+ amount);
		}
	}
	public void withdraw(double amount) {
		
		if(amount > 0 && balance - amount >= MIN_BALANCE) {
			balance -= amount;
			System.out.println("withdraw "+ amount);
		}else {
			System.out.println("cannot withdraw" + amount + "Minimum balance 500 required");
		}
	}
	public double getBalance() {
		return accNum;
	}
	@Override
	public String toString() {
		return "Account Number: " + accNum + ", Balance:" + balance;
	}

}

