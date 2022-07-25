package Atividades;

public class ParesCompreendidosEntre85e907 {

	public static void main(String[] args) {
		
		int numPares = 0;
		int somaPares = 0;
		
		for(int i = 85; i < 907; i++) {
			if(i%2==0) {
				numPares = i;
				somaPares += i;
				
				System.out.println("Os números pares compreendidos entre 85 e 907 são: " + numPares);
			} 
		}
		System.out.println("\nA soma de todos os números pares compreendidos entre 85 e 907 é de: " + somaPares);
		
	}
}
