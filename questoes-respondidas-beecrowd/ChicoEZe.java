package Atividades;

public class ChicoEZe {

	public static void main(String[] args) {
		
		double chico = 1.5;
		double ze = 1.1;
		int qtAnos = 0;
		
		while(chico >= ze) {
			ze += 0.03;
			chico += 0.02;
			qtAnos++;
		}
		System.out.println("A quantidade de anos para que Zé fique maior que Chico é: " + qtAnos + " anos");
	}
}
