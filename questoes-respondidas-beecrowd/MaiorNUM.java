package Atividades;

import java.util.Scanner;

public class MaiorNUM {
	
	public static int MaiorAB(int A, int B, int C) {
		int maxab, max;
		maxab = (A + B + Math.abs(A - B))/2;
		max = (maxab + C + Math.abs(maxab - C))/2;
		
		return max;
	}

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		
		int A,B,C;
		
		System.out.print("A: ");
		A = leia.nextInt();
		
		System.out.print("B: ");
		B = leia.nextInt();
		
		System.out.print("C: ");
		C = leia.nextInt();
		
		System.out.println(MaiorAB(A,B,C) + " é o maior");
		leia.close();
	}

}
