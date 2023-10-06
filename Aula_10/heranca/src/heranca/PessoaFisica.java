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
public class PessoaFisica extends Pessoa {
    private String cpf;
    
    public PessoaFisica(){
    }
    
    public PessoaFisica(String nome, String telefone, String cpf){
        super(nome, telefone);
        this.cpf = cpf;
    }
    
    public void consultar(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + this.cpf);
    }
  
    
}
