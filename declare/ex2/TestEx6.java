package project125;

import java.util.Scanner;

public class TestEx6{
	public static void main(String args[]) throws NumberFormatException {
		Scanner s = new Scanner(System.in);
		Ex6 e = new Ex6();
		System.out.println("Enter the id");
	    e.id = Integer.parseInt(s.next());
		//System.out.println("the id is :" +id );
		e.print();
		
		
		
	}

}
