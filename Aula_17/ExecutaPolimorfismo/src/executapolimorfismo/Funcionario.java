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
public class Funcionario extends PessoaFisica {
    private float salario;

    public Funcionario(float salario, String nome, String telefone, String endereco, String cpf, String dtNascimento) {
        super(nome, telefone, endereco, cpf, dtNascimento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Salário: " + this.salario);
    }
    
}
