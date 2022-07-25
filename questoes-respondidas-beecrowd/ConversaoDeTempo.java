package Atividades;

import java.util.Scanner;

public class ConversaoDeTempo {
	
	public static int ConversaoHoras(int segundos) { //1 hora corresponde a 3600 segundos
		return segundos / 3600;
	}
	public static int ConversaoMinutos(int segundos) { //resto da divisão pela qt de seguntos de 1 hora dividido pela qt de minutos de 1hora
		return (segundos % 3600)/60;
	}
	public static int ConversaoSegundos(int segundos) { //resto da divisão pela quantidade de minutos de 1 hora
		return segundos % 60;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N;
		
		System.out.println("Informe um valor para converte-lo em horas");
		N = sc.nextInt();
		
		System.out.printf("%d:%d:%d", ConversaoHoras(N), ConversaoMinutos(N), ConversaoSegundos(N));
		sc.close();
	}

}
