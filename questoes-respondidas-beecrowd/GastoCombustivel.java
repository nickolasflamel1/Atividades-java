package Atividades;

import java.util.Scanner;

public class GastoCombustivel {
	
	public static float GasolinaGasta(float tempoGasto, float velocidadeMedia) {
		float distancia = tempoGasto * velocidadeMedia;
		return distancia / 12;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		float tempoGasto, velocidadeMedia;
		
		System.out.print("Tempo gasto: ");
		tempoGasto = scan.nextFloat();
		System.out.println("Velocidade média: ");
		velocidadeMedia = scan.nextFloat();
		
		System.out.printf("%.3f ", GasolinaGasta(tempoGasto, velocidadeMedia));
		
		scan.close();
		

	}

}
