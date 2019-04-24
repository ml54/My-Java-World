package project3;

public class Student {
	
	float id;
	String name;
	float[] marks;
	float percentage;
	float sum = 0;
	
	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Percentage=" + percentage);
		
	}
	
	void per() {
		int i;
		for (i=0;i<marks.length; i++) {
			sum+=marks[i];
			percentage = sum/marks.length ;
			
		}
	}
	
	

}
