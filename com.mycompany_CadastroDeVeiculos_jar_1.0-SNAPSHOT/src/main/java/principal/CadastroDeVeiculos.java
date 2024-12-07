package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeVeiculos {

    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        
        GerenciaCarros gerCarros = new GerenciaCarros(carros);
        
        int opcao;
        Scanner scN = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        String marca, modelo, log = "";
        int anoFab, anoMod, posicao, resp;
        float preco;
        Carro carro;
        
        do{
            System.out.println("-=[Cadastro de Veículos]=-");
            System.out.println("1 - inclusão");
            System.out.println("2 - exclusão");
            System.out.println("3 - alteração");
            System.out.println("4 - consulta");
            System.out.println("5 - relatório");
            System.out.println("6 - sair");
            System.out.println("Opção: ");
            opcao = scN.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("-[Inclusão]-");
                    System.out.println("Digite os dados a seguir:");
                    System.out.println("Marca: ");
                    marca = scS.nextLine();
                    System.out.println("Modelo: ");
                    modelo = scS.nextLine();
                    System.out.println("Ano fabricação: ");
                    anoFab = scN.nextInt();
                    System.out.println("Ano modelo: ");
                    anoMod = scN.nextInt();
                    System.out.println("Preço: ");
                    preco = scN.nextFloat();
                    
                    log = gerCarros.incluir(marca, modelo, anoFab, anoMod, preco);
                    
                    if(!log.isEmpty()){
                        System.out.println(log);
                        System.out.println("Corrija o erro e tente novamente. O carro não foi cadastrado.");
                    }
                    break;
                case 2:
                    System.out.println("-[Exclusão]-");
                    System.out.println("Digite a posição que deseja excluir:");
                    posicao = scN.nextInt();
                    
                    carro = gerCarros.consultar(posicao);
                    if(carro != null){
                        System.out.println("[Carro escolhido:]");
                        mostrar(carro);
                        
                        do{
                            System.out.println("Confirma a exclusão? (1-sim/2-não)");
                           resp = scN.nextInt();
                        }while(resp < 1 || resp > 2);
                        
                        if(resp == 1){
                            log = gerCarros.excluir(posicao);

                            if(!log.isEmpty()){
                                System.out.println(log);
                                System.out.println("Corrija o erro e tente novamente. O carro não foi excluído.");
                            }
                            else
                                System.out.println("Carro excluído com sucesso.");                                        
                        }
                        else
                            System.out.println("O carro não foi excluído.");                            
                    }
                    else
                        System.out.println("Posição não existe.");
                    break;
                case 3:
                    System.out.println("-[Alteração]-");
                    
                    System.out.println("Digite a posição que deseja alterar:");
                    posicao = scN.nextInt();

                    carro = gerCarros.consultar(posicao);
                    if(carro != null){
                        System.out.println("[Carro escolhido:]");
                        mostrar(carro);
                        
                        do{
                            System.out.println("Confirma a alteração? (1-sim/2-não)");
                           resp = scN.nextInt();
                        }while(resp < 1 || resp > 2);
                        
                        if(resp == 1){
                            System.out.println("Digite os dados a seguir:");
                            System.out.println("Marca: ");
                            marca = scS.nextLine();
                            System.out.println("Modelo: ");
                            modelo = scS.nextLine();
                            System.out.println("Ano fabricação: ");
                            anoFab = scN.nextInt();
                            System.out.println("Ano modelo: ");
                            anoMod = scN.nextInt();
                            System.out.println("Preço: ");
                            preco = scN.nextFloat();
                    
                            log = gerCarros.alterar(posicao, marca, modelo, anoFab, anoMod, preco);
                    
                            if(!log.isEmpty()){
                                System.out.println(log);
                                System.out.println("Corrija o erro e tente novamente. O carro não foi alterado.");
                            }
                            else
                                System.out.println("Carro alterado com sucesso.");                                        
                        }
                        else
                            System.out.println("O carro não foi alterado.");                            
                    }
                    else
                        System.out.println("Posição não existe.");
                    
                    break;
                case 4:
                    System.out.println("-[Consulta]-");
                    System.out.println("Digite a posição que deseja consultar:");
                    posicao = scN.nextInt();
                    
                    carro = gerCarros.consultar(posicao);
                    if(carro != null){
                        System.out.println("[Carro escolhido:]");
                        mostrar(carro);
                    }
                    else
                        System.out.println("Posição não existe.");
                    break;
                case 5:
                    System.out.println("-[Relatório]-");
                    ArrayList<Carro> cars = gerCarros.relatorio();
                    if(!cars.isEmpty()){
                        for(Carro c : cars){
                            mostrar(c);
                            System.out.println("---------------");
                        }
                    }
                    break;
            }
        }while(opcao != 6);
        
        
    }
    
    public static void mostrar(Carro carro){
        System.out.println("Marca         : " + carro.getMarca());
        System.out.println("Modelo        : " + carro.getModelo());
        System.out.println("Ano fabricação: " + carro.getAnoFabricacao());
        System.out.println("Ano modelo    : " + carro.getAnoModelo());
        System.out.println("Preço         : " + carro.getPreco());
    }
}
