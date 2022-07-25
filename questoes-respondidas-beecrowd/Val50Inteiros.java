package Atividades;

import java.util.Scanner;

public class Val50Inteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somaPositivos = 0;
		int qtNegativos = 0;
		
		for(int i = 0; i < 50; i++) {
			
			System.out.println("Digite um número");
			int num = sc.nextInt();
			
			if(num >= 0) {
				somaPositivos += num;
			} else {
				qtNegativos++;
			}
			
		}
		System.out.println("A soma dos números positivos é de: " + somaPositivos 
				   + "\nA quantidade de números negativos é de " + qtNegativos);
		sc.close();
	}

}
