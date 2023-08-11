package main.list.OperacoesBasicas.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefa.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaTarefa);
    }

    public List<Tarefa> getListaTarefa() {
        return listaTarefa;
    }

    public void setListaTarefa(List<Tarefa> listaTarefa) {
        this.listaTarefa = listaTarefa;
    }

}
