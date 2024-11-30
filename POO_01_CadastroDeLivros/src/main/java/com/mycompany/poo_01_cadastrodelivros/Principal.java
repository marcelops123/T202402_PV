package com.mycompany.poo_01_cadastrodelivros;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        ArrayList<Livro> livros = new ArrayList<>();
        
        GerenciaLivros gerLivros = new GerenciaLivros(livros);
        
        Scanner scN = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        
        int op, anoPub, edicao, isbn, pos, resp;
        String titulo, autor, editora, log;
        Livro liv;
        
        do{
            System.out.println("--==[Cadastro de Livros]==--");
            System.out.println("1 - Inclusão");
            System.out.println("2 - Exclusão");
            System.out.println("3 - Alteração");
            System.out.println("4 - Consulta");
            System.out.println("5 - Relatório");
            System.out.println("6 - Sair");
            System.out.println("Opção: ");
            op = scN.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("-=[Inclusão]=-");
                    System.out.println("Digite os dados a seguir:");
                    System.out.println("- Título: ");
                    titulo = scS.nextLine();
                    System.out.println("- Autor: ");
                    autor = scS.nextLine();
                    System.out.println("- Editora: ");
                    editora = scS.nextLine();
                    System.out.println("- Ano publicação: ");
                    anoPub = scN.nextInt();
                    System.out.println("- Edição: ");
                    edicao = scN.nextInt();
                    System.out.println("- ISBN: ");
                    isbn = scN.nextInt();
                    
                    log = gerLivros.incluir(titulo, autor, editora, anoPub, 
                            edicao, isbn);
                    
                    if(log.isEmpty())
                        System.out.println("Inclusão efetuada com sucesso.");
                    else
                        System.out.println(log);
                    break;
                case 2:
                    System.out.println("-=[Exclusão]=-");
                    System.out.println("Digite a posição que deseja excluir:");
                    pos = scN.nextInt();
                    
                    liv = gerLivros.consultar(pos);
                    
                    if(liv == null)
                        System.out.println("Posição inválida ou não "
                                + "existem livros cadastrados.");
                    else{
                        System.out.println("-[Livro escolhido]-");
                        mostrar(liv);
                        do{
                            System.out.println("Confirma exclusão? (1-sim/2-não)");
                            resp = scN.nextInt();
                        }while(resp < 1 || resp > 2);
                        
                        if(resp == 2)
                            System.out.println("Exclusão não efetivada.");
                        else{
                            log = gerLivros.excluir(pos);
                            
                            if(log.isEmpty())
                                System.out.println("Exclusão efetivada com sucesso.");
                            else
                                System.out.println(log);
                        }
                    }
                    break;
                case 3:
                    System.out.println("-=[Alteração]=-");
                    System.out.println("Digite a posição que deseja alterar: ");
                    pos = scN.nextInt();
                    
                    liv = gerLivros.consultar(pos);
                    
                    if(liv == null)
                        System.out.println("Posição inválida ou não "
                                + "existem livros cadastrados.");
                    else{
                        System.out.println("-[Livro escolhido]-");
                        mostrar(liv);
                        do{
                            System.out.println("Confirma alteração? (1-sim/2-não)");
                            resp = scN.nextInt();
                        }while(resp < 1 || resp > 2);
                        
                        if(resp == 2)
                            System.out.println("Alteração não efetivada.");
                        else{
                            System.out.println("Digite os dados a seguir:");
                            System.out.println("- Título: ");
                            titulo = scS.nextLine();
                            System.out.println("- Autor: ");
                            autor = scS.nextLine();
                            System.out.println("- Editora: ");
                            editora = scS.nextLine();
                            System.out.println("- Ano publicação: ");
                            anoPub = scN.nextInt();
                            System.out.println("- Edição: ");
                            edicao = scN.nextInt();
                            System.out.println("- ISBN: ");
                            isbn = scN.nextInt();

                            log = gerLivros.alterar(pos, titulo, autor, 
                                    editora, anoPub, edicao, isbn);

                            if(log.isEmpty())
                                System.out.println("Alteração efetuada com sucesso.");
                            else
                                System.out.println(log);
                        }
                    }
                    break;
                case 4:
                    System.out.println("-=[Consulta]=-");
                    System.out.println("Digite a posição que deseja consultar:");
                    pos = scN.nextInt();
                    
                    liv = gerLivros.consultar(pos);
                    
                    if(liv == null)
                        System.out.println("Posição inválida ou não "
                                + "existem livros cadastrados.");
                    else{
                        System.out.println("-[Livro escolhido]-");
                        mostrar(liv);
                    }
                    break;
                case 5:
                    System.out.println("-=[Relatório]=-");
                    ArrayList<Livro> lista = gerLivros.relatorio();
                    if(lista.isEmpty())
                        System.out.println("Não existem livrovs cadstrados.");
                    else{
                        for(Livro l : lista){
                            mostrar(l);
                            System.out.println("-----------");
                        }
                    }
            }
        }while(op != 6);
    }

    public static void mostrar(Livro liv){
        System.out.println("Título        : " + liv.getTitulo());
        System.out.println("Autor         : " + liv.getAutor());
        System.out.println("Editora       : " + liv.getEditora());
        System.out.println("Ano publicação: " + liv.getAnoPublicacao());
        System.out.println("Edição        : " + liv.getEdicao());
        System.out.println("ISBN          : " + liv.getIsbn());
    }
}
