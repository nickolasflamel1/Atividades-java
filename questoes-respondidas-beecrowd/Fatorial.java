package Atividades;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.println("Digite um n�mero para ver o seu fatorial");
		int N = scan.nextInt();
		
		while(N < 0) {
			System.out.println("ERRO: apenas n�meros positivos");
			System.out.println("Digite um n�mero para ver o seu fatorial");
			N = scan.nextInt();
		}
		
		for(int i = 1; i <= N; i++) {
			fatorial *= i;
		}
		System.out.println("O fatorial de " + N + " � = " + fatorial);
		scan.close();
	}
}
