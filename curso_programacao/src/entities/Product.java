package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product() {}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	public double getPrice() {return this.price;}
	public void setPrice(double price) {this.price = price;}
	public int getQuantity() {return this.quantity;}
		
	
	public double StockTotalValue() {
		return quantity * price;
	}
	public void AddProduct(int quantity) {
		this.quantity += quantity;
	}
	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, $" + String.format("%.2f", StockTotalValue()); 
	}

}
