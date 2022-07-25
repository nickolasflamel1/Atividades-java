package Atividades;

import java.util.Scanner;

public class DistanciaCarro {
	
	public static int Distancia(int distancia) {
		return distancia * 2;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int distancia;
		
		System.out.print("Informe a distância: ");
		distancia = scan.nextInt();
		System.out.println(Distancia(distancia) + " minutos");
		scan.close();

	}

}
