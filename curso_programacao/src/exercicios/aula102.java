package exercicios;

import java.util.Scanner;

public class aula102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a dimensao da matriz:");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		
		int[][] vec = new int[n][n];
		
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				int input = sc.nextInt();
				sc.nextLine();
				vec[i][j] = input;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print(vec[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Sequencia diagonal:");
		for(int i=0; i<n; i++) {
			System.out.print(vec[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("Qtd de numero negativo:");
		int k=0;
		for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				if(vec[i][j] < 0) k++;				
			}
		}
		System.out.println(k);
		
		
		sc.close();
	}

}
