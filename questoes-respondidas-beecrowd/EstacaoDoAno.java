package Atividades;

import java.util.Scanner;

public class EstacaoDoAno {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o dia (DD)");
		int dia = input.nextInt();
		System.out.println("Informe o m�s (MM)");
		int mes = input.nextInt();
		System.out.println("Informe o ano(AAAA)");
		int ano = input.nextInt();
		
		if((dia >= 1 && dia < 31) && (mes >= 3 && mes <= 5))
		{
			System.out.println("Primavera no hemisf�rio Norte");
			System.out.println("Outono no hemisf�rio Sul");	
			
		} 
		else if((dia >= 1 && dia < 31) && (mes >= 6 && mes <= 8)) 
		{
			System.out.println("Ver�o no hemisf�rio Norte");
			System.out.println("Inverno no hemisf�rio Sul");	
		}
		else if((dia >= 1 && dia < 30) && (mes >= 9 && mes <= 11))
		{
			System.out.println("Outono no hemisf�rio Norte");
			System.out.println("Primavera no hemisf�rio Sul");	
		}
		else if((dia >= 1 && dia < 28) && (mes >= 2 && mes <= 12))
		{
			System.out.println("Inverno no hemisf�rio Norte");
			System.out.println("Ver�o no hemisf�rio Sul");	
		}
		input.close();
	}

}
