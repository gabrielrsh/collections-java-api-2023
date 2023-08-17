package main.set.Ordenacao.exercicio1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public Set<Produto> getProdutosSet() {
        return produtosSet;
    }
    
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(cod,nome,preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto( 1L, "Produto 15", 20d, 2);
        cadastroProdutos.adicionarProduto( 2L, "Produto 1", 20d, 1);
        cadastroProdutos.adicionarProduto( 7L, "Produto 7", 16d, 3);
        cadastroProdutos.adicionarProduto( 18L, "Produto 20", 15d, 4);
        cadastroProdutos.adicionarProduto( 10L, "Produto 5", 2d, 20);
        

        //System.out.println(cadastroProdutos.produtosSet);

        //System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        

    }
}
