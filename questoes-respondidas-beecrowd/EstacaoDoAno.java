package Atividades;

import java.util.Scanner;

public class EstacaoDoAno {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o dia (DD)");
		int dia = input.nextInt();
		System.out.println("Informe o mês (MM)");
		int mes = input.nextInt();
		System.out.println("Informe o ano(AAAA)");
		int ano = input.nextInt();
		
		if((dia >= 1 && dia < 31) && (mes >= 3 && mes <= 5))
		{
			System.out.println("Primavera no hemisfério Norte");
			System.out.println("Outono no hemisfério Sul");	
			
		} 
		else if((dia >= 1 && dia < 31) && (mes >= 6 && mes <= 8)) 
		{
			System.out.println("Verão no hemisfério Norte");
			System.out.println("Inverno no hemisfério Sul");	
		}
		else if((dia >= 1 && dia < 30) && (mes >= 9 && mes <= 11))
		{
			System.out.println("Outono no hemisfério Norte");
			System.out.println("Primavera no hemisfério Sul");	
		}
		else if((dia >= 1 && dia < 28) && (mes >= 2 && mes <= 12))
		{
			System.out.println("Inverno no hemisfério Norte");
			System.out.println("Verão no hemisfério Sul");	
		}
		input.close();
	}

}
