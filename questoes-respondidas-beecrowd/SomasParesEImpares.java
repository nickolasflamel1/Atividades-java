package Atividades;

public class SomasParesEImpares {

	public static void main(String[] args) {
		
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int i = 100; i <= 1500; i++) {
			if(i%2==0) {
				somaPares += i;
			} else {
				somaImpares += i;
			}
		}
		System.out.println("A soma dos n�meros pares �: " + somaPares 
					+ "\nA soma dos n�meros �mpares �: " + somaImpares);
	}

}
