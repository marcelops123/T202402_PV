package com.mycompany.lista01_exercicio03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edwar
 */
public class Principal {
    public static void main(String[] args){
        ArrayList<Cliente> clientes = new ArrayList<>();
        GerenciaCliente gerClientes = new GerenciaCliente(clientes);
        GerenciaEndereco gerEnder = new GerenciaEndereco(clientes);
        
       Scanner scN = new Scanner(System.in);
       Scanner scS = new Scanner(System.in);
        
       int opcao, opCli, opEnd, dia, mes, ano, pos, resp, tipoEnd, numero;
       float valor;
       Cliente cli;
       String nome, cpf, logradouro, bairro, municipio, estado, cep, complemento;
       LocalDate data = null;

       do{
            System.out.println("-=[Cadastro Clentes/Endereços]=-"); 
            System.out.println("1 - cliente"); 
            System.out.println("2 - endereços"); 
            System.out.println("3 - sair"); 
            System.out.println("Opção: ");
            opcao = scN.nextInt();

            switch(opcao){
                case 1: // Cadastro de Cliente
                    do{
                        System.out.println("-=[Cadastro de Clientes]=-"); 
                        System.out.println("1 - incluir"); 
                        System.out.println("2 - excluir"); 
                        System.out.println("3 - alterar"); 
                        System.out.println("4 - consultar"); 
                        System.out.println("5 - relatório"); 
                        System.out.println("6 - voltar"); 
                        System.out.println("Opção: ");
                        opCli = scN.nextInt();

                        switch(opCli){
                            case 1:
                                System.out.println("-[Inclusão de Cliente]-");
                                System.out.println("- nome: ");
                                nome = scS.nextLine();
                                System.out.println("- cpf: ");
                                cpf = scS.nextLine();
                                System.out.println("- valor: ");
                                valor = scN.nextFloat();
                                System.out.println("- data: ");
                                System.out.println("- dia: ");
                                dia = scN.nextInt();
                                System.out.println("- mês: ");
                                mes = scN.nextInt();
                                System.out.println("- ano: ");
                                ano = scN.nextInt();
                                
                                data = LocalDate.of(ano, mes, dia);                               
                                
                                gerClientes.incluir(nome, cpf, valor, data);
                                
                                System.out.println("Inclusão efetuada com sucesso.");
                                break;
                            case 2:
                                System.out.println("-[Exclusão de Cliente]-");
                                System.out.println("- digite a posição que deseja excluir: ");
                                pos = scN.nextInt();
                                
                                cli = gerClientes.consultar(pos);
                                
                                if(cli != null){
                                    mostrarCliente(cli);
                                    resp = confirmaSimNao("exclusão");
                                    
                                    if(resp == 1){
                                        if(gerClientes.excluir(pos))
                                            System.out.println("Exclusão efeutada com sucesso.");
                                        else
                                            System.out.println("Exclusão não efetuada.");
                                    }
                                    else
                                        System.out.println("Exclusão não efetuada.");
                                }
                                else
                                    System.out.println("Posição não existe.");
                                break;
                            case 3:
                                System.out.println("-[Alteração de Cliente]-");
                                System.out.println("- digite a posição que deseja alterar: ");
                                pos = scN.nextInt();
                                
                                cli = gerClientes.consultar(pos);
                                
                                if(cli != null){
                                    mostrarCliente(cli);
                                    resp = confirmaSimNao("alteração");
                                    
                                    if(resp == 1){
                                        System.out.println("-Digite os valores a seguir:-");
                                        System.out.println("- nome: ");
                                        nome = scS.nextLine();
                                        System.out.println("- cpf: ");
                                        cpf = scS.nextLine();
                                        System.out.println("- valor: ");
                                        valor = scN.nextFloat();
                                        System.out.println("- data: ");
                                        System.out.println("- dia: ");
                                        dia = scN.nextInt();
                                        System.out.println("- mês: ");
                                        mes = scN.nextInt();
                                        System.out.println("- ano: ");
                                        ano = scN.nextInt();
                                        data = LocalDate.of(ano, mes, dia);                               

                                        if(gerClientes.alterar(pos, nome, cpf, valor, data))
                                            System.out.println("Alteração efeutada com sucesso.");
                                        else
                                            System.out.println("Alteração não efetuada.");
                                    }
                                    else
                                        System.out.println("Alteração não efetuada.");
                                }
                                else
                                    System.out.println("Posição não existe.");
                                break;
                            case 4:
                                System.out.println("-[Consulta Cliente]-");
                                System.out.println("- digite a posição que deseja consultar: ");
                                pos = scN.nextInt();
                                
                                cli = gerClientes.consultar(pos);
                                
                                if(cli != null)
                                    mostrarCliente(cli);
                                else
                                    System.out.println("Posição não existe.");
                                break;
                            case 5:
                                System.out.println("-[Relatório de Clientes]-");
                                ArrayList<Cliente> clis = gerClientes.relatorio();
                                
                                if(clis.isEmpty())
                                    System.out.println("Não existem clientes cadastrados.");
                                else{
                                    for(Cliente c : clis){
                                        mostrarCliente(c);
                                        System.out.println("---------------");
                                    }
                                }
                                break;
                        }
                    }while(opCli != 6);
                    break;
                case 2:
                    /* Cadastro de endereços. */
                    if(gerClientes.existeClienteCadstrado()){
                        do{ // Cadastro de Endereço
                            System.out.println("-=[Cadastro de Endereço]=-"); 
                            System.out.println("1 - incluir"); 
                            System.out.println("2 - excluir"); 
                            System.out.println("3 - alterar"); 
                            System.out.println("4 - consultar"); 
                            System.out.println("5 - voltar"); 
                            System.out.println("Opção: ");
                            opEnd = scN.nextInt();

                            switch(opEnd){
                                case 1: // Inclusão
                                    System.out.println("-[Inclusão de Endereço]-");
                                    System.out.println("Qual a posição do Cliente?");
                                    pos = scN.nextInt();

                                    cli = gerClientes.consultar(pos);
                                    
                                    if(cli != null){
                                        /* 1 - endereço de cobrança
                                           2 - endereço de entrega
                                        */
                                        tipoEnd = enderecoCobrancEntrega();

                                        System.out.println("- logradouro: ");
                                        logradouro = scS.nextLine();
                                        System.out.println("- número: ");
                                        numero = scN.nextInt();
                                        System.out.println("- complemento: ");
                                        complemento = scS.nextLine();
                                        System.out.println("- bairro: ");
                                        bairro = scS.nextLine();
                                        System.out.println("- município: ");
                                        municipio = scS.nextLine();
                                        System.out.println("- estado: ");
                                        estado = scS.nextLine();
                                        System.out.println("- cep: ");
                                        cep = scS.nextLine();

                                        Endereco end = new Endereco(logradouro, numero,
                                                complemento, bairro, municipio, estado, cep);

                                        if(gerEnder.incluir(pos, tipoEnd, end))
                                            System.out.println("Inclusão efetuada com sucesso.");
                                        else
                                            System.out.println("Inclusão não efetuada.");
                                    }
                                    else
                                        System.out.println("Posição não existe.");
                                    break;
                                case 2: // Exclusão
                                    System.out.println("-[Exclusão de Endereço]-");
                                    System.out.println("Qual a posição do Cliente?");
                                    pos = scN.nextInt();

                                    cli = gerClientes.consultar(pos);
                                    
                                    if(cli != null){
                                        /* 1 - endereço de cobrança
                                           2 - endereço de entrega
                                        */
                                        tipoEnd = enderecoCobrancEntrega();

                                        cli = gerClientes.consultar(pos);

                                        if(cli != null){
                                            mostrarCliente(cli);
                                            resp = confirmaSimNao("exclusão do endereço");

                                            if(resp == 1){
                                                if(gerEnder.excluir(pos, tipoEnd))
                                                    System.out.println("Exclusão de endereço efeutada com sucesso.");
                                                else
                                                    System.out.println("Exclusão de endereço não efetuada.");
                                            }
                                            else
                                                System.out.println("Exclusão de endereço não efetuada.");
                                        }
                                        else
                                            System.out.println("Posição não existe.");
                                    }
                                    else
                                        System.out.println("Posição não existe.");
                                    break;
                                case 3: // Alteração de endereço
                                    System.out.println("-[Alteração de Endereço]-");
                                    System.out.println("Qual a posição do Cliente?");
                                    pos = scN.nextInt();

                                    cli = gerClientes.consultar(pos);
                                    
                                    if(cli != null){
                                        /* 1 - endereço de cobrança
                                           2 - endereço de entrega
                                        */
                                        tipoEnd = enderecoCobrancEntrega();
                                        
                                        boolean endNaoNulo = false;
                                        if(tipoEnd == 1)
                                           endNaoNulo = (cli.getEnderecoDeCobranca() != null);
                                        else
                                           endNaoNulo = (cli.getEnderecoDeEntrega() != null);

                                        if(endNaoNulo){
                                            System.out.println("- logradouro: ");
                                            logradouro = scS.nextLine();
                                            System.out.println("- número: ");
                                            numero = scN.nextInt();
                                            System.out.println("- complemento: ");
                                            complemento = scS.nextLine();
                                            System.out.println("- bairro: ");
                                            bairro = scS.nextLine();
                                            System.out.println("- município: ");
                                            municipio = scS.nextLine();
                                            System.out.println("- estado: ");
                                            estado = scS.nextLine();
                                            System.out.println("- cep: ");
                                            cep = scS.nextLine();

                                            if(gerEnder.alterar(pos, tipoEnd, logradouro, numero,
                                                    complemento, bairro, municipio, estado, cep))
                                                System.out.println("Alteração efetuada com sucesso.");
                                            else
                                                System.out.println("Alteração não efetuada.");
                                        }
                                        else
                                            System.out.println("Endereço não cadastrado.");
                                    }
                                    else
                                        System.out.println("Posição não existe.");
                                    break;
                                case 4:
                                    System.out.println("-[Consulta endereço]-");
                                    System.out.println("- digite a posição que deseja consultar: ");
                                    pos = scN.nextInt();

                                    cli = gerClientes.consultar(pos);

                                    if(cli != null){
                                        mostrarCliente(cli);
                                    }
                                    else
                                        System.out.println("Posição não existe.");
                                    break;
                            }
                        }while(opEnd != 5);
                        break;
                    }
                    else
                        System.out.println("Não existem clientes cadastrados.");
            }
        }while(opcao != 3);
    }
    
