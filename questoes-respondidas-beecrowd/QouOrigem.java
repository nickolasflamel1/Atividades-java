package Atividades;

import java.util.Scanner;

public class QouOrigem {
	
	public static void print(String txt) {
		System.out.println(txt);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float x, y;
		
		System.out.println("Informa a primeira coordenada");
		x = scan.nextFloat();
		System.out.println("Informa a segunda coordenada");
		y = scan.nextFloat();
		
		if(x == 0 && y == 0) {
			print("Origem");
		} else if(x == 0) {
			print("Eixo X");
		} else if(y == 0) {
			print("Eixo Y");
		} else if(x > 0 && y > 0) {
			print("Q1");
		} else if(x < 0 && y > 0) {
			print("Q2");
		} else if(x < 0 && y < 0) {
			print("Q3");
		} else if(x > 0 && y < 0) {
			print("Q4");
		}
		scan.close();
	}

}
