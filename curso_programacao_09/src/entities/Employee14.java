package entities;

public class Employee14 implements Comparable<Employee14> {

	private String name;
	private Double salary;
	
	public Employee14(String name, Double salary) {
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
	public int compareTo(Employee14 other) {
		return -salary.compareTo(other.getSalary());
	}
	
}
