package Multithreading2;

public class BookTicket extends Thread {
	static int c=10;
public	void run() {
		print();
	}
	static synchronized void print() {
		c--;
		if (c<0)
			System.out.println("Ticket not available");
		else
			System.out.println("Ticket available"+c);
	}

}
