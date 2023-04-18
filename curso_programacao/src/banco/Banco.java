package banco;

import java.util.Scanner;
import entities.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double money = 0;
		String resp = "";

		ContaBancaria conta;

		System.out.println("Abertura de Conta");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Numero da conta: ");
		long accNumber = sc.nextLong();

		System.out.print("Tem deposito inicial (Y/N)?");
		resp = sc.next().toLowerCase();
		if (resp.equals("y")) {
			System.out.print("Deposito inicial: ");
			money = sc.nextDouble();
			conta = new ContaBancaria(name, accNumber, money);
		} 
		else {
			conta = new ContaBancaria(name, accNumber);
		}

		System.out.println("\nDados da conta:");
		System.out.println(conta);

		System.out.print("\nDigite um valor para deposito: ");
		money = sc.nextDouble();
		conta.Deposit(money);
		System.out.println("Updated:");
		System.out.println(conta);

		System.out.print("\nDigite um valor para retirada: ");
		money = sc.nextDouble();
		conta.Withdraw(money);
		System.out.println("Updated:");
		System.out.println(conta);

		sc.close();
	}

}
