/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executapolimorfismo;

/**
 *
 * @author professor
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void mostrar(){
        
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + '}';
    }
    
    
    
}
