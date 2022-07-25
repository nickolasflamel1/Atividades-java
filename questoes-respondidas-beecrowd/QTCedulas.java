package Atividades;

import java.util.Scanner;

public class QTCedulas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cedulas;
		
		System.out.println("Informe um valor");
		cedulas = sc.nextInt();
		
		System.out.printf("%d\n", cedulas);

		System.out.printf("%d notas(s) de R$ 100,00\n", cedulas / 100);

		cedulas = cedulas % 100;

		System.out.printf("%d notas(s) de R$ 50,00\n", cedulas / 50);

		cedulas = cedulas % 50;

		System.out.printf("%d notas(s) de R$ 20,00\n", cedulas / 20);

		cedulas = cedulas % 20;

		System.out.printf("%d notas(s) de R$ 10,00\n", cedulas / 10);

		cedulas = cedulas % 10;

		System.out.printf("%d notas(s) de R$ 5,00\n", cedulas / 5);

		cedulas = cedulas % 5;

		System.out.printf("%d notas(s) de R$ 2,00\n", cedulas / 2);

		cedulas = cedulas % 2;

		System.out.printf("%d notas(s) de R$ 1,00\n", cedulas / 1);
		
		sc.close();

	}

}
