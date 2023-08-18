package main.map.OperacoesBasicas.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public Map<String, String> getPalavrasMap() {
        return palavrasMap;
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }
    
    public void removerPalavra(String palavra) {
        palavrasMap.remove(palavra);
    }

    public void exibirPalavra() {
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        return palavrasMap.get(palavra);
    }
}
