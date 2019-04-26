package task1;

public class Consultants extends Employee {
	float hrs;
	float rhrs;
	
	
	Consultants(int id, String name, float hrs,float rhrs){
		super(id,name);
		this.hrs = hrs;
		this.rhrs = rhrs;
	}
	
	void calS() {
		salary = hrs * rhrs ;
		
	}
	void print() {
		super.print();
		System.out.println("Total hours:" +hrs);
		System.out.println("Total rate per hours:" +rhrs);
		System.out.println("Total Salary is :" +salary);
	}

}
