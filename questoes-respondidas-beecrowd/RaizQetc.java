package Atividades;

import java.util.Scanner;

public class RaizQetc {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = input.nextInt();
		
		System.out.println("Escolha o cálculo que você deseja realizar");
		System.out.println("[1] RaizQ do número");
		System.out.println("[2] Metade do número");
		System.out.println("[3] 10% do número");
		System.out.println("[4] O dobro do número");
		short options = input.nextShort();
		
		switch (options) {
			case 1:
				int raiz = (int) Math.sqrt(num);
				System.out.println("A raiz quadrada de " + num + " é: " + raiz);
				break;
			case 2:
				int metade = num/2;
				System.out.println("A metade de " + num + " é: " + metade);
				break;
			case 3:
				int porcentagem = num*10/100;
				System.out.println("10% de " + num + " é: " + porcentagem);
				break;
			case 4:
				int dobro = num * 2;
				System.out.println("O dobro de " + num + " é: " + dobro);
				break;
			default:
				System.out.println("Opção inválida...");
		}
		input.close();
	

	}

}
