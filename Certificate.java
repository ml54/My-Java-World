package project6;

public class Certificate {
	private String name;
	private String institution;
	
	public Certificate(String name, String institution) {
		this.name = name;
		this.institution = institution;

}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}
	void print() {
		System.out.println("Institution Name=" + institution);
		System.out.println("Certificate Name=" + name);
		
	}
}

