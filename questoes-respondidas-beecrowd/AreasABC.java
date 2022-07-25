package Atividades;

import java.util.Scanner;

public class AreasABC {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double PI = Math.PI;
		double A,B,C,raio;
		double area_triangulo_retangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo;
		
		System.out.print("A: ");
		A = leia.nextDouble();
		
		System.out.print("B: ");
		B = leia.nextDouble();
		
		System.out.print("C: ");
		C = leia.nextDouble();
		
		area_triangulo_retangulo = (A * C)/2;
		
		raio = Math.pow(C, 2);
		area_circulo = PI * raio;
		
		area_trapezio = ((A + B) * C)/2;
		
		raio = Math.pow(B, 2);
		area_quadrado = raio;
		
		area_retangulo = A * B;
		
		System.out.println();
		System.out.printf("TRIÂNGULO: %.3f\n", area_triangulo_retangulo);
		System.out.printf("CÍRCULO: %.3f\n", area_circulo);
		System.out.printf("TRAPÉZIO: %.3f\n", area_trapezio);
		System.out.printf("QUADRADO: %.3f\n", area_quadrado);
		System.out.printf("RETÂNGULO: %.3f\n", area_retangulo);
		
		leia.close();

	}

}
