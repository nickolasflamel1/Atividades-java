package Atividades;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número");
		double num1 = scan.nextDouble();
		System.out.println("Informe um número");
		double num2 = scan.nextDouble();
		
		while(num1 == num2) {
			System.out.println("Números não podem ser iguais, digite outro número: ");
			num2 = scan.nextDouble();
		}
		if(num1 > num2) {
			double maior = num1;
			System.out.println("O maior número é: " + maior);
		} else {
			double maior = num2; 
			System.out.println("O maior número é: " + maior);
		}
		scan.close();	
	}

}
