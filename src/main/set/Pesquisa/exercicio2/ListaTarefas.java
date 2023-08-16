package main.set.Pesquisa.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public Set<Tarefa> getTarefasSet() {
        return tarefasSet;
    }
    
    public void adicionarTarefa(Tarefa tarefa) {
        tarefasSet.add(tarefa);
    }
    
    public void removerTarefa(Tarefa tarefa) {
        tarefasSet.remove(tarefa);
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t: tarefasSet) {
            if(t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t: tarefasSet) {
            if(!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(Tarefa tarefa) {
        for(Tarefa t: tarefasSet) {
            if(t.equals(tarefa)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(Tarefa tarefa) {
        for(Tarefa t: tarefasSet) {
            if(t.equals(tarefa)){
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
    }
}
