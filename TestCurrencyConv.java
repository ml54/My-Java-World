package project4;
import java.util.Scanner;



public class TestCurrencyConv {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CurrencyConv c = new CurrencyConv();
		
		System.out.println("1.rs to dollars\t2.dollars to rs");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:

			System.out.println("Enter amt in rupees");
			c.amt = scan.nextInt();
			c.dollar();
			break;
		
		
		case 2:
			System.out.println("Enter amt in dollars");
			c.amt1 = scan.nextInt();
			c.rs();
			break;
		
		default :
			System.out.println("please enter a valid amt.");
		
		
		
	}

}
}
