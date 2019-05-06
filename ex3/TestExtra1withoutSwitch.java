package package2;

import java.util.Scanner;

import package1.Extra1;

public class TestExtra1withoutSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cho;
		Scanner s = new Scanner(System.in);
		Extra1<String> e = new Extra1<String>("hello friends");
		e.print();

		Extra1<Integer> e1 = new Extra1<Integer>(310396);
		e1.print();
		Extra1<Float> e2 = new Extra1<Float>((float)3.14);
		e2.print();
		Extra1<Double> e3 = new Extra1<Double>(310396.123456);
		e3.print();
	}
	

}
