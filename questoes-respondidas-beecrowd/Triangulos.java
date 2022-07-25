package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Triangulos {

	public static void print(String txt) {
		System.out.println(txt);
	}

	public static void main(String[] args) {

		/*
		 * Leia 3 números duplos (A, B e C) representando os lados de um triângulo e
		 * organize-os em ordem decrescente, de modo que o lado A seja o maior dos três
		 * lados. Em seguida, determine o tipo de triângulo que eles podem fazer, com
		 * base nos seguintes casos, sempre escrevendo uma mensagem apropriada:
		 * 
		 * se A ≥ B + C, escreva a mensagem: NÃO FORMA TRIÂNGULO
		 * 
		 * se A 2 = B 2 + C 2 , escreva a mensagem: TRIÂNGULO RETANGULO
		 * 
		 * se A 2 > B 2 + C 2 , escreva a mensagem: TRIÂNGULO OBTUSANGULO
		 * 
		 * se A 2 <B 2 + C 2 , escreva a mensagem: TRIÂNGULO ACUTANGULO
		 * 
		 * se os três lados forem do mesmo tamanho, escreva a mensagem: TRIÂNGULO EQUILATERO
		 * 
		 * se apenas dois lados são iguais e o terceiro é diferente, escreva a mensagem: TRIÂNGULO ISOSCELES
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double A, B, C, AUX;

		System.out.println("LADOS DE UM TRIÂNGULO");
		System.out.print("Lado A: ");
		A = scan.nextDouble();
		System.out.print("Lado B: ");
		B = scan.nextDouble();
		System.out.print("Lado C: ");
		C = scan.nextDouble();

		if (A < B) {
			AUX = A;
			A = B;
			B = AUX;
		}
		if (A < C) {
			AUX = A;
			A = C;
			C = AUX;
		}
		if (B < C) {
			AUX = B;
			A = C;
			C = AUX;
		}
		if (A >= B + C) {
			print("NÃO FORMA TRIÂNGULO");
		} else if (A * A == B * B + C * C) {
			print("TRIÂNGULO RETÂNGULO");
		} else if (A * A > B * B + C * C) {
			print("TRIÂNGULO OBTUSÂNGULO");
		} else if (A * A < B * B + C * C) {
			print("TRIÂNGULO ACUTÂNGULO");
		} else if (A == B && A == C && B == C) {
			print("TRIÂNGULO EQUILATERO");
		} else if (A == B || A == C || B == C) {
			print("TRIÂNGULO ISÓSCELES");
		}
		scan.close();

	}

}
