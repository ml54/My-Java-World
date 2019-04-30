package project121;

public class Ext {
	int x= 10 ;
	int y = 15;
	void foo() throws ArithmeticException{
		x = x / 0;
		y = y / 0;
	}

}
