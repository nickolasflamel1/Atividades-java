package Atividades;

import java.util.Scanner;

public class XImpares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X, i;

		System.out.println("Digite um número");
		X = scan.nextInt();
		
		i = 1;
		while(i <= X) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
		scan.close();
	}

}
