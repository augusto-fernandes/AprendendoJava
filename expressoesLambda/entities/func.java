package entities;

public class func {
	private String name;
	private String email;
	private double salary;
	public func(String name, String email, double salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
