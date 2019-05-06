package project141;
import java.util.Scanner;
public class TestRaw {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Exam<Integer> e = new Exam<Integer>(2);
		//e.print();
		Exam<String> e1 = new Exam<String>("manan");
		//e1.print();
		 System.out.println(e.getCode());
		 System.out.println(e1.getCode());
	}

}
