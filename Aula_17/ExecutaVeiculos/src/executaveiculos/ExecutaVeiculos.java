/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaveiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExecutaVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Veiculo> estacionamento = new ArrayList<Veiculo>();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        
        Veiculo v1= new Veiculo("Preto", "ABC1234", "VW", 2015);
        Veiculo v2= new Veiculo("Azul", "BCD3234", "Ford", 2020);
        Veiculo v3= new Veiculo("Verde", "FML9988", "GM", 2018);
        
        estacionamento.add(v1);
        estacionamento.add(v2);
        estacionamento.add(v3);
        
        while(opcao != 4){
            System.out.println("-- Menu --");
            System.out.println("1 - Cadastra Veículo");
            System.out.println("2 - Mostra Dados");
            System.out.println("3 - Consulta informações");
            System.out.println("4 - Sair");
            System.out.println("Informe uma opção:");
            opcao = ler.nextInt();
            
            switch(opcao){
                case 1:
                    //Cadastro
                    Veiculo aux = new Veiculo();
                    aux.setCor(JOptionPane.showInputDialog("Informe a cor:"));
                    aux.setMarca(JOptionPane.showInputDialog("Informe a marca:"));
                    aux.setPlaca(JOptionPane.showInputDialog("Informe a placa:"));
                    aux.setAno(Integer.valueOf(JOptionPane.showInputDialog("Informe o ano:")));
                    
                    estacionamento.add(aux);
                break;
                case 2:
                    //Mostra dados
                    mostraDados(estacionamento);
                break;
                case 3:
                    //Consulta Informações
                    System.out.println("A lista possui " + estacionamento.size() + " veiculos cadastrados");
                    Veiculo vNovo;
                    Veiculo vAnt;
                    vNovo = buscaVeiculoNovo(estacionamento);
                    vAnt = buscaVeiculoAntigo(estacionamento);
                    System.out.println("O veiculo mais novo é: " + vNovo.toString());
                    System.out.println("O veiculo mais antigo é: " + vAnt.toString());
                    int vPreta;
                    vPreta = buscaVeiculosCorPreta(estacionamento);
                    System.out.println("O total de veiculos da cor preta é: " + vPreta);
                    
                    estacionamento.remove(3);
                    mostraDados(estacionamento);
                break;
            }
        }
    }
    
    public static void mostraDados(List<Veiculo> estacionamento){
        for(Veiculo v: estacionamento){
            System.out.println(v.toString());
        }
    }
    
    public static Veiculo buscaVeiculoNovo(List<Veiculo> estacionamento){
        Veiculo aux = new Veiculo();
        
        for(int i=0; i< estacionamento.size(); i++){
            if(i == 0)
                aux = estacionamento.get(i);
            else{
                if(estacionamento.get(i).getAno() > aux.getAno())
                    aux = estacionamento.get(i);
            }
        }
        
        return aux;
    }
    
    public static Veiculo buscaVeiculoAntigo(List<Veiculo> estacionamento){
        Veiculo aux = new Veiculo();
        
        for(int i=0; i< estacionamento.size(); i++){
            if(i == 0)
                aux = estacionamento.get(i);
            else{
                if(estacionamento.get(i).getAno() < aux.getAno())
                    aux = estacionamento.get(i);
            }
        }
        
        return aux;
    }
    
    public static int buscaVeiculosCorPreta(List<Veiculo> estacionamento){
        int contador = 0;
        for(Veiculo v : estacionamento){
            if(v.getCor().equalsIgnoreCase("Preto") || v.getCor().equalsIgnoreCase("Preta"))
                contador++;
        }
        return contador;
    }
}
