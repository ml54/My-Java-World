package task1;
//import java.util.Scanner;
public class PerEmployee extends Employee{
	float basic;
	float da;
	float hra;
	
	PerEmployee(int id, String name, float basic){
		super( id,name );
		//System.out.println(name);
		//System.out.println(id);
		this.basic = basic;
		
	}
	void calS() {
		da = basic * 20 / 100;
		hra = basic * 35 / 100;
		salary = basic + da + hra ;
		
	}
	
	void print() {
		super.print();
		System.out.println("Your basic Salary is :" +basic);
		System.out.println("Your da Salary is :" +da);
		System.out.println("Your hra Salary is :" +hra);
	}

}
