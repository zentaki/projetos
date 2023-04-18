package aula8;

import java.util.Scanner;
import entities.Student;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Student's name: ");
		student.name = sc.nextLine();
		for (int i = 1; i < 4; i++) {
			System.out.print("Grade " + i + ": ");
			student.setGrade(i, sc.nextDouble());
		}
		student.finalGrade();

		sc.close();
	}

}
