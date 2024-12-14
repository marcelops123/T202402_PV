package com.mycompany.lista01_exercicio03;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author edwar
 */
public class GerenciaCliente {
    
    private ArrayList<Cliente> clientes;
    
    public GerenciaCliente(ArrayList<Cliente> clis){
        clientes = clis;
    }
    
    public void incluir(String nome, String cpf, float valor, LocalDate data){
        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setCpf(cpf);
        cli.setValor(valor);
        cli.setData(data);
        cli.setEnderecoDeCobranca(null);
        cli.setEnderecoDeEntrega(null);
        clientes.add(cli);      
    }
    
    public boolean excluir(int posicao){
        if((posicao >= 0) && (posicao < clientes.size())){
            clientes.remove(posicao);
            return true;
        }
        else
            return false;
    }
    
    public boolean alterar(int posicao, String nome, String cpf, float valor, 
            LocalDate data){
        if((posicao >= 0) && (posicao < clientes.size())){
            Cliente cli = clientes.get(posicao);
            cli.setNome(nome);
            cli.setCpf(cpf);
            cli.setValor(valor);
            cli.setData(data);

// Os dois códigos (de cima e debaixo) fazem exatamente a mesma coisa.
//            clientes.get(posicao).setNome(nome);
//            clientes.get(posicao).setCpf(cpf);
//            clientes.get(posicao).setValor(valor);
//            clientes.get(posicao).setData(data);
            return true;
        }
        else
            return false;
    }
    
    public Cliente consultar(int posicao){
        if((posicao >= 0) && (posicao < clientes.size())){
            return clientes.get(posicao);
        }
        else
            return null;
    }
    
    public ArrayList<Cliente> relatorio(){
        return clientes;
    }
    
    public boolean existeClienteCadstrado(){
        return !clientes.isEmpty();
    }
}
