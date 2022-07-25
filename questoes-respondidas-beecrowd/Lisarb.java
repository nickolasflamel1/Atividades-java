package Atividades;

import java.util.Scanner;

public class Lisarb {
	
	/* from 0.00 to 2,000.00     || sem taxa
	 * from 2,000.01 to 3,000.00 || 8% (0,08)
	 * from 3,000.01 to 4,500.00 || 18% (0,18)
	 * more than 4,500.00        || 28% (0,28)
	 * 
	 * R$ 3.002,00 por exemplo, a alíquota de 8% é apenas acima de R$ 1.000,00, 
	 * pois o salário de R$ 0,00 a R $ 2.000,00 é isento de impostos. 
	 * No exemplo a seguir, a alíquota total é de 8% sobre R$ 1.000,00 + 18% sobre R$ 2,00, 
	 * resultando em R$ 80,36 ao todo
	*/
	
	public static double Taxa(double valor) {
		double taxa = 0;
		double diferenca;
		
		if(valor > 4500) {
			taxa = (1000 * 0.08) + (1500 * 0.18);
			diferenca = valor - 4500;
			taxa += diferenca * 0.28;
		} else if(valor > 3000) {
			taxa = 1000 * 0.08;
			diferenca = valor - 3000;
			taxa += diferenca * 0.18;
		} else if(valor > 2000) {
			diferenca = valor - 2000;
			taxa = diferenca * 0.08;
		} 
		if(taxa > 0) {
			System.out.printf("R$ %.2f", taxa);
		} else {
			System.out.println("Isento");
		}
		return taxa;
	}
	
	public static void main(String[] args) {
		
		double salario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salário para saber o valor do seu imposto de renda: ");
		salario = scan.nextDouble();
		
		Taxa(salario);
		scan.close();
	}

}
