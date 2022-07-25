package Atividades;

public class NumInt1Ate10 {

	public static void main(String[] args) {
		
		int n = 1;
		int soma = 0;
		
		while(n <= 10) {
			soma += n;
			n += 1;
		}
		System.out.println("A soma entre 1 e 10 é: " + soma);

	}

}
