package com.mycompany.lista01_exercicio03;

import java.time.LocalDate;

/**
 *
 * @author edwar
 */
public class Cliente {
    private String nome;
    private String cpf;
    private float valor;
    private LocalDate data;
    private Endereco enderecoDeCobranca;
    private Endereco enderecoDeEntrega;

    public Cliente() {
        enderecoDeCobranca = null;
        enderecoDeEntrega = null;
    }

    public Cliente(String nome, String cpf, float valor, LocalDate data, Endereco enderecoDeCobranca, Endereco enderecoDeEntrega) {
        this.nome = nome;
        this.cpf = cpf;
        this.valor = valor;
        this.data = data;
        this.enderecoDeCobranca = enderecoDeCobranca;
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Endereco getEnderecoDeCobranca() {
        return enderecoDeCobranca;
    }

    public void setEnderecoDeCobranca(Endereco enderecoDeCobranca) {
        this.enderecoDeCobranca = enderecoDeCobranca;
    }

    public Endereco getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }
}
