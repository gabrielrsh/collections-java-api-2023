package main.set.OperacoesBasicas.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicasSet = new HashSet<>();
    }

    public Set<String> getPalavrasUnicasSet() {
        return palavrasUnicasSet;
    }

    public void  adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicasSet.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasSet);
    }
}
