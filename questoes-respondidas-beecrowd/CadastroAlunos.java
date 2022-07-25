package Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nome;
        String nomeConsulta;
        String dis;
        String media;
        char resp = 'S';
        char resp1 = 'S';

        List<DadosAlunos> cadastro = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {

            while (resp == 'S') {

                DadosAlunos dadosaluno = new DadosAlunos();

                System.out.println("Nome: ");
                nome = scan.nextLine();
                dadosaluno.setNome(nome);

                System.out.println("Disciplina: ");
                dis = scan.nextLine();
                dadosaluno.setDis(dis);

                System.out.println("Média: ");
                media = scan.nextLine();
                dadosaluno.setMedia(media);

                System.out.println("Novo Aluno [S] Sim / [N] Não??");
                resp = scan.nextLine().charAt(0);

                cadastro.add(dadosaluno);
            }
        }

        System.out.println("Deseja consultar algum aluno [S] Sim / [N] Não??");
        resp1 = scan.nextLine().charAt(0);

        while (resp1 == 'S') {
            System.out.println("Digite o nome do aluno: ");
            nomeConsulta = scan.nextLine();

            if (cadastro.contains(nomeConsulta)) {
                cadastro.toString();
            } else {
                System.out.println("Aluno não cadastrado");
            }
            System.out.println("Nova consulta? [S] Sim / [N] Não?");
            resp1 = scan.nextLine().charAt(0);
        }
    }
}
