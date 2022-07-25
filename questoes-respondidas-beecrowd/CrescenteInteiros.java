package Atividades;

import java.util.Scanner;

public class CrescenteInteiros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b, c;

		System.out.print("Digite um número inteiro: ");
		a = scan.nextInt();
		System.out.print("Digite um número inteiro: ");
		b = scan.nextInt();
		System.out.print("Digite um número inteiro: ");
		c = scan.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();

		if(a < b) {
			if(b < c) {
				System.out.println(a+"\n"+b+"\n"+c);
			} else if(a < c) {
				System.out.println(a+"\n"+c+"\n"+b);
			} else {
				System.out.println(c+"\n"+a+"\n"+b);
			}
		} else if(b < c) {
			if(a < c) {
				System.out.println(b+"\n"+a+"\n"+c);
			} else {
				System.out.println(b+"\n"+c+"\n"+a);
			}
		} else {
			System.out.println(c+"\n"+b+"\n"+a);
		}
		scan.close();

	}

}
