package main.list.OperacoesBasicas.exericio2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : listaItens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        this.listaItens.removeAll(itensParaRemover);
    }

    public double calculaValorTotal() {
        if(listaItens.isEmpty())
            return 0;
            
        double valorTotal = 0;
        
        for (Item i : listaItens) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }
}
