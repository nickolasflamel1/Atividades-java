package Atividades;

import java.util.Scanner;

public class SomaImparesXeY {
	
	public static int somaImpares(int x, int y) {
		int soma = 0;
		int i;
		
		if(x < y) {
			for(i = x+1; i < y; i++ ) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for(i = y+1; i < x; i++ ) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
		}
		return soma;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("X");
		x = scan.nextInt();
		System.out.println("Y");
		y = scan.nextInt();
		
		System.out.printf("%d\n", somaImpares(x,y));
		scan.close();
		
	}

}
