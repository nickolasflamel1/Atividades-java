package Atividades;

import java.util.Scanner;

public class QParesQImpares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int varControle = 1;
		int QPares = 0;
		int QImpares = 0;

		while (varControle == 1) {
			System.out.println("Digite o número");
			int num = scan.nextInt();

			if (num % 2 == 0) {
				QPares++;
			} else {
				QImpares++;
			}

			System.out.println("Deseja continuar? \n[1] para sim, ou [2] para não");
			varControle = scan.nextByte();
		}
		System.out.println("Pares = " + QPares + ", Ímpares = " + QImpares);
		scan.close();
	}

}
