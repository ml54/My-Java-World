package Multithreading3;
//import java.lang.*;
public class BookTicket extends Thread {
	static int c=10;
	public void run() {
		print();
		
	}
	static void print() {
		c--;
		if(c<0)
			System.out.println("ticket not available");
		else	
			synchronized (BookTicket.class) {
				System.out.println("ticket available"+c);
			}
			
	}

}
