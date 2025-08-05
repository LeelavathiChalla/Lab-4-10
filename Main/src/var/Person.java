package var;

public class Person {
	private String name;
	private Account account;
	public Person(String name, double initialBalance) {
		this.name = name;
		this.account = new Account(initialBalance);
	}
	public Account getAccount() {
		return account;
	}
	@Override
	public String toString() {
		return "Name: " + name + "," + account.toString();
	}

}



