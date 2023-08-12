package main;

import main.list.Ordenacao.exercicio1.CatalogoLivros;

public class App {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro de 1", "kleiton", 2000);
        catalogoLivros.adicionarLivro("Livro de 1", "craudio", 2022);
        catalogoLivros.adicionarLivro("Livro de 2", "kleiton", 1888);
        catalogoLivros.adicionarLivro("Livro de 3", "junin", 1990);

        //System.out.println(catalogoLivros.pesquisarPorAutor("kleiton"));
        //System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2030, 2050));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro de 1"));
    }
}