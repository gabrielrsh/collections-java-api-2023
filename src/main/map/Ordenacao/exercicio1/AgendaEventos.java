package main.map.Ordenacao.exercicio1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento> agendaEventos;

    public Map<LocalDate, Evento> getAgendaEventos() {
        return agendaEventos;
    }

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }
    
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(agendaEventos);
        System.out.println(eventosPorData);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(agendaEventos);
        for(Map.Entry<LocalDate, Evento> entry : eventosPorData.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: "+proximoEvento+" acontecera na data "+ proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2011, 7, 1), "evento 7", "atracao 5");
        agenda.adicionarEvento(LocalDate.now(), "evento 2", "atracao 2");
        agenda.adicionarEvento(LocalDate.of(2000, 5, 12), "evento 4", "atracao");
        agenda.exibirAgenda();
        agenda.obterProximoEvento();
    }
}
