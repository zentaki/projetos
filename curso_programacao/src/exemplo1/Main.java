package exemplo1;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	
	static void cls() {
		try {
		    if (System.getProperty("os.name").contains("Windows")) {
		        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		    } else {
		        System.out.print("\033[H\033[2J");
		        System.out.flush();
		    }
		} catch (Exception ex) {
		    // Tratar exceção
		}

	}
	
	static double areacirculo(double a) {
		return 3.14159 * Math.pow(a, 2);
		
	}
	static double areatriangulo(double a, double b) {
		return a * b / 2;
	}
	
	static double areatrapezio(double a, double b, double c) {
		return ((a + b)/2) * c;
	}
	
	static double areaquadrado(double a) {
		return a * a;
	}
	static double arearetangulo(double a, double b) {
		return a * b;
	}
	
	static void enunciado(int l) {
		char letra[]= {'A','B','C'};
		System.out.println("Digite um um valor para cada um: A, B e C.");
		System.out.print("Valor para " + letra[l] + " : " );
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x = 0;
		double[] abc = new double[3];
		enum letra{
			a(0), b(1), c(2);
			
			private int valor;
			private letra(int valor) {
				this.valor = valor;
			}
			public int get() {
				return this.valor;
			}
		}
		
		for(int i=0; i<3; i++) {
			cls();
			enunciado(i);
			x = sc.nextDouble();
			abc[i] = x;
			sc.nextLine();
		}
		
		DecimalFormat df2 = new DecimalFormat("#.00");
		DecimalFormat df3 = new DecimalFormat("#.000");
		
		cls();
		System.out.println("A = " + df2.format(abc[letra.a.get()]) + "    B = " + df2.format(abc[letra.b.get()]) + "    C = " + df2.format(abc[letra.c.get()]));
		
		System.out.println("Triangulo: " + df3.format(areatriangulo(abc[letra.a.get()], abc[letra.c.get()])));
		System.out.println("Circulo: " +  df3.format(areacirculo(abc[letra.c.get()])));
		System.out.println("Trapezio: " + df3.format(areatrapezio(abc[letra.a.get()], abc[letra.b.get()], abc[letra.c.get()])));
		System.out.println("Quadrado: " + df3.format(areaquadrado(abc[letra.b.get()])));
		System.out.println("Retangulo: " + df3.format(arearetangulo(abc[letra.a.get()], abc[letra.b.get()])));
		
		
		sc.close();

	}

}
