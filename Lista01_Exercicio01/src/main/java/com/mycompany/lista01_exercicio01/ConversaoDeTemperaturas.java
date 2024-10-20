package com.mycompany.lista01_exercicio01;

/**
 *
 * @author edwar
 */
public class ConversaoDeTemperaturas {
    private float valorOriginal;
    private float valorConvertido;

    public ConversaoDeTemperaturas() {
    }

    public void setValorOriginal(float valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public float getValorConvertido() {
        return valorConvertido;
    }

    public void celsiusParaFahrenheit(){
        // °F = °C × 1,8 + 32
        valorConvertido = (float) (valorOriginal * 1.8 + 32);
    }
    
    public void celsiusParaKelvins(){
        // K = °C + 273,15
        valorConvertido = (float) (valorOriginal + 273.15);
    }
    
    public void fahrenheitParaKelvins(){
        // K = (°F + 459,67) / 1,8
        valorConvertido = (float) ((valorOriginal + 459.67) / 1.8);
    }
    
    public void fahrenheitParaCelsius(){
        // °C = (°F - 32) / 1,8
        valorConvertido = (float) ((valorOriginal - 32) / 1.8);
    }
    
    public void kelvinsParaFahrenheit(){
        // °F = K × 1,8 - 459,67
        valorConvertido = (float) (valorOriginal * 1.8 - 459.67);
    }
    
    public void kelvinsParaCelsius(){
        // °C = K - 273,15
        valorConvertido = (float) (valorOriginal - 273.15);
    }
}