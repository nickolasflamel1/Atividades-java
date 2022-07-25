package Atividades;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int num1 = scan.nextInt();
		System.out.println("Informe um número");
		int num2 = scan.nextInt();
		
		while(num1 == num2) {
			System.out.println("Números não podem ser iguais, digite outro número: ");
			num2 = scan.nextInt();
		}
		if(num1 > num2) {
			int maior = num1;
			int menor = num2;
			System.out.println("A ordem crescente dos números é: " + menor + "," + maior);
		} else {
			int maior = num2;
			int menor = num1;
			System.out.println("A ordem crescente dos números é: " + menor + ", " + maior);
		}
		scan.close();

	}
}
