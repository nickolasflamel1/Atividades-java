package Atividades;

import java.util.Scanner;

public class AreaDoRetangulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a base do ret�ngulo: ");
		double base = input.nextDouble();
		System.out.println("Informe a altura do ret�ngulo: ");
		double altura = input.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A �rea do ret�ngulo � = " + area);
		
		input.close();
	}

}
