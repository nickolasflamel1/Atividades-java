package Atividades;

import java.util.Scanner;

public class QtEstoque {

	public static void main(String[] args) {
		/* LER:
		 * qt atual em estoque
		 * qt minima em estoque
		 * qt maxima em estoque
		 * ESCREVER:
		 * qt media (quantidade (m�dia = quantidade m�xima + quantidade m�nima)/2
		 * qt em estoque >= qt media "Nao efetuar compra"
		 * senao "Efetuar compra"	
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa a quantidade m�nima do estoque");
		int qt_min_estoque = scan.nextInt();
		
		System.out.println("Informe a quantidade m�xima do estoque");
		int qt_max_estoque = scan.nextInt();
		
		System.out.println("Informa a quantidade atual do estoque");
		int qt_atual_estoque = scan.nextInt();
		
		double qt_media_estoque = (qt_max_estoque + qt_min_estoque)/2;
		
		if(qt_atual_estoque >= qt_media_estoque) {
			System.out.println("N�o efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
		scan.close();
		
	}

}
