package Multithreading1;

public class TestMain {

	public static void main(String[] args) {
		BookTicket b[] = new BookTicket[11];
		for (int i=0;i<b.length;i++) {
			b[i]= new BookTicket();
			b[i].start();
		}

	}

}
