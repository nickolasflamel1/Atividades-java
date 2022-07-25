package Atividades;

import java.util.Scanner;

public class FuncaoAnosEmDias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.println("Quantos anos você tem: ");
		int idade = input.nextInt();
		System.out.println("Quantos meses: ");
		int meses = input.nextInt();
		System.out.println("Quantos dias: ");
		int dias = input.nextInt();
		
		System.out.println("Sua idade em dias é: " + IdadeEmDias(idade, meses, dias));
		
		input.close();
	}
	
	public static int IdadeEmDias(int idade, int meses, int dias) {
		int res = idade * 365 + meses * 30 + dias;
		return res;
	}

}
