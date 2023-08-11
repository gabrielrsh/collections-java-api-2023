package main;

import main.list.OperacoesBasicas.exericio2.CarrinhoDeCompras;

public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.exibirItens();
        System.out.println(carrinho.calculaValorTotal());

        carrinho.adicionarItem("Celular", 1250.00, 1);
        carrinho.exibirItens();
        System.out.println(carrinho.calculaValorTotal());

        carrinho.adicionarItem("Teclado", 350.12, 1);
        carrinho.exibirItens();
        System.out.println(carrinho.calculaValorTotal());

        carrinho.adicionarItem("Caneta", 1.1, 3);
        carrinho.exibirItens();
        System.out.println(carrinho.calculaValorTotal());

        carrinho.removeItem("celular");
        carrinho.exibirItens();
        System.out.println(carrinho.calculaValorTotal());

        carrinho.removeItem("caneta");
        carrinho.exibirItens();
        System.out.println(carrinho.calculaValorTotal());
    }
}