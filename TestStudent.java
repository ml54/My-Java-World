package project3;
import java.util.Scanner;



public class TestStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter name");
		s.name = scan.next();
		System.out.println("Enter id");
		s.id = scan.nextInt();
		System.out.println("Enter marks");
		int n = scan.nextInt();
		s.marks = new float[n];
		System.out.println("Enter marks per sub");
		for(int i =0; i<s.marks.length; i++) {
			s.marks[i]=scan.nextFloat();
		}
		
		s.per();
		s.print();
		
		
		
		
		
	}

}
