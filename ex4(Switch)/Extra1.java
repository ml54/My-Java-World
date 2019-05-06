package package1;

public class Extra1<t> {
	public  t code;

	public Extra1(t code) {
		super();
		this.code = code;
	}

	public t getCode() {
		return code;
	}

	public void setCode(t code) {
		this.code = code;
	}
	
	public void print() {
		System.out.println("code type" +code.getClass().getSimpleName());
		System.out.println("code name" +code);
	}

}



