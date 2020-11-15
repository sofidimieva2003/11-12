package oop;

import java.util.Scanner;

public class StudentTest {

	public static void Scholarships(Student[] array) {
		Scanner sc = new Scanner(System.in);
		String names = new String();
		for (int i = 0; i < 5; i++) {
			System.out.print("Name of student " + (i + 1) + ": ");
			String name = sc.next();
			System.out.print("Grade of student " + (i + 1) + ": ");
			double grade = sc.nextDouble();
			array[i] = new Student(name, grade);
			boolean YesOrNo = array[i].Scholarship(grade);
			if (YesOrNo) {
				names = names + name + " ";
			}
		}
		System.out.println(names);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] array = new Student[5];

		Scholarships(array);
	}
}
