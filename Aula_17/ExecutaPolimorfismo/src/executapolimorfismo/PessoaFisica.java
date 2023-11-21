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
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dtNascimento;
    
    public PessoaFisica(){
        
    }
    
    public PessoaFisica(String nome, String telefone, String endereco, String cpf, String dtNascimento){
       super(nome, telefone, endereco);
       this.cpf = cpf;
       this.dtNascimento = dtNascimento;
    }

    public PessoaFisica(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }
      
    @Override
    public void mostrar(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("Endereco: " + super.getEndereco());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data Nascimento: " + this.dtNascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    
    
    
}
