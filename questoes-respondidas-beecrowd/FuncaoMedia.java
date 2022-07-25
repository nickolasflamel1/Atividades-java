package Atividades;

import java.util.Scanner;

public class FuncaoMedia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, media;
		char M;
		
		System.out.println("[A] Média Aritmética");
		System.out.println("[P] Média Ponderada");
		System.out.println("[H] Média Harmônica");
		M = leia.next().charAt(0);
		
		while(M != 'A' && M != 'P' && M != 'H') {
			System.out.println("ERRO: Opção inválida");
			System.out.println("[A] Média Aritmética");
			System.out.println("[P] Média Ponderada");
			System.out.println("[H] Média Harmônica");
			M = leia.next().charAt(0); 
		}
		
		System.out.print("Nota 1: ");
		n1 = leia.nextFloat();
		System.out.print("Nota 2: ");
		n2 = leia.nextFloat();
		System.out.print("Nota 3: ");
		n3 = leia.nextFloat();
		
		media = Media(n1, n2, n3, M);
		
		System.out.printf("Média = %.1f", media);
		
		leia.close();
	}

	public static float Media(float n1, float n2, float n3, char op) {
		
		float res = 0;
		
		switch(op) {
		case 'A':
			res = (n1 + n2 + n3) / 3;
			break;
		case 'P':
			res = ((n1 * 5 + n2 * 3 + n3 * 2)) / 10;
			break;
		case 'H':
			res = 3 / (1 / n1 + 1 / n2 + 1 / n3);
		}
		return res;
	}
}
