package Atividades;

import java.util.Scanner;

public class MaiorQ10 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double num = read.nextDouble();
		
		if(num > 10) {
			System.out.println("NÚMERO MAIOR QUE 10");
		} else {
			System.out.println("NÃO É MAIOR QUE 10");
		}
		read.close();

	}
}
