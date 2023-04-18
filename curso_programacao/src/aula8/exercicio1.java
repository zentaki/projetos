package aula8;

import java.util.Scanner;

import entities.Retangulo;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo r = new Retangulo();
		System.out.println("Digite of valores de um retangulo:");
		System.out.print("Altura: ");
		r.altura = sc.nextDouble();
		System.out.print("Largura: ");
		r.largura = sc.nextDouble();
		System.out.println(r);
		
		sc.close();
	}

}
