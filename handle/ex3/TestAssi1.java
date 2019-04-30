package project122;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestAssi1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Assi1 i = new Assi1();
		System.out.println("enter x:" );
		i.x = s.nextInt();
		System.out.println("enter y:");
		i.y = s.nextInt();
		try {
			
			i.divide();
			
		}
		
		//catch (InputMismatchException ie) {
			//System.out.println("Exception is there!!!"); 
		//}
		catch (Exception he) {
			System.out.println("Exception is there!");
		}
		//catch(NumberFormatException ne) {
		//	System.out.println("Enter valid char");
		//}
		//catch(ArithmeticException ae) {
		// 	System.out.println("Arithmatic Exception is there ");
		//}
		//finally {
			//System.out.println("Oops!!");
	//	}
	}

}
