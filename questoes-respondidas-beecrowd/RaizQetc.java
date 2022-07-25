package Atividades;

import java.util.Scanner;

public class RaizQetc {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int num = input.nextInt();
		
		System.out.println("Escolha o c�lculo que voc� deseja realizar");
		System.out.println("[1] RaizQ do n�mero");
		System.out.println("[2] Metade do n�mero");
		System.out.println("[3] 10% do n�mero");
		System.out.println("[4] O dobro do n�mero");
		short options = input.nextShort();
		
		switch (options) {
			case 1:
				int raiz = (int) Math.sqrt(num);
				System.out.println("A raiz quadrada de " + num + " �: " + raiz);
				break;
			case 2:
				int metade = num/2;
				System.out.println("A metade de " + num + " �: " + metade);
				break;
			case 3:
				int porcentagem = num*10/100;
				System.out.println("10% de " + num + " �: " + porcentagem);
				break;
			case 4:
				int dobro = num * 2;
				System.out.println("O dobro de " + num + " �: " + dobro);
				break;
			default:
				System.out.println("Op��o inv�lida...");
		}
		input.close();
	

	}

}
