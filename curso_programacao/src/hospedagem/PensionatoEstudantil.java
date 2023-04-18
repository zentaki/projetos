package hospedagem;

import java.util.Scanner;
import entities.RoomRent;

public class PensionatoEstudantil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int oc = 0;
		RoomRent[] rented = new RoomRent[10];
		
		System.out.print("Digite um numero de ocupantes:");
		oc = sc.nextInt();
		sc.nextLine();
		
		
		for(int i=0; i < oc; i++) {
			System.out.println("Cadastro: ");
			String name;
			String email;
			int room;
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Quarto: ");
			room = sc.nextInt();
			sc.nextLine();
			rented[room-1] = new RoomRent(name, email, room);
		}
		System.out.println("Quartos ocupados: ");
		for(RoomRent rent : rented) {
			if(rent != null)System.out.println(rent);
		}
		
		System.out.print("Diga o numero do quarto q procura:");
		int quarto = sc.nextInt(); // 1 - 10
		sc.nextLine();
		System.out.println(rented[quarto-1]);
		sc.close();
	}


}
