package main.list.OperacoesBasicas.exercicio1;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }


    @Override
    public String toString() {
        return "Descricao= " + getDescricao();
    }

    
}
