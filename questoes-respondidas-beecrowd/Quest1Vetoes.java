package Atividades;

public class Quest1Vetoes {
    public static void main(String[] args) {
        String vetorUm[] = {"Nickolas", "Claudiane", "Matheus", "Francileide"};
        String vetorDois[] = new String[vetorUm.length];

        for(int i = 0; i < vetorUm.length; i++) {
            vetorDois[i] = vetorUm[i];
            System.out.println(vetorDois[i] + " ");
        }
    }
}
