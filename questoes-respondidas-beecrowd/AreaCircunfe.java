package Atividades;

import java.util.Scanner;

public class AreaCircunfe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double PI = Math.PI;
		double area;
		
		System.out.println("Informe o valor do raio da circunfer�ncia para calcular a sua �rea");
		double raio = scan.nextDouble();
		raio = Math.pow(raio, 2);
		area = PI * raio;
		
		System.out.printf("A �rea da circunfer�ncia � = %.2f", area);
		scan.close();
		
	}

}
