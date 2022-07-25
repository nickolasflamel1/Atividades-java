package Atividades;

import java.text.NumberFormat;
import java.util.Scanner;

public class RevendedoraDeCarros {

	public static void main(String[] args) {
		// LER:
		// qt de carros vendidos
		// valor total das vendas 
		// salario fixo
		// valor recebido por carro vendido
		
		// ESCREVER:
		// salario final do funcionario
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o número de carros vendidos?");
		int Qt_carros_vendidos = leia.nextInt();
		
		System.out.println("Informe o valor total das suas vendas");
		double Valor_total_vendas = leia.nextDouble();
		
		System.out.println("Informe seu salário fixo");
		double Salario_fixo = leia.nextDouble();
		
		System.out.println("Informe o valor recebido por carro vendido");
		double Valor_por_carro_vendido = leia.nextDouble();
		
		double comissao1 = Qt_carros_vendidos * Valor_por_carro_vendido;
		double comissao2 = Valor_total_vendas * 0.05; 
		
		double Comissao_final = comissao1 + comissao2;
		
		double Salario_final = Salario_fixo + Comissao_final;
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String Salario_final_fmt = fmt.format(Salario_final);
		
		System.out.println("O seu salário final é de: " + Salario_final_fmt);
		
		leia.close();

	}
}
