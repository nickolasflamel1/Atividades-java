package Atividades;

import java.util.Scanner;

public class AnosEmDias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int DIASDOANO = 365;
		int DIASDOMES = 30;
		
		System.out.println("Quantos anos você tem: ");
		int idade = input.nextInt();
		System.out.println("Quantos meses: ");
		int meses = input.nextInt();
		System.out.println("Quantos dias: ");
		int dias = input.nextInt();
		
		int MesesEmDias = meses * DIASDOMES;
		int TotDiasMeses = MesesEmDias + dias;
		int IdadeEmDias = (idade * DIASDOANO) + TotDiasMeses;
		
		System.out.println("Sua idade em dias é: " + IdadeEmDias + " dias");
		
		input.close();
	}

}
