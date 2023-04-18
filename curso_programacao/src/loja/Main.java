package loja;

import java.util.Scanner;

import entities.Product;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("\nDados do produto");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
				
		
		System.out.println("Dados do Produto: " + product);
		System.out.print("Quantidade do produto para adicionar: ");
		product.AddProduct(sc.nextInt());
		System.out.println("\nDados do Produto: " + product);
		System.out.print("Quantidade do produto para remover: ");
		product.RemoveProduct(sc.nextInt());
		System.out.println("\nDados do Produto: " + product);
		
		sc.close();
	}

}
