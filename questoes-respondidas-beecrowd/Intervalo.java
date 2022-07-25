package Atividades;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número");
		double N = scan.nextDouble();

		if (N >= 0 && N <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (N > 25 && N <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (N > 50 && N <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (N > 75 && N <= 100) {
			System.out.println("Intervalo (75,100]");
		} else if (N < 0 || N > 100) {
			System.out.println("Fora de intervalo");
		}
		scan.close();

	}

}
