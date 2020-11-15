package oop;

public class Student {
	private String name;
	private double grade;

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setGrade(double newGrade) {
		grade = newGrade;
	}

	Student() {

	}

	Student(String newName, double newGrade) {

	}

	public boolean Scholarship(double grade) {
		if (grade >= 5.50) {
			return true;
		} else {
			return false;
		}
	}
}
