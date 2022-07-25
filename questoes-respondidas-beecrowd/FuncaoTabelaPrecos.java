package Atividades;

import java.util.Scanner;

public class FuncaoTabelaPrecos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1] Cachorro Quente R$4.00");
		System.out.println("[2] X-salada R$4.50");
		System.out.println("[3] X-bacon R$5.00");
		System.out.println("[4] Torrada Simples R$2.00");
		System.out.println("[5] Refrigerante R$1.50");
		int options = scan.nextInt();
		
		Menu(options);
		
		scan.close();
	}

	public static void Menu(int options) {

		Scanner scan = new Scanner(System.in);

		double PcachorroQuente = 4.00;
		double PxSalada = 4.50;
		double PxBacon = 5.00;
		double PtorradaSimples = 2.00;
		double Prefrigerante = 1.50;
		double total = 0;
		int qt = 0;

		switch (options) {
		case 1:
			System.out.println("Digite a quantidade");
			qt = scan.nextInt();
			total = qt * PcachorroQuente;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 2:
			System.out.println("Digite a quantidade");
			qt = scan.nextInt();
			total = qt * PxSalada;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 3:
			System.out.println("Digite a quantidade");
			qt = scan.nextInt();
			total = qt * PxBacon;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 4:
			System.out.println("Digite a quantidade");
			qt = scan.nextInt();
			total = qt * PtorradaSimples;
			System.out.printf("Total: R$ %.2f", total);
			break;
		case 5:
			System.out.println("Digite a quantidade");
			qt = scan.nextInt();
			total = qt * Prefrigerante;
			System.out.printf("Total: R$ %.2f", total);
		}
		scan.close();
	}

}
