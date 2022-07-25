package Atividades;

import java.util.Scanner;

public class AreaCircunfe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double PI = Math.PI;
		double area;
		
		System.out.println("Informe o valor do raio da circunferência para calcular a sua área");
		double raio = scan.nextDouble();
		raio = Math.pow(raio, 2);
		area = PI * raio;
		
		System.out.printf("A área da circunferência é = %.2f", area);
		scan.close();
		
	}

}
