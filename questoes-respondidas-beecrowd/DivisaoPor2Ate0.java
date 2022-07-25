package Atividades;

import java.util.Scanner;

public class DivisaoPor2Ate0 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int qtDivisao = 0;
		double ultima_Divisao = 0;
		double divisao = 0;

		System.out.println("Digite um número para dividi-lo por 2 sucessivamente");
		double num = input.nextDouble();

		for (double i = num; i >= 0; i -= divisao) {
			divisao = num /= 2; 
			qtDivisao++;
			System.out.printf("%.1f%n", divisao);
			
			if (num < 1) {
				break;
			}
			if (divisao > 0 && divisao < 2) {
				ultima_Divisao = divisao;
			}

		}
		System.out.printf("A última divisão foi: %.1f\n", ultima_Divisao);
		System.out.println("A quantidade de divisões foi de: " + qtDivisao);
		input.close();

	}

}