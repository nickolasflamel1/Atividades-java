package Atividades;

import java.util.Scanner;

public class FuncaoBaskhara {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float a,b,c;
		
		System.out.print("A: ");
		a = scan.nextFloat();
		System.out.print("B: ");
		b = scan.nextFloat();
		System.out.print("C: ");
		c = scan.nextFloat();
		
		Bhaskara(a, b, c);
		scan.close();
		
	}
	
	public static void Bhaskara(float a, float b, float c) {
		
		float raiz1 = 0;
		float raiz2 = 0;
		double delta = b*b - 4*a*c;
		
		if(delta < 0 || a == 0) {
			System.out.println("Impossível calcular");
		} else {
			raiz1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
			raiz2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
			
			System.out.printf("R1 = %.5f\n", raiz1);
			System.out.printf("R2 = %.5f\n", raiz2);
		}
	}
}
