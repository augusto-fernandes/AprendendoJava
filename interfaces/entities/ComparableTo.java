package entities;

public class ComparableTo implements Comparable<ComparableTo> {
	private String name;
	private Double salary;
	
	public ComparableTo(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	//compareTo serve para comparar uma classe com outra
	public int compareTo(ComparableTo other) {
		
		return name.compareTo(other.getName());
		//caso voce queira odernar os funcionarios por salario e nao por nome:
		//return salary.compareTo(other.getSalary
		
		// para ordernar de uma forma decrescente:
		//return -salary.compareTo(other.getSalary
	}
	

}
