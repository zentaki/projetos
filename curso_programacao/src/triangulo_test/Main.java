package triangulo_test;

import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os lados do triangulo X:");
		x.set(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println();
		
		System.out.println("Digite os lados do triangulo Y:");
		y.set(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area do triangulo X = %.4f\n", x.area());
		System.out.printf("Area do triangulo Y = %.4f\n", y.area());
		
		if(areaX > areaY) System.out.println("X é maior");
		else System.out.println("Y é maior");
		
		
		
		sc.close();
	}

}
