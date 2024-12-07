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
     * @return retorna null caso o procedimento tenha ocorrido com sucesso. Caso
     * contrário retorna uma Stringr descrevendo o erro ocorrido.
     */
    public String incluir(String marca, String modelo, int anoFab, int anoMod,
            float preco){
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
                            
                            carros.add(carro);
                        }
        
        return log;
    }
    
    public String excluir(int posicao){
        String log = "";
        
        if((posicao < 0) || (posicao >= carros.size()))
            log = "Posição não existe.";
        else{
            carros.remove(posicao);
        }
        
        return log;
    }
    
    public String alterar(int posicao, String marca, String modelo, int anoFab, 
            int anoMod, float preco){
        String log = ""; // registra a ocorrência de problemas
        
        if((posicao < 0) || (posicao >= carros.size()))
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
                                carros.get(posicao).setMarca(marca);
                                carros.get(posicao).setModelo(modelo);
                                carros.get(posicao).setAnoFabricacao(anoFab);
                                carros.get(posicao).setAnoModelo(anoMod);
                                carros.get(posicao).setPreco(preco);
                            }
        
        return log;
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
