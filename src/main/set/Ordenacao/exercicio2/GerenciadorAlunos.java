package main.set.Ordenacao.exercicio2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public Set<Aluno> getAlunosSet() {
        return alunosSet;
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        for(Aluno a: alunosSet) {
            if(a.getMatricula() == matricula) {
                alunosSet.remove(a);
                return;
            }
        }
        System.out.println("Matrícula não existe");
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Gabriel", 100, 10);
        gerenciadorAlunos.adicionarAluno("Dan", 102, 10);


        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

    }
}
