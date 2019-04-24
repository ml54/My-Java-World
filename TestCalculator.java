package project1;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {

		Calculator c = new Calculator();

		Scanner scan = new Scanner(System.in);

		System.out.println("1.Add\t2.Sub\t3.Mul\t4.Div");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:

			System.out.println("Enter num1 & num2");
			c.num1 = scan.nextFloat();
			c.num2 = scan.nextFloat();
			c.add();
			break;

		case 2:

			System.out.println("Enter num1 & num2");
			c.num1 = scan.nextFloat();
			c.num2 = scan.nextFloat();
			c.sub();
			break;
			
			
		case 3:
			
			System.out.println("Enter num1 & num2");
			c.num1 = scan.nextFloat();
			c.num2 = scan.nextFloat();
			c.mul();
			break;
			
		case 4:
			
			System.out.println("Enter num1 & num2");
			c.num1 = scan.nextFloat();
			c.num2 = scan.nextFloat();
			c.div();
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}
}