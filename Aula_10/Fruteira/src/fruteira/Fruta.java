/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteira;

/**
 *
 * @author professor
 */
public class Fruta {
    private String nome;
    private String tipo;
    private int quantidade;
    
    public Fruta(){
        
    }
    
    public Fruta(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public Fruta(String nome, String tipo, int quantidade){
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void consultar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Quantidade: " + this.quantidade);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
}
