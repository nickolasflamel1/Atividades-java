package Atividades;

public class Quest2Vetores {
    public static void main(String[] args) {

        int[] vetorUm = {2,3,5,6,10};
        int[] vetorDois = {4,7,8,9,20};
        int[] vetorTres = new int[vetorUm.length];

        for(int i = 0; i < vetorUm.length; i++) {
            System.out.println(vetorTres[i] = vetorUm[i] + vetorDois[i]);
            System.out.println(" ");
        }
    }
}
