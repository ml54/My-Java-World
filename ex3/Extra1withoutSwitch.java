package package2;

public class Extra1withoutSwitch<t> {
	public  t code;

	public Extra1withoutSwitch(t code) {
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
