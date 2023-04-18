package entities;

public class Employee2 {
	
	private String name;
	private int id;
	private double salary;
	
	public Employee2(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", $" + String.format("%.2f", salary);
	}
	
	public void salaryRaise(double percentage) {
		salary += salary * percentage / 100;
	}
	
	
}
