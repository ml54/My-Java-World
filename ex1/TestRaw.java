package project14;
import java.util.Scanner;

public class TestRaw {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Exam e  = new Exam ();
		System.out.println("enter the number");
		//Integer i = new Integer(0);
		e.i=Integer.valueOf(0);
		e.i = s.nextInt();
		//System.out.println(e.getClass());
		//System.out.println(e.getClass().getName());
		//System.out.println(e.getClass().getSimpleName());
		System.out.println(e.getI().getClass().getSimpleName());
		
		System.out.println(e.i);
		
	}

}
