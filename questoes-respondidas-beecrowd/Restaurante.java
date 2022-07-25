package Atividades;

import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
		
		int qtVezes;
		int porcentagem1 = 0;
		int porcentagem2 = 0;
		int porcentagem3 = 0;
		int qtdA = 0;
		int qtdB = 0;
		int qtdC = 0;
		
		System.out.println("Informe o número de alunos da univesidade");
		int qtAlunos = scan.nextInt();
		
		System.out.println("Informe o número de vezes que cada aluno foi ao restaurante");
		
		for(int i = 1; i <= qtAlunos; i++) {
			System.out.println("Aluno " + i);
			qtVezes = scan.nextInt();
			
			if(qtVezes < 10) {
				qtdA++;
				porcentagem1 = (qtdA * 100)/qtAlunos;
			}
			if(qtVezes >=10 && qtVezes <= 15) {
				qtdB++;
				porcentagem2 = (qtdB * 100)/qtAlunos;
			}
			if(qtVezes > 15) {
				qtdC++;
				porcentagem3 = (qtdC * 100)/qtAlunos;
			}
		}
		System.out.println("O percentual de alunos que utilizaram o restaurante menos que 10 vezes é de: " + porcentagem1+"%");
		System.out.println("O percentual de alunos que utilizaram o restaurante entre 10 e 15 vezes é de: " + porcentagem2+"%");
		System.out.println("O percentual de alunos que utilizaram o restaurante acima de 15 vezes é de: " + porcentagem3+"%");
		scan.close();
	}

}
