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
        PessoaFisica pf = new PessoaFisica("Fernando", "123456", "333.444.555-00");
        
        pf.consultar();
    }
    
}
