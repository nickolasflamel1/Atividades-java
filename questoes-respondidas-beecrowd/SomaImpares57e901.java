package Atividades;

public class SomaImpares57e901 {

	public static void escreva(String txt) {
		System.out.println(txt);
	}

	public static void main(String[] args) {

		int somaImpares = 0;
		int impares = 0;
		int inicio = 57;
		int fim = 901;

		while (inicio <= fim) {
			impares = inicio;
			somaImpares += impares;
			escreva("Os números ímpares compreendidos entre 57 e 901: " + impares);
			inicio += 2;
		}
		escreva("A soma dos números ímpares compreendidos entre 57 e 901 é = " + somaImpares);

	}

}
