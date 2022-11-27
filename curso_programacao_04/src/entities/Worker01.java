package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel01;

public class Worker01 {

	private String name;
	private WorkerLevel01 level;
	private Double baseSalary;
	
	private Department01 department;
	
	private List<HourContract01> contracts = new ArrayList<>();
	
	public Worker01() {
	}

	public Worker01(String name, WorkerLevel01 level, Double baseSalary, Department01 department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel01 getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel01 level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department01 getDepartment() {
		return department;
	}

	public void setDepartment(Department01 department) {
		this.department = department;
	}

	public List<HourContract01> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract01 contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract01 contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract01 c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1+ cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

	
}
