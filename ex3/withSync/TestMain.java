package Multithreading2;

public class TestMain {

	public static void main(String[] args) {
		BookTicket b[] = new BookTicket[12]; 
		for (int i=0;i<b.length;i++) {
			b[i]=new BookTicket();
			b[i].start();
		}

	}

}
