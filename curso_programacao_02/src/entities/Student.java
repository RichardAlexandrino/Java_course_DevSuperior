package entities;

public class Student {

	public String name;
	public double a1;
	public double a2;
	public double a3;
	
	public double gradeCalculation() {
		return a1 + a2 + a3;
	}

	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", gradeCalculation());
	}
	
	public double approval() {
		if (gradeCalculation() < 60.0) {
			return 60.0 - gradeCalculation();
		}
		else {
			return 0.0;
		}
	}
}
