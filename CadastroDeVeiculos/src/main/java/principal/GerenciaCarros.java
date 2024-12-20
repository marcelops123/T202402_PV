package principal;

import java.util.ArrayList;

public class GerenciaCarros {
    private ArrayList<Carro> carros;
    
    public GerenciaCarros(ArrayList carros){
        this.carros = carros;
    }
    
    /**
     * Para que o método incluir funcione perfeitamente, todos os parâmetros do
     * método devem estar preenchidos. O método retorna null caso tenha feito a 
     * criação e inclusão do carro com sucesso. Caso contrário, retorna o erro 
     * ocorrido.
     * @param marca
     * @param modelo
     * @param anoFab
     * @param anoMod
     * @param preco
     * @param refenciaParaVeiculoCriado
     * @return retorna null caso o procedimento tenha ocorrido com sucesso. Caso
     * contrário retorna uma Stringr descrevendo o erro ocorrido.
     */
    public String incluir(String marca, String modelo, int anoFab, int anoMod,
            float preco, Carro[] refenciaParaVeiculoCriado){
        String log = ""; // registra a ocorrência de problemas
        
        if(marca.isEmpty())
            log = "Marca não preenchida.";
        else
            if(modelo.isEmpty())
                log = "Modelo não preenchido.";
            else
                if(anoFab == 0)
                    log = "Ano de fabricação não preenchido.";
                else
                    if(anoMod == 0)
                        log = "Ano modelo não preenchido";
                    else
                        if(preco == 0)
                            log = "Preço não preenchido";
                        else{

                            Carro carro = new Carro(marca, modelo, anoFab, 
                                anoMod, preco);

                            /* Devolve a referência para o objeto 
                               "carro" que acabou de ser criado.  */
                            refenciaParaVeiculoCriado[0] = carro;
                            
                            carros.add(carro);
                        }
        
        return log;
    }
    
    public String excluir(Carro car, Carro[] veiculoAnteriorOuPosterior){
        String log = "";
                
        if(car == null)
            log = "Veículo não existe.";
        else{
            veiculoAnteriorOuPosterior[0] = veiculoAnterior(car);
            if(veiculoAnteriorOuPosterior[0] == null)
                veiculoAnteriorOuPosterior[0] = veiculoPosterior(car);
            
            carros.remove(car);
        }
        
        return log;
    }
    
    public String alterar(Carro atual, String marca, String modelo, int anoFab, 
            int anoMod, float preco){
        String log = ""; // registra a ocorrência de problemas
        
        if(atual == null)
            log = "Posição não existe.";
        else
            if(marca.isEmpty())
                log = "Marca não preenchida.";
            else
                if(modelo.isEmpty())
                    log = "Modelo não preenchido.";
                else
                    if(anoFab == 0)
                        log = "Ano de fabricação não preenchido.";
                    else
                        if(anoMod == 0)
                            log = "Ano modelo não preenchido";
                        else
                            if(preco == 0)
                                log = "Preço não preenchido";
                            else{
                                int pos = carros.indexOf(atual);
        
                                carros.get(pos).setMarca(marca);
                                carros.get(pos).setModelo(modelo);
                                carros.get(pos).setAnoFabricacao(anoFab);
                                carros.get(pos).setAnoModelo(anoMod);
                                carros.get(pos).setPreco(preco);
                            }
        
        return log;
    }
    
    public Carro primeiroVeiculo(){
        if(carros.isEmpty())
            return null;
        else
            return carros.getFirst();
    }
    
    public Carro veiculoAnterior(Carro atual){
        int pos = carros.indexOf(atual);
        
        if(pos > 0)
            return carros.get(pos - 1);
        else
            return null;
    }
    
    public Carro veiculoPosterior(Carro atual){
        int pos = carros.indexOf(atual);
        
        if(pos < (carros.size() - 1))
            return carros.get(pos + 1);
        else
            return null;
    }
    
    public Carro ultimoVeiculo(){
        if(carros.isEmpty())
            return null;
        else
            return carros.getLast();
    }
    
    public Carro consultar(int posicao){
        if((posicao < 0) || (posicao >= carros.size()))
            return null;
        else{
            return carros.get(posicao);
        }
    }
    
    public ArrayList relatorio(){
        return carros;
    }
}
