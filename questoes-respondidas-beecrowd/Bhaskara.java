package Atividades;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float a,b,c, delta;
		
		System.out.print("A: ");
		a = scan.nextFloat();
		System.out.print("B: ");
		b = scan.nextFloat();
		System.out.print("C: ");
		c = scan.nextFloat();
		
		delta = b*b - 4*a*c;
		
		if(delta < 0 || a == 0) {
			System.out.println("Impossível calcular");
		} else {
			double Raiz1 = (-b + Math.sqrt(delta)) / (2*a);
			double Raiz2 = (-b - Math.sqrt(delta)) / (2*a);
			
			System.out.printf("R1 = %.5f\n", Raiz1);
			System.out.printf("R2 = %.5f\n", Raiz2);
		}
		scan.close();
		
	}

}