    public static void mostrarCliente(Cliente cli){
        System.out.println("- nome: " + cli.getNome());
        System.out.println("- cpf : " + cli.getCpf());
        System.out.println("- valor: " + cli.getValor());
        System.out.println("- data: " + cli.getData());
        
        if(cli.getEnderecoDeCobranca() != null)
            mostrarEndereco(cli.getEnderecoDeCobranca(), "cobrança");
        else
            System.out.println("Endereço de cobrança não cadastrado.");
        
        if(cli.getEnderecoDeEntrega() != null)
            mostrarEndereco(cli.getEnderecoDeEntrega(), "entrega");
        else
            System.out.println("Endereço de entrega não cadastrado.");
    }
    
    public static void mostrarEndereco(Endereco end, String tipo){
        if(end != null){
            System.out.println("-- Endereço de " + tipo + " --");
            System.out.println("-- logradouro: " + end.getLogradouro());
            System.out.println("-- numero    : " + end.getNumero());
            System.out.println("-- bairro    : " + end.getBairro());
            System.out.println("-- município : " + end.getMunicipio());
            System.out.println("-- estado    : " + end.getEstado());
            System.out.println("-- cep       : " + end.getCep());
        }
        else
            System.out.println("Endereço não cadastrado.");
    }
    
    public static int confirmaSimNao(String oque){
        int resp; Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("Confirma " + oque + " ? (1-sim/2-não): ");
            resp = s.nextInt();
        }while(resp < 1 || resp > 2);
        
        return resp;
    }
    
    public static int enderecoCobrancEntrega(){
        int resp; Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("-[Tipo de Endereço]-");
            System.out.println("1 - cobrança");
            System.out.println("2 - entrega");
            System.out.println("Opção: ");
            resp = s.nextInt();
        }while(resp < 1 || resp > 2);
        
        return resp;
    }
}
