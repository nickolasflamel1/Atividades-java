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
			
			System.out.println("Digite um número");
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
		System.out.println("A quantidade de números positivos é: " + qtPositivos 
					+ "\nA quantidade de números negativos é de: " + qtNegativos 
					+ "\nA quantidade de números pares é de: " + qtPares 
					+ "\nA quantidade de números ímpares é de " + qtImpares);
		scan.close();
		
	}

}
