package package1;

import java.util.Scanner;

public class TestExtra1 {
	public static void main(String args[]) {
		String cho;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Datatype:");
		cho = s.nextLine();
		switch(cho) {
		case "String" :{
			System.out.println("\nEnter the string ");
			Extra1<String> e = new Extra1<String>(s.nextLine());
			e.print();
			break;
		}
		case "string" :{
			System.out.println("\nEnter the string ");
			Extra1<String> e = new Extra1<String>(s.nextLine());
			e.print();
			break;
		}
		case "Integer" :{
			System.out.println("\nEnter the Integer Value: ");
			Extra1<Integer> e1 = new Extra1<Integer>(s.nextInt());
			e1.print();
			break;
		}
		
		case "integer" :{
			System.out.println("\nEnter the Integer Value: ");
			Extra1<Integer> e1 = new Extra1<Integer>(s.nextInt());
			e1.print();
			break;
		}
		case "float" :{
			System.out.println("\nEnter the Float Value: ");
			Extra1<Float> e2 = new Extra1<Float>((float)s.nextInt());
			e2.print();
			break;
		}
		case "Float" :{
			System.out.println("\nEnter the Float Value: ");
			Extra1<Float> e2 = new Extra1<Float>((float)s.nextInt());
			e2.print();
			break;
		}
		case "double":{
			System.out.println("\nEnter the Double Value: ");
			Extra1<Double> e3 = new Extra1<Double>(s.nextDouble());
			e3.print();
			break;
		}
		case "Double":{
			System.out.println("\nEnter the Double Value: ");
			Extra1<Double> e3 = new Extra1<Double>(s.nextDouble());
			e3.print();
			break;
		}
			
		default:
			System.out.println("Sorry !! You have entered Wrong Datatype...");
		
		
		
		
		
	}

}
}