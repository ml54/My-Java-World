package project2;

import java.util.Scanner;

public class TestAreaC {
	
	public static void main(String[] args) {
		
		AreaC a = new AreaC();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.circle\t2.square\t3.triangle");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:

			System.out.println("Enter radius");
			a.r = scan.nextInt();
			a.circle();
			break;
		
		
		case 2:
			System.out.println("Enter radius");
			a.r = scan.nextInt();
			a.square();
			break;
			
		case 3:
			System.out.println("Enter base");
			a.r = scan.nextInt();
			System.out.println("Enter altitude");
			a.r2 = scan.nextInt();
			a.triangle();
			break;
			
	}

  }
}