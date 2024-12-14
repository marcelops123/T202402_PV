package com.mycompany.lista01_exercicio03;

import java.util.ArrayList;

/**
 *
 * @author edwar
 */
public class GerenciaEndereco {
    
    private ArrayList<Cliente> clientes;
    
    public GerenciaEndereco(ArrayList<Cliente> clis){
        this.clientes = clis;
    }
    
    public boolean incluir(int pos, int opcao, Endereco endereco){
        if(opcao == 1 || opcao == 2){
            if(opcao == 1)
                clientes.get(pos).setEnderecoDeCobranca(endereco);
            else
                clientes.get(pos).setEnderecoDeEntrega(endereco);
            return true;
        }
        else
            return false;
    }
    
    public boolean excluir(int pos, int opcao){
        if(opcao == 1 || opcao == 2){
            if(opcao == 1)
                clientes.get(pos).setEnderecoDeCobranca(null);
            else
                clientes.get(pos).setEnderecoDeEntrega(null);
            return true;
        }
        else
            return false;
    }
    
    public boolean alterar(int pos, int opcao, String logradouro, int numero,
        String complemento, String bairro, String municipio,String estado,
        String cep){
        if(opcao == 1 || opcao == 2){
            if(opcao == 1){
                clientes.get(pos).getEnderecoDeCobranca().setLogradouro(logradouro);
                clientes.get(pos).getEnderecoDeCobranca().setNumero(numero);
                clientes.get(pos).getEnderecoDeCobranca().setComplemento(complemento);
                clientes.get(pos).getEnderecoDeCobranca().setBairro(bairro);
                clientes.get(pos).getEnderecoDeCobranca().setMunicipio(municipio);
                clientes.get(pos).getEnderecoDeCobranca().setEstado(estado);
                clientes.get(pos).getEnderecoDeCobranca().setCep(cep);
            }
            else{
                clientes.get(pos).getEnderecoDeEntrega().setLogradouro(logradouro);
                clientes.get(pos).getEnderecoDeEntrega().setNumero(numero);
                clientes.get(pos).getEnderecoDeEntrega().setComplemento(complemento);
                clientes.get(pos).getEnderecoDeEntrega().setBairro(bairro);
                clientes.get(pos).getEnderecoDeEntrega().setMunicipio(municipio);
                clientes.get(pos).getEnderecoDeEntrega().setEstado(estado);
                clientes.get(pos).getEnderecoDeEntrega().setCep(cep);
            }
            return true;
        }
        else
            return false;
    }
    
    public Endereco consultar(int pos, int opcao){
        if(opcao == 1 || opcao == 2){
            if(opcao == 1)
                return clientes.get(pos).getEnderecoDeCobranca();
            else
                return clientes.get(pos).getEnderecoDeEntrega();
        }
        else
            return null;
    }
}
