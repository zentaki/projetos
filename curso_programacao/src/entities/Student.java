package entities;

public class Student {

	public String name;
	double nota[] = new double[3];
	/*
	final double notaMax = 100; // isso serviria para notar a base de porcentagem, caso o valor fosse outro q nao 100
								// poderia ser usado de forma dinamica para calcular as notas.
								// Uma ideia q nao precisou ser implementada totalmente.
	*/

	public int setGrade(int period, double valor) {
		switch (period) {
		case 1:
			nota[0] = valor;
			break;
		case 2:
			nota[1] = valor;
			break;
		case 3:
			nota[2] = valor;
			break;
		default:
			System.out.println("valor incorreto");
			return 1;
		}
		return 0;
	}
	
	public void finalGrade() {
		double fg = (nota[0] + nota[1] + nota[2]);
		System.out.println("FINAL GRADE = " + String.format("%.2f", fg));
		if(fg >= 60 ) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED\nMISSING " + String.format("%.2f",60-fg) + " POINTS");
		}
	}
}
