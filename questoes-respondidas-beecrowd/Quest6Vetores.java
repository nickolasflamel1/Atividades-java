package Atividades;

public class Quest6Vetores {
    public static void main(String[] args) {

        double[][] mat =    {{5.6, 7.8, 5.0},
                            {8.9, 10.0,3.2}};
        int i ,j;
        double soma = 0;

        for(i = 0; i < 2; i++) { //qt de linhas
            for(j = 0; j < 3; j++) { //qt de columns
                soma += mat[i][j];
            }
        }
        System.out.println(soma);
    }
}
