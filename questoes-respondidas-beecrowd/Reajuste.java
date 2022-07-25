package Atividades;

import java.text.NumberFormat;
import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		// Ler:
		// salario atual e percentual do reajuste
		// Escrever:
		// valor do novo sal�rio
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual seu sal�rio atual?");
		double Salario_atual = scan.nextDouble();
		
		System.out.println("Qual percentual do reajuste?");
		double reajuste = scan.nextDouble();
		
		double percentual_reajuste = (Salario_atual*reajuste)/100; 
		double Novo_Salario = Salario_atual + percentual_reajuste;
		
		NumberFormat fmtSalario = NumberFormat.getCurrencyInstance();
		String Novo_Salario_fmt = fmtSalario.format(Novo_Salario);
		
		System.out.println("Seu novo sal�rio � " + Novo_Salario_fmt);
		
		scan.close();
	}

}
