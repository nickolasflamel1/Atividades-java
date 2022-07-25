package Atividades;

public class Quest4Vetores {
    public static void main(String[] args) {

        int[] vetorUm = {4,5,6,7,8};
        int[] vetorDois = {1,2,3,4,5};
        int[] vetorTres = new int[vetorUm.length + vetorDois.length];

        for(int i = 0, j = 0; i < vetorTres.length; i+=2, j++) {
            System.out.println(vetorTres[ i ] = vetorUm[ j ]);
            System.out.println(" ");
            System.out.println(vetorTres[ i + 1 ] = vetorDois[ j ]);
            System.out.println(" ");
        }
    }
}
