package entities;

public class ContaBancaria {
	private String name;
	private long accNumber;
	private double money;
	
	
	public ContaBancaria(String name, long accNumber, double money) {
		super();
		this.name = name;
		this.accNumber = accNumber;
		this.money = money;
	}
	public ContaBancaria(String name, long accNumber) {
		super();
		this.name = name;
		this.accNumber = accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public double getMoney() {
		return money;
	}
	
	public void Deposit(double money) {
		this.money += money;
	}
	public void Withdraw(double money) {
		this.money -= money+5;
	}
	
	public String toString() {
		return "Acc: " + accNumber + ", Holder's name: " + name + ", Money: $" + money;
	}
	
	
}
