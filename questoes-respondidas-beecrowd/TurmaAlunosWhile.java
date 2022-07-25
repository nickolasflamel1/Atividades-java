package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class TurmaAlunosWhile {

	public static void main(String[] args) {
		// idade media dos alunos com menos de 1.70m
		// a altura média dos alunos com mais de 20 anos

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int i = 1;
		int idade = 0;
		int somaIdade = 0;
		int qtIdade = 0;

		double altura;
		double somaAltura = 0;
		int qtAltura = 0;

		while (i <= 87) {
			System.out.println("Idade aluno " + i + ":");
			idade = scan.nextInt();
			System.out.println("Altura aluno " + i + ":");
			altura = scan.nextDouble();

			if (altura < 1.70) {
				somaIdade += idade;
				qtIdade++;
			}

			if (idade > 20) {
				somaAltura += altura;
				qtAltura++;
			}
			i++;
		}
		int mediaIdade;
		double mediaAltura;

		if (somaIdade == 0 && somaAltura != 0) {
			mediaAltura = somaAltura / qtAltura;
			System.out.println("A idade média dos alunos com menos de 1.70m de altura: NULO");
			System.out.printf("A altura média dos alunos com mais de 20 anos: %.2f metros.", mediaAltura);
		} else if (somaAltura == 0) {
			mediaIdade = somaIdade / qtIdade;
			System.out.println("A idade média dos alunos com menos de 1.70m de altura: " + mediaIdade + " anos.");
			System.out.println("A altura média dos alunos com mais de 20 anos: NULO");
		} else if ((somaIdade == 0) && (somaAltura == 0)) {
			System.out.println("A idade média dos alunos com menos de 1.70m de altura: NULO");
			System.out.println("A altura média dos alunos com mais de 20 anos: NULO");
		} else {
			mediaAltura = somaAltura / qtAltura;
			mediaIdade = somaIdade / qtIdade;
			System.out.println("A idade média dos alunos com menos de 1.70m de altura: " + mediaIdade + " anos.");
			System.out.printf("A altura média dos alunos com mais de 20 anos: %.2f metros.", mediaAltura);
		}
		scan.close();

	}

}