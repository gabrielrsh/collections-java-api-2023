package main.list.Pesquisa.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumero;

    public SomaNumeros() {
        this.listaNumero = new ArrayList<>();
    }

    public List<Integer> getListaNumero() {
        return listaNumero;
    }

    public void adicionarNumero(int numero) {
        listaNumero.add(numero);
    }
    
    public Integer calcularSoma() {
        Integer soma = 0;
        if(!listaNumero.isEmpty()) {
            for(Integer n : listaNumero) {
                soma += n;
            }
        }
        return soma;
    }

    public Integer encontrarMaiorNumero() {
        Integer maiorNumero = Integer.MIN_VALUE;
        if(!listaNumero.isEmpty()) {
            for(Integer n : listaNumero) {
                if(n>maiorNumero)
                    maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero() {
        Integer menorNumero = Integer.MAX_VALUE;
        if(!listaNumero.isEmpty()) {
            for(Integer n : listaNumero) {
                if(n<menorNumero)
                    menorNumero = n;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if(!listaNumero.isEmpty()) {
            System.out.println(listaNumero);
        }
        else System.out.println("A lista está vaiza");
    }
}
