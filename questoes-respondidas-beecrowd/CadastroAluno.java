package Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        String nome_consulta;
        String disciplina;
        double media;
        int resp = 1;

        List<DadosAluno> cadastro = new ArrayList<>();

        for (int i = 0; i <= 2; i++) {

            while (resp == 1) {

                DadosAluno dados_aluno = new DadosAluno();

                System.out.println("Nome: ");
                nome = scan.nextLine();
                dados_aluno.setNome(nome);

                System.out.println("Disciplina: ");
                disciplina = scan.nextLine();
                dados_aluno.setDisciplina(disciplina);

                System.out.println("Média: ");
                media = scan.nextDouble();
                dados_aluno.setMedia(media);

                System.out.println("[1] cadastrar outro aluno");
                System.out.println("[2] consulta de alunos");
                resp = scan.nextInt();

                cadastro.add(dados_aluno);

                if (resp == 2) {
                    System.out.println("CONSULTA DE ALUNOS");
                    System.out.println("Digite o nome do aluno: ");
                    nome_consulta = scan.nextLine();

                    if (nome_consulta.equals(dados_aluno.getNome())) {
                        dados_aluno.toString();
                    } else {
                        System.out.println("Aluno não cadastrado");
                    }
                }
            }
        }
    }
}
