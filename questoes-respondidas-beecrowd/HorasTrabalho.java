package Atividades;

import java.text.NumberFormat;
import java.util.Scanner;

public class HorasTrabalho {

	public static void main(String[] args) {
		
		/*LER: número do funcionário
		 * quantidade de horas trabalhadas no mês
		 * valor recebido por hora trabalhada
		 * ESCREVER: número do funcionário
		 * salário ao final do mês
		*/
		
		int numero_func;
		int horas_de_trab;
		double valor_por_hora;
		double salario_final;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número do funcionário: ");
		numero_func = scan.nextInt();
		
		System.out.print("Quantidade total de horas trabalhadas no mês: ");
		horas_de_trab = scan.nextInt();
		
		System.out.print("Valor recebido por hora: ");
		valor_por_hora = scan.nextDouble();
		
		salario_final = horas_de_trab * valor_por_hora;
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String salario_final_func = fmt.format(salario_final);
		
		System.out.println();
		System.out.println("NÚMERO = " + numero_func);
		System.out.print("SALÁRI = " + salario_final_func);
		scan.close();
		
	}

}
