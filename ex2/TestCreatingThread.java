package project151;

public class TestCreatingThread {

	public static void main(String[] args) {
		CreatingThreadA ta = new CreatingThreadA();
		CreatingThreadB tb = new CreatingThreadB();
		Thread t1 = new Thread (ta);
		Thread t2 = new Thread (tb);
		t1.start();
		t2.start();

	}

}
