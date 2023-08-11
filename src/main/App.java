package main;

import main.list.OperacoesBasicas.ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa lista = new ListaTarefa();

        lista.adicionarTarefa("primeira tarefa");
        lista.adicionarTarefa("segunda tarefa");
        lista.adicionarTarefa("terceira tarefa");

        lista.obterDescricoesTarefas();

        lista.removerTarefa("primeira tarefa");
        System.out.println("Total tarefas:"+lista.obterNumeroTotalTarefas());
        lista.obterDescricoesTarefas();
    }
}
