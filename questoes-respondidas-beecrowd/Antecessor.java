package Atividades;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o n�mero ao qual voc� quer ver o seu antecessor");
		int num = scan.nextInt();
		int antecessor =  num - 1;
		System.out.println("O antecessor de " + num + " � igual a " + antecessor);
		
		scan.close();
	}

}
