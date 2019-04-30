package project124;
import java.util.*;

public class TestEx5 {
	int z;

	public static void main(String[] args) throws Exception, ArithmeticException {
		Ex5 e = new Ex5();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of x:");
		e.x = s.nextInt();
		System.out.println("enter the value of y:");
		e.y = s.nextInt();
		e.print();
		

	}

}
