package Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clientes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        String endereco;
        String telefone;
        char resp = 'S';

        List<DadosCliente> registro = new ArrayList<>();

        for (int i = 0; i <= 40; i++) {

            while (resp == 'S') {

                DadosCliente dados = new DadosCliente();

                System.out.println("Nome: ");
                nome = scan.nextLine();
                dados.setNome(nome);

                System.out.println("Endereço: ");
                endereco = scan.nextLine();
                dados.setEndereco(endereco);

                System.out.println("Telefone: ");
                telefone = scan.nextLine();
                dados.setTelefone(telefone);

                System.out.println("Novo Cliente (S/N)?");
                resp = scan.nextLine().charAt(0);

                registro.add(dados);
            }

        }
        for (DadosCliente d : registro) {
            System.out.println(d.toString());
        }
    }
}
