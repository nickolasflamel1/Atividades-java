package Atividades;

import java.util.Scanner;

public class PositivoENegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num = scan.nextInt();
		
		if(num >= 0) {
			int positivo = num;
			System.out.println("O n�mero " + positivo + " � um n�mero POSITIVO");
		} else {
			int negativo = num;
			System.out.println("O n�mero " + negativo + " � um n�mero NEGATIVO");
		}
		scan.close();
	}

}
