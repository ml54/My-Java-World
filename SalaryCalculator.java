
public class SalaryCalculator {
	
	 String name;
	 int id;
	 float basic;
	 float da;
	 float hra;
	 float totalsalary;
	 float result;
	 
	 void naming() {
		 System.out.println("Name is= " + name);
		 System.out.println("ID is= " + id);
		 
	 }
	 void h() {
		 hra = (15  * basic) / 100 ;
		 System.out.println("Result hra is= " + hra);
		 
	 }
	  void d() {
		  da = (35 * basic) / 100;
		  System.out.println("Result da is= " + da);
	  }
	  void salary() {
	  
		  totalsalary =  (basic + da + hra);
		  System.out.println("TotalSalary is= " + totalsalary);  
	  }
	 
	


}
