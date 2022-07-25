package Atividades;

import java.util.Scanner;

public class FuncaoNumeroPrimo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.println("Digite um n�mero para saber se ele � um n�mero primo");
		num = scan.nextInt();

		while (num < 0) {
			System.out.println("Numero n�o pode ser negativo");
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
