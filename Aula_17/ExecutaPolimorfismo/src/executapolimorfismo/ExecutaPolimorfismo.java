/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executapolimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExecutaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = null;
        int tipo;
        
        tipo = Integer.valueOf(JOptionPane.showInputDialog("Informe o Tipo (1-4): "));
        
        switch(tipo){
            case 1:
                pessoa = new Pessoa("Fernando", "123456", "Av. Brasil");
                System.out.println(pessoa.toString());
            break;
            case 2:
                pessoa = new PessoaFisica("Maria", "123456", "Av. São Paulo", "3344556677", "22/05/2004");
                pessoa.mostrar();
            break;
            case 3:
                pessoa = new PessoaJuridica("123456789/00", "João da Silva", "ABC do Brasil", "123456789", "Av. dos Ipês");
                System.out.println(pessoa.toString());
            break;
            
        }
        
    }
    
}
