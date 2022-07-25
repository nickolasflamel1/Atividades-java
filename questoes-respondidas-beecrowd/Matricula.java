package Atividades;

import java.util.Scanner;

public class Matricula {

	public static void line() {
		System.out.println();
	}

	public static int RandomNum(int x, int y) {
		return (int) ((int) x + Math.random() * (y - x));
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int matricula = 0;
		int qtAprovados = 0;
		int qtReprovados = 0;

		System.out.println("Quantos alunos você deseja cadastrar?");
		int qtAlunos = scan.nextInt();
		int i = 1;

		while (i <= qtAlunos) {
			// cadastro do aluno
			matricula = RandomNum(100000, 1000000);
			System.out.println("Nome do Aluno " + i);
			String nome = scan.next();
			System.out.println("Idade do Aluno " + i);
			int idade = scan.nextInt();
			System.out.println("Número da matrícula do Aluno " + i + ": " + matricula);
			// notas do aluno
			System.out.println("-------------------------------------------");
			line();
			System.out.println("1° nota do aluno " + i);
			double nota1 = scan.nextDouble();

			while (nota1 < 0 || nota1 > 10) {
				System.out.println("Nota inválida, digite uma nota válida");
				nota1 = scan.nextDouble();
			}

			System.out.println("2° nota do aluno " + i);
			double nota2 = scan.nextDouble();

			while (nota2 < 0 || nota2 > 10) {
				System.out.println("Nota inválida, digite uma nota válida");
				nota2 = scan.nextDouble();
			}

			System.out.println("3° nota do aluno " + i);
			double nota3 = scan.nextDouble();

			while (nota3 < 0 || nota3 > 10) {
				System.out.println("Nota inválida, digite uma nota válida");
				nota3 = scan.nextDouble();
			}

			line();
			// media do aluno
			double media_final = ((2 * nota1) + (3 * nota2) + (4 * nota3)) / 9;
			if (media_final >= 5) {
				qtAprovados++;
				System.out.printf("O aluno de matrícula: %d foi APROVADO com média final de: %.1f \n", matricula,
						media_final);
			} else {
				qtReprovados++;
				System.out.printf("O aluno de matrícula: %d foi REPROVADO com média final de: %.1f \n", matricula,
						media_final);
				line();
			}
			i += 1;
			System.out.println("-------------------------------------------------------------------");
		}
		System.out.println("Total de alunos da turma: " + qtAlunos 
					+ "\nTotal de alunos APROVADOS: " + qtAprovados
					+ "\nTotal de alunos REPROVADOS: " + qtReprovados);
		scan.close();
	}

}
