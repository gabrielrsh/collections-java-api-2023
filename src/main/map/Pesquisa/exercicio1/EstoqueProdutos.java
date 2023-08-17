package main.map.Pesquisa.exercicio1;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public Map<Long, Produto> getEstoqueProdutosMap() {
        return estoqueProdutosMap;
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                if(maiorPreco<p.getPreco()) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                if(menorPreco>p.getPreco()) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                double valorProdutoEmEstoque = p.getPreco()*p.getQuantidade();
                if(valorProdutoEmEstoque>maiorValorTotalProdutoEstoque){
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = p;
                }
            }
        }
        
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();
        
        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoqueProdutos.adicionarProduto(4L, "Produto D", 3, 20.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor Total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais BARATO: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto mais CARO: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto com MAIOR VALOR TOTAL: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
