package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class EmExame {
	
	public static float media(float N1, float N2, float N3, float N4) {
		float media;
		media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1)/10;
		return media;
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		float N1 = scan.nextFloat();
		System.out.println("Digite a segunda nota");
		float N2 = scan.nextFloat();
		System.out.println("Digite a terceira nota");
		float N3 = scan.nextFloat();
		System.out.println("Digite a quarta nota");
		float N4 = scan.nextFloat();
		float media = media(N1,N2,N3,N4);
		
		if(media >= 7) {
			System.out.println("Aluno aprovado.");
			System.out.println("Mídia: " + media);
		} else if(media < 5) {
			System.out.println("Mídia: " + media);
			System.out.println("Aluno reprovado.");
		} else if(media >= 5 && media < 7) {
			System.out.println("Mídia: " + media);
			System.out.println("Aluno em exame.");
			System.out.print("Nota do exame: ");
			float notaExame = scan.nextFloat();
			float mediafinal = (media + notaExame)/2;
			
			if(mediafinal >= 5) {
				System.out.println("Aluno aprovado.");
				System.out.println("Final de mídia: " + mediafinal);
			} else {
				System.out.println("Mídia: " + mediafinal);
				System.out.println("Aluno reprovado.");
			}
			
		}
		scan.close();
	}

}
