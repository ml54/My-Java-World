package project15;

public class TestCreatingThread {

	public static void main(String[] args) {
		CreatingThreadA ta = new CreatingThreadA();
		CreatingThreadB tb = new CreatingThreadB();
		ta.start();
		tb.start();
		
		
	}

}
