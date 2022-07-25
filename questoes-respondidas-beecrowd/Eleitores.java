package Atividades;

import java.util.Scanner;

public class Eleitores {

	public static void main(String[] args) {
		// Ler:
		// número total de eleitores
		// número total de votos nulos, brancos e válidos
		// Escrever:
		// o percentual que cada um representa em relação ao total de eleitores.

		Scanner input = new Scanner(System.in);

		System.out.println("Qual número total de eleitores? ");
		double Total_de_eleitores = input.nextInt();

		System.out.println("Qual foi o total de votos nulos?");
		double Votos_nulos = input.nextInt();

		System.out.println("Qual foi o total de votos em branco?");
		double Votos_em_branco = input.nextInt();

		System.out.println("Qual foi o total de votos válidos?");
		double Votos_validos = input.nextInt();

		double percentual_votos_nulos = (Votos_nulos / Total_de_eleitores) * 100;
		double percentual_votos_em_branco = (Votos_em_branco / Total_de_eleitores) * 100;
		double percentual_votos_validos = (Votos_validos / Total_de_eleitores) * 100;

		
		 System.out.println("O percentual de votos nulos foi de: " + (int) percentual_votos_nulos 
				 	+ "%\nO percentual de votos em branco foi de: " + (int) percentual_votos_em_branco 
				 	+ "%\nO percentual de votos válidos foi de: " + (int) percentual_votos_validos +"%");
		 
		 
		input.close();

	}

}
