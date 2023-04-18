package aula8;

import java.util.Scanner;
import entities.Employee;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e = new Employee();
		
		System.out.println("Type in employee data");
		System.out.print("Name: ");
		e.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		e.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println("Employee: " + e);
		System.out.print("What percentage to increase salary: ");
		e.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Update Employee: " + e);
		
		sc.close();
	}

}
