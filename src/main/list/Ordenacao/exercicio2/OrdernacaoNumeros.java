package main.list.Ordenacao.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdernacaoNumeros {
    private List<Integer> numeros;

    public OrdernacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        if(!this.numeros.isEmpty()){
            Collections.sort(numerosAscendentes);
        }
        return numerosAscendentes;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.numeros);
        if(!this.numeros.isEmpty()){
            numerosDescendentes.sort(Collections.reverseOrder());
        }
        return numerosDescendentes;
    }
}
