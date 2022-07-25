package Atividades;

public class SomaPares {

	public static void main(String[] args) {
		
		int somaPares = 0;
		
		for(int num = 1; num <= 599; num++) {
			if(num%2==0) {
				somaPares += num;
			}
		}
		System.out.println("A soma dos números pares é de: " + somaPares);

	}

}
