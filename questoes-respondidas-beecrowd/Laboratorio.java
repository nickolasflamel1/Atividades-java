package Atividades;

import java.util.Scanner;

public class Laboratorio {

	public static void linha() {
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int quantidade_total_testes;
		int totalSapos = 0;
		int totalRatos = 0;
		int totalCoelhos = 0;
		int quantidadeCobaias;
		String cobaia;

		System.out.println("Quantos testes foram realizados?");
		quantidade_total_testes = scan.nextInt();

		for (int i = 1; i <= quantidade_total_testes; i++) {

			System.out.println("Informe a quantidade de cobaias do " + i + "° teste");
			quantidadeCobaias = scan.nextInt();

			while (quantidadeCobaias < 1 || quantidadeCobaias > 15) {
				if (quantidadeCobaias < 1) {
					System.out.println("ERRO: quantidade mínima de cobaias = 1");
					System.out.println("Informe a quantidade de cobaias do " + i + "° teste");
					quantidadeCobaias = scan.nextInt();
				} else if (quantidadeCobaias > 15) {
					System.out.println("ERRO: quantidade máxima de 15 cobaias por teste");
					System.out.println("Informe a quantidade de cobaias do " + i + "° teste");
					quantidadeCobaias = scan.nextInt();
				}
			}

			System.out.println("Informe a cobaia");
			System.out.println("[C] para Coelhos");
			System.out.println("[R] para Ratos");
			System.out.println("[S] para Sapos");
			cobaia = scan.next();

			linha();

			switch (cobaia) {
			case "C":
				totalCoelhos += quantidadeCobaias;
				break;
			case "R":
				totalRatos += quantidadeCobaias;
				break;
			case "S":
				totalSapos += quantidadeCobaias;
				break;
			}
		}
		double quantidadeTotal = totalCoelhos + totalRatos + totalSapos;
		double porcentagemCoelhos = (totalCoelhos * 100) / quantidadeTotal;
		double porcentagemRatos = (totalRatos * 100) / quantidadeTotal;
		double porcentagemSapos = (totalSapos * 100) / quantidadeTotal;

		System.out.println("Total: " + (int) quantidadeTotal + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);

		System.out.printf("Percentual de coelhos: %.2f%% \n", porcentagemCoelhos);
		System.out.printf("Percentual de ratos: %.2f%% \n", porcentagemRatos);
		System.out.printf("Percentual de sapos: %.2f%% \n", porcentagemSapos);
		scan.close();

	}

}
