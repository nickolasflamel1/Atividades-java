package Atividades;

import java.util.Scanner;

public class FuncaoNumeroPrimo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.println("Digite um número para saber se ele é um número primo");
		num = scan.nextInt();

		while (num < 0) {
			System.out.println("Numero não pode ser negativo");
			num = scan.nextInt();
		}
		
		System.out.println(NumeroPrimo(num));
		
		scan.close();

	}
	
	public static boolean NumeroPrimo(int num) {
		
		boolean NumeroPrimo;
		int quantidadeDivisores = 0;
		
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				quantidadeDivisores++;
			}
		}

		if (quantidadeDivisores == 2) {
			NumeroPrimo = true;
		} else {
			NumeroPrimo = false;
		}
		return NumeroPrimo;
	}
}
