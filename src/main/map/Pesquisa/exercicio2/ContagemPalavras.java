package main.map.Pesquisa.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String,Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public Map<String, Integer> getPalvrasMap() {
        return palavrasMap;
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(palavrasMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry: palavrasMap.entrySet()) {
            if(entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente; 
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("triste", 10);
        contagem.adicionarPalavra("muito", 10);

        contagem.exibirContagemPalavras();
        System.out.println(contagem.encontrarPalavraMaisFrequente());
    }
}
