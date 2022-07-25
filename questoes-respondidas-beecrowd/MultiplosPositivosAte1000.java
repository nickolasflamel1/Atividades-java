package Atividades;

public class MultiplosPositivosAte1000 {

	public static void main(String[] args) {
		
		int multiplos_positivos = 0;
		
		for(int i = 0; i < 1000; i++) {
			if(i%7==0) {
				multiplos_positivos = i;
				System.out.println("Os multiplos positivos de 7 inferiores a 1000, são: " + multiplos_positivos);
			}
		}
		
	}

}
