package Atividades;

public class DadosAlunos {

    String nome;
    String dis;
    String media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno cadastrado!" +
                " nome = " + nome +
                ", disciplina = " + dis +
                ", media = " + media;
    }
}
