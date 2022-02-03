package entities;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(Integer id, String name, Double salary) {
		/*super();*/
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
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

	public void increaseSalary(Double salary) {
		this.salary *= 1+(salary/100);
	}
	
	public String toString() {
		return String.format("%d, %s, %.2f", id, name, salary);
	}

}
