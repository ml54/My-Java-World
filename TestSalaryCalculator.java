import java.util.Scanner;

public class TestSalaryCalculator {

	public static void main(String[] args) {
		SalaryCalculator s = new SalaryCalculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		s.name = scan.next();
		System.out.println("Enter id");
		s.id = scan.nextInt();
		System.out.println("Enter basic salary");
		s.basic = scan.nextFloat();
		s.naming();
		s.h();
		s.d();
		s.salary();
		
		
		
	}
}
