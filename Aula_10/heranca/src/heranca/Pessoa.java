/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author professor
 */
public class Pessoa {
    private String nome;
    private String telefone;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
    
}
