package Atividades;

public class Dados {

    String cheque;
    String livro;
    String aluno;
    String endereco;
    String cadastro;

    public String getCheque() {
        return cheque;
    }

    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return
                "Cheque = " + cheque  +
                ", Livro = " + livro  +
                ", Aluno = " + aluno  +
                ", Endereco = " + endereco  +
                ", Cadastro = " + cadastro;
    }
}
