package Atividades;

import java.text.NumberFormat;
import java.util.Scanner;

public class HorasTrabalho {

	public static void main(String[] args) {
		
		/*LER: n�mero do funcion�rio
		 * quantidade de horas trabalhadas no m�s
		 * valor recebido por hora trabalhada
		 * ESCREVER: n�mero do funcion�rio
		 * sal�rio ao final do m�s
		*/
		
		int numero_func;
		int horas_de_trab;
		double valor_por_hora;
		double salario_final;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("N�mero do funcion�rio: ");
		numero_func = scan.nextInt();
		
		System.out.print("Quantidade total de horas trabalhadas no m�s: ");
		horas_de_trab = scan.nextInt();
		
		System.out.print("Valor recebido por hora: ");
		valor_por_hora = scan.nextDouble();
		
		salario_final = horas_de_trab * valor_por_hora;
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String salario_final_func = fmt.format(salario_final);
		
		System.out.println();
		System.out.println("N�MERO = " + numero_func);
		System.out.print("SAL�RI = " + salario_final_func);
		scan.close();
		
	}

}
