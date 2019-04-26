package task1;
import java.util.Scanner;
public class TestEmployee {
	public static void main(String args[]) {
		Scanner s = new Scanner (System.in);
		System.out.println("1.Permanent Employee\t2.Consultant");
		int choice = s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Details of Permanent Employee:");
			System.out.println("Enter id:" );
			int id = s.nextInt();
			System.out.println("Enter Name:");
			String name = s.next();
			s.nextLine();
			
			System.out.println("Enter basic:");
			int basic = s.nextInt();
			PerEmployee p = new PerEmployee(id,name,basic);
			p.calS();
			p.print();
			break;
			
		case 2:
			System.out.println("Details of Consultant Employee");
			System.out.println("Enter id:" );
			int cid = s.nextInt();
			System.out.println("Enter Name:");
			String cname = s.next();
			s.nextLine();
			
			System.out.println("Enter number of hrs:");
			int chrs = s.nextInt();
			System.out.println("Enter rate per hour:");
			int rhrs = s.nextInt();
			
			Consultants c = new Consultants(cid,cname,chrs,rhrs);
			
			c.calS();
			c.print();
			break;
			
		default:
			System.out.println("No beauty no brains");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
