/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author professor
 */
public class ListaVagas {
    private String[] vagas;
    private int totalVeiculos;
    
    public ListaVagas(){
        vagas = new String[10];
        for(int i=0; i<10; i++){
            vagas[i] = "";
        }
        totalVeiculos = 0;
    }
    
    public void insereVeiculo(String placa){
        if(totalVeiculos < 10){
            for(int i=0; i<10; i++){
                //System.out.println(i);
                if(vagas[i].isBlank()){
                    vagas[i] = placa;
                    totalVeiculos++;
                    break;
                }
            }
        }else{
            System.out.println("Estacionamento Lotado!");
        }
    }
    
    public void removeVeiculo(int vaga){
        if(vagas[vaga].length() > 0){
           vagas[vaga] = "";
           totalVeiculos--;
            System.out.println("Veículo Removido com Sucesso!");
        }else{
            System.out.println("Vaga não utilizada, impossível remover!");
        }
    }
    
    public void listarVeiculos(){
        System.out.println("-- Vagas --");
        for(int i=0; i<10; i++){
            System.out.println((i+1)+" - "+vagas[i]);
        }
    }
     
}
