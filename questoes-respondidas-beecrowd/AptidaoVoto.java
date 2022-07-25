package Atividades;

import java.util.Scanner;

public class AptidaoVoto {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Informe o ano atual");
		int ano_atual = user_input.nextInt();
		
		System.out.println("Ano de nascimento");
		int ano_nascimento = user_input.nextInt();
		
		int idade = ano_atual - ano_nascimento;
		
		if(idade < 16) {
			System.out.println("Não vota!");
		} else if((idade >=16 && idade < 18) || (idade > 70)) {
			System.out.println("Voto opcional");
		} else {
			System.out.println("Voto obrigatório!");
		}
		user_input.close();
	}

}
