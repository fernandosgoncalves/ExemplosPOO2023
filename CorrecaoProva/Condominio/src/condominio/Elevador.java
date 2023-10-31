/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;

/**
 *
 * @author professor
 */
public class Elevador {
    private int andarAtual;
    private int qtdePessoas;
    private int capacidade;
    private int totalAndares;
    
    public Elevador(){
        
    }
    
    public void Inicializa(int totalAndares, int capacidade){
        andarAtual = 0;
        qtdePessoas = 0;
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }
    
    public void Entra(){
        if(capacidade > qtdePessoas){
            qtdePessoas++;
        }else{
            System.out.println("Elevador Lotado!");
        }
    }
    
    public void Sai(){
        if(qtdePessoas > 0){
            qtdePessoas--;
        }else{
            System.out.println("Elevador Vazio!");
        }
    }
    
    public void Sai(int quantidade){
        if(qtdePessoas >= quantidade){
            qtdePessoas -= quantidade;
        }else{
            System.out.println("Não há pessoas suficientes!");
        }
    }
    
    public void Sobe(){
        if(andarAtual < totalAndares){
            andarAtual ++;
        }else{
            System.out.println("Já está no topo!");
        }
    }
    
    public void Sobe(int quantidade){
        if((andarAtual+quantidade) <= totalAndares){
            andarAtual+= quantidade;
        }else{
            System.out.println("Não há andares suficientes!");
        }
    }
    
    public void Desce(){
        if(andarAtual > 0){
            andarAtual--;
        }else{
            System.out.println("Elevador no térreo!");
        }
    }
    
    public void Mostrar(){
        System.out.println("Andar Atual: " + andarAtual);
        System.out.println("Total Andares: " + totalAndares);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Qtde Pessoas: " + qtdePessoas);
    }

    //alt+insert
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
    
}
