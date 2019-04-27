package project2;

public class AreaC {
	
	float pi ;
	double r;
	double r2;
	double result;
	
	void circle() {
		pi = (float)3.14;
		result = pi * r * r;
		printResult();
	}
	
	void square() {
		result = r * r;
		printResult();
		
	}
	
	void triangle() {
		result = 0.5f * r * r2;
		printResult();
		
		
	}
	void printResult() {
		System.out.println("Result is= " + result);
	}

}
