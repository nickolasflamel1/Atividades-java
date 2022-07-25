package Atividades;

import java.util.Scanner;

public class PositivoENegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num = scan.nextInt();
		
		if(num >= 0) {
			int positivo = num;
			System.out.println("O número " + positivo + " é um número POSITIVO");
		} else {
			int negativo = num;
			System.out.println("O número " + negativo + " é um número NEGATIVO");
		}
		scan.close();
	}

}
