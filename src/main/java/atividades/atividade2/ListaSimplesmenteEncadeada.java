package atividades.atividade2;

public class ListaSimplesmenteEncadeada {
    private Aluno cabeca;

    public ListaSimplesmenteEncadeada() {
        this.cabeca = null;
    }

    public ListaSimplesmenteEncadeada(Aluno cabeca) {
        this.cabeca = cabeca;
    }

    public Aluno getCabeca() {
        return cabeca;
    }

    public void setCabeca(Aluno cabeca) {
        this.cabeca = cabeca;
    }

    public boolean isEmpty() {
        return this.getCabeca() == null;
    }

    public void adicionarNoInicio(String nome, int matricula) {
        Aluno novoAluno = new Aluno(nome, matricula);
        novoAluno.setProximo(this.getCabeca());
        this.setCabeca(novoAluno);
    }

    public void adicionarNoFinal(String nome, int matricula) {
        Aluno novoAluno = new Aluno(nome, matricula);

        if (this.isEmpty()) {
            this.setCabeca(novoAluno);
            return;
        }

        Aluno alunoAuxiliar = this.getCabeca();
        while (alunoAuxiliar.getProximo() != null) {
            alunoAuxiliar = alunoAuxiliar.getProximo();
        }
        alunoAuxiliar.setProximo(novoAluno);
    }

    public boolean verificarListasIguais(ListaSimplesmenteEncadeada lista) {
        if (this.isEmpty() && lista.isEmpty()) {
            return true;
        }

        if (this.isEmpty() || lista.isEmpty()) {
            return false;
        }

        Aluno alunoAtualA = this.getCabeca();
        Aluno alunoAtualB = lista.getCabeca();

        while (alunoAtualA != null && alunoAtualB != null) {
            if (alunoAtualA.getMatricula() != alunoAtualB.getMatricula()) {
                return false;
            }

            alunoAtualA = alunoAtualA.getProximo();
            alunoAtualB = alunoAtualB.getProximo();
        }

        return alunoAtualA == null && alunoAtualB == null;
    }
}
