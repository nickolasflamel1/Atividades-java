package Atividades;

public class MultiplosPositivos {

	public static void main(String[] args) {
		
		int multiplos_positivos = 0;
		
		for(int i = 620; i >= 49; i--) {
			if(i%7==0)  {
				multiplos_positivos = i;
				System.out.println("Os m�ltiplos positivos de 7 s�o: " + multiplos_positivos);
			}
		}

	}

}
