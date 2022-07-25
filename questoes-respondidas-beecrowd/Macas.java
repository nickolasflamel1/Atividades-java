package Atividades;

import java.text.NumberFormat;
import java.util.Scanner;

public class Macas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas maças foram compradas?");
		int macas = scan.nextInt();
		double valor;
		
		if(macas < 12) {
			valor = macas * 1.0;
			NumberFormat fmt = NumberFormat.getCurrencyInstance();
			String valorFinalFmt = fmt.format(valor);
			System.out.println("Valor da sua compra: " + valorFinalFmt);
		} else {
			valor = macas * 1.30;
			NumberFormat fmt = NumberFormat.getCurrencyInstance();
			String valorFinalFmt = fmt.format(valor);
			System.out.println("Valor da sua compra: " + valorFinalFmt);
		}
		scan.close();
	}

}
