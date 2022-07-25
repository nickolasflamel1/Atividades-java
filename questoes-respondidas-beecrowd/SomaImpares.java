package Atividades;

public class SomaImpares {

	public static void main(String[] args) {

		int somaImpares = 0;
		
		for(int i = 57; i <= 901; i++) {
			if(i%2==1) {
				System.out.println("Os números ímpares entre 57 e 901 são: " + i);
				somaImpares += i;
			} 
		}
		System.out.println("A soma dos números ímpares é: " + somaImpares);	
	}
}
