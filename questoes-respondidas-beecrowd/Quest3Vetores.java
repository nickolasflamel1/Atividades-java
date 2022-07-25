package Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest3Vetores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cheque;
        String livro;
        String aluno;
        String endereco;
        String cadastro;

        List<Dados> users = new ArrayList<>();

        for(int i = 0; i < 2; i++){

            Dados dados = new Dados();

            System.out.println("Cheque: ");
            cheque = scan.nextLine();
            dados.setCheque(cheque);
            System.out.println("Livro: ");
            livro = scan.nextLine();
            dados.setLivro(livro);
            System.out.println("Aluno: ");
            aluno = scan.nextLine();
            dados.setAluno(aluno);
            System.out.println("Endereço: ");
            endereco = scan.nextLine();
            dados.setEndereco(endereco);
            System.out.println("Cadastro: ");
            cadastro = scan.nextLine();
            dados.setCadastro(cadastro);

            users.add(dados);
        }
        for(Dados d: users) {
           System.out.println(d.toString());
        }
    }
}