package project141;

public class Exam<t> {
	private t code;
	
	public Exam(){
		
	}
	public Exam(t code) {
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
		System.out.println(code);
	}

}
