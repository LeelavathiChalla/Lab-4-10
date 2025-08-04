package var;
import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your NUmber: ");
		int i = scanner.nextInt();
		// TODO Auto-generated method stub
		if(i<0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Positive Number");
		}

	}

}
