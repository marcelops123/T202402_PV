package com.mycompany.lista01_exercicio02;

/**
 *
 * @author edwar
 */
public class Calculadora {
    private double valor1;
    private double valor2;
    private double resultado;

    public Calculadora() {
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }
    
    public void adicao(){
        resultado = valor1 + valor2;
    }
    
    public void subtracao(){
        resultado = valor1 - valor2;
    }
    
    public void multiplicacao(){
        resultado = valor1 * valor2;
    }
    
    public void divisao(){
        resultado = valor1 / valor2;
    }
    
    public void potencia(){
        resultado = Math.pow(valor1, valor1);
    }
    
    public void raizQuadrada(){
        resultado = Math.sqrt(valor1);
    }
}
