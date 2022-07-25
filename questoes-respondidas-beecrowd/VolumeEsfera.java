package Atividades;

import java.util.Scanner;

public class VolumeEsfera {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double PI = Math.PI;
		
		System.out.println("Informe o valor do raio para calcular o valor da esfera");
		double raio = scan.nextDouble();
		raio = Math.pow(raio, 3);
		
		double volume = ((4.0/3) * PI * raio);
		
		System.out.printf("VOLUME = %.3f", volume);
		scan.close();
	}

}
