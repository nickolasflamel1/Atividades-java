package Atividades;

import java.text.NumberFormat;
import java.util.Scanner;

public class TotalPrecoProduto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int codigo;
		int[] qt = new int[2];
		double[] preco = new double[2];
		double total, total2, totalfinal = 0;

		for (int i = 0; i <= 1; i++) {
			
			System.out.print("Código do produto: ");
			codigo = scan.nextInt();
			System.out.print("Quantidade: ");
			qt[i] = scan.nextInt();
			System.out.print("Valor: ");
			preco[i] = scan.nextDouble();
			
		}
		total = qt[0] * preco[0];
		total2 = qt[1] * preco[1];
		totalfinal = total + total2;
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String total_final = fmt.format(totalfinal);
		
		System.out.println();
		System.out.println("VALOR A PAGAR: " + total_final);
		scan.close();
	}

}
