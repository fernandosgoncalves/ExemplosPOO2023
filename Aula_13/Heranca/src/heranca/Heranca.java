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
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica("Joaquim", "123456", "Av. Brasil", "123.321.456-00", "12/12/2023");
        PessoaJuridica pj = new PessoaJuridica("123456", "João Da Silva", "Amar do Brasil", "123456", "Av. 7 de Setembro");
        Funcionario f = new Funcionario(15500, "Vanessa", "55334455", "Rua Central", "123456", "21/12/2022");
                
        System.out.println("Nome: " + pessoa.getNome());
        
        pessoa.setNome("Pedro");
        
        pessoa.mostrar();
        
        f.mostrar();
    }
    
}
