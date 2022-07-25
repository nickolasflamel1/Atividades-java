package Atividades;

public class DadosAluno {

    String nome;
    String disciplina;
    double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno cadastrado!" +
                "nome = " + nome +
                ", disciplina = " + disciplina +
                ", media = " + media;
    }
}