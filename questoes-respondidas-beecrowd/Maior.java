package Atividades;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero");
		double num1 = scan.nextDouble();
		System.out.println("Informe um n�mero");
		double num2 = scan.nextDouble();
		
		while(num1 == num2) {
			System.out.println("N�meros n�o podem ser iguais, digite outro n�mero: ");
			num2 = scan.nextDouble();
		}
		if(num1 > num2) {
			double maior = num1;
			System.out.println("O maior n�mero �: " + maior);
		} else {
			double maior = num2; 
			System.out.println("O maior n�mero �: " + maior);
		}
		scan.close();	
	}

}
