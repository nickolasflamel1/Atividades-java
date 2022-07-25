package Atividades;

import java.util.Scanner;

public class x1x2y1y2 {
	
	public static double DistanciaXY(double x2, double x1, double y2, double y1) {
		double distanciaXY = Math.sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
		return distanciaXY;
	}

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double x1,x2,y1,y2;
		
		System.out.print("x1: ");
		x1 = leia.nextDouble();
		System.out.print("y1: ");
		y1 = leia.nextDouble();
		System.out.print("x2: ");
		x2 = leia.nextDouble();
		System.out.print("y2: ");
		y2 = leia.nextDouble();
		
		System.out.printf("%.4f", DistanciaXY(x2,x1,y2,y1));
		
		leia.close();	
	}

}
