package project121;

public class TestExt {
	public static void main(String args[]) {
		try {
			Ext e = new Ext();
			e.foo();
			//int z = 10/0;
			//int i = Integer.parseInt("12a");
			//int z = 10/0;
		}
		catch(NumberFormatException ne) {
			System.out.println("dont enter chars");
		}
		catch(ArithmeticException ae) {
			System.out.println("exe");
		}
		finally {
			System.out.println("always there");
		}
		
	}

}
