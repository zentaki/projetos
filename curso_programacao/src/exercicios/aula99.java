package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entities.Employee2;

public class aula99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numEmployees = 0;
		
		System.out.print("How many employee will be registered?");
		numEmployees = sc.nextInt();
		sc.nextLine();
		
		List<Employee2> employees = new ArrayList<>();	
		
		for(int i = 0; i < numEmployees; i++) {
			System.out.println("Employee #" + (i+1) + ":" );
			System.out.print("ID:");
			int id = sc.nextInt();
			sc.nextLine();
			while(HasId(employees, id)) {
				System.out.print("ID ja existente. Tente denovo: ");
				id = sc.nextInt();
				sc.nextLine();
			}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: $");
			double salary = sc.nextDouble();
			Employee2 e = new Employee2(id, name, salary);
			employees.add(e);			
		}
		System.out.println();
		
		System.out.print("Enter the employee ID that will have the salary raised: ");
		int id = sc.nextInt();
		sc.nextLine();
				
		//minha soluçao
		boolean found = false;
		for(Employee2 x : employees) {
			if(x.getId() == id) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				x.salaryRaise(percentage);
				found = true;
				break;
			}
		}
		if(!found)System.out.println("ID not found!");
		
		
		System.out.println();
		
		System.out.print("Enter the employee ID that will have the salary raised: ");
		id = sc.nextInt();
		sc.nextLine();
				
		//soluçao seguindo a soluçao do professor
		Integer pos = SearchEmployee(employees, id);
		if(pos != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employees.get(pos).salaryRaise(percentage);
		}
		else System.out.println("ID not found!");
		
		System.out.println();
		
		System.out.print("Enter the employee ID that will have the salary raised: ");
		int ids = sc.nextInt();
		sc.nextLine();
		
		//soluçao do professor usando lambda
		Employee2 emp = employees.stream().filter(x -> x.getId() == ids).findFirst().orElse(null);
		//observaçao da variavel ids, ela deve ser constante, final, ou uma vez atribuido um valor nao pode mudar
		//sendo assim quado a variavel é criada e ela recebe o valor pela primeira vez, nao podera mudar de valor
		//do contrario ela nao será aceita
		if(emp != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.salaryRaise(percentage);
		}
		else System.out.println("ID not found!");
		
		System.out.println();
		
		System.out.println("List of Employees:");
		for(Employee2 x : employees) {
			System.out.println(x);
		}
		
		
		sc.close();
	}
	
	public static Integer SearchEmployee(List<Employee2> emp, int id) {
		for(int i=0; i < emp.size(); i++){
			if(emp.get(i).getId() == id) return i;
		}
		return null;
	}
	public static boolean HasId(List<Employee2> emp, int id) {
		Employee2 e = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return e != null;
	}

}
