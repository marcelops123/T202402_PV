package com.mycompany.poo_01_cadastrodelivros;

import java.util.ArrayList;

public class GerenciaLivros {
    private ArrayList<Livro> livros;
    private String log;

    public GerenciaLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
    public String incluir(String titulo, String autor, String editora, 
            int anoPublicacao, int edicao, int isbn){
        log = "";

        if(titulo.isEmpty())
            log = "campo Título está vazio.";
        else
            if(autor.isEmpty())
                log = "campo Autor está vazio.";
            else
                if(editora.isEmpty())
                    log = "campo Editora está vazio.";
                else
                    if(anoPublicacao == 0)
                        log = "campo Ano de Publicação está vazio.";
                    else
                        if(edicao == 0)
                            log = "campo Edição está vazio.";
                        else
                            if(isbn == 0)
                                log = "campo ISBN está vazio.";
                            else{
                                Livro liv = new Livro(titulo, autor, editora, 
                                        anoPublicacao, edicao, isbn);
        
                                livros.add(liv);
                            }
        return log;
    }
    
    public String excluir(int posicao){
        log = "";
        
        if(livros.isEmpty())
            log = "Não existem livros cadastrados.";
        else
            if((posicao < 0) || (posicao > livros.size()))
                log = "Posição inválida";
            else{
                livros.remove(posicao);
            }
                
         return log;
    }
    
    public String alterar(int posicao, String titulo, String autor, 
            String editora, int anoPublicacao, int edicao, int isbn){
        log = "";

        if(livros.isEmpty())
            log = "Não existem livros cadastrados.";
        else
            if((posicao < 0) || (posicao > livros.size()))
                log = "Posição inválida";
            else
                if(titulo.isEmpty())
                    log = "campo Título está vazio.";
                else
                    if(autor.isEmpty())
                        log = "campo Autor está vazio.";
                    else
                        if(editora.isEmpty())
                            log = "campo Editora está vazio.";
                        else
                            if(anoPublicacao == 0)
                                log = "campo Ano de Publicação está vazio.";
                            else
                                if(edicao == 0)
                                    log = "campo Edição está vazio.";
                                else
                                    if(isbn == 0)
                                        log = "campo ISBN está vazio.";
                                    else{
                                        livros.get(posicao).setTitulo(titulo);
                                        livros.get(posicao).setAutor(autor);
                                        livros.get(posicao).setEditora(editora);
                                        livros.get(posicao).setAnoPublicacao(anoPublicacao);
                                        livros.get(posicao).setEdicao(edicao);
                                        livros.get(posicao).setIsbn(isbn);
                                    }
        return log;
    }
    
    public Livro consultar(int posicao){
        if(livros.isEmpty())
            return null;
        else
            if((posicao < 0) || (posicao > livros.size()))
                return null;
            else{
                return livros.get(posicao);
            }
    }
    
    public ArrayList relatorio(){
        return livros;
    }
}
