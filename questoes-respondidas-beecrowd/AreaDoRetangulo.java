package Atividades;

import java.util.Scanner;

public class AreaDoRetangulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a base do retângulo: ");
		double base = input.nextDouble();
		System.out.println("Informe a altura do retângulo: ");
		double altura = input.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A área do retângulo é = " + area);
		
		input.close();
	}

}
