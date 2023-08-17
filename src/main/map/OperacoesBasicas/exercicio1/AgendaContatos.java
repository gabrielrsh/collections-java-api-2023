package main.map.OperacoesBasicas.exercicio1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        agendaContatoMap = new HashMap<>();
    }

    public Map<String, Integer> getAgendaContatoMap() {
        return agendaContatoMap;
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            return agendaContatoMap.get(nome);
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gabriel", 1);
        agendaContatos.adicionarContato("Jaop", 2);
        agendaContatos.adicionarContato("Dani", 22);
        agendaContatos.adicionarContato("Gabriel", 34);
        agendaContatos.adicionarContato("Jo", 112);

        agendaContatos.exibirContatos();
    }

}
