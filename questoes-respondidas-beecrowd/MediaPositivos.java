package Atividades;

import java.util.Scanner;

public class MediaPositivos {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		double valores;
		double somaPositivos = 0;
		int quantidadePositivos = 0;
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite um valor:");
			valores = scan.nextDouble();
			
			if(valores > 0) {
				somaPositivos += valores;
				quantidadePositivos++;
			}										
		}
		double mediaPositivos = somaPositivos / quantidadePositivos;
		System.out.println(quantidadePositivos + " valores positivos");
		System.out.println(mediaPositivos);
		scan.close();
	}

}
