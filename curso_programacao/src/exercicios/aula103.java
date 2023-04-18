package exercicios;

import java.util.Scanner;

public class aula103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		
		System.out.println("Digite uma dimensao para a matriz:");
		System.out.print("Numero de linhas: ");
		int m = sc.nextInt();
		sc.nextLine();
		System.out.print("Numero de colunas: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[][] mat = new int[m][n];
		
		System.out.println();
		System.out.println("Digite os valores para a matriz:");
		for(int i=0; i < mat.length; i++ ) {
			for(int j=0; j < mat[0].length; j++) {
				mat[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
		
		System.out.println();
		System.out.print("Digite um valor para encontrar na matriz: ");
		int proc = sc.nextInt();
		sc.nextLine();
		System.out.println();
				
		for(int i=0; i < mat.length; i++ ) {
			for(int j=0; j < mat[0].length; j++) {
				if(mat[i][j] == proc) {
					System.out.println("Posiçao: " + i + "," + j);
					if(i-1 >= 0) System.out.println("UP = " + mat[i-1][j]);
					if(j-1 >= 0) System.out.println("Left = " + mat[i][j-1]);
					if(i+1 < mat.length) System.out.println("Down = " + mat[i+1][j]);
					if(j+1 < mat[0].length) System.out.println("Right = " + mat[i][j+1]);					
				}
				
			}
		}
		
		
		sc.close();
	}

}
