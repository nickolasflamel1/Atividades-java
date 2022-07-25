package Atividades;

import java.util.Scanner;

public class Quest5Vetores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[20];
        int N;
        int i;
        int fim = 19;

        for(i = 0; i < 20; i++) {
            System.out.println(i + 1 + " índice: ");
            vetor[i] = scan.nextInt();
        }
        System.out.println();
        System.out.println("VETOR ORIGINAL");
        for(i = 0; i < 20; i++){
            System.out.println(vetor[i]);
        }

        for(i = 0; i < 10; i++) {
            N = vetor[i];
            vetor[i] = vetor[fim];
            vetor[fim] = N;
            fim--;
        }
        System.out.println();
        System.out.println("VETOR MODIFICADO");
        for(i = 0; i < 20; i++) {
            System.out.println(vetor[i]);
        }
    }
}
