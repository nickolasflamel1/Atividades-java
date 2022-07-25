package Atividades;

import java.text.NumberFormat;
import java.util.Scanner;

public class SalarioFixo {

	public static void main(String[] args) {
		// LER: salario fixo, valor total de vendas
		// total de vendas <= 1.500 comissao de 3% // > 1.500 comissao de 5%
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Informe o salário fixo: ");
		double salario_fixo = user_input.nextDouble();
		
		System.out.println("Informe o valor total das vendas");
		double valor_total_vendas = user_input.nextDouble();
		
		if(valor_total_vendas <= 1500) {
			double comissao = (valor_total_vendas * 3)/100;
			double ajuste_salario = salario_fixo + comissao;
			
			NumberFormat fmt = NumberFormat.getCurrencyInstance();
			String salario_final = fmt.format(ajuste_salario);
			System.out.println("O seu salário final é de " + salario_final);
			
		} else {
			double comissao = (0.03 * 1500) + (valor_total_vendas - 1500) * 0.05;
			double ajuste_salario = salario_fixo + comissao;
			
			NumberFormat fmt = NumberFormat.getCurrencyInstance();
			String salario_final = fmt.format(ajuste_salario);
			System.out.println("O seu salário final é de " + salario_final);
		}
		user_input.close();	
	}
}
