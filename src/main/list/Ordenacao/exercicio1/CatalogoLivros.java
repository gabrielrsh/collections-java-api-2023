package main.list.Ordenacao.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!this.listaLivros.isEmpty()){
            for(Livro l: listaLivros) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }   
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!this.listaLivros.isEmpty()) {
            for(Livro l: listaLivros) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            } 
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()) {
            for(Livro l: listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

}
