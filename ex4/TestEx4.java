package project123;
import java.util.Scanner;

public class TestEx4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		//Ex4 e = new Ex4();
		try {
		System.out.println("eNTER ID:");
		int id = Integer.parseInt(s.next());
		System.out.println("YOur id is:" +id);
		//e.print();
		
		
		}
		catch (NumberFormatException ne)
		{
			System.out.println("NFE is there");
		}
	}

}
