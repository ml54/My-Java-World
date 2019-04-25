package project6;

public class Employee {
	private int id;
	private String name;
	private Certificate certificate;

	public Employee() {

	}

	public Employee(int id, String name, float salary, Certificate certificate) {

		this.id = id;
		this.name = name;
		this.certificate = certificate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		certificate.print();
	}

	

}
