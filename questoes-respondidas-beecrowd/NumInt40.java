package Atividades;

import java.util.Scanner;

public class NumInt40 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtPositivos = 0;
		int qtNegativos = 0;
		int qtPares = 0;
		int qtImpares = 0;
		
		for(int i = 0; i < 40; i++) {
			
			System.out.println("Digite um n�mero");
			int num = scan.nextInt();
			
			if(num >= 0) {
				qtPositivos++;
			} else {
				qtNegativos++;
			}
			if(num % 2 == 0) {
				qtPares++;
			} else {
				qtImpares++;
			}
			
		}
		System.out.println("A quantidade de n�meros positivos �: " + qtPositivos 
					+ "\nA quantidade de n�meros negativos � de: " + qtNegativos 
					+ "\nA quantidade de n�meros pares � de: " + qtPares 
					+ "\nA quantidade de n�meros �mpares � de " + qtImpares);
		scan.close();
		
	}

}
