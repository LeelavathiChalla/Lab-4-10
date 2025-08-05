package var;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith = new Person("Smith", 2000);
		Person kathy = new Person("Kethy", 3000);
		smith.getAccount().deposit(2000);
		kathy.getAccount().withdraw(2000);
		System.out.println("\n--- Updated Account Details---");
		System.out.println(smith);
		System.out.println(kathy);

	}

}
