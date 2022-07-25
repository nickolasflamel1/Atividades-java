package Atividades;

import java.util.Scanner;

public class MenuPrecos {
	
	public static double Desconto(Double valor, int desconto) {
		double descont = valor * desconto/100;
		double valorfinal = valor - descont;
		return valorfinal;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua compra: ");
		double valor = scan.nextDouble();
		double desconto;
		
		System.out.println("[1] Venda a Vista - desconto de 10%");
		System.out.println("[2] Venda a Prazo 30 dias - desconto de 5%");
		System.out.println("[3] Venda a Prazo 60 dias - mesmo preço");
		System.out.println("[4] Venda a Prazo 90 dias - acréscimo de 5%");
		System.out.println("[5] Venda com cartão de débito - desconto de 8%");
		System.out.println("[6] Venda com cartão de crédito - desconto de 7%");
		byte options = scan.nextByte();
		
		switch(options) {
			case 1:
				desconto = (int) Desconto(valor, 10);
				System.out.println("O valor com o desconto de 10% é de " + desconto);
				break;
			case 2:
				desconto = Desconto(valor, 5);
				System.out.println("O valor com o desconto de 5% é de " + desconto);
				break;
			case 3:
				System.out.println("O valor da sua compra é de: " + valor);
				break;
			case 4:
				double acrescimo = valor + (valor * 5/100);
				System.out.println("O valor da sua compra com o acréscimo de 5% é de: " + acrescimo);
				break;
			case 5:
				desconto = Desconto(valor, 8);
				System.out.println("O valor da sua compra com desconto de 8% é de: " + desconto);
				break;
			case 6:
				desconto = Desconto(valor, 7);
				System.out.println("O valor da sua compra com desconto de 7% é de: " + desconto);
				break;
			default:
				System.out.println("Opção inválida...");
				break;
		}
		scan.close();

	}

}
